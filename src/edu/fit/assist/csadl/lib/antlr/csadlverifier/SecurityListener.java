package edu.fit.assist.csadl.lib.antlr.csadlverifier;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SecurityParser}.
 */
public interface SecurityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SecurityParser#csadl}.
	 * @param ctx the parse tree
	 */
	void enterCsadl(SecurityParser.CsadlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecurityParser#csadl}.
	 * @param ctx the parse tree
	 */
	void exitCsadl(SecurityParser.CsadlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecurityParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SecurityParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecurityParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SecurityParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecurityParser#assumption1}.
	 * @param ctx the parse tree
	 */
	void enterAssumption1(SecurityParser.Assumption1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SecurityParser#assumption1}.
	 * @param ctx the parse tree
	 */
	void exitAssumption1(SecurityParser.Assumption1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SecurityParser#assumption2}.
	 * @param ctx the parse tree
	 */
	void enterAssumption2(SecurityParser.Assumption2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SecurityParser#assumption2}.
	 * @param ctx the parse tree
	 */
	void exitAssumption2(SecurityParser.Assumption2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SecurityParser#guarantee}.
	 * @param ctx the parse tree
	 */
	void enterGuarantee(SecurityParser.GuaranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecurityParser#guarantee}.
	 * @param ctx the parse tree
	 */
	void exitGuarantee(SecurityParser.GuaranteeContext ctx);
}