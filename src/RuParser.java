// Generated from C:/antlr/antlrProjects/Tarea4_Final/src/Ru.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, IGUAL=3, DIFQ=4, MAYORQ=5, MENORQ=6, MENIG=7, MAYIG=8, MAS=9, 
		MENOS=10, MULT=11, DIV=12, MOD=13, POW=14, NOT=15, PTOCOMA=16, ASIGNA=17, 
		APAR=18, CPAR=19, ALLAVE=20, CLLAVE=21, TRUE=22, FALSE=23, NIL=24, IF=25, 
		ELSE=26, WHILE=27, LOG=28, IMPRIMIR=29, ID=30, INT=31, FLOAT=32, STRING=33, 
		COMENTARIO=34, ESPACIO=35, OTRO=36;
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_sentencia = 2, RULE_asignacion = 3, 
		RULE_sentencia_if = 4, RULE_bloque_condicional = 5, RULE_bloque_de_sentencia = 6, 
		RULE_sentencia_while = 7, RULE_log = 8, RULE_imprimir = 9, RULE_expr = 10, 
		RULE_atomo = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloque", "sentencia", "asignacion", "sentencia_if", "bloque_condicional", 
			"bloque_de_sentencia", "sentencia_while", "log", "imprimir", "expr", 
			"atomo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "'='", "'('", "')'", 
			"'{'", "'}'", "'true'", "'false'", "'nil'", "'if'", "'else'", "'while'", 
			"'log'", "'imprime'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "IGUAL", "DIFQ", "MAYORQ", "MENORQ", "MENIG", "MAYIG", 
			"MAS", "MENOS", "MULT", "DIV", "MOD", "POW", "NOT", "PTOCOMA", "ASIGNA", 
			"APAR", "CPAR", "ALLAVE", "CLLAVE", "TRUE", "FALSE", "NIL", "IF", "ELSE", 
			"WHILE", "LOG", "IMPRIMIR", "ID", "INT", "FLOAT", "STRING", "COMENTARIO", 
			"ESPACIO", "OTRO"
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
	public String getGrammarFileName() { return "Ru.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RuParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			bloque();
			setState(25);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70766297088L) != 0)) {
				{
				{
				setState(27);
				sentencia();
				}
				}
				setState(32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Token OTRO;
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_whileContext sentencia_while() {
			return getRuleContext(Sentencia_whileContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public TerminalNode OTRO() { return getToken(RuParser.OTRO, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				sentencia_if();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				sentencia_while();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				log();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				imprimir();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				((SentenciaContext)_localctx).OTRO = match(OTRO);
				System.err.println("caracter desconocido: " + (((SentenciaContext)_localctx).OTRO!=null?((SentenciaContext)_localctx).OTRO.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public TerminalNode ASIGNA() { return getToken(RuParser.ASIGNA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ID);
			setState(43);
			match(ASIGNA);
			setState(44);
			expr(0);
			setState(45);
			match(PTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_ifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(RuParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RuParser.IF, i);
		}
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(RuParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(RuParser.ELSE, i);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IF);
			setState(48);
			bloque_condicional();
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(ELSE);
					setState(50);
					match(IF);
					setState(51);
					bloque_condicional();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57);
				match(ELSE);
				setState(58);
				bloque_de_sentencia();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_condicionalContext extends ParserRuleContext {
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(APAR);
			setState(62);
			expr(0);
			setState(63);
			match(CPAR);
			setState(64);
			bloque_de_sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_de_sentenciaContext extends ParserRuleContext {
		public TerminalNode ALLAVE() { return getToken(RuParser.ALLAVE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode CLLAVE() { return getToken(RuParser.CLLAVE, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Bloque_de_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_de_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque_de_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque_de_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_de_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_de_sentenciaContext bloque_de_sentencia() throws RecognitionException {
		Bloque_de_sentenciaContext _localctx = new Bloque_de_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque_de_sentencia);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(ALLAVE);
				setState(67);
				bloque();
				setState(68);
				match(CLLAVE);
				}
				break;
			case IF:
			case WHILE:
			case LOG:
			case IMPRIMIR:
			case ID:
			case OTRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				sentencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RuParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WHILE);
			setState(74);
			expr(0);
			setState(75);
			bloque_de_sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(RuParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LOG);
			setState(78);
			expr(0);
			setState(79);
			match(PTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(RuParser.IMPRIMIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IMPRIMIR);
			setState(82);
			expr(0);
			setState(83);
			match(PTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenosUnarioExprContext extends ExprContext {
		public TerminalNode MENOS() { return getToken(RuParser.MENOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MenosUnarioExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterMenosUnarioExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitMenosUnarioExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitMenosUnarioExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(RuParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(RuParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(RuParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RuParser.MOD, 0); }
		public MultiplicacionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterMultiplicacionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitMultiplicacionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitMultiplicacionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(RuParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(RuParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(RuParser.IGUAL, 0); }
		public TerminalNode DIFQ() { return getToken(RuParser.DIFQ, 0); }
		public IgualdadExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterIgualdadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitIgualdadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitIgualdadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYIG() { return getToken(RuParser.MAYIG, 0); }
		public TerminalNode MENIG() { return getToken(RuParser.MENIG, 0); }
		public TerminalNode MENORQ() { return getToken(RuParser.MENORQ, 0); }
		public TerminalNode MAYORQ() { return getToken(RuParser.MAYORQ, 0); }
		public RelacionalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterRelacionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitRelacionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitRelacionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AditivaExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(RuParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(RuParser.MENOS, 0); }
		public AditivaExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAditivaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAditivaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAditivaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(RuParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				{
				_localctx = new MenosUnarioExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				match(MENOS);
				setState(87);
				expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(NOT);
				setState(89);
				expr(8);
				}
				break;
			case APAR:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				atomo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(94);
						match(POW);
						setState(95);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(97);
						((MultiplicacionExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
							((MultiplicacionExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AditivaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(100);
						((AditivaExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((AditivaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new RelacionalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(103);
						((RelacionalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
							((RelacionalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new IgualdadExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
						((IgualdadExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIFQ) ) {
							((IgualdadExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						match(AND);
						setState(110);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(112);
						match(OR);
						setState(113);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomoContext extends ParserRuleContext {
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
	 
		public AtomoContext() { }
		public void copyFrom(AtomoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExprContext extends AtomoContext {
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public ParExprContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomoContext {
		public TerminalNode TRUE() { return getToken(RuParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RuParser.FALSE, 0); }
		public BooleanAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomContext extends AtomoContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public IdAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomoContext {
		public TerminalNode STRING() { return getToken(RuParser.STRING, 0); }
		public StringAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilAtomContext extends AtomoContext {
		public TerminalNode NIL() { return getToken(RuParser.NIL, 0); }
		public NilAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAtomContext extends AtomoContext {
		public TerminalNode INT() { return getToken(RuParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RuParser.FLOAT, 0); }
		public NumberAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atomo);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(APAR);
				setState(120);
				expr(0);
				setState(121);
				match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001d\b\u0001\n"+
		"\u0001\f\u0001 \t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00045\b\u0004\n\u0004\f\u0004"+
		"8\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004<\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006H\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\\\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\ns\b\n\n\n\f\nv\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\u000b\u0000"+
		"\u0001\u0014\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0006\u0001\u0000\u000b\r\u0001\u0000\t\n\u0001\u0000\u0005\b\u0001"+
		"\u0000\u0003\u0004\u0001\u0000\u001f \u0001\u0000\u0016\u0017\u008d\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004"+
		"(\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b/\u0001\u0000"+
		"\u0000\u0000\n=\u0001\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000e"+
		"I\u0001\u0000\u0000\u0000\u0010M\u0001\u0000\u0000\u0000\u0012Q\u0001"+
		"\u0000\u0000\u0000\u0014[\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0000"+
		"\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001d\u0003\u0004"+
		"\u0002\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u0003\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		"!)\u0003\u0006\u0003\u0000\")\u0003\b\u0004\u0000#)\u0003\u000e\u0007"+
		"\u0000$)\u0003\u0010\b\u0000%)\u0003\u0012\t\u0000&\'\u0005$\u0000\u0000"+
		"\')\u0006\u0002\uffff\uffff\u0000(!\u0001\u0000\u0000\u0000(\"\u0001\u0000"+
		"\u0000\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)\u0005\u0001\u0000\u0000"+
		"\u0000*+\u0005\u001e\u0000\u0000+,\u0005\u0011\u0000\u0000,-\u0003\u0014"+
		"\n\u0000-.\u0005\u0010\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0019\u0000\u000006\u0003\n\u0005\u000012\u0005\u001a\u0000\u000023\u0005"+
		"\u0019\u0000\u000035\u0003\n\u0005\u000041\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7;\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u001a\u0000"+
		"\u0000:<\u0003\f\u0006\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\t\u0001\u0000\u0000\u0000=>\u0005\u0012\u0000\u0000>?\u0003\u0014"+
		"\n\u0000?@\u0005\u0013\u0000\u0000@A\u0003\f\u0006\u0000A\u000b\u0001"+
		"\u0000\u0000\u0000BC\u0005\u0014\u0000\u0000CD\u0003\u0002\u0001\u0000"+
		"DE\u0005\u0015\u0000\u0000EH\u0001\u0000\u0000\u0000FH\u0003\u0004\u0002"+
		"\u0000GB\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\r\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u001b\u0000\u0000JK\u0003\u0014\n\u0000KL\u0003\f"+
		"\u0006\u0000L\u000f\u0001\u0000\u0000\u0000MN\u0005\u001c\u0000\u0000"+
		"NO\u0003\u0014\n\u0000OP\u0005\u0010\u0000\u0000P\u0011\u0001\u0000\u0000"+
		"\u0000QR\u0005\u001d\u0000\u0000RS\u0003\u0014\n\u0000ST\u0005\u0010\u0000"+
		"\u0000T\u0013\u0001\u0000\u0000\u0000UV\u0006\n\uffff\uffff\u0000VW\u0005"+
		"\n\u0000\u0000W\\\u0003\u0014\n\tXY\u0005\u000f\u0000\u0000Y\\\u0003\u0014"+
		"\n\bZ\\\u0003\u0016\u000b\u0000[U\u0001\u0000\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\t\u0001\u0000\u0000\u0000]^\n"+
		"\n\u0000\u0000^_\u0005\u000e\u0000\u0000_s\u0003\u0014\n\u000b`a\n\u0007"+
		"\u0000\u0000ab\u0007\u0000\u0000\u0000bs\u0003\u0014\n\bcd\n\u0006\u0000"+
		"\u0000de\u0007\u0001\u0000\u0000es\u0003\u0014\n\u0007fg\n\u0005\u0000"+
		"\u0000gh\u0007\u0002\u0000\u0000hs\u0003\u0014\n\u0006ij\n\u0004\u0000"+
		"\u0000jk\u0007\u0003\u0000\u0000ks\u0003\u0014\n\u0005lm\n\u0003\u0000"+
		"\u0000mn\u0005\u0002\u0000\u0000ns\u0003\u0014\n\u0004op\n\u0002\u0000"+
		"\u0000pq\u0005\u0001\u0000\u0000qs\u0003\u0014\n\u0003r]\u0001\u0000\u0000"+
		"\u0000r`\u0001\u0000\u0000\u0000rc\u0001\u0000\u0000\u0000rf\u0001\u0000"+
		"\u0000\u0000ri\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000ro\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000u\u0015\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wx\u0005\u0012\u0000\u0000xy\u0003\u0014\n\u0000yz\u0005\u0013"+
		"\u0000\u0000z\u0081\u0001\u0000\u0000\u0000{\u0081\u0007\u0004\u0000\u0000"+
		"|\u0081\u0007\u0005\u0000\u0000}\u0081\u0005\u001e\u0000\u0000~\u0081"+
		"\u0005!\u0000\u0000\u007f\u0081\u0005\u0018\u0000\u0000\u0080w\u0001\u0000"+
		"\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0017\u0001\u0000\u0000\u0000\t\u001e("+
		"6;G[rt\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}