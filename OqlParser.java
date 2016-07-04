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
		T__2=1, T__1=2, T__0=3, COMPARATOR=4, LOGICAL=5, GET_FIELD=6, FIELD=7, 
		VALUE=8, LONG=9, ACTIVE=10, ID=11, GET=12, AND=13, OR=14, IN=15, FLOAT=16, 
		QUOTE=17, EQUAL=18, GT=19, LT=20, GTEQ=21, LTEQ=22, NE=23, BR_OPEN=24, 
		BR_CLOSE=25, WS=26;
	public static final String[] tokenNames = {
		"<INVALID>", "' IN SET ('", "'where'", "','", "COMPARATOR", "LOGICAL", 
		"GET_FIELD", "FIELD", "VALUE", "LONG", "ACTIVE", "ID", "'get'", "'AND'", 
		"'OR'", "'IN'", "FLOAT", "'''", "'='", "'>'", "'<'", "'>='", "'<='", "'<>'", 
		"'('", "')'", "WS"
	};
	public static final int
		RULE_whereclause = 0, RULE_criteria = 1, RULE_condition = 2, RULE_in_condition = 3, 
		RULE_simple_condition = 4, RULE_simple_get_condition = 5, RULE_sub_condition = 6, 
		RULE_active_condition = 7, RULE_value_array = 8;
	public static final String[] ruleNames = {
		"whereclause", "criteria", "condition", "in_condition", "simple_condition", 
		"simple_get_condition", "sub_condition", "active_condition", "value_array"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(2);
			setState(19); criteria();
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
			setState(21); condition();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL) {
				{
				{
				setState(22); match(LOGICAL);
				setState(23); condition();
				}
				}
				setState(28);
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
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29); active_condition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); in_condition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31); sub_condition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32); simple_condition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(33); simple_get_condition();
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
		public TerminalNode GET_FIELD() { return getToken(OqlParser.GET_FIELD, 0); }
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
			setState(36); match(GET_FIELD);
			setState(37); match(1);
			setState(38); value_array();
			setState(39); match(BR_CLOSE);
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
		public TerminalNode LONG() { return getToken(OqlParser.LONG, 0); }
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
		enterRule(_localctx, 8, RULE_simple_condition);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); match(FIELD);
				setState(42); match(COMPARATOR);
				setState(43); match(VALUE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); match(FIELD);
				setState(45); match(COMPARATOR);
				setState(46); match(LONG);
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

	public static class Simple_get_conditionContext extends ParserRuleContext {
		public TerminalNode GET_FIELD() { return getToken(OqlParser.GET_FIELD, 0); }
		public TerminalNode COMPARATOR() { return getToken(OqlParser.COMPARATOR, 0); }
		public TerminalNode VALUE() { return getToken(OqlParser.VALUE, 0); }
		public TerminalNode LONG() { return getToken(OqlParser.LONG, 0); }
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
		enterRule(_localctx, 10, RULE_simple_get_condition);
		try {
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); match(GET_FIELD);
				setState(50); match(COMPARATOR);
				setState(51); match(LONG);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); match(GET_FIELD);
				setState(53); match(COMPARATOR);
				setState(54); match(VALUE);
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
		enterRule(_localctx, 12, RULE_sub_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(BR_OPEN);
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
			setState(66); match(BR_CLOSE);
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
		public TerminalNode ACTIVE() { return getToken(OqlParser.ACTIVE, 0); }
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
		enterRule(_localctx, 14, RULE_active_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(ACTIVE);
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
		enterRule(_localctx, 16, RULE_value_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(VALUE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(71); match(3);
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
		"\t\4\n\t\n\3\2\3\2\3\2\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\5\4%\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\62\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7:\n\7\3\b\3\b\3\b\3\b\7\b@\n\b\f\b"+
		"\16\bC\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\nL\n\n\f\n\16\nO\13\n\3\n\2"+
		"\13\2\4\6\b\n\f\16\20\22\2\2P\2\24\3\2\2\2\4\27\3\2\2\2\6$\3\2\2\2\b&"+
		"\3\2\2\2\n\61\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20F\3\2\2\2\22H\3\2\2\2\24"+
		"\25\7\4\2\2\25\26\5\4\3\2\26\3\3\2\2\2\27\34\5\6\4\2\30\31\7\7\2\2\31"+
		"\33\5\6\4\2\32\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\5\3\2\2\2\36\34\3\2\2\2\37%\5\20\t\2 %\5\b\5\2!%\5\16\b\2\"%\5\n\6\2"+
		"#%\5\f\7\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2"+
		"\2\2&\'\7\b\2\2\'(\7\3\2\2()\5\22\n\2)*\7\33\2\2*\t\3\2\2\2+,\7\t\2\2"+
		",-\7\6\2\2-\62\7\n\2\2./\7\t\2\2/\60\7\6\2\2\60\62\7\13\2\2\61+\3\2\2"+
		"\2\61.\3\2\2\2\62\13\3\2\2\2\63\64\7\b\2\2\64\65\7\6\2\2\65:\7\13\2\2"+
		"\66\67\7\b\2\2\678\7\6\2\28:\7\n\2\29\63\3\2\2\29\66\3\2\2\2:\r\3\2\2"+
		"\2;<\7\32\2\2<A\5\6\4\2=>\7\7\2\2>@\5\6\4\2?=\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\33\2\2E\17\3\2\2\2FG\7\f\2\2G\21"+
		"\3\2\2\2HM\7\n\2\2IJ\7\5\2\2JL\7\n\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2M"+
		"N\3\2\2\2N\23\3\2\2\2OM\3\2\2\2\b\34$\619AM";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}