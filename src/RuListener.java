// Generated from C:/antlr/antlrProjects/Tarea4_Final/src/Ru.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuParser}.
 */
public interface RuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RuParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RuParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(RuParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(RuParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(RuParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(RuParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(RuParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(RuParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_if(RuParser.Sentencia_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_if(RuParser.Sentencia_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#bloque_condicional}.
	 * @param ctx the parse tree
	 */
	void enterBloque_condicional(RuParser.Bloque_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#bloque_condicional}.
	 * @param ctx the parse tree
	 */
	void exitBloque_condicional(RuParser.Bloque_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#bloque_de_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterBloque_de_sentencia(RuParser.Bloque_de_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#bloque_de_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitBloque_de_sentencia(RuParser.Bloque_de_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_while(RuParser.Sentencia_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_while(RuParser.Sentencia_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(RuParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(RuParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(RuParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(RuParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenosUnarioExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMenosUnarioExpr(RuParser.MenosUnarioExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenosUnarioExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMenosUnarioExpr(RuParser.MenosUnarioExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(RuParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(RuParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicacionExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacionExpr(RuParser.MultiplicacionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicacionExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacionExpr(RuParser.MultiplicacionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(RuParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(RuParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(RuParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(RuParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(RuParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(RuParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code igualdadExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIgualdadExpr(RuParser.IgualdadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code igualdadExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIgualdadExpr(RuParser.IgualdadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relacionalExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelacionalExpr(RuParser.RelacionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relacionalExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelacionalExpr(RuParser.RelacionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aditivaExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAditivaExpr(RuParser.AditivaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aditivaExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAditivaExpr(RuParser.AditivaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(RuParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(RuParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(RuParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(RuParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(RuParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(RuParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(RuParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(RuParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(RuParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(RuParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(RuParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(RuParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(RuParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(RuParser.NilAtomContext ctx);
}