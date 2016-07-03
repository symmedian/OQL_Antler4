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
		VALUE=8, LONG=9, ID=10, GET=11, AND=12, OR=13, IN=14, FLOAT=15, QUOTE=16, 
		EQUAL=17, GT=18, LT=19, GTEQ=20, LTEQ=21, NE=22, BR_OPEN=23, BR_CLOSE=24, 
		WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"' IN SET ('", "'where'", "','", "COMPARATOR", "LOGICAL", "GET_FIELD", 
		"FIELD", "VALUE", "LONG", "ID", "'get'", "'AND'", "'OR'", "'IN'", "FLOAT", 
		"'''", "'='", "'>'", "'<'", "'>='", "'<='", "'<>'", "'('", "')'", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "COMPARATOR", "LOGICAL", "GET_FIELD", "FIELD", 
		"VALUE", "LONG", "ID", "GET", "AND", "OR", "IN", "FLOAT", "QUOTE", "EQUAL", 
		"GT", "LT", "GTEQ", "LTEQ", "NE", "BR_OPEN", "BR_CLOSE", "WS", "DIGIT"
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
		case 24: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\33\u00c7\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5P\n\5\3\6\3\6\5\6T\n\6\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\3\7\3"+
		"\7\6\7`\n\7\r\7\16\7a\3\7\3\7\3\7\3\b\6\bh\n\b\r\b\16\bi\3\t\3\t\6\tn"+
		"\n\t\r\t\16\to\3\t\3\t\3\t\6\tu\n\t\r\t\16\tv\3\t\5\tz\n\t\3\n\6\n}\n"+
		"\n\r\n\16\n~\3\n\3\n\3\13\6\13\u0084\n\13\r\13\16\13\u0085\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\6\20\u0097\n\20"+
		"\r\20\16\20\u0098\3\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\20"+
		"\3\20\6\20\u00a4\n\20\r\20\16\20\u00a5\5\20\u00a8\n\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\6\32\u00c0\n\32\r\32\16\32\u00c1\3\32\3\32\3"+
		"\33\3\33\2\34\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\2\65\2\1\3\2\n\3\"\"\5\62;C\\"+
		"c|\5\62;C\\c|\6\60\60\62;C\\c|\6\60\60\62;C\\c|\3c|\5\13\f\17\17\"\"\3"+
		"\62;\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\67\3\2\2\2\5A\3\2\2\2\7G\3\2\2"+
		"\2\tO\3\2\2\2\13S\3\2\2\2\rX\3\2\2\2\17g\3\2\2\2\21y\3\2\2\2\23|\3\2\2"+
		"\2\25\u0083\3\2\2\2\27\u0087\3\2\2\2\31\u008b\3\2\2\2\33\u008f\3\2\2\2"+
		"\35\u0092\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2%\u00ad"+
		"\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2+\u00b4\3\2\2\2-\u00b7\3\2\2\2"+
		"/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63\u00bf\3\2\2\2\65\u00c5\3\2\2\2\67"+
		"8\7\"\2\289\7K\2\29:\7P\2\2:;\7\"\2\2;<\7U\2\2<=\7G\2\2=>\7V\2\2>?\7\""+
		"\2\2?@\7*\2\2@\4\3\2\2\2AB\7y\2\2BC\7j\2\2CD\7g\2\2DE\7t\2\2EF\7g\2\2"+
		"F\6\3\2\2\2GH\7.\2\2H\b\3\2\2\2IP\5#\22\2JP\5%\23\2KP\5\'\24\2LP\5)\25"+
		"\2MP\5+\26\2NP\5-\27\2OI\3\2\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2"+
		"\2ON\3\2\2\2P\n\3\2\2\2QT\5\31\r\2RT\5\33\16\2SQ\3\2\2\2SR\3\2\2\2T\f"+
		"\3\2\2\2UW\t\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z"+
		"X\3\2\2\2[\\\5\27\f\2\\]\7*\2\2]_\5!\21\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5!\21\2de\7+\2\2e\16\3\2\2\2fh\t\4"+
		"\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\20\3\2\2\2km\5!\21\2ln\t"+
		"\5\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\5!\21\2rz\3"+
		"\2\2\2su\t\6\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xz\5"+
		"\23\n\2yk\3\2\2\2yt\3\2\2\2yx\3\2\2\2z\22\3\2\2\2{}\5\65\33\2|{\3\2\2"+
		"\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7N\2"+
		"\2\u0081\24\3\2\2\2\u0082\u0084\t\7\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\26\3\2\2\2\u0087"+
		"\u0088\7i\2\2\u0088\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\30\3\2\2\2\u008b"+
		"\u008c\7C\2\2\u008c\u008d\7P\2\2\u008d\u008e\7F\2\2\u008e\32\3\2\2\2\u008f"+
		"\u0090\7Q\2\2\u0090\u0091\7T\2\2\u0091\34\3\2\2\2\u0092\u0093\7K\2\2\u0093"+
		"\u0094\7P\2\2\u0094\36\3\2\2\2\u0095\u0097\5\65\33\2\u0096\u0095\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009e\7\60\2\2\u009b\u009d\5\65\33\2\u009c\u009b\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a8"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7\60\2\2\u00a2\u00a4\5\65\33"+
		"\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u0096\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8"+
		" \3\2\2\2\u00a9\u00aa\7)\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"$\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae&\3\2\2\2\u00af\u00b0\7>\2\2\u00b0("+
		"\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7?\2\2\u00b3*\3\2\2\2\u00b4\u00b5"+
		"\7>\2\2\u00b5\u00b6\7?\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9"+
		"\7@\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\7+\2\2\u00bd\62\3\2\2\2\u00be\u00c0\t\b\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\b\32\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\t\t\2\2\u00c6\66"+
		"\3\2\2\2\22\2OSXaiovy~\u0085\u0098\u009e\u00a5\u00a7\u00c1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}