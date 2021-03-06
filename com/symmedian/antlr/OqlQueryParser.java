package com.symmedian.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OqlQueryParser {
	//"select * from TradeMessage where ColumnA = 'bla' and (ColumnB IN SET ('kla', 'klo') OR Columnc <> 'bbar')"
	//"select * FROM TradeMessage WHERE validFrom > 2727272727277 AND sourceSystem = 'MUREX' AND 'tradeGroup' IN SET ('CDS', 'CRDI')"

	public static void main(String[] args) {
		//String sqlQuery =  "where get('field1') = value1 AND get('field2') <= value2 OR get('field3') > value3";//args[0];
		String sqlQuery = "where field3 > 2345L AND get('field4') IN SET ('value1', 'value3') OR (get('field5') = 'valuex' AND get('field6') = 123445.87 OR get('field7') > 'value7')";
		//String sqlQuery = "where field3 < 363636363636363L AND NOT get('active') AND field7 = ''";

		// pre-process 'difficult' cases
		preProcessQuery(sqlQuery);

		OqlLexer lexer = new OqlLexer(new ANTLRInputStream(sqlQuery));

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		OqlParser parser = new OqlParser(tokens);

		// Specify our entry point
		OqlParser.WhereclauseContext context = parser.whereclause();

		// Walk it and attach our listener
		ParseTreeWalker walker = new ParseTreeWalker();
		OqlBaseListener listener = new com.symmedian.antlr.OqlQueryParser.OqlQueryListener();
		walker.walk(listener, context);
	}

	private static String preProcessQuery(String sqlQuery) {
		Pattern pattern = Pattern.compile(" [0-9]*L ");
		Matcher matcher = pattern.matcher(sqlQuery);
		if (matcher.find()) {
			for(int i = 0; i < matcher.groupCount(); i++) {
				String match = matcher.group(i);
			}
		}
		String sqlQueryNew = sqlQuery.replaceAll("get('active')", "get('active') = 'true'");
		// NB need to remove 'L' in longs as well
		sqlQueryNew = sqlQueryNew.replaceAll("get('active')", "get('active') = 'true'");
		return sqlQueryNew;
	}

	public static class OqlQueryListener extends OqlBaseListener {
		LinkedList <com.symmedian.antlr.Criterion> stack = new LinkedList<com.symmedian.antlr.Criterion>();

		@Override
		public void exitCriteria(OqlParser.CriteriaContext ctx) {

			ArrayList<String> logicalList = getLogicals(ctx);

			ArrayList<com.symmedian.antlr.Criterion> criterionList = new ArrayList<com.symmedian.antlr.Criterion>();
			for(int i = 0; i < ctx.getChildCount(); i = i + 2) {
				criterionList.add(stack.removeLast());
			}
			Collections.reverse(criterionList);

			com.symmedian.antlr.Criterion combined = combineCriteria(criterionList, logicalList, 0);
			// At this processing is complete and combined criteria can be used in query
		}

		@Override
		public void exitSimple_condition(OqlParser.Simple_conditionContext ctx) {
			System.out.println("exitSimple_condition " + ctx.getText());
			String field = ctx.FIELD().getText();
			String comparator = ctx.COMPARATOR().getText();
			String value = ctx.VALUE().getText();
			stack.addLast(createRestriction(field, comparator, value));
		}

		@Override
		public void exitSimple_get_condition(OqlParser.Simple_get_conditionContext ctx) {
			System.out.println("exitSimple_get_condition " + ctx.getText());
			String field = ctx.GET_FIELD().getText();
			String comparator = ctx.COMPARATOR().getText();
			String value = ctx.VALUE().getText();
			stack.addLast(createRestriction(field, comparator, value));
		}

		@Override
		public void exitIn_condition(OqlParser.In_conditionContext ctx) {
			System.out.println("exitIn_condition " + ctx.getText());
			String field = ctx.FIELD().getText();
			ArrayList<String> values = new ArrayList<String>();

			for(int i = 0; i <= ctx.value_array().getChildCount(); i = i + 2) {
				values.add(ctx.value_array().getChild(i).getText());
			}
			stack.addLast(com.symmedian.antlr.Restrictions.in(field, values));
		}

		@Override
		public void exitActive_condition(OqlParser.Active_conditionContext ctx) {
			super.exitActive_condition(ctx);
		}

		@Override
		public void exitIn_get_condition(OqlParser.In_get_conditionContext ctx) {
			super.exitIn_get_condition(ctx);
		}

		@Override
		public void exitSub_condition(OqlParser.Sub_conditionContext ctx) {
			// 0 (
			// 1  crit 1
			// 2 AND OR
			// 3 crit 2
			// 4 AND OR
			// 5 crit 3
			// 6 AND
			// 7 crit 4
			// 8 )

			ArrayList<String> logicalList = new ArrayList<String>();
			// grab every second child - Ignore ( at start and ) at end
			for(int i = 2; i < ctx.getChildCount() - 1; i = i + 2) {
				String logical1 = ctx.getChild(i).getText();
				logicalList.add(logical1);
			}

			ArrayList<com.symmedian.antlr.Criterion> criterionList = new ArrayList<com.symmedian.antlr.Criterion>(3);
			for(int i = 1; i < ctx.getChildCount(); i = i + 2) {
				criterionList.add(stack.removeLast());
			}

			Collections.reverse(criterionList);

			com.symmedian.antlr.Criterion combined = combineCriteria(criterionList, logicalList, 0);
			stack.addLast(combined);
		}

		private ArrayList<String> getLogicals(OqlParser.CriteriaContext ctx) {
			ArrayList<String> logicalList = new ArrayList<String>();
			// grab every second child
			for(int i = 1; i < ctx.getChildCount(); i = i + 2) {
				String logical1 = ctx.getChild(i).getText();
				logicalList.add(logical1);
			}
			return logicalList;
		}

		private com.symmedian.antlr.Criterion combineCriteria(ArrayList<com.symmedian.antlr.Criterion> criterionList, ArrayList<String> logicalList, int index) {

			String logical = logicalList.get(index);
			com.symmedian.antlr.Criterion criterionLeft = criterionList.get(index);

			if(index + 2 < criterionList.size()) {

				com.symmedian.antlr.Criterion combined = combineCriteria(criterionList, logicalList, index + 1);
				return createCombinedCriterion(criterionLeft, combined, logical);

			} else {

				com.symmedian.antlr.Criterion criterionRight = criterionList.get(index + 1);
				return createCombinedCriterion(criterionLeft, criterionRight, logical);
			}
		}

		private com.symmedian.antlr.Criterion createCombinedCriterion(com.symmedian.antlr.Criterion criterionLeft, com.symmedian.antlr.Criterion criterionRight, String logical) {
			com.symmedian.antlr.Criterion combinedCriterion = null;

			if(logical.equals("AND")) {
				combinedCriterion = com.symmedian.antlr.Restrictions.and(criterionLeft, criterionRight);
			}
			if(logical.equals("OR")) {
				combinedCriterion = com.symmedian.antlr.Restrictions.or(criterionLeft, criterionRight);
			}
			return combinedCriterion;
		}

		private com.symmedian.antlr.Criterion createRestriction(String field, String comparator, String value) {
			if(comparator.equals("=")) {
				return com.symmedian.antlr.Restrictions.equal(field, value);
			}
			if(comparator.equals("<")) {
				return com.symmedian.antlr.Restrictions.lessThan(field, value);
			}
			if(comparator.equals(">")) {
				return com.symmedian.antlr.Restrictions.greaterThan(field, value);
			}
			if(comparator.equals(">=")) {
				return com.symmedian.antlr.Restrictions.greaterThanEqual(field, value);
			}
			if(comparator.equals("<=")) {
				return com.symmedian.antlr.Restrictions.lessThanEqual(field, value);
			}
			return null;
		}
	}

}
