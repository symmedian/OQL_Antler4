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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, COMPARATOR=8, 
		LOGICAL=9, GET_FIELD=10, FIELD=11, VALUE=12, NUMBER=13, LONG=14, GET=15, 
		AND=16, OR=17, IN=18, QUOTE=19, EQUAL=20, GT=21, LT=22, GTEQ=23, LTEQ=24, 
		NE=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"' IN SET ('", "'where'", "'WHERE'", "'('", "')'", "'get('active')'", 
		"','", "COMPARATOR", "LOGICAL", "GET_FIELD", "FIELD", "VALUE", "NUMBER", 
		"LONG", "'get'", "'AND'", "'OR'", "'IN'", "'''", "'='", "'>'", "'<'", 
		"'>='", "'<='", "'<>'", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COMPARATOR", 
		"LOGICAL", "GET_FIELD", "FIELD", "VALUE", "NUMBER", "LONG", "GET", "AND", 
		"OR", "IN", "QUOTE", "EQUAL", "GT", "LT", "GTEQ", "LTEQ", "NE", "WS", 
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
		"\2\4\34\u00d4\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\5\nn\n\n\3\13"+
		"\3\13\3\13\3\13\6\13t\n\13\r\13\16\13u\3\13\3\13\3\13\3\f\6\f|\n\f\r\f"+
		"\16\f}\3\r\3\r\7\r\u0082\n\r\f\r\16\r\u0085\13\r\3\r\3\r\3\r\3\r\5\r\u008b"+
		"\n\r\3\16\5\16\u008e\n\16\3\16\3\16\6\16\u0092\n\16\r\16\16\16\u0093\3"+
		"\16\6\16\u0097\n\16\r\16\16\16\u0098\3\16\3\16\7\16\u009d\n\16\f\16\16"+
		"\16\u00a0\13\16\5\16\u00a2\n\16\5\16\u00a4\n\16\3\17\6\17\u00a7\n\17\r"+
		"\17\16\17\u00a8\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\6\33\u00cd\n\33\r\33\16"+
		"\33\u00ce\3\33\3\33\3\34\3\34\3\u0083\35\3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1"+
		"\65\34\2\67\2\1\3\2\6\5\62;C\\c|\5\62;C\\c|\5\13\f\17\17\"\"\3\62;\u00e5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\39\3\2\2\2\5C\3\2\2\2\7I\3\2"+
		"\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17a\3\2\2\2\21i\3\2\2\2\23m\3\2"+
		"\2\2\25o\3\2\2\2\27{\3\2\2\2\31\u008a\3\2\2\2\33\u008d\3\2\2\2\35\u00a6"+
		"\3\2\2\2\37\u00ac\3\2\2\2!\u00b0\3\2\2\2#\u00b4\3\2\2\2%\u00b7\3\2\2\2"+
		"\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3"+
		"\2\2\2\61\u00c5\3\2\2\2\63\u00c8\3\2\2\2\65\u00cc\3\2\2\2\67\u00d2\3\2"+
		"\2\29:\7\"\2\2:;\7K\2\2;<\7P\2\2<=\7\"\2\2=>\7U\2\2>?\7G\2\2?@\7V\2\2"+
		"@A\7\"\2\2AB\7*\2\2B\4\3\2\2\2CD\7y\2\2DE\7j\2\2EF\7g\2\2FG\7t\2\2GH\7"+
		"g\2\2H\6\3\2\2\2IJ\7Y\2\2JK\7J\2\2KL\7G\2\2LM\7T\2\2MN\7G\2\2N\b\3\2\2"+
		"\2OP\7*\2\2P\n\3\2\2\2QR\7+\2\2R\f\3\2\2\2ST\7i\2\2TU\7g\2\2UV\7v\2\2"+
		"VW\7*\2\2WX\7)\2\2XY\7c\2\2YZ\7e\2\2Z[\7v\2\2[\\\7k\2\2\\]\7x\2\2]^\7"+
		"g\2\2^_\7)\2\2_`\7+\2\2`\16\3\2\2\2ab\7.\2\2b\20\3\2\2\2cj\5)\25\2dj\5"+
		"+\26\2ej\5-\27\2fj\5/\30\2gj\5\61\31\2hj\5\63\32\2ic\3\2\2\2id\3\2\2\2"+
		"ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\22\3\2\2\2kn\5!\21\2ln\5#\22"+
		"\2mk\3\2\2\2ml\3\2\2\2n\24\3\2\2\2op\5\37\20\2pq\7*\2\2qs\5\'\24\2rt\t"+
		"\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\'\24\2xy"+
		"\7+\2\2y\26\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\30\3\2\2\2\177\u0083\5\'\24\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\'\24\2\u0087\u008b\3\2\2\2"+
		"\u0088\u008b\5\33\16\2\u0089\u008b\5\35\17\2\u008a\177\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\32\3\2\2\2\u008c\u008e\7/\2\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00a3\3\2\2\2\u008f\u0091\7\60"+
		"\2\2\u0090\u0092\5\67\34\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a4\3\2\2\2\u0095\u0097\5\67"+
		"\34\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a1\3\2\2\2\u009a\u009e\7\60\2\2\u009b\u009d\5"+
		"\67\34\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u009a\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u008f\3\2\2\2\u00a3"+
		"\u0096\3\2\2\2\u00a4\34\3\2\2\2\u00a5\u00a7\5\67\34\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\7N\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7i\2\2"+
		"\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af \3\2\2\2\u00b0\u00b1\7C\2"+
		"\2\u00b1\u00b2\7P\2\2\u00b2\u00b3\7F\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7"+
		"Q\2\2\u00b5\u00b6\7T\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7K\2\2\u00b8\u00b9"+
		"\7P\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7"+
		"?\2\2\u00bd*\3\2\2\2\u00be\u00bf\7@\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7>"+
		"\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4\7?\2\2\u00c4\60\3\2"+
		"\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7?\2\2\u00c7\62\3\2\2\2\u00c8\u00c9"+
		"\7>\2\2\u00c9\u00ca\7@\2\2\u00ca\64\3\2\2\2\u00cb\u00cd\t\4\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\33\2\2\u00d1\66\3\2\2\2\u00d2\u00d3"+
		"\t\5\2\2\u00d38\3\2\2\2\21\2imu}\u0083\u008a\u008d\u0093\u0098\u009e\u00a1"+
		"\u00a3\u00a8\u00ce";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}