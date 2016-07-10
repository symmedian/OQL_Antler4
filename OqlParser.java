// Generated from /Users/jantaljaard/IdeaProjects/Antler/src/resources/Oql.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, COMPARATOR=8, 
		LOGICAL=9, GET_FIELD=10, FIELD=11, VALUE=12, NUMBER=13, LONG=14, GET=15, 
		AND=16, OR=17, IN=18, QUOTE=19, EQUAL=20, GT=21, LT=22, GTEQ=23, LTEQ=24, 
		NE=25, WS=26;
	public static final String[] tokenNames = {
		"<INVALID>", "' IN SET ('", "'where'", "'WHERE'", "'('", "')'", "'get('active')'", 
		"','", "COMPARATOR", "LOGICAL", "GET_FIELD", "FIELD", "VALUE", "NUMBER", 
		"LONG", "'get'", "'AND'", "'OR'", "'IN'", "'''", "'='", "'>'", "'<'", 
		"'>='", "'<='", "'<>'", "WS"
	};
	public static final int
		RULE_whereclause = 0, RULE_criteria = 1, RULE_condition = 2, RULE_in_condition = 3, 
		RULE_in_get_condition = 4, RULE_simple_condition = 5, RULE_simple_get_condition = 6, 
		RULE_sub_condition = 7, RULE_active_condition = 8, RULE_value_array = 9;
	public static final String[] ruleNames = {
		"whereclause", "criteria", "condition", "in_condition", "in_get_condition", 
		"simple_condition", "simple_get_condition", "sub_condition", "active_condition", 
		"value_array"
	};

	@Override
	public String getGrammarFileName() { return "Oql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public OqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WhereclauseContext extends ParserRuleContext {
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public WhereclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterWhereclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitWhereclause(this);
		}
	}

	public final WhereclauseContext whereclause() throws RecognitionException {
		WhereclauseContext _localctx = new WhereclauseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_whereclause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==3) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(21); criteria();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaContext extends ParserRuleContext {
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public List<TerminalNode> LOGICAL() { return getTokens(OqlParser.LOGICAL); }
		public TerminalNode LOGICAL(int i) {
			return getToken(OqlParser.LOGICAL, i);
		}
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitCriteria(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_criteria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); condition();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL) {
				{
				{
				setState(24); match(LOGICAL);
				setState(25); condition();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Simple_get_conditionContext simple_get_condition() {
			return getRuleContext(Simple_get_conditionContext.class,0);
		}
		public Active_conditionContext active_condition() {
			return getRuleContext(Active_conditionContext.class,0);
		}
		public Simple_conditionContext simple_condition() {
			return getRuleContext(Simple_conditionContext.class,0);
		}
		public In_get_conditionContext in_get_condition() {
			return getRuleContext(In_get_conditionContext.class,0);
		}
		public In_conditionContext in_condition() {
			return getRuleContext(In_conditionContext.class,0);
		}
		public Sub_conditionContext sub_condition() {
			return getRuleContext(Sub_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condition);
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); active_condition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); in_condition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33); in_get_condition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34); sub_condition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(35); simple_condition();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(36); simple_get_condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_conditionContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(OqlParser.FIELD, 0); }
		public Value_arrayContext value_array() {
			return getRuleContext(Value_arrayContext.class,0);
		}
		public In_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterIn_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitIn_condition(this);
		}
	}

	public final In_conditionContext in_condition() throws RecognitionException {
		In_conditionContext _localctx = new In_conditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_in_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(FIELD);
			setState(40); match(1);
			setState(41); value_array();
			setState(42); match(5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_get_conditionContext extends ParserRuleContext {
		public TerminalNode GET_FIELD() { return getToken(OqlParser.GET_FIELD, 0); }
		public Value_arrayContext value_array() {
			return getRuleContext(Value_arrayContext.class,0);
		}
		public In_get_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_get_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterIn_get_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitIn_get_condition(this);
		}
	}

	public final In_get_conditionContext in_get_condition() throws RecognitionException {
		In_get_conditionContext _localctx = new In_get_conditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_in_get_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(GET_FIELD);
			setState(45); match(1);
			setState(46); value_array();
			setState(47); match(5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_conditionContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(OqlParser.FIELD, 0); }
		public TerminalNode COMPARATOR() { return getToken(OqlParser.COMPARATOR, 0); }
		public TerminalNode VALUE() { return getToken(OqlParser.VALUE, 0); }
		public Simple_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterSimple_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitSimple_condition(this);
		}
	}

	public final Simple_conditionContext simple_condition() throws RecognitionException {
		Simple_conditionContext _localctx = new Simple_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(FIELD);
			setState(50); match(COMPARATOR);
			setState(51); match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_get_conditionContext extends ParserRuleContext {
		public TerminalNode GET_FIELD() { return getToken(OqlParser.GET_FIELD, 0); }
		public TerminalNode COMPARATOR() { return getToken(OqlParser.COMPARATOR, 0); }
		public TerminalNode VALUE() { return getToken(OqlParser.VALUE, 0); }
		public Simple_get_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_get_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterSimple_get_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitSimple_get_condition(this);
		}
	}

	public final Simple_get_conditionContext simple_get_condition() throws RecognitionException {
		Simple_get_conditionContext _localctx = new Simple_get_conditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_get_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(GET_FIELD);
			setState(54); match(COMPARATOR);
			setState(55); match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_conditionContext extends ParserRuleContext {
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public List<TerminalNode> LOGICAL() { return getTokens(OqlParser.LOGICAL); }
		public TerminalNode LOGICAL(int i) {
			return getToken(OqlParser.LOGICAL, i);
		}
		public Sub_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterSub_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitSub_condition(this);
		}
	}

	public final Sub_conditionContext sub_condition() throws RecognitionException {
		Sub_conditionContext _localctx = new Sub_conditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sub_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(4);
			setState(58); condition();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL) {
				{
				{
				setState(59); match(LOGICAL);
				setState(60); condition();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Active_conditionContext extends ParserRuleContext {
		public Active_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_active_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterActive_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitActive_condition(this);
		}
	}

	public final Active_conditionContext active_condition() throws RecognitionException {
		Active_conditionContext _localctx = new Active_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_active_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_arrayContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(OqlParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(OqlParser.VALUE, i);
		}
		public Value_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).enterValue_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OqlListener ) ((OqlListener)listener).exitValue_array(this);
		}
	}

	public final Value_arrayContext value_array() throws RecognitionException {
		Value_arrayContext _localctx = new Value_arrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(VALUE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(71); match(7);
				setState(72); match(VALUE);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\34Q\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\3\2\3\2\3\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t@\n\t\f\t\16\t"+
		"C\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\13"+
		"\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\4\5N\2\26\3\2\2\2\4\31\3\2\2\2\6\'"+
		"\3\2\2\2\b)\3\2\2\2\n.\3\2\2\2\f\63\3\2\2\2\16\67\3\2\2\2\20;\3\2\2\2"+
		"\22F\3\2\2\2\24H\3\2\2\2\26\27\t\2\2\2\27\30\5\4\3\2\30\3\3\2\2\2\31\36"+
		"\5\6\4\2\32\33\7\13\2\2\33\35\5\6\4\2\34\32\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!(\5\22\n\2\"(\5\b\5\2"+
		"#(\5\n\6\2$(\5\20\t\2%(\5\f\7\2&(\5\16\b\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3"+
		"\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\7\3\2\2\2)*\7\r\2\2*+\7\3\2\2"+
		"+,\5\24\13\2,-\7\7\2\2-\t\3\2\2\2./\7\f\2\2/\60\7\3\2\2\60\61\5\24\13"+
		"\2\61\62\7\7\2\2\62\13\3\2\2\2\63\64\7\r\2\2\64\65\7\n\2\2\65\66\7\16"+
		"\2\2\66\r\3\2\2\2\678\7\f\2\289\7\n\2\29:\7\16\2\2:\17\3\2\2\2;<\7\6\2"+
		"\2<A\5\6\4\2=>\7\13\2\2>@\5\6\4\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BD\3\2\2\2CA\3\2\2\2DE\7\7\2\2E\21\3\2\2\2FG\7\b\2\2G\23\3\2\2\2H"+
		"M\7\16\2\2IJ\7\t\2\2JL\7\16\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2N\25\3\2\2\2OM\3\2\2\2\6\36\'AM";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}