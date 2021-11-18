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
		ASSOCIATION_HAS=14, ACTION_HAS=15, SERVER_TYPE=16, SECURITY=17, ASSOCIATION_KEY=18, 
		ASSOCIATION_CREATE=19, SENSITIVITY=20, CONTENT=21, WS=22;
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
			"ASSOCIATION_HAS", "ACTION_HAS", "SERVER_TYPE", "SECURITY", "ASSOCIATION_KEY", 
			"ASSOCIATION_CREATE", "SENSITIVITY", "CONTENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "';'", "'guarantee'", 
			"'assume'", "'isConnectedTo'", null, "'has'", "'performs'", null, "'isSecure'", 
			null, "'created'", null, "'content'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSET_COMPUTER", "ASSET_IOT_DEVICE", "ASSET_SERVER", "ASSET_SOFTWARE_FEATURE", 
			"ASSET_HARDWARE_COMPONENT", "SOFTWARE_FEATURE", "THING", "IDENTIFIER", 
			"ENDSYMBOL", "GUARANTEE", "ASSUMPTION", "ASSOCIATION_CONNECT", "ACTION_COMMUNICATE", 
			"ASSOCIATION_HAS", "ACTION_HAS", "SERVER_TYPE", "SECURITY", "ASSOCIATION_KEY", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0179\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u009d\n\b\3\b\3\b\3\t\3\t\7\t\u00a3\n\t\f\t\16\t\u00a6\13\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ed\n\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u012e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u014a\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0169\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u0174\n\27\r\27\16\27\u0175\3"+
		"\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\3\2C\\\4\2\62"+
		";C\\\5\2\13\f\16\17\"\"\2\u0187\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5:\3\2\2\2\7F\3\2\2\2\ty\3\2\2\2\13"+
		"{\3\2\2\2\r\u008f\3\2\2\2\17\u009c\3\2\2\2\21\u00a0\3\2\2\2\23\u00a7\3"+
		"\2\2\2\25\u00a9\3\2\2\2\27\u00b3\3\2\2\2\31\u00ba\3\2\2\2\33\u00ec\3\2"+
		"\2\2\35\u00ee\3\2\2\2\37\u00f2\3\2\2\2!\u012d\3\2\2\2#\u012f\3\2\2\2%"+
		"\u0149\3\2\2\2\'\u014b\3\2\2\2)\u0168\3\2\2\2+\u016a\3\2\2\2-\u0173\3"+
		"\2\2\2/\60\7e\2\2\60\61\7q\2\2\61\62\7o\2\2\62\63\7r\2\2\63\64\7w\2\2"+
		"\64\65\7v\2\2\65\66\7g\2\2\66\67\7t\2\2\678\3\2\2\289\5\21\t\29\4\3\2"+
		"\2\2:;\7k\2\2;<\7q\2\2<=\7v\2\2=>\7F\2\2>?\7g\2\2?@\7x\2\2@A\7k\2\2AB"+
		"\7e\2\2BC\7g\2\2CD\3\2\2\2DE\5\21\t\2E\6\3\2\2\2FG\7u\2\2GH\7g\2\2HI\7"+
		"t\2\2IJ\7x\2\2JK\7g\2\2KL\7t\2\2LM\3\2\2\2MN\5\21\t\2N\b\3\2\2\2OP\7k"+
		"\2\2PQ\7p\2\2QR\7v\2\2RS\7g\2\2ST\7t\2\2TU\7p\2\2UV\7g\2\2VW\7v\2\2WX"+
		"\7H\2\2XY\7g\2\2YZ\7c\2\2Z[\7v\2\2[\\\7w\2\2\\]\7t\2\2]z\7g\2\2^_\7u\2"+
		"\2_`\7g\2\2`a\7e\2\2ab\7w\2\2bc\7t\2\2cd\7k\2\2de\7v\2\2ef\7{\2\2fg\7"+
		"H\2\2gh\7g\2\2hi\7c\2\2ij\7v\2\2jk\7w\2\2kl\7t\2\2lz\7g\2\2mn\7u\2\2n"+
		"o\7o\2\2op\7c\2\2pq\7t\2\2qr\7v\2\2rs\7H\2\2st\7g\2\2tu\7c\2\2uv\7v\2"+
		"\2vw\7w\2\2wx\7t\2\2xz\7g\2\2yO\3\2\2\2y^\3\2\2\2ym\3\2\2\2z\n\3\2\2\2"+
		"{|\7j\2\2|}\7c\2\2}~\7t\2\2~\177\7f\2\2\177\u0080\7y\2\2\u0080\u0081\7"+
		"c\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7E\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7o\2\2\u0086\u0087\7r\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008e\5\21\t\2\u008e\f\3\2\2\2\u008f\u0090"+
		"\5\21\t\2\u0090\16\3\2\2\2\u0091\u0092\7f\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u009d\7c\2\2\u0095\u0096\7o\2\2\u0096\u0097\7g\2\2"+
		"\u0097\u0098\7u\2\2\u0098\u0099\7u\2\2\u0099\u009a\7c\2\2\u009a\u009b"+
		"\7i\2\2\u009b\u009d\7g\2\2\u009c\u0091\3\2\2\2\u009c\u0095\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\5\21\t\2\u009f\20\3\2\2\2\u00a0\u00a4\t\2\2"+
		"\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\22\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7=\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7w\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7p\2\2"+
		"\u00af\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7g\2\2\u00b2\26\3\2"+
		"\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7"+
		"\7w\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7g\2\2\u00b9\30\3\2\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7E\2\2\u00bd\u00be\7q\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7e\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6"+
		"\7V\2\2\u00c6\u00c7\7q\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7{\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00ed\7v\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7e\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7{\2\2\u00d4\u00d5"+
		"\7r\2\2\u00d5\u00ed\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\u00d9\7c\2\2\u00d9\u00ed\7f\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7g\2\2"+
		"\u00dc\u00dd\7p\2\2\u00dd\u00ed\7f\2\2\u00de\u00df\7t\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7x\2\2\u00e4\u00ed\7g\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7q\2\2"+
		"\u00e7\u00e8\7t\2\2\u00e8\u00e9\7y\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb\u00ed\7f\2\2\u00ec\u00c8\3\2\2\2\u00ec\u00cf\3\2\2\2\u00ec"+
		"\u00d6\3\2\2\2\u00ec\u00da\3\2\2\2\u00ec\u00de\3\2\2\2\u00ec\u00e5\3\2"+
		"\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1"+
		"\7u\2\2\u00f1\36\3\2\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5"+
		"\7t\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\u00f9\7o\2\2\u00f9\u00fa\7u\2\2\u00fa \3\2\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7u\2\2\u00fd\u00fe\7H\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7t\2\2"+
		"\u0100\u0101\7u\2\2\u0101\u0102\7v\2\2\u0102\u0103\7R\2\2\u0103\u0104"+
		"\7c\2\2\u0104\u0105\7t\2\2\u0105\u0106\7v\2\2\u0106\u012e\7{\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7u\2\2\u0109\u010a\7V\2\2\u010a\u010b\7j\2\2"+
		"\u010b\u010c\7k\2\2\u010c\u010d\7t\2\2\u010d\u010e\7f\2\2\u010e\u010f"+
		"\7R\2\2\u010f\u0110\7c\2\2\u0110\u0111\7t\2\2\u0111\u0112\7v\2\2\u0112"+
		"\u012e\7{\2\2\u0113\u0114\7k\2\2\u0114\u0115\7u\2\2\u0115\u0116\7F\2\2"+
		"\u0116\u0117\7g\2\2\u0117\u0118\7o\2\2\u0118\u0119\7G\2\2\u0119\u011a"+
		"\7z\2\2\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7p\2\2\u011e\u011f\7c\2\2\u011f\u012e\7n\2\2\u0120\u0121\7k\2\2"+
		"\u0121\u0122\7u\2\2\u0122\u0123\7F\2\2\u0123\u0124\7g\2\2\u0124\u0125"+
		"\7o\2\2\u0125\u0126\7K\2\2\u0126\u0127\7p\2\2\u0127\u0128\7v\2\2\u0128"+
		"\u0129\7g\2\2\u0129\u012a\7t\2\2\u012a\u012b\7p\2\2\u012b\u012c\7c\2\2"+
		"\u012c\u012e\7n\2\2\u012d\u00fb\3\2\2\2\u012d\u0107\3\2\2\2\u012d\u0113"+
		"\3\2\2\2\u012d\u0120\3\2\2\2\u012e\"\3\2\2\2\u012f\u0130\7k\2\2\u0130"+
		"\u0131\7u\2\2\u0131\u0132\7U\2\2\u0132\u0133\7g\2\2\u0133\u0134\7e\2\2"+
		"\u0134\u0135\7w\2\2\u0135\u0136\7t\2\2\u0136\u0137\7g\2\2\u0137$\3\2\2"+
		"\2\u0138\u0139\7m\2\2\u0139\u013a\7p\2\2\u013a\u013b\7q\2\2\u013b\u013c"+
		"\7y\2\2\u013c\u013d\7M\2\2\u013d\u013e\7g\2\2\u013e\u013f\7{\2\2\u013f"+
		"\u0140\7Q\2\2\u0140\u014a\7h\2\2\u0141\u0142\7j\2\2\u0142\u0143\7c\2\2"+
		"\u0143\u0144\7u\2\2\u0144\u0145\7M\2\2\u0145\u0146\7g\2\2\u0146\u0147"+
		"\7{\2\2\u0147\u0148\7Q\2\2\u0148\u014a\7h\2\2\u0149\u0138\3\2\2\2\u0149"+
		"\u0141\3\2\2\2\u014a&\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7t\2\2\u014d"+
		"\u014e\7g\2\2\u014e\u014f\7c\2\2\u014f\u0150\7v\2\2\u0150\u0151\7g\2\2"+
		"\u0151\u0152\7f\2\2\u0152(\3\2\2\2\u0153\u0154\7j\2\2\u0154\u0155\7c\2"+
		"\2\u0155\u0156\7u\2\2\u0156\u0157\7U\2\2\u0157\u0158\7g\2\2\u0158\u0159"+
		"\7p\2\2\u0159\u015a\7u\2\2\u015a\u015b\7k\2\2\u015b\u015c\7v\2\2\u015c"+
		"\u015d\7k\2\2\u015d\u015e\7x\2\2\u015e\u0169\7g\2\2\u015f\u0160\7j\2\2"+
		"\u0160\u0161\7c\2\2\u0161\u0162\7u\2\2\u0162\u0163\7P\2\2\u0163\u0164"+
		"\7q\2\2\u0164\u0165\7t\2\2\u0165\u0166\7o\2\2\u0166\u0167\7c\2\2\u0167"+
		"\u0169\7n\2\2\u0168\u0153\3\2\2\2\u0168\u015f\3\2\2\2\u0169*\3\2\2\2\u016a"+
		"\u016b\7e\2\2\u016b\u016c\7q\2\2\u016c\u016d\7p\2\2\u016d\u016e\7v\2\2"+
		"\u016e\u016f\7g\2\2\u016f\u0170\7p\2\2\u0170\u0171\7v\2\2\u0171,\3\2\2"+
		"\2\u0172\u0174\t\4\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\27\2\2"+
		"\u0178.\3\2\2\2\13\2y\u009c\u00a4\u00ec\u012d\u0149\u0168\u0175\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}