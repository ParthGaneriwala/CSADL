package edu.fit.assist.csadl.lib.antlr.csadlverifier;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SecurityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSET=1, CHAR=2, BEGIN=3, END=4, ENDSYMBOL=5, GUARANTEE=6, ASSUMPTION=7, 
		ACTION=8, ASSOCIATION=9, SENSITIVITY=10, MESSAGE=11, CONTENT=12, WS=13;
	public static final int
		RULE_csadl = 0, RULE_statement = 1, RULE_assumption1 = 2, RULE_assumption2 = 3, 
		RULE_guarantee = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"csadl", "statement", "assumption1", "assumption2", "guarantee"
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

	@Override
	public String getGrammarFileName() { return "Security.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SecurityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CsadlContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SecurityParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SecurityParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CsadlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csadl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterCsadl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitCsadl(this);
		}
	}

	public final CsadlContext csadl() throws RecognitionException {
		CsadlContext _localctx = new CsadlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_csadl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(BEGIN);
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				statement();
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GUARANTEE || _la==ASSUMPTION );
			setState(16);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ENDSYMBOL() { return getToken(SecurityParser.ENDSYMBOL, 0); }
		public Assumption1Context assumption1() {
			return getRuleContext(Assumption1Context.class,0);
		}
		public Assumption2Context assumption2() {
			return getRuleContext(Assumption2Context.class,0);
		}
		public GuaranteeContext guarantee() {
			return getRuleContext(GuaranteeContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(18);
				assumption1();
				}
				break;
			case 2:
				{
				setState(19);
				assumption2();
				}
				break;
			case 3:
				{
				setState(20);
				guarantee();
				}
				break;
			}
			setState(23);
			match(ENDSYMBOL);
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

	public static class Assumption1Context extends ParserRuleContext {
		public TerminalNode ASSUMPTION() { return getToken(SecurityParser.ASSUMPTION, 0); }
		public List<TerminalNode> ASSET() { return getTokens(SecurityParser.ASSET); }
		public TerminalNode ASSET(int i) {
			return getToken(SecurityParser.ASSET, i);
		}
		public TerminalNode ASSOCIATION() { return getToken(SecurityParser.ASSOCIATION, 0); }
		public TerminalNode MESSAGE() { return getToken(SecurityParser.MESSAGE, 0); }
		public Assumption1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumption1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterAssumption1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitAssumption1(this);
		}
	}

	public final Assumption1Context assumption1() throws RecognitionException {
		Assumption1Context _localctx = new Assumption1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_assumption1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(ASSUMPTION);
			setState(26);
			match(ASSET);
			setState(27);
			match(ASSOCIATION);
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==ASSET || _la==MESSAGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Assumption2Context extends ParserRuleContext {
		public TerminalNode ASSUMPTION() { return getToken(SecurityParser.ASSUMPTION, 0); }
		public TerminalNode MESSAGE() { return getToken(SecurityParser.MESSAGE, 0); }
		public TerminalNode SENSITIVITY() { return getToken(SecurityParser.SENSITIVITY, 0); }
		public TerminalNode CONTENT() { return getToken(SecurityParser.CONTENT, 0); }
		public Assumption2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumption2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterAssumption2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitAssumption2(this);
		}
	}

	public final Assumption2Context assumption2() throws RecognitionException {
		Assumption2Context _localctx = new Assumption2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_assumption2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(ASSUMPTION);
			setState(31);
			match(MESSAGE);
			setState(32);
			match(SENSITIVITY);
			setState(33);
			match(CONTENT);
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

	public static class GuaranteeContext extends ParserRuleContext {
		public TerminalNode GUARANTEE() { return getToken(SecurityParser.GUARANTEE, 0); }
		public List<TerminalNode> ASSET() { return getTokens(SecurityParser.ASSET); }
		public TerminalNode ASSET(int i) {
			return getToken(SecurityParser.ASSET, i);
		}
		public TerminalNode ACTION() { return getToken(SecurityParser.ACTION, 0); }
		public TerminalNode MESSAGE() { return getToken(SecurityParser.MESSAGE, 0); }
		public GuaranteeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarantee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterGuarantee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitGuarantee(this);
		}
	}

	public final GuaranteeContext guarantee() throws RecognitionException {
		GuaranteeContext _localctx = new GuaranteeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_guarantee);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(GUARANTEE);
			setState(36);
			match(ASSET);
			setState(37);
			match(ACTION);
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==ASSET || _la==MESSAGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\4\2\3\3\r\r\2(\2\f\3\2\2\2"+
		"\4\27\3\2\2\2\6\33\3\2\2\2\b \3\2\2\2\n%\3\2\2\2\f\16\7\5\2\2\r\17\5\4"+
		"\3\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2"+
		"\2\2\22\23\7\6\2\2\23\3\3\2\2\2\24\30\5\6\4\2\25\30\5\b\5\2\26\30\5\n"+
		"\6\2\27\24\3\2\2\2\27\25\3\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\32\7\7"+
		"\2\2\32\5\3\2\2\2\33\34\7\t\2\2\34\35\7\3\2\2\35\36\7\13\2\2\36\37\t\2"+
		"\2\2\37\7\3\2\2\2 !\7\t\2\2!\"\7\r\2\2\"#\7\f\2\2#$\7\16\2\2$\t\3\2\2"+
		"\2%&\7\b\2\2&\'\7\3\2\2\'(\7\n\2\2()\t\2\2\2)\13\3\2\2\2\4\20\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}