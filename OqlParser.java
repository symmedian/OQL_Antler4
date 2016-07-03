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
		VALUE=8, LONG=9, ID=10, GET=11, AND=12, OR=13, IN=14, FLOAT=15, QUOTE=16, 
		EQUAL=17, GT=18, LT=19, GTEQ=20, LTEQ=21, NE=22, BR_OPEN=23, BR_CLOSE=24, 
		WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "' IN SET ('", "'where'", "','", "COMPARATOR", "LOGICAL", 
		"GET_FIELD", "FIELD", "VALUE", "LONG", "ID", "'get'", "'AND'", "'OR'", 
		"'IN'", "FLOAT", "'''", "'='", "'>'", "'<'", "'>='", "'<='", "'<>'", "'('", 
		"')'", "WS"
	};
	public static final int
		RULE_whereclause = 0, RULE_criteria = 1, RULE_condition = 2, RULE_in_condition = 3, 
		RULE_simple_condition = 4, RULE_simple_get_condition = 5, RULE_sub_condition = 6, 
		RULE_value_array = 7;
	public static final String[] ruleNames = {
		"whereclause", "criteria", "condition", "in_condition", "simple_condition", 
		"simple_get_condition", "sub_condition", "value_array"
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
			setState(16); match(2);
			setState(17); criteria();
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
			setState(19); condition();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL) {
				{
				{
				setState(20); match(LOGICAL);
				setState(21); condition();
				}
				}
				setState(26);
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
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); in_condition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); sub_condition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29); simple_condition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30); simple_get_condition();
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
			setState(33); match(GET_FIELD);
			setState(34); match(1);
			setState(35); value_array();
			setState(36); match(BR_CLOSE);
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
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); match(FIELD);
				setState(39); match(COMPARATOR);
				setState(40); match(VALUE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); match(FIELD);
				setState(42); match(COMPARATOR);
				setState(43); match(LONG);
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
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(GET_FIELD);
				setState(47); match(COMPARATOR);
				setState(48); match(LONG);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(GET_FIELD);
				setState(50); match(COMPARATOR);
				setState(51); match(VALUE);
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
			setState(54); match(BR_OPEN);
			setState(55); condition();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL) {
				{
				{
				setState(56); match(LOGICAL);
				setState(57); condition();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(BR_CLOSE);
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
		enterRule(_localctx, 14, RULE_value_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(VALUE);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(66); match(3);
				setState(67); match(VALUE);
				}
				}
				setState(72);
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
		"\2\3\33L\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\3\2\3\2\3\2\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4"+
		"\5\4\"\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6/\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\67\n\7\3\b\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b"+
		"\3\b\3\b\3\t\3\t\3\t\7\tG\n\t\f\t\16\tJ\13\t\3\t\2\n\2\4\6\b\n\f\16\20"+
		"\2\2K\2\22\3\2\2\2\4\25\3\2\2\2\6!\3\2\2\2\b#\3\2\2\2\n.\3\2\2\2\f\66"+
		"\3\2\2\2\168\3\2\2\2\20C\3\2\2\2\22\23\7\4\2\2\23\24\5\4\3\2\24\3\3\2"+
		"\2\2\25\32\5\6\4\2\26\27\7\7\2\2\27\31\5\6\4\2\30\26\3\2\2\2\31\34\3\2"+
		"\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\"\5\b\5"+
		"\2\36\"\5\16\b\2\37\"\5\n\6\2 \"\5\f\7\2!\35\3\2\2\2!\36\3\2\2\2!\37\3"+
		"\2\2\2! \3\2\2\2\"\7\3\2\2\2#$\7\b\2\2$%\7\3\2\2%&\5\20\t\2&\'\7\32\2"+
		"\2\'\t\3\2\2\2()\7\t\2\2)*\7\6\2\2*/\7\n\2\2+,\7\t\2\2,-\7\6\2\2-/\7\13"+
		"\2\2.(\3\2\2\2.+\3\2\2\2/\13\3\2\2\2\60\61\7\b\2\2\61\62\7\6\2\2\62\67"+
		"\7\13\2\2\63\64\7\b\2\2\64\65\7\6\2\2\65\67\7\n\2\2\66\60\3\2\2\2\66\63"+
		"\3\2\2\2\67\r\3\2\2\289\7\31\2\29>\5\6\4\2:;\7\7\2\2;=\5\6\4\2<:\3\2\2"+
		"\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\32\2\2B\17\3"+
		"\2\2\2CH\7\n\2\2DE\7\5\2\2EG\7\n\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2I\21\3\2\2\2JH\3\2\2\2\b\32!.\66>H";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}