// Generated from csadlverifiernew/Security.g4 by ANTLR 4.9.2

package edu.fit.assist.csadl.lib.antlr.csadlverifiernew;

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
		ASSET_COMPUTER=1, ASSET_IOT_DEVICE=2, ASSET_SERVER=3, ASSET_SOFTWARE_FEATURE=4, 
		ASSET_HARDWARE_COMPONENT=5, SOFTWARE_FEATURE=6, THING=7, IDENTIFIER=8, 
		ENDSYMBOL=9, GUARANTEE=10, ASSUMPTION=11, ASSOCIATION_CONNECT=12, ACTION_COMMUNICATE=13, 
		ASSOCIATION_HAS=14, ACTION_HAS=15, ASSOCIATION_COMPUTER=16, ASSOCIATION_KEY=17, 
		ASSOCIATION_CREATE=18, SENSITIVITY=19, CONTENT=20, WS=21;
	public static final int
		RULE_csadl = 0, RULE_statement = 1, RULE_assumption1 = 2, RULE_assumption2 = 3, 
		RULE_assumption3 = 4, RULE_assumption4 = 5, RULE_assumption5 = 6, RULE_assumption6 = 7, 
		RULE_guarantee1 = 8, RULE_guarantee2 = 9, RULE_guarantee3 = 10, RULE_guarantee4 = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"csadl", "statement", "assumption1", "assumption2", "assumption3", "assumption4", 
			"assumption5", "assumption6", "guarantee1", "guarantee2", "guarantee3", 
			"guarantee4"
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GUARANTEE || _la==ASSUMPTION );
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
		public Assumption3Context assumption3() {
			return getRuleContext(Assumption3Context.class,0);
		}
		public Assumption4Context assumption4() {
			return getRuleContext(Assumption4Context.class,0);
		}
		public Assumption5Context assumption5() {
			return getRuleContext(Assumption5Context.class,0);
		}
		public Assumption6Context assumption6() {
			return getRuleContext(Assumption6Context.class,0);
		}
		public Guarantee1Context guarantee1() {
			return getRuleContext(Guarantee1Context.class,0);
		}
		public Guarantee2Context guarantee2() {
			return getRuleContext(Guarantee2Context.class,0);
		}
		public Guarantee3Context guarantee3() {
			return getRuleContext(Guarantee3Context.class,0);
		}
		public Guarantee4Context guarantee4() {
			return getRuleContext(Guarantee4Context.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(29);
				assumption1();
				}
				break;
			case 2:
				{
				setState(30);
				assumption2();
				}
				break;
			case 3:
				{
				setState(31);
				assumption3();
				}
				break;
			case 4:
				{
				setState(32);
				assumption4();
				}
				break;
			case 5:
				{
				setState(33);
				assumption5();
				}
				break;
			case 6:
				{
				setState(34);
				assumption6();
				}
				break;
			case 7:
				{
				setState(35);
				guarantee1();
				}
				break;
			case 8:
				{
				setState(36);
				guarantee2();
				}
				break;
			case 9:
				{
				setState(37);
				guarantee3();
				}
				break;
			case 10:
				{
				setState(38);
				guarantee4();
				}
				break;
			}
			setState(41);
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
		public TerminalNode ASSET_IOT_DEVICE() { return getToken(SecurityParser.ASSET_IOT_DEVICE, 0); }
		public TerminalNode ASSOCIATION_CONNECT() { return getToken(SecurityParser.ASSOCIATION_CONNECT, 0); }
		public TerminalNode ASSET_SERVER() { return getToken(SecurityParser.ASSET_SERVER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ASSUMPTION);
			setState(44);
			match(ASSET_IOT_DEVICE);
			setState(45);
			match(ASSOCIATION_CONNECT);
			setState(46);
			match(ASSET_SERVER);
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
		public List<TerminalNode> ASSET_COMPUTER() { return getTokens(SecurityParser.ASSET_COMPUTER); }
		public TerminalNode ASSET_COMPUTER(int i) {
			return getToken(SecurityParser.ASSET_COMPUTER, i);
		}
		public TerminalNode ASSOCIATION_CONNECT() { return getToken(SecurityParser.ASSOCIATION_CONNECT, 0); }
		public TerminalNode ASSET_SERVER() { return getToken(SecurityParser.ASSET_SERVER, 0); }
		public TerminalNode ASSET_IOT_DEVICE() { return getToken(SecurityParser.ASSET_IOT_DEVICE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ASSUMPTION);
			setState(49);
			match(ASSET_COMPUTER);
			setState(50);
			match(ASSOCIATION_CONNECT);
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSET_COMPUTER) | (1L << ASSET_IOT_DEVICE) | (1L << ASSET_SERVER))) != 0)) ) {
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

	public static class Assumption3Context extends ParserRuleContext {
		public TerminalNode ASSUMPTION() { return getToken(SecurityParser.ASSUMPTION, 0); }
		public TerminalNode ASSET_IOT_DEVICE() { return getToken(SecurityParser.ASSET_IOT_DEVICE, 0); }
		public TerminalNode ASSOCIATION_HAS() { return getToken(SecurityParser.ASSOCIATION_HAS, 0); }
		public TerminalNode ASSET_SOFTWARE_FEATURE() { return getToken(SecurityParser.ASSET_SOFTWARE_FEATURE, 0); }
		public TerminalNode ASSET_HARDWARE_COMPONENT() { return getToken(SecurityParser.ASSET_HARDWARE_COMPONENT, 0); }
		public Assumption3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumption3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterAssumption3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitAssumption3(this);
		}
	}

	public final Assumption3Context assumption3() throws RecognitionException {
		Assumption3Context _localctx = new Assumption3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_assumption3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ASSUMPTION);
			setState(54);
			match(ASSET_IOT_DEVICE);
			setState(55);
			match(ASSOCIATION_HAS);
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==ASSET_SOFTWARE_FEATURE || _la==ASSET_HARDWARE_COMPONENT) ) {
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

	public static class Assumption4Context extends ParserRuleContext {
		public TerminalNode ASSUMPTION() { return getToken(SecurityParser.ASSUMPTION, 0); }
		public TerminalNode ASSOCIATION_KEY() { return getToken(SecurityParser.ASSOCIATION_KEY, 0); }
		public List<TerminalNode> ASSET_COMPUTER() { return getTokens(SecurityParser.ASSET_COMPUTER); }
		public TerminalNode ASSET_COMPUTER(int i) {
			return getToken(SecurityParser.ASSET_COMPUTER, i);
		}
		public List<TerminalNode> ASSET_IOT_DEVICE() { return getTokens(SecurityParser.ASSET_IOT_DEVICE); }
		public TerminalNode ASSET_IOT_DEVICE(int i) {
			return getToken(SecurityParser.ASSET_IOT_DEVICE, i);
		}
		public List<TerminalNode> ASSET_SERVER() { return getTokens(SecurityParser.ASSET_SERVER); }
		public TerminalNode ASSET_SERVER(int i) {
			return getToken(SecurityParser.ASSET_SERVER, i);
		}
		public Assumption4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumption4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterAssumption4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitAssumption4(this);
		}
	}

	public final Assumption4Context assumption4() throws RecognitionException {
		Assumption4Context _localctx = new Assumption4Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_assumption4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ASSUMPTION);
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSET_COMPUTER) | (1L << ASSET_IOT_DEVICE) | (1L << ASSET_SERVER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(60);
			match(ASSOCIATION_KEY);
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSET_COMPUTER) | (1L << ASSET_IOT_DEVICE) | (1L << ASSET_SERVER))) != 0)) ) {
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

	public static class Assumption5Context extends ParserRuleContext {
		public TerminalNode ASSUMPTION() { return getToken(SecurityParser.ASSUMPTION, 0); }
		public TerminalNode THING() { return getToken(SecurityParser.THING, 0); }
		public TerminalNode SENSITIVITY() { return getToken(SecurityParser.SENSITIVITY, 0); }
		public TerminalNode CONTENT() { return getToken(SecurityParser.CONTENT, 0); }
		public Assumption5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumption5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterAssumption5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitAssumption5(this);
		}
	}

	public final Assumption5Context assumption5() throws RecognitionException {
		Assumption5Context _localctx = new Assumption5Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_assumption5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ASSUMPTION);
			setState(64);
			match(THING);
			setState(65);
			match(SENSITIVITY);
			setState(66);
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

	public static class Assumption6Context extends ParserRuleContext {
		public TerminalNode ASSUMPTION() { return getToken(SecurityParser.ASSUMPTION, 0); }
		public TerminalNode ASSOCIATION_CREATE() { return getToken(SecurityParser.ASSOCIATION_CREATE, 0); }
		public TerminalNode THING() { return getToken(SecurityParser.THING, 0); }
		public TerminalNode ASSET_COMPUTER() { return getToken(SecurityParser.ASSET_COMPUTER, 0); }
		public TerminalNode ASSET_IOT_DEVICE() { return getToken(SecurityParser.ASSET_IOT_DEVICE, 0); }
		public Assumption6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumption6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterAssumption6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitAssumption6(this);
		}
	}

	public final Assumption6Context assumption6() throws RecognitionException {
		Assumption6Context _localctx = new Assumption6Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_assumption6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ASSUMPTION);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==ASSET_COMPUTER || _la==ASSET_IOT_DEVICE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(ASSOCIATION_CREATE);
			setState(71);
			match(THING);
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

	public static class Guarantee1Context extends ParserRuleContext {
		public TerminalNode GUARANTEE() { return getToken(SecurityParser.GUARANTEE, 0); }
		public TerminalNode ASSET_IOT_DEVICE() { return getToken(SecurityParser.ASSET_IOT_DEVICE, 0); }
		public TerminalNode ACTION_COMMUNICATE() { return getToken(SecurityParser.ACTION_COMMUNICATE, 0); }
		public TerminalNode THING() { return getToken(SecurityParser.THING, 0); }
		public TerminalNode ASSET_SERVER() { return getToken(SecurityParser.ASSET_SERVER, 0); }
		public Guarantee1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarantee1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterGuarantee1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitGuarantee1(this);
		}
	}

	public final Guarantee1Context guarantee1() throws RecognitionException {
		Guarantee1Context _localctx = new Guarantee1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_guarantee1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(GUARANTEE);
			setState(74);
			match(ASSET_IOT_DEVICE);
			setState(75);
			match(ACTION_COMMUNICATE);
			setState(76);
			match(THING);
			setState(77);
			match(ASSET_SERVER);
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

	public static class Guarantee2Context extends ParserRuleContext {
		public TerminalNode GUARANTEE() { return getToken(SecurityParser.GUARANTEE, 0); }
		public List<TerminalNode> ASSET_COMPUTER() { return getTokens(SecurityParser.ASSET_COMPUTER); }
		public TerminalNode ASSET_COMPUTER(int i) {
			return getToken(SecurityParser.ASSET_COMPUTER, i);
		}
		public TerminalNode ACTION_COMMUNICATE() { return getToken(SecurityParser.ACTION_COMMUNICATE, 0); }
		public TerminalNode THING() { return getToken(SecurityParser.THING, 0); }
		public TerminalNode ASSET_SERVER() { return getToken(SecurityParser.ASSET_SERVER, 0); }
		public TerminalNode ASSET_IOT_DEVICE() { return getToken(SecurityParser.ASSET_IOT_DEVICE, 0); }
		public Guarantee2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarantee2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterGuarantee2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitGuarantee2(this);
		}
	}

	public final Guarantee2Context guarantee2() throws RecognitionException {
		Guarantee2Context _localctx = new Guarantee2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_guarantee2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(GUARANTEE);
			setState(80);
			match(ASSET_COMPUTER);
			setState(81);
			match(ACTION_COMMUNICATE);
			setState(82);
			match(THING);
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSET_COMPUTER) | (1L << ASSET_IOT_DEVICE) | (1L << ASSET_SERVER))) != 0)) ) {
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

	public static class Guarantee3Context extends ParserRuleContext {
		public TerminalNode GUARANTEE() { return getToken(SecurityParser.GUARANTEE, 0); }
		public TerminalNode ASSET_IOT_DEVICE() { return getToken(SecurityParser.ASSET_IOT_DEVICE, 0); }
		public TerminalNode ACTION_HAS() { return getToken(SecurityParser.ACTION_HAS, 0); }
		public TerminalNode SOFTWARE_FEATURE() { return getToken(SecurityParser.SOFTWARE_FEATURE, 0); }
		public Guarantee3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarantee3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterGuarantee3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitGuarantee3(this);
		}
	}

	public final Guarantee3Context guarantee3() throws RecognitionException {
		Guarantee3Context _localctx = new Guarantee3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_guarantee3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(GUARANTEE);
			setState(86);
			match(ASSET_IOT_DEVICE);
			setState(87);
			match(ACTION_HAS);
			setState(88);
			match(SOFTWARE_FEATURE);
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

	public static class Guarantee4Context extends ParserRuleContext {
		public TerminalNode GUARANTEE() { return getToken(SecurityParser.GUARANTEE, 0); }
		public TerminalNode ACTION_COMMUNICATE() { return getToken(SecurityParser.ACTION_COMMUNICATE, 0); }
		public List<TerminalNode> ASSET_COMPUTER() { return getTokens(SecurityParser.ASSET_COMPUTER); }
		public TerminalNode ASSET_COMPUTER(int i) {
			return getToken(SecurityParser.ASSET_COMPUTER, i);
		}
		public List<TerminalNode> ASSET_IOT_DEVICE() { return getTokens(SecurityParser.ASSET_IOT_DEVICE); }
		public TerminalNode ASSET_IOT_DEVICE(int i) {
			return getToken(SecurityParser.ASSET_IOT_DEVICE, i);
		}
		public TerminalNode ASSET_SERVER() { return getToken(SecurityParser.ASSET_SERVER, 0); }
		public TerminalNode THING() { return getToken(SecurityParser.THING, 0); }
		public Guarantee4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarantee4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).enterGuarantee4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecurityListener ) ((SecurityListener)listener).exitGuarantee4(this);
		}
	}

	public final Guarantee4Context guarantee4() throws RecognitionException {
		Guarantee4Context _localctx = new Guarantee4Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_guarantee4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(GUARANTEE);
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSET_COMPUTER) | (1L << ASSET_IOT_DEVICE) | (1L << ASSET_SERVER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			match(ACTION_COMMUNICATE);
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSET_COMPUTER) | (1L << ASSET_IOT_DEVICE) | (1L << THING))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\6\3\2\3\5\3\2\6\7\3\2\3\4\4\2\3\4\t\t\2_\2\33\3\2\2\2\4)\3\2"+
		"\2\2\6-\3\2\2\2\b\62\3\2\2\2\n\67\3\2\2\2\f<\3\2\2\2\16A\3\2\2\2\20F\3"+
		"\2\2\2\22K\3\2\2\2\24Q\3\2\2\2\26W\3\2\2\2\30\\\3\2\2\2\32\34\5\4\3\2"+
		"\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2"+
		"\37*\5\6\4\2 *\5\b\5\2!*\5\n\6\2\"*\5\f\7\2#*\5\16\b\2$*\5\20\t\2%*\5"+
		"\22\n\2&*\5\24\13\2\'*\5\26\f\2(*\5\30\r\2)\37\3\2\2\2) \3\2\2\2)!\3\2"+
		"\2\2)\"\3\2\2\2)#\3\2\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3"+
		"\2\2\2*+\3\2\2\2+,\7\13\2\2,\5\3\2\2\2-.\7\r\2\2./\7\4\2\2/\60\7\16\2"+
		"\2\60\61\7\5\2\2\61\7\3\2\2\2\62\63\7\r\2\2\63\64\7\3\2\2\64\65\7\16\2"+
		"\2\65\66\t\2\2\2\66\t\3\2\2\2\678\7\r\2\289\7\4\2\29:\7\20\2\2:;\t\3\2"+
		"\2;\13\3\2\2\2<=\7\r\2\2=>\t\2\2\2>?\7\23\2\2?@\t\2\2\2@\r\3\2\2\2AB\7"+
		"\r\2\2BC\7\t\2\2CD\7\25\2\2DE\7\26\2\2E\17\3\2\2\2FG\7\r\2\2GH\t\4\2\2"+
		"HI\7\24\2\2IJ\7\t\2\2J\21\3\2\2\2KL\7\f\2\2LM\7\4\2\2MN\7\17\2\2NO\7\t"+
		"\2\2OP\7\5\2\2P\23\3\2\2\2QR\7\f\2\2RS\7\3\2\2ST\7\17\2\2TU\7\t\2\2UV"+
		"\t\2\2\2V\25\3\2\2\2WX\7\f\2\2XY\7\4\2\2YZ\7\21\2\2Z[\7\b\2\2[\27\3\2"+
		"\2\2\\]\7\f\2\2]^\t\2\2\2^_\7\17\2\2_`\t\5\2\2`\31\3\2\2\2\4\35)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}