// Generated from csadlverifiernew/Security.g4 by ANTLR 4.9.2

package edu.fit.assist.csadl.lib.antlr.csadlverifiernew;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SecurityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSET_COMPUTER=1, ASSET_IOT_DEVICE=2, ASSET_SERVER=3, ASSET_SOFTWARE_FEATURE=4, 
		ASSET_HARDWARE_COMPONENT=5, SOFTWARE_FEATURE=6, THING=7, IDENTIFIER=8, 
		ENDSYMBOL=9, GUARANTEE=10, ASSUMPTION=11, ASSOCIATION_CONNECT=12, ACTION_COMMUNICATE=13, 
		ASSOCIATION_HAS=14, ACTION_HAS=15, ASSOCIATION_COMPUTER=16, ASSOCIATION_KEY=17, 
		ASSOCIATION_CREATE=18, SENSITIVITY=19, CONTENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSET_COMPUTER", "ASSET_IOT_DEVICE", "ASSET_SERVER", "ASSET_SOFTWARE_FEATURE", 
			"ASSET_HARDWARE_COMPONENT", "SOFTWARE_FEATURE", "THING", "IDENTIFIER", 
			"ENDSYMBOL", "GUARANTEE", "ASSUMPTION", "ASSOCIATION_CONNECT", "ACTION_COMMUNICATE", 
			"ASSOCIATION_HAS", "ACTION_HAS", "ASSOCIATION_COMPUTER", "ASSOCIATION_KEY", 
			"ASSOCIATION_CREATE", "SENSITIVITY", "CONTENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "';'", "'guarantee'", 
			"'assume'", "'isConnectedTo'", null, "'has'", "'performs'", "'is'", null, 
			"'created'", null, "'content'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSET_COMPUTER", "ASSET_IOT_DEVICE", "ASSET_SERVER", "ASSET_SOFTWARE_FEATURE", 
			"ASSET_HARDWARE_COMPONENT", "SOFTWARE_FEATURE", "THING", "IDENTIFIER", 
			"ENDSYMBOL", "GUARANTEE", "ASSUMPTION", "ASSOCIATION_CONNECT", "ACTION_COMMUNICATE", 
			"ASSOCIATION_HAS", "ACTION_HAS", "ASSOCIATION_COMPUTER", "ASSOCIATION_KEY", 
			"ASSOCIATION_CREATE", "SENSITIVITY", "CONTENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SecurityLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Security.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5x\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009b"+
		"\n\b\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010c"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u012b\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\6\26\u0136\n\26\r\26\16\26\u0137\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27\3\2\5\3\2C\\\4\2\62;C\\\5\2\13\f\16\17\"\"\2\u0146\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\58\3\2\2\2\7D\3\2"+
		"\2\2\tw\3\2\2\2\13y\3\2\2\2\r\u008d\3\2\2\2\17\u009a\3\2\2\2\21\u009c"+
		"\3\2\2\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00af\3\2\2\2\31\u00b6\3"+
		"\2\2\2\33\u00e8\3\2\2\2\35\u00ea\3\2\2\2\37\u00ee\3\2\2\2!\u00f7\3\2\2"+
		"\2#\u010b\3\2\2\2%\u010d\3\2\2\2\'\u012a\3\2\2\2)\u012c\3\2\2\2+\u0135"+
		"\3\2\2\2-.\7e\2\2./\7q\2\2/\60\7o\2\2\60\61\7r\2\2\61\62\7w\2\2\62\63"+
		"\7v\2\2\63\64\7g\2\2\64\65\7t\2\2\65\66\3\2\2\2\66\67\5\21\t\2\67\4\3"+
		"\2\2\289\7k\2\29:\7q\2\2:;\7v\2\2;<\7F\2\2<=\7g\2\2=>\7x\2\2>?\7k\2\2"+
		"?@\7e\2\2@A\7g\2\2AB\3\2\2\2BC\5\21\t\2C\6\3\2\2\2DE\7u\2\2EF\7g\2\2F"+
		"G\7t\2\2GH\7x\2\2HI\7g\2\2IJ\7t\2\2JK\3\2\2\2KL\5\21\t\2L\b\3\2\2\2MN"+
		"\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7g\2\2QR\7t\2\2RS\7p\2\2ST\7g\2\2TU\7v\2\2"+
		"UV\7H\2\2VW\7g\2\2WX\7c\2\2XY\7v\2\2YZ\7w\2\2Z[\7t\2\2[x\7g\2\2\\]\7u"+
		"\2\2]^\7g\2\2^_\7e\2\2_`\7w\2\2`a\7t\2\2ab\7k\2\2bc\7v\2\2cd\7{\2\2de"+
		"\7H\2\2ef\7g\2\2fg\7c\2\2gh\7v\2\2hi\7w\2\2ij\7t\2\2jx\7g\2\2kl\7u\2\2"+
		"lm\7o\2\2mn\7c\2\2no\7t\2\2op\7v\2\2pq\7H\2\2qr\7g\2\2rs\7c\2\2st\7v\2"+
		"\2tu\7w\2\2uv\7t\2\2vx\7g\2\2wM\3\2\2\2w\\\3\2\2\2wk\3\2\2\2x\n\3\2\2"+
		"\2yz\7j\2\2z{\7c\2\2{|\7t\2\2|}\7f\2\2}~\7y\2\2~\177\7c\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7E\2\2\u0082\u0083\7q\2\2\u0083"+
		"\u0084\7o\2\2\u0084\u0085\7r\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\5\21\t\2\u008c\f\3\2\2\2\u008d\u008e\5\21\t\2\u008e"+
		"\16\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092"+
		"\u009b\7c\2\2\u0093\u0094\7o\2\2\u0094\u0095\7g\2\2\u0095\u0096\7u\2\2"+
		"\u0096\u0097\7u\2\2\u0097\u0098\7c\2\2\u0098\u0099\7i\2\2\u0099\u009b"+
		"\7g\2\2\u009a\u008f\3\2\2\2\u009a\u0093\3\2\2\2\u009b\20\3\2\2\2\u009c"+
		"\u00a0\t\2\2\2\u009d\u009f\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\22\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\7=\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7i\2\2\u00a6"+
		"\u00a7\7w\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7c\2\2"+
		"\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\7g\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\30\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7E\2\2\u00b9"+
		"\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\u00be\7e\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7f\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c3\7q\2\2\u00c3\32\3\2\2\2\u00c4\u00c5"+
		"\7g\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7t\2\2\u00c8"+
		"\u00c9\7{\2\2\u00c9\u00ca\7r\2\2\u00ca\u00e9\7v\2\2\u00cb\u00cc\7f\2\2"+
		"\u00cc\u00cd\7g\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7{\2\2\u00d0\u00d1\7r\2\2\u00d1\u00e9\7v\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7c\2\2\u00d5\u00e9\7f\2\2\u00d6\u00d7\7u\2\2"+
		"\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00e9\7f\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7x\2\2\u00e0\u00e9\7g\2\2\u00e1\u00e2\7h\2\2"+
		"\u00e2\u00e3\7q\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7y\2\2\u00e5\u00e6"+
		"\7c\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e9\7f\2\2\u00e8\u00c4\3\2\2\2\u00e8"+
		"\u00cb\3\2\2\2\u00e8\u00d2\3\2\2\2\u00e8\u00d6\3\2\2\2\u00e8\u00da\3\2"+
		"\2\2\u00e8\u00e1\3\2\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7u\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0"+
		"\7g\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7u\2\2\u00f6 \3\2\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7u\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\7m\2\2\u00fb"+
		"\u00fc\7p\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7y\2\2\u00fe\u00ff\7M\2\2"+
		"\u00ff\u0100\7g\2\2\u0100\u0101\7{\2\2\u0101\u0102\7Q\2\2\u0102\u010c"+
		"\7h\2\2\u0103\u0104\7j\2\2\u0104\u0105\7c\2\2\u0105\u0106\7u\2\2\u0106"+
		"\u0107\7M\2\2\u0107\u0108\7g\2\2\u0108\u0109\7{\2\2\u0109\u010a\7Q\2\2"+
		"\u010a\u010c\7h\2\2\u010b\u00fa\3\2\2\2\u010b\u0103\3\2\2\2\u010c$\3\2"+
		"\2\2\u010d\u010e\7e\2\2\u010e\u010f\7t\2\2\u010f\u0110\7g\2\2\u0110\u0111"+
		"\7c\2\2\u0111\u0112\7v\2\2\u0112\u0113\7g\2\2\u0113\u0114\7f\2\2\u0114"+
		"&\3\2\2\2\u0115\u0116\7j\2\2\u0116\u0117\7c\2\2\u0117\u0118\7u\2\2\u0118"+
		"\u0119\7U\2\2\u0119\u011a\7g\2\2\u011a\u011b\7p\2\2\u011b\u011c\7u\2\2"+
		"\u011c\u011d\7k\2\2\u011d\u011e\7v\2\2\u011e\u011f\7k\2\2\u011f\u0120"+
		"\7x\2\2\u0120\u012b\7g\2\2\u0121\u0122\7j\2\2\u0122\u0123\7c\2\2\u0123"+
		"\u0124\7u\2\2\u0124\u0125\7P\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2\2"+
		"\u0127\u0128\7o\2\2\u0128\u0129\7c\2\2\u0129\u012b\7n\2\2\u012a\u0115"+
		"\3\2\2\2\u012a\u0121\3\2\2\2\u012b(\3\2\2\2\u012c\u012d\7e\2\2\u012d\u012e"+
		"\7q\2\2\u012e\u012f\7p\2\2\u012f\u0130\7v\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7p\2\2\u0132\u0133\7v\2\2\u0133*\3\2\2\2\u0134\u0136\t\4\2\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\26\2\2\u013a,\3\2\2\2\n\2w\u009a"+
		"\u00a0\u00e8\u010b\u012a\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}