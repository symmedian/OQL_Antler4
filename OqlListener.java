// Generated from /Users/jantaljaard/IdeaProjects/Antler/src/resources/Oql.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface OqlListener extends ParseTreeListener {
	void enterSimple_get_condition(OqlParser.Simple_get_conditionContext ctx);
	void exitSimple_get_condition(OqlParser.Simple_get_conditionContext ctx);

	void enterActive_condition(OqlParser.Active_conditionContext ctx);
	void exitActive_condition(OqlParser.Active_conditionContext ctx);

	void enterCondition(OqlParser.ConditionContext ctx);
	void exitCondition(OqlParser.ConditionContext ctx);

	void enterSimple_condition(OqlParser.Simple_conditionContext ctx);
	void exitSimple_condition(OqlParser.Simple_conditionContext ctx);

	void enterCriteria(OqlParser.CriteriaContext ctx);
	void exitCriteria(OqlParser.CriteriaContext ctx);

	void enterWhereclause(OqlParser.WhereclauseContext ctx);
	void exitWhereclause(OqlParser.WhereclauseContext ctx);

	void enterIn_condition(OqlParser.In_conditionContext ctx);
	void exitIn_condition(OqlParser.In_conditionContext ctx);

	void enterSub_condition(OqlParser.Sub_conditionContext ctx);
	void exitSub_condition(OqlParser.Sub_conditionContext ctx);

	void enterValue_array(OqlParser.Value_arrayContext ctx);
	void exitValue_array(OqlParser.Value_arrayContext ctx);
}