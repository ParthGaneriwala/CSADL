package edu.fit.assist.csadl.lib.antlr.csadlverifier;

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
		ASSET=1, CHAR=2, BEGIN=3, END=4, ENDSYMBOL=5, GUARANTEE=6, ASSUMPTION=7, 
		ACTION=8, ASSOCIATION=9, SENSITIVITY=10, MESSAGE=11, CONTENT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSET", "CHAR", "BEGIN", "END", "ENDSYMBOL", "GUARANTEE", "ASSUMPTION", 
			"ACTION", "ASSOCIATION", "SENSITIVITY", "MESSAGE", "CONTENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "';'", "'guarantee'", "'assume'", null, 
			null, null, null, "'content'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSET", "CHAR", "BEGIN", "END", "ENDSYMBOL", "GUARANTEE", "ASSUMPTION", 
			"ACTION", "ASSOCIATION", "SENSITIVITY", "MESSAGE", "CONTENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00e0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ca\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u00db"+
		"\n\16\r\16\16\16\u00dc\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\3\2\3\5\2\13\f\16\17\"\"\2\u00e9\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5(\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13"+
		".\3\2\2\2\r\60\3\2\2\2\17:\3\2\2\2\21\u0084\3\2\2\2\23\u00b2\3\2\2\2\25"+
		"\u00c9\3\2\2\2\27\u00cb\3\2\2\2\31\u00d1\3\2\2\2\33\u00da\3\2\2\2\35\36"+
		"\7e\2\2\36\37\7q\2\2\37 \7o\2\2 !\7r\2\2!\"\7w\2\2\"#\7v\2\2#$\7g\2\2"+
		"$%\7t\2\2%&\3\2\2\2&\'\5\5\3\2\'\4\3\2\2\2()\4C\\\2)\6\3\2\2\2*+\7}\2"+
		"\2+\b\3\2\2\2,-\7\177\2\2-\n\3\2\2\2./\7=\2\2/\f\3\2\2\2\60\61\7i\2\2"+
		"\61\62\7w\2\2\62\63\7c\2\2\63\64\7t\2\2\64\65\7c\2\2\65\66\7p\2\2\66\67"+
		"\7v\2\2\678\7g\2\289\7g\2\29\16\3\2\2\2:;\7c\2\2;<\7u\2\2<=\7u\2\2=>\7"+
		"w\2\2>?\7o\2\2?@\7g\2\2@\20\3\2\2\2AB\7g\2\2BC\7p\2\2CD\7e\2\2DE\7t\2"+
		"\2EF\7{\2\2FG\7r\2\2GH\7v\2\2HI\7O\2\2IJ\7u\2\2JK\7i\2\2KL\7V\2\2L\u0085"+
		"\7q\2\2MN\7f\2\2NO\7g\2\2OP\7e\2\2PQ\7t\2\2QR\7{\2\2RS\7r\2\2ST\7v\2\2"+
		"TU\7O\2\2UV\7u\2\2VW\7i\2\2WX\7H\2\2XY\7t\2\2YZ\7q\2\2Z\u0085\7o\2\2["+
		"\\\7t\2\2\\]\7g\2\2]^\7c\2\2^_\7f\2\2_`\7O\2\2`a\7u\2\2ab\7i\2\2bc\7H"+
		"\2\2cd\7t\2\2de\7q\2\2e\u0085\7o\2\2fg\7u\2\2gh\7g\2\2hi\7p\2\2ij\7f\2"+
		"\2jk\7O\2\2kl\7u\2\2lm\7i\2\2mn\7V\2\2n\u0085\7q\2\2op\7t\2\2pq\7g\2\2"+
		"qr\7e\2\2rs\7g\2\2st\7k\2\2tu\7x\2\2uv\7g\2\2vw\7O\2\2wx\7u\2\2xy\7i\2"+
		"\2yz\7H\2\2z{\7t\2\2{|\7q\2\2|\u0085\7o\2\2}~\7h\2\2~\177\7q\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7y\2\2\u0081\u0082\7c\2\2\u0082\u0083\7t\2\2\u0083"+
		"\u0085\7f\2\2\u0084A\3\2\2\2\u0084M\3\2\2\2\u0084[\3\2\2\2\u0084f\3\2"+
		"\2\2\u0084o\3\2\2\2\u0084}\3\2\2\2\u0085\22\3\2\2\2\u0086\u0087\7j\2\2"+
		"\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\u008a\7E\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7p\2\2\u008c\u008d\7p\2\2\u008d\u008e\7g\2\2\u008e"+
		"\u008f\7e\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092\7q\2\2"+
		"\u0092\u0093\7p\2\2\u0093\u0094\7Y\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u00b3\7j\2\2\u0097\u0098\7m\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7y\2\2\u009b\u009c\7M\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u009e\7{\2\2\u009e\u009f\7Q\2\2\u009f\u00b3\7h\2\2\u00a0\u00a1"+
		"\7j\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7M\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7{\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00b3\7h\2\2"+
		"\u00a8\u00a9\7j\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac"+
		"\7E\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b3\7f\2\2\u00b2\u0086\3\2\2"+
		"\2\u00b2\u0097\3\2\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b3\24"+
		"\3\2\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7u\2\2\u00b7"+
		"\u00b8\7U\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7u\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7k\2\2\u00be\u00bf"+
		"\7x\2\2\u00bf\u00ca\7g\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6\u00c7\7o\2\2\u00c7\u00c8\7c\2\2\u00c8\u00ca\7n\2\2\u00c9\u00b4"+
		"\3\2\2\2\u00c9\u00c0\3\2\2\2\u00ca\26\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\5\3"+
		"\2\u00d0\30\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\32\3\2\2\2\u00d9\u00db\t\2\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\b\16\2\2\u00df\34\3\2\2\2\7\2\u0084\u00b2\u00c9\u00dc"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}