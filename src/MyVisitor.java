import java.util.*;

/* El visitor recorre el árbol generado por el parser y evalúa el código Ru. */
public class MyVisitor extends RuBaseVisitor<Object> {

    /* Tabla de variables: guarda nombres de variables con sus valores. */
    private final Map<String, Object> variables = new HashMap<>();

    /* Programa: comienza visitando el bloque principal */
    @Override
    public Object visitPrograma(RuParser.ProgramaContext ctx) {
        return visit(ctx.bloque());
    }

    /* Un bloque puede contener muchas sentencias */
    @Override
    public Object visitBloque(RuParser.BloqueContext ctx) {
        for (var sentencia : ctx.sentencia()) {
            visit(sentencia);
        }
        return null;
    }

    /* Asignación: guarda el resultado de evaluar una expresión en una variable */
    @Override
    public Object visitAsignacion(RuParser.AsignacionContext ctx) {
        /* nombre de la variable */
        String id = ctx.ID().getText();
        /* valor de la expresión */
        Object value = visit(ctx.expr());
        /* guardar variable */
        variables.put(id, value);
        return value;
    }

    /* Imprimir: muestra el resultado en consola con formato */
    @Override
    public Object visitImprimir(RuParser.ImprimirContext ctx) {
        Object value = visit(ctx.expr());
        if (value == null) {
            System.out.println(">> nil");
        } else if (value instanceof Boolean) {
            System.out.println(">> " + ((Boolean) value ? "true" : "false"));
        } else {
            System.out.println(value);
        }
        return null;
    }

    /* log: imprime en stderr (útil para debugging) */
    @Override
    public Object visitLog(RuParser.LogContext ctx) {
        Object value = visit(ctx.expr());
        System.err.println("log: " + value);
        return null;
    }

    /* if-else: evalúa condiciones hasta encontrar una verdadera */
    @Override
    public Object visitSentencia_if(RuParser.Sentencia_ifContext ctx) {
        List<RuParser.Bloque_condicionalContext> conds = ctx.bloque_condicional();
        for (var cond : conds) {
            if (asBool(visit(cond.expr()))) {
                visit(cond.bloque_de_sentencia());
                /* no ejecuta los siguientes */
                return null;
            }
        }
        /* Si hay un else al final, se ejecuta si ningún if anterior fue verdadero */
        if (ctx.ELSE() != null && ctx.bloque_de_sentencia() != null) {
            visit(ctx.bloque_de_sentencia());
        }
        return null;
    }

    /* Un bloque puede ser un conjunto de sentencias o solo una */
    @Override
    public Object visitBloque_de_sentencia(RuParser.Bloque_de_sentenciaContext ctx) {
        if (ctx.sentencia() != null) {
            return visit(ctx.sentencia());
        }
        return visit(ctx.bloque());
    }

    /* while: repite mientras la condición sea verdadera */
    @Override
    public Object visitSentencia_while(RuParser.Sentencia_whileContext ctx) {
        while (asBool(visit(ctx.expr()))) {
            visit(ctx.bloque_de_sentencia());
        }
        return null;
    }

    /* Operadores + y - */
    @Override
    public Object visitAditivaExpr(RuParser.AditivaExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Double && r instanceof Double) {
            return ctx.op.getType() == RuParser.MAS ? (Double) l + (Double) r : (Double) l - (Double) r;
        }
        return 0.0;
    }

    /* Operadores *, /, % */
    @Override
    public Object visitMultiplicacionExpr(RuParser.MultiplicacionExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Double && r instanceof Double) {
            return switch (ctx.op.getType()) {
                case RuParser.MULT -> (Double) l * (Double) r;
                case RuParser.DIV -> (Double) l / (Double) r;
                case RuParser.MOD -> (Double) l % (Double) r;
                default -> 0.0;
            };
        }
        return 0.0;
    }

    /* Operadores relacionales: >, <, >=, <= */
    @Override
    public Object visitRelacionalExpr(RuParser.RelacionalExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Double && r instanceof Double) {
            return switch (ctx.op.getType()) {
                case RuParser.MAYIG -> (Double) l >= (Double) r;
                case RuParser.MENIG -> (Double) l <= (Double) r;
                case RuParser.MAYORQ -> (Double) l > (Double) r;
                case RuParser.MENORQ -> (Double) l < (Double) r;
                default -> false;
            };
        }
        return false;
    }

    /* Operadores de igualdad: ==, != */
    @Override
    public Object visitIgualdadExpr(RuParser.IgualdadExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        return switch (ctx.op.getType()) {
            case RuParser.IGUAL -> Objects.equals(l, r);
            case RuParser.DIFQ -> !Objects.equals(l, r);
            default -> false;
        };
    }

    /* Lógico && */
    @Override
    public Object visitAndExpr(RuParser.AndExprContext ctx) {
        return asBool(visit(ctx.expr(0))) && asBool(visit(ctx.expr(1)));
    }

    /* Lógico || */
    @Override
    public Object visitOrExpr(RuParser.OrExprContext ctx) {
        return asBool(visit(ctx.expr(0))) || asBool(visit(ctx.expr(1)));
    }

    /* Negación: !expr */
    @Override
    public Object visitNotExpr(RuParser.NotExprContext ctx) {
        return !asBool(visit(ctx.expr()));
    }

    /* Negativo unario: -expr */
    @Override
    public Object visitMenosUnarioExpr(RuParser.MenosUnarioExprContext ctx) {
        Object v = visit(ctx.expr());
        if (v instanceof Double) return -(Double) v;
        return 0.0;
    }

    /* Exponenciación: ^ */
    @Override
    public Object visitPowExpr(RuParser.PowExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Double && r instanceof Double)
            return Math.pow((Double) l, (Double) r);
        return 0.0;
    }

    /* Constantes numéricas */
    @Override
    public Object visitNumberAtom(RuParser.NumberAtomContext ctx) {
        String text = ctx.getText();
        return text.contains(".") ? Double.parseDouble(text) : Double.valueOf(text);
    }

    /* Constantes booleanas: true / false */
    @Override
    public Object visitBooleanAtom(RuParser.BooleanAtomContext ctx) {
        return ctx.TRUE() != null;
    }

    /* nil equivale a null */
    @Override
    public Object visitNilAtom(RuParser.NilAtomContext ctx) {
        return null;
    }

    /* Identificadores (variables) */
    @Override
    public Object visitIdAtom(RuParser.IdAtomContext ctx) {
        return variables.getOrDefault(ctx.ID().getText(), null);
    }

    /* Cadenas de texto */
    @Override
    public Object visitStringAtom(RuParser.StringAtomContext ctx) {
        String text = ctx.getText();
        /* Quita comillas externas y reemplaza dobles comillas internas */
        return text.substring(1, text.length() - 1).replace("\"\"", "\"");
    }

    /* Paréntesis: (expr) */
    @Override
    public Object visitParExpr(RuParser.ParExprContext ctx) {
        return visit(ctx.expr());
    }

    /* Cualquier átomo dentro de una expresión */
    @Override
    public Object visitAtomExpr(RuParser.AtomExprContext ctx) {
        return visit(ctx.atomo());
    }

    /* Convierte a booleano para estructuras de control */
    private boolean asBool(Object val) {
        if (val instanceof Boolean b) return b;
        if (val instanceof Double d) return d != 0.0;
        if (val instanceof Integer i) return i != 0;
        return val != null;
    }
}