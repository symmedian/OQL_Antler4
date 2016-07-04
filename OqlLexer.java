// Generated from /Users/jantaljaard/IdeaProjects/Antler/src/resources/Oql.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, COMPARATOR=4, LOGICAL=5, GET_FIELD=6, FIELD=7, 
		VALUE=8, LONG=9, ACTIVE=10, ID=11, GET=12, AND=13, OR=14, IN=15, FLOAT=16, 
		QUOTE=17, EQUAL=18, GT=19, LT=20, GTEQ=21, LTEQ=22, NE=23, BR_OPEN=24, 
		BR_CLOSE=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"' IN SET ('", "'where'", "','", "COMPARATOR", "LOGICAL", "GET_FIELD", 
		"FIELD", "VALUE", "LONG", "ACTIVE", "ID", "'get'", "'AND'", "'OR'", "'IN'", 
		"FLOAT", "'''", "'='", "'>'", "'<'", "'>='", "'<='", "'<>'", "'('", "')'", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "COMPARATOR", "LOGICAL", "GET_FIELD", "FIELD", 
		"VALUE", "LONG", "ACTIVE", "ID", "GET", "AND", "OR", "IN", "FLOAT", "QUOTE", 
		"EQUAL", "GT", "LT", "GTEQ", "LTEQ", "NE", "BR_OPEN", "BR_CLOSE", "WS", 
		"DIGIT"
	};


	public OqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Oql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\34\u00e1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\5\6V\n\6\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3"+
		"\7\3\7\3\7\3\7\6\7b\n\7\r\7\16\7c\3\7\3\7\3\7\3\b\6\bj\n\b\r\b\16\bk\3"+
		"\t\3\t\6\tp\n\t\r\t\16\tq\3\t\3\t\3\t\6\tw\n\t\r\t\16\tx\3\t\5\t|\n\t"+
		"\3\n\6\n\177\n\n\r\n\16\n\u0080\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\6\f\u009e\n\f\r\f\16\f\u009f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21\u00b1\n\21"+
		"\r\21\16\21\u00b2\3\21\3\21\7\21\u00b7\n\21\f\21\16\21\u00ba\13\21\3\21"+
		"\3\21\6\21\u00be\n\21\r\21\16\21\u00bf\5\21\u00c2\n\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\6\33\u00da\n\33\r\33\16\33\u00db\3\33\3\33\3"+
		"\34\3\34\2\35\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\2\67\2\1\3\2\n\3\"\""+
		"\5\62;C\\c|\5\62;C\\c|\6\60\60\62;C\\c|\6\60\60\62;C\\c|\3c|\5\13\f\17"+
		"\17\"\"\3\62;\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\39\3\2\2"+
		"\2\5C\3\2\2\2\7I\3\2\2\2\tQ\3\2\2\2\13U\3\2\2\2\rZ\3\2\2\2\17i\3\2\2\2"+
		"\21{\3\2\2\2\23~\3\2\2\2\25\u0084\3\2\2\2\27\u009d\3\2\2\2\31\u00a1\3"+
		"\2\2\2\33\u00a5\3\2\2\2\35\u00a9\3\2\2\2\37\u00ac\3\2\2\2!\u00c1\3\2\2"+
		"\2#\u00c3\3\2\2\2%\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00c9\3\2\2\2+\u00cb"+
		"\3\2\2\2-\u00ce\3\2\2\2/\u00d1\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2"+
		"\2\65\u00d9\3\2\2\2\67\u00df\3\2\2\29:\7\"\2\2:;\7K\2\2;<\7P\2\2<=\7\""+
		"\2\2=>\7U\2\2>?\7G\2\2?@\7V\2\2@A\7\"\2\2AB\7*\2\2B\4\3\2\2\2CD\7y\2\2"+
		"DE\7j\2\2EF\7g\2\2FG\7t\2\2GH\7g\2\2H\6\3\2\2\2IJ\7.\2\2J\b\3\2\2\2KR"+
		"\5%\23\2LR\5\'\24\2MR\5)\25\2NR\5+\26\2OR\5-\27\2PR\5/\30\2QK\3\2\2\2"+
		"QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\n\3\2\2\2SV\5\33\16"+
		"\2TV\5\35\17\2US\3\2\2\2UT\3\2\2\2V\f\3\2\2\2WY\t\2\2\2XW\3\2\2\2Y\\\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5\31\r\2^_\7*\2\2_a"+
		"\5#\22\2`b\t\3\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2e"+
		"f\5#\22\2fg\7+\2\2g\16\3\2\2\2hj\t\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\20\3\2\2\2mo\5#\22\2np\t\5\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2rs\3\2\2\2st\5#\22\2t|\3\2\2\2uw\t\6\2\2vu\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2z|\5\23\n\2{m\3\2\2\2{v\3\2\2\2{z\3\2"+
		"\2\2|\22\3\2\2\2}\177\5\67\34\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7N\2\2\u0083"+
		"\24\3\2\2\2\u0084\u0085\5\31\r\2\u0085\u0086\7*\2\2\u0086\u0087\5#\22"+
		"\2\u0087\u0088\7c\2\2\u0088\u0089\7e\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7x\2\2\u008c\u008d\7g\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\5#\22\2\u008f\u0090\7+\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7?\2"+
		"\2\u0092\u0093\7\"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5#\22\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7w\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\5#\22\2\u009b\26\3\2\2\2\u009c\u009e\t\7\2"+
		"\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7P\2\2\u00a7"+
		"\u00a8\7F\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7T\2\2\u00ab"+
		"\36\3\2\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7P\2\2\u00ae \3\2\2\2\u00af"+
		"\u00b1\5\67\34\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\7\60\2\2\u00b5"+
		"\u00b7\5\67\34\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c2\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\7\60\2\2\u00bc\u00be\5\67\34\2\u00bd\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00b0\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7)\2\2"+
		"\u00c4$\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8"+
		"(\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\7?\2\2\u00d0.\3"+
		"\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3\7@\2\2\u00d3\60\3\2\2\2\u00d4\u00d5"+
		"\7*\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7+\2\2\u00d7\64\3\2\2\2\u00d8\u00da"+
		"\t\b\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\33\2\2\u00de\66\3\2\2"+
		"\2\u00df\u00e0\t\t\2\2\u00e08\3\2\2\2\22\2QUZckqx{\u0080\u009f\u00b2\u00b8"+
		"\u00bf\u00c1\u00db";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}