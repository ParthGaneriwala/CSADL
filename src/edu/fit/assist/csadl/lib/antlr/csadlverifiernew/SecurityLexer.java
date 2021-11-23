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
		SECURE_ACTION_CONNECT=14, SECURE_ACTION_COMMUNICATE=15, ASSOCIATION_HAS=16, 
		ACTION_HAS=17, SERVER_TYPE=18, SECURITY=19, ENCRYPTION=20, ASSOCIATION_KEY=21, 
		ASSOCIATION_CREATE=22, SENSITIVITY=23, CONTENT=24, WS=25;
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
			"SECURE_ACTION_CONNECT", "SECURE_ACTION_COMMUNICATE", "ASSOCIATION_HAS", 
			"ACTION_HAS", "SERVER_TYPE", "SECURITY", "ENCRYPTION", "ASSOCIATION_KEY", 
			"ASSOCIATION_CREATE", "SENSITIVITY", "CONTENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "';'", "'guarantee'", 
			"'assume'", "'isConnectedTo'", null, "'isSecurelyConnectedTo'", null, 
			"'has'", "'performs'", null, "'isSecure'", "'hasFeatureEventEncryption'", 
			null, "'created'", null, "'content'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSET_COMPUTER", "ASSET_IOT_DEVICE", "ASSET_SERVER", "ASSET_SOFTWARE_FEATURE", 
			"ASSET_HARDWARE_COMPONENT", "SOFTWARE_FEATURE", "THING", "IDENTIFIER", 
			"ENDSYMBOL", "GUARANTEE", "ASSUMPTION", "ASSOCIATION_CONNECT", "ACTION_COMMUNICATE", 
			"SECURE_ACTION_CONNECT", "SECURE_ACTION_COMMUNICATE", "ASSOCIATION_HAS", 
			"ACTION_HAS", "SERVER_TYPE", "SECURITY", "ENCRYPTION", "ASSOCIATION_KEY", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u01db\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\b\3\b\3\t\3\t\7"+
		"\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00f3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0135"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0176\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ac\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01cb\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u01d6\n\32\r\32\16"+
		"\32\u01d7\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\3\2\5\3\2C\\\4\2\62;C\\\5\2\13\f\16\17\"\"\2\u01eb\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\3\65\3\2\2\2\5@\3\2\2\2\7L\3\2\2\2\t\177\3\2\2\2\13\u0081"+
		"\3\2\2\2\r\u0095\3\2\2\2\17\u00a2\3\2\2\2\21\u00a6\3\2\2\2\23\u00ad\3"+
		"\2\2\2\25\u00af\3\2\2\2\27\u00b9\3\2\2\2\31\u00c0\3\2\2\2\33\u00f2\3\2"+
		"\2\2\35\u00f4\3\2\2\2\37\u0134\3\2\2\2!\u0136\3\2\2\2#\u013a\3\2\2\2%"+
		"\u0175\3\2\2\2\'\u0177\3\2\2\2)\u0180\3\2\2\2+\u01ab\3\2\2\2-\u01ad\3"+
		"\2\2\2/\u01ca\3\2\2\2\61\u01cc\3\2\2\2\63\u01d5\3\2\2\2\65\66\7e\2\2\66"+
		"\67\7q\2\2\678\7o\2\289\7r\2\29:\7w\2\2:;\7v\2\2;<\7g\2\2<=\7t\2\2=>\3"+
		"\2\2\2>?\5\21\t\2?\4\3\2\2\2@A\7k\2\2AB\7q\2\2BC\7v\2\2CD\7F\2\2DE\7g"+
		"\2\2EF\7x\2\2FG\7k\2\2GH\7e\2\2HI\7g\2\2IJ\3\2\2\2JK\5\21\t\2K\6\3\2\2"+
		"\2LM\7u\2\2MN\7g\2\2NO\7t\2\2OP\7x\2\2PQ\7g\2\2QR\7t\2\2RS\3\2\2\2ST\5"+
		"\21\t\2T\b\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2XY\7g\2\2YZ\7t\2\2Z[\7p\2"+
		"\2[\\\7g\2\2\\]\7v\2\2]^\7H\2\2^_\7g\2\2_`\7c\2\2`a\7v\2\2ab\7w\2\2bc"+
		"\7t\2\2c\u0080\7g\2\2de\7u\2\2ef\7g\2\2fg\7e\2\2gh\7w\2\2hi\7t\2\2ij\7"+
		"k\2\2jk\7v\2\2kl\7{\2\2lm\7H\2\2mn\7g\2\2no\7c\2\2op\7v\2\2pq\7w\2\2q"+
		"r\7t\2\2r\u0080\7g\2\2st\7u\2\2tu\7o\2\2uv\7c\2\2vw\7t\2\2wx\7v\2\2xy"+
		"\7H\2\2yz\7g\2\2z{\7c\2\2{|\7v\2\2|}\7w\2\2}~\7t\2\2~\u0080\7g\2\2\177"+
		"U\3\2\2\2\177d\3\2\2\2\177s\3\2\2\2\u0080\n\3\2\2\2\u0081\u0082\7j\2\2"+
		"\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084\u0085\7f\2\2\u0085\u0086"+
		"\7y\2\2\u0086\u0087\7c\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7E\2\2\u008a\u008b\7q\2\2\u008b\u008c\7o\2\2\u008c\u008d\7r\2\2"+
		"\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\21\t\2\u0094"+
		"\f\3\2\2\2\u0095\u0096\5\21\t\2\u0096\16\3\2\2\2\u0097\u0098\7f\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009a\7v\2\2\u009a\u00a3\7c\2\2\u009b\u009c\7o\2\2"+
		"\u009c\u009d\7g\2\2\u009d\u009e\7u\2\2\u009e\u009f\7u\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a3\7g\2\2\u00a2\u0097\3\2\2\2\u00a2"+
		"\u009b\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\5\21\t\2\u00a5\20\3\2\2"+
		"\2\u00a6\u00aa\t\2\2\2\u00a7\u00a9\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\22\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7i\2\2"+
		"\u00b0\u00b1\7w\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7c\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7g\2\2"+
		"\u00bf\30\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7"+
		"E\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7f\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7q\2\2\u00cd\32\3\2\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7t\2\2"+
		"\u00d2\u00d3\7{\2\2\u00d3\u00d4\7r\2\2\u00d4\u00f3\7v\2\2\u00d5\u00d6"+
		"\7f\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7{\2\2\u00da\u00db\7r\2\2\u00db\u00f3\7v\2\2\u00dc\u00dd\7t\2\2"+
		"\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00f3\7f\2\2\u00e0\u00e1"+
		"\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00f3\7f\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7k\2\2\u00e9\u00ea\7x\2\2\u00ea\u00f3\7g\2\2\u00eb\u00ec"+
		"\7h\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7y\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f3\7f\2\2\u00f2\u00ce\3\2\2"+
		"\2\u00f2\u00d5\3\2\2\2\u00f2\u00dc\3\2\2\2\u00f2\u00e0\3\2\2\2\u00f2\u00e4"+
		"\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f3\34\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5"+
		"\u00f6\7u\2\2\u00f6\u00f7\7U\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7e\2\2"+
		"\u00f9\u00fa\7w\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd"+
		"\7n\2\2\u00fd\u00fe\7{\2\2\u00fe\u00ff\7E\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7p\2\2\u0102\u0103\7g\2\2\u0103\u0104\7e\2\2"+
		"\u0104\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7f\2\2\u0107\u0108"+
		"\7V\2\2\u0108\u0109\7q\2\2\u0109\36\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c"+
		"\7g\2\2\u010c\u010d\7e\2\2\u010d\u010e\7w\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7n\2\2\u0111\u0112\7{\2\2\u0112\u0113\7U\2\2"+
		"\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115\u0135\7f\2\2\u0116\u0117"+
		"\7u\2\2\u0117\u0118\7g\2\2\u0118\u0119\7e\2\2\u0119\u011a\7w\2\2\u011a"+
		"\u011b\7t\2\2\u011b\u011c\7g\2\2\u011c\u011d\7n\2\2\u011d\u011e\7{\2\2"+
		"\u011e\u011f\7T\2\2\u011f\u0120\7g\2\2\u0120\u0121\7e\2\2\u0121\u0122"+
		"\7g\2\2\u0122\u0123\7k\2\2\u0123\u0124\7x\2\2\u0124\u0135\7g\2\2\u0125"+
		"\u0126\7u\2\2\u0126\u0127\7g\2\2\u0127\u0128\7e\2\2\u0128\u0129\7w\2\2"+
		"\u0129\u012a\7t\2\2\u012a\u012b\7g\2\2\u012b\u012c\7n\2\2\u012c\u012d"+
		"\7{\2\2\u012d\u012e\7H\2\2\u012e\u012f\7q\2\2\u012f\u0130\7t\2\2\u0130"+
		"\u0131\7y\2\2\u0131\u0132\7c\2\2\u0132\u0133\7t\2\2\u0133\u0135\7f\2\2"+
		"\u0134\u010a\3\2\2\2\u0134\u0116\3\2\2\2\u0134\u0125\3\2\2\2\u0135 \3"+
		"\2\2\2\u0136\u0137\7j\2\2\u0137\u0138\7c\2\2\u0138\u0139\7u\2\2\u0139"+
		"\"\3\2\2\2\u013a\u013b\7r\2\2\u013b\u013c\7g\2\2\u013c\u013d\7t\2\2\u013d"+
		"\u013e\7h\2\2\u013e\u013f\7q\2\2\u013f\u0140\7t\2\2\u0140\u0141\7o\2\2"+
		"\u0141\u0142\7u\2\2\u0142$\3\2\2\2\u0143\u0144\7k\2\2\u0144\u0145\7u\2"+
		"\2\u0145\u0146\7H\2\2\u0146\u0147\7k\2\2\u0147\u0148\7t\2\2\u0148\u0149"+
		"\7u\2\2\u0149\u014a\7v\2\2\u014a\u014b\7R\2\2\u014b\u014c\7c\2\2\u014c"+
		"\u014d\7t\2\2\u014d\u014e\7v\2\2\u014e\u0176\7{\2\2\u014f\u0150\7k\2\2"+
		"\u0150\u0151\7u\2\2\u0151\u0152\7V\2\2\u0152\u0153\7j\2\2\u0153\u0154"+
		"\7k\2\2\u0154\u0155\7t\2\2\u0155\u0156\7f\2\2\u0156\u0157\7R\2\2\u0157"+
		"\u0158\7c\2\2\u0158\u0159\7t\2\2\u0159\u015a\7v\2\2\u015a\u0176\7{\2\2"+
		"\u015b\u015c\7k\2\2\u015c\u015d\7u\2\2\u015d\u015e\7F\2\2\u015e\u015f"+
		"\7g\2\2\u015f\u0160\7o\2\2\u0160\u0161\7G\2\2\u0161\u0162\7z\2\2\u0162"+
		"\u0163\7v\2\2\u0163\u0164\7g\2\2\u0164\u0165\7t\2\2\u0165\u0166\7p\2\2"+
		"\u0166\u0167\7c\2\2\u0167\u0176\7n\2\2\u0168\u0169\7k\2\2\u0169\u016a"+
		"\7u\2\2\u016a\u016b\7F\2\2\u016b\u016c\7g\2\2\u016c\u016d\7o\2\2\u016d"+
		"\u016e\7K\2\2\u016e\u016f\7p\2\2\u016f\u0170\7v\2\2\u0170\u0171\7g\2\2"+
		"\u0171\u0172\7t\2\2\u0172\u0173\7p\2\2\u0173\u0174\7c\2\2\u0174\u0176"+
		"\7n\2\2\u0175\u0143\3\2\2\2\u0175\u014f\3\2\2\2\u0175\u015b\3\2\2\2\u0175"+
		"\u0168\3\2\2\2\u0176&\3\2\2\2\u0177\u0178\7k\2\2\u0178\u0179\7u\2\2\u0179"+
		"\u017a\7U\2\2\u017a\u017b\7g\2\2\u017b\u017c\7e\2\2\u017c\u017d\7w\2\2"+
		"\u017d\u017e\7t\2\2\u017e\u017f\7g\2\2\u017f(\3\2\2\2\u0180\u0181\7j\2"+
		"\2\u0181\u0182\7c\2\2\u0182\u0183\7u\2\2\u0183\u0184\7H\2\2\u0184\u0185"+
		"\7g\2\2\u0185\u0186\7c\2\2\u0186\u0187\7v\2\2\u0187\u0188\7w\2\2\u0188"+
		"\u0189\7t\2\2\u0189\u018a\7g\2\2\u018a\u018b\7G\2\2\u018b\u018c\7x\2\2"+
		"\u018c\u018d\7g\2\2\u018d\u018e\7p\2\2\u018e\u018f\7v\2\2\u018f\u0190"+
		"\7G\2\2\u0190\u0191\7p\2\2\u0191\u0192\7e\2\2\u0192\u0193\7t\2\2\u0193"+
		"\u0194\7{\2\2\u0194\u0195\7r\2\2\u0195\u0196\7v\2\2\u0196\u0197\7k\2\2"+
		"\u0197\u0198\7q\2\2\u0198\u0199\7p\2\2\u0199*\3\2\2\2\u019a\u019b\7m\2"+
		"\2\u019b\u019c\7p\2\2\u019c\u019d\7q\2\2\u019d\u019e\7y\2\2\u019e\u019f"+
		"\7M\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7{\2\2\u01a1\u01a2\7Q\2\2\u01a2"+
		"\u01ac\7h\2\2\u01a3\u01a4\7j\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7u\2\2"+
		"\u01a6\u01a7\7M\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7{\2\2\u01a9\u01aa"+
		"\7Q\2\2\u01aa\u01ac\7h\2\2\u01ab\u019a\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ac"+
		",\3\2\2\2\u01ad\u01ae\7e\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7g\2\2\u01b0"+
		"\u01b1\7c\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7f\2\2"+
		"\u01b4.\3\2\2\2\u01b5\u01b6\7j\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7u\2"+
		"\2\u01b8\u01b9\7U\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc"+
		"\7u\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7k\2\2\u01bf"+
		"\u01c0\7x\2\2\u01c0\u01cb\7g\2\2\u01c1\u01c2\7j\2\2\u01c2\u01c3\7c\2\2"+
		"\u01c3\u01c4\7u\2\2\u01c4\u01c5\7P\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7"+
		"\7t\2\2\u01c7\u01c8\7o\2\2\u01c8\u01c9\7c\2\2\u01c9\u01cb\7n\2\2\u01ca"+
		"\u01b5\3\2\2\2\u01ca\u01c1\3\2\2\2\u01cb\60\3\2\2\2\u01cc\u01cd\7e\2\2"+
		"\u01cd\u01ce\7q\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7v\2\2\u01d0\u01d1"+
		"\7g\2\2\u01d1\u01d2\7p\2\2\u01d2\u01d3\7v\2\2\u01d3\62\3\2\2\2\u01d4\u01d6"+
		"\t\4\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\b\32\2\2\u01da\64\3\2\2"+
		"\2\f\2\177\u00a2\u00aa\u00f2\u0134\u0175\u01ab\u01ca\u01d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}