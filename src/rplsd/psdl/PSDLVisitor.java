// Generated from PSDL.g4 by ANTLR 4.4
package rplsd.psdl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PSDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PSDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PSDLParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(@NotNull PSDLParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#elasticity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElasticity(@NotNull PSDLParser.ElasticityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#initVelocity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVelocity(@NotNull PSDLParser.InitVelocityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(@NotNull PSDLParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#friction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFriction(@NotNull PSDLParser.FrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull PSDLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull PSDLParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(@NotNull PSDLParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#circle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircle(@NotNull PSDLParser.CircleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#worldProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorldProperty(@NotNull PSDLParser.WorldPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(@NotNull PSDLParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(@NotNull PSDLParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#rectangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangle(@NotNull PSDLParser.RectangleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(@NotNull PSDLParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(@NotNull PSDLParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#modelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelName(@NotNull PSDLParser.ModelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#triangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriangle(@NotNull PSDLParser.TriangleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(@NotNull PSDLParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#objectCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreation(@NotNull PSDLParser.ObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(@NotNull PSDLParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#force}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForce(@NotNull PSDLParser.ForceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#basicShape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicShape(@NotNull PSDLParser.BasicShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull PSDLParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#world}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorld(@NotNull PSDLParser.WorldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSDLParser#gravity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGravity(@NotNull PSDLParser.GravityContext ctx);
}