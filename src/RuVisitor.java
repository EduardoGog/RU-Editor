// Generated from C:/antlr/antlrProjects/Tarea4_Final/src/Ru.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RuParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(RuParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(RuParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(RuParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#sentencia_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_if(RuParser.Sentencia_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#bloque_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicional(RuParser.Bloque_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#bloque_de_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_de_sentencia(RuParser.Bloque_de_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#sentencia_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_while(RuParser.Sentencia_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(RuParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(RuParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenosUnarioExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenosUnarioExpr(RuParser.MenosUnarioExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(RuParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicacionExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacionExpr(RuParser.MultiplicacionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(RuParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(RuParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(RuParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualdadExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdadExpr(RuParser.IgualdadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relacionalExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionalExpr(RuParser.RelacionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aditivaExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAditivaExpr(RuParser.AditivaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link RuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(RuParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(RuParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(RuParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(RuParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(RuParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(RuParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link RuParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(RuParser.NilAtomContext ctx);
}