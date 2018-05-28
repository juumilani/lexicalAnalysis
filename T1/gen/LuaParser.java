// Generated from /home/mariana/Desktop/CC1/T1/T1/src/t1/Lua.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ATR=27, BREAK=28, DO=29, ELSE=30, ELSEIF=31, END=32, 
		FALSE=33, FOR=34, FUNCTION=35, GOTO=36, IF=37, IN=38, LOCAL=39, NIL=40, 
		NOT=41, REPEAT=42, RETURN=43, THEN=44, TRUE=45, UNTIL=46, WHILE=47, IDENTIFICADOR=48, 
		CADEIA=49, COM=50, WS=51, EOL=52, DECIMAL=53, Digito=54, AND=55, OR=56;
	public static final int
		RULE_listaExpressoes = 0, RULE_programa = 1, RULE_bloco = 2, RULE_retorno = 3, 
		RULE_trecho = 4, RULE_var = 5, RULE_varSufix = 6, RULE_prefixoVar = 7, 
		RULE_comando = 8, RULE_rotulo = 9, RULE_listaIdentificadores = 10, RULE_nomeFuncao = 11, 
		RULE_expressao = 12, RULE_prefixoExpressao = 13, RULE_chamadaFuncao = 14, 
		RULE_argumento = 15, RULE_definicaoFuncao = 16, RULE_corpoFuncao = 17, 
		RULE_listaParametros = 18, RULE_construtorTabela = 19, RULE_listaCampos = 20, 
		RULE_campo = 21, RULE_separaCampos = 22, RULE_opbinario = 23, RULE_opunario = 24;
	public static final String[] ruleNames = {
		"listaExpressoes", "programa", "bloco", "retorno", "trecho", "var", "varSufix", 
		"prefixoVar", "comando", "rotulo", "listaIdentificadores", "nomeFuncao", 
		"expressao", "prefixoExpressao", "chamadaFuncao", "argumento", "definicaoFuncao", 
		"corpoFuncao", "listaParametros", "construtorTabela", "listaCampos", "campo", 
		"separaCampos", "opbinario", "opunario"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'['", "']'", "'.'", "'('", "')'", "'::'", "':'", 
		"'...'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'..'", 
		"'<'", "'<='", "'>'", "'>='", "'=='", "'~='", "'#'", "'='", "'break'", 
		"'do'", "'else'", "'elseif'", "'end'", "'false'", "'for'", "'function'", 
		"'goto'", "'if'", "'in'", "'local'", "'nil'", "'not'", "'repeat'", "'return'", 
		"'then'", "'true'", "'until'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ATR", "BREAK", "DO", "ELSE", "ELSEIF", "END", "FALSE", 
		"FOR", "FUNCTION", "GOTO", "IF", "IN", "LOCAL", "NIL", "NOT", "REPEAT", 
		"RETURN", "THEN", "TRUE", "UNTIL", "WHILE", "IDENTIFICADOR", "CADEIA", 
		"COM", "WS", "EOL", "DECIMAL", "Digito", "AND", "OR"
	};
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<726568_e_726552_e_726580>>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ListaExpressoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ListaExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaExpressoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListaExpressoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpressoesContext listaExpressoes() throws RecognitionException {
		ListaExpressoesContext _localctx = new ListaExpressoesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_listaExpressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			expressao(0);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				expressao(0);
				}
				}
				setState(57);
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

	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			trecho();
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

	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << BREAK) | (1L << DO) | (1L << FOR) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << LOCAL) | (1L << REPEAT) | (1L << WHILE) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(60);
				comando();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(66);
				retorno();
				}
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LuaParser.RETURN, 0); }
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(RETURN);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__25) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << CADEIA) | (1L << Digito))) != 0)) {
				{
				setState(70);
				listaExpressoes();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(73);
				match(T__1);
				}
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

	public static class TrechoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitTrecho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_trecho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			bloco();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public VarSufixContext varSufix() {
			return getRuleContext(VarSufixContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(IDENTIFICADOR);
				setState(80);
				varSufix();
				}
				break;
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

	public static class VarSufixContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VarSufixContext varSufix() {
			return getRuleContext(VarSufixContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarSufixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSufix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarSufix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarSufix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarSufix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSufixContext varSufix() throws RecognitionException {
		VarSufixContext _localctx = new VarSufixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varSufix);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__2);
				setState(84);
				expressao(0);
				setState(85);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__2);
				setState(88);
				expressao(0);
				setState(89);
				match(T__3);
				setState(90);
				varSufix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__4);
				setState(93);
				var();
				}
				break;
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

	public static class PrefixoVarContext extends ParserRuleContext {
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrefixoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixoVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrefixoVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixoVarContext prefixoVar() throws RecognitionException {
		PrefixoVarContext _localctx = new PrefixoVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prefixoVar);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((PrefixoVarContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixoVarContext)_localctx).var!=null?_input.getText(((PrefixoVarContext)_localctx).var.start,((PrefixoVarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				chamadaFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__5);
				setState(101);
				expressao(0);
				setState(102);
				match(T__6);
				}
				break;
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

	public static class ComandoContext extends ParserRuleContext {
		public NomeFuncaoContext nomeFuncao;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ATR() { return getToken(LuaParser.ATR, 0); }
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public RotuloContext rotulo() {
			return getRuleContext(RotuloContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LuaParser.BREAK, 0); }
		public TerminalNode GOTO() { return getToken(LuaParser.GOTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public TerminalNode DO() { return getToken(LuaParser.DO, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public TerminalNode WHILE() { return getToken(LuaParser.WHILE, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode REPEAT() { return getToken(LuaParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(LuaParser.UNTIL, 0); }
		public TerminalNode IF() { return getToken(LuaParser.IF, 0); }
		public List<TerminalNode> THEN() { return getTokens(LuaParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(LuaParser.THEN, i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(LuaParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(LuaParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(LuaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(LuaParser.FOR, 0); }
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public TerminalNode IN() { return getToken(LuaParser.IN, 0); }
		public TerminalNode FUNCTION() { return getToken(LuaParser.FUNCTION, 0); }
		public NomeFuncaoContext nomeFuncao() {
			return getRuleContext(NomeFuncaoContext.class,0);
		}
		public CorpoFuncaoContext corpoFuncao() {
			return getRuleContext(CorpoFuncaoContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(LuaParser.LOCAL, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comando);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				var();
				setState(108);
				match(ATR);
				setState(109);
				listaExpressoes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				chamadaFuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				rotulo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(GOTO);
				setState(115);
				match(IDENTIFICADOR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(DO);
				setState(117);
				bloco();
				setState(118);
				match(END);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				match(WHILE);
				setState(121);
				expressao(0);
				setState(122);
				match(DO);
				setState(123);
				bloco();
				setState(124);
				match(END);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				match(REPEAT);
				setState(127);
				bloco();
				setState(128);
				match(UNTIL);
				setState(129);
				expressao(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				match(IF);
				setState(132);
				expressao(0);
				setState(133);
				match(THEN);
				setState(134);
				bloco();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(135);
					match(ELSEIF);
					setState(136);
					expressao(0);
					setState(137);
					match(THEN);
					setState(138);
					bloco();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(145);
					match(ELSE);
					setState(146);
					bloco();
					}
				}

				setState(149);
				match(END);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(151);
				match(FOR);
				setState(152);
				match(IDENTIFICADOR);
				setState(153);
				match(ATR);
				setState(154);
				expressao(0);
				setState(155);
				match(T__0);
				setState(156);
				expressao(0);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(157);
					match(T__0);
					setState(158);
					expressao(0);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(DO);
				setState(165);
				bloco();
				setState(166);
				match(END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(168);
				match(FOR);
				setState(169);
				listaIdentificadores();
				setState(170);
				match(IN);
				setState(171);
				listaExpressoes();
				setState(172);
				match(DO);
				setState(173);
				bloco();
				setState(174);
				match(END);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(176);
				match(FUNCTION);
				setState(177);
				((ComandoContext)_localctx).nomeFuncao = nomeFuncao();
				setState(178);
				corpoFuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomeFuncao!=null?_input.getText(((ComandoContext)_localctx).nomeFuncao.start,((ComandoContext)_localctx).nomeFuncao.stop):null),Tipo.FUNCAO); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				match(LOCAL);
				setState(182);
				listaIdentificadores();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATR) {
					{
					setState(183);
					match(ATR);
					setState(184);
					listaExpressoes();
					}
				}

				}
				break;
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

	public static class RotuloContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public RotuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRotulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRotulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitRotulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotuloContext rotulo() throws RecognitionException {
		RotuloContext _localctx = new RotuloContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rotulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__7);
			setState(190);
			match(IDENTIFICADOR);
			setState(191);
			match(T__7);
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

	public static class ListaIdentificadoresContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LuaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LuaParser.IDENTIFICADOR, i);
		}
		public ListaIdentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdentificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaIdentificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaIdentificadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListaIdentificadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIdentificadoresContext listaIdentificadores() throws RecognitionException {
		ListaIdentificadoresContext _localctx = new ListaIdentificadoresContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaIdentificadores);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IDENTIFICADOR);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					match(T__0);
					setState(195);
					match(IDENTIFICADOR);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class NomeFuncaoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LuaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LuaParser.IDENTIFICADOR, i);
		}
		public NomeFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomeFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomeFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNomeFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeFuncaoContext nomeFuncao() throws RecognitionException {
		NomeFuncaoContext _localctx = new NomeFuncaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nomeFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IDENTIFICADOR);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(202);
				match(T__4);
				setState(203);
				match(IDENTIFICADOR);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(209);
				match(T__8);
				setState(210);
				match(IDENTIFICADOR);
				}
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(LuaParser.NIL, 0); }
		public TerminalNode FALSE() { return getToken(LuaParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(LuaParser.TRUE, 0); }
		public TerminalNode Digito() { return getToken(LuaParser.Digito, 0); }
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
		public DefinicaoFuncaoContext definicaoFuncao() {
			return getRuleContext(DefinicaoFuncaoContext.class,0);
		}
		public PrefixoExpressaoContext prefixoExpressao() {
			return getRuleContext(PrefixoExpressaoContext.class,0);
		}
		public ConstrutorTabelaContext construtorTabela() {
			return getRuleContext(ConstrutorTabelaContext.class,0);
		}
		public OpunarioContext opunario() {
			return getRuleContext(OpunarioContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpbinarioContext opbinario() {
			return getRuleContext(OpbinarioContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				{
				setState(214);
				match(NIL);
				}
				break;
			case FALSE:
				{
				setState(215);
				match(FALSE);
				}
				break;
			case TRUE:
				{
				setState(216);
				match(TRUE);
				}
				break;
			case Digito:
				{
				setState(217);
				match(Digito);
				}
				break;
			case CADEIA:
				{
				setState(218);
				match(CADEIA);
				}
				break;
			case T__9:
				{
				setState(219);
				match(T__9);
				}
				break;
			case FUNCTION:
				{
				setState(220);
				definicaoFuncao();
				setState(221);
				prefixoExpressao();
				}
				break;
			case T__10:
				{
				setState(223);
				construtorTabela();
				}
				break;
			case T__13:
			case T__25:
			case NOT:
				{
				setState(224);
				opunario();
				setState(225);
				expressao(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(229);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(230);
					opbinario();
					setState(231);
					expressao(3);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class PrefixoExpressaoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrefixoExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixoExpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixoExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixoExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrefixoExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixoExpressaoContext prefixoExpressao() throws RecognitionException {
		PrefixoExpressaoContext _localctx = new PrefixoExpressaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prefixoExpressao);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				chamadaFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(T__5);
				setState(241);
				expressao(0);
				setState(242);
				match(T__6);
				}
				break;
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

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chamadaFuncao);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				var();
				setState(247);
				argumento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				var();
				setState(250);
				match(T__8);
				setState(251);
				match(IDENTIFICADOR);
				setState(252);
				argumento();
				}
				break;
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

	public static class ArgumentoContext extends ParserRuleContext {
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public ConstrutorTabelaContext construtorTabela() {
			return getRuleContext(ConstrutorTabelaContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumento);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__5);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__25) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << CADEIA) | (1L << Digito))) != 0)) {
					{
					setState(257);
					listaExpressoes();
					}
				}

				setState(260);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				construtorTabela();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(CADEIA);
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

	public static class DefinicaoFuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LuaParser.FUNCTION, 0); }
		public CorpoFuncaoContext corpoFuncao() {
			return getRuleContext(CorpoFuncaoContext.class,0);
		}
		public DefinicaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterDefinicaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitDefinicaoFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitDefinicaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicaoFuncaoContext definicaoFuncao() throws RecognitionException {
		DefinicaoFuncaoContext _localctx = new DefinicaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definicaoFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(FUNCTION);
			setState(266);
			corpoFuncao();
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

	public static class CorpoFuncaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public CorpoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpoFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitCorpoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoFuncaoContext corpoFuncao() throws RecognitionException {
		CorpoFuncaoContext _localctx = new CorpoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_corpoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__5);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==IDENTIFICADOR) {
				{
				setState(269);
				listaParametros();
				}
			}

			setState(272);
			match(T__6);
			setState(273);
			bloco();
			setState(274);
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

	public static class ListaParametrosContext extends ParserRuleContext {
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaParametros);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				listaIdentificadores();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(277);
					match(T__0);
					setState(278);
					match(T__9);
					}
				}

				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__9);
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

	public static class ConstrutorTabelaContext extends ParserRuleContext {
		public ListaCamposContext listaCampos() {
			return getRuleContext(ListaCamposContext.class,0);
		}
		public ConstrutorTabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtorTabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutorTabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutorTabela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitConstrutorTabela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrutorTabelaContext construtorTabela() throws RecognitionException {
		ConstrutorTabelaContext _localctx = new ConstrutorTabelaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_construtorTabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__10);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__25) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << IDENTIFICADOR) | (1L << CADEIA) | (1L << Digito))) != 0)) {
				{
				setState(285);
				listaCampos();
				}
			}

			setState(288);
			match(T__11);
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

	public static class ListaCamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<SeparaCamposContext> separaCampos() {
			return getRuleContexts(SeparaCamposContext.class);
		}
		public SeparaCamposContext separaCampos(int i) {
			return getRuleContext(SeparaCamposContext.class,i);
		}
		public ListaCamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaCampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaCampos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListaCampos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCamposContext listaCampos() throws RecognitionException {
		ListaCamposContext _localctx = new ListaCamposContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listaCampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			campo();
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					separaCampos();
					setState(292);
					campo();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(299);
				separaCampos();
				}
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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode ATR() { return getToken(LuaParser.ATR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_campo);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__2);
				setState(303);
				expressao(0);
				setState(304);
				match(T__3);
				setState(305);
				match(ATR);
				setState(306);
				expressao(0);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(IDENTIFICADOR);
				setState(309);
				match(ATR);
				setState(310);
				expressao(0);
				}
				break;
			case T__9:
			case T__10:
			case T__13:
			case T__25:
			case FALSE:
			case FUNCTION:
			case NIL:
			case NOT:
			case TRUE:
			case CADEIA:
			case Digito:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				expressao(0);
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

	public static class SeparaCamposContext extends ParserRuleContext {
		public SeparaCamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separaCampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparaCampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparaCampos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitSeparaCampos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparaCamposContext separaCampos() throws RecognitionException {
		SeparaCamposContext _localctx = new SeparaCamposContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_separaCampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class OpbinarioContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LuaParser.AND, 0); }
		public TerminalNode OR() { return getToken(LuaParser.OR, 0); }
		public OpbinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpbinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpbinario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpbinario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpbinarioContext opbinario() throws RecognitionException {
		OpbinarioContext _localctx = new OpbinarioContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opbinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << AND) | (1L << OR))) != 0)) ) {
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

	public static class OpunarioContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LuaParser.NOT, 0); }
		public OpunarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpunario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpunario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpunario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpunarioContext opunario() throws RecognitionException {
		OpunarioContext _localctx = new OpunarioContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opunario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__25) | (1L << NOT))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\4\7\4@\n\4\f"+
		"\4\16\4C\13\4\3\4\5\4F\n\4\3\5\3\5\5\5J\n\5\3\5\5\5M\n\5\3\6\3\6\3\7\3"+
		"\7\3\7\5\7T\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008f\n\n\f\n\16\n\u0092\13\n"+
		"\3\n\3\n\5\n\u0096\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a2"+
		"\n\n\f\n\16\n\u00a5\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bc\n\n\5\n\u00be\n\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c7\n\f\f\f\16\f\u00ca\13\f\3\r\3\r"+
		"\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\r\3\r\5\r\u00d6\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e6"+
		"\n\16\3\16\3\16\3\16\3\16\7\16\u00ec\n\16\f\16\16\16\u00ef\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0101\n\20\3\21\3\21\5\21\u0105\n\21\3\21\3\21\3\21\5"+
		"\21\u010a\n\21\3\22\3\22\3\22\3\23\3\23\5\23\u0111\n\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\5\24\u011a\n\24\3\24\5\24\u011d\n\24\3\25\3\25\5"+
		"\25\u0121\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0129\n\26\f\26\16\26"+
		"\u012c\13\26\3\26\5\26\u012f\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u013b\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\3\32"+
		"\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5\3\2\3\4"+
		"\4\2\17\339:\5\2\20\20\34\34++\2\u015e\2\64\3\2\2\2\4<\3\2\2\2\6A\3\2"+
		"\2\2\bG\3\2\2\2\nN\3\2\2\2\fS\3\2\2\2\16`\3\2\2\2\20j\3\2\2\2\22\u00bd"+
		"\3\2\2\2\24\u00bf\3\2\2\2\26\u00c3\3\2\2\2\30\u00cb\3\2\2\2\32\u00e5\3"+
		"\2\2\2\34\u00f6\3\2\2\2\36\u0100\3\2\2\2 \u0109\3\2\2\2\"\u010b\3\2\2"+
		"\2$\u010e\3\2\2\2&\u011c\3\2\2\2(\u011e\3\2\2\2*\u0124\3\2\2\2,\u013a"+
		"\3\2\2\2.\u013c\3\2\2\2\60\u013e\3\2\2\2\62\u0140\3\2\2\2\649\5\32\16"+
		"\2\65\66\7\3\2\2\668\5\32\16\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:\3\3\2\2\2;9\3\2\2\2<=\5\n\6\2=\5\3\2\2\2>@\5\22\n\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2DF\5\b\5\2ED\3\2\2\2"+
		"EF\3\2\2\2F\7\3\2\2\2GI\7-\2\2HJ\5\2\2\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2"+
		"KM\7\4\2\2LK\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NO\5\6\4\2O\13\3\2\2\2PT\7\62"+
		"\2\2QR\7\62\2\2RT\5\16\b\2SP\3\2\2\2SQ\3\2\2\2T\r\3\2\2\2UV\7\5\2\2VW"+
		"\5\32\16\2WX\7\6\2\2Xa\3\2\2\2YZ\7\5\2\2Z[\5\32\16\2[\\\7\6\2\2\\]\5\16"+
		"\b\2]a\3\2\2\2^_\7\7\2\2_a\5\f\7\2`U\3\2\2\2`Y\3\2\2\2`^\3\2\2\2a\17\3"+
		"\2\2\2bc\5\f\7\2cd\b\t\1\2dk\3\2\2\2ek\5\36\20\2fg\7\b\2\2gh\5\32\16\2"+
		"hi\7\t\2\2ik\3\2\2\2jb\3\2\2\2je\3\2\2\2jf\3\2\2\2k\21\3\2\2\2l\u00be"+
		"\7\4\2\2mn\5\f\7\2no\7\35\2\2op\5\2\2\2p\u00be\3\2\2\2q\u00be\5\36\20"+
		"\2r\u00be\5\24\13\2s\u00be\7\36\2\2tu\7&\2\2u\u00be\7\62\2\2vw\7\37\2"+
		"\2wx\5\6\4\2xy\7\"\2\2y\u00be\3\2\2\2z{\7\61\2\2{|\5\32\16\2|}\7\37\2"+
		"\2}~\5\6\4\2~\177\7\"\2\2\177\u00be\3\2\2\2\u0080\u0081\7,\2\2\u0081\u0082"+
		"\5\6\4\2\u0082\u0083\7\60\2\2\u0083\u0084\5\32\16\2\u0084\u00be\3\2\2"+
		"\2\u0085\u0086\7\'\2\2\u0086\u0087\5\32\16\2\u0087\u0088\7.\2\2\u0088"+
		"\u0090\5\6\4\2\u0089\u008a\7!\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7"+
		".\2\2\u008c\u008d\5\6\4\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7 \2\2\u0094\u0096\5\6\4\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\""+
		"\2\2\u0098\u00be\3\2\2\2\u0099\u009a\7$\2\2\u009a\u009b\7\62\2\2\u009b"+
		"\u009c\7\35\2\2\u009c\u009d\5\32\16\2\u009d\u009e\7\3\2\2\u009e\u00a3"+
		"\5\32\16\2\u009f\u00a0\7\3\2\2\u00a0\u00a2\5\32\16\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\37\2\2\u00a7\u00a8\5\6\4\2"+
		"\u00a8\u00a9\7\"\2\2\u00a9\u00be\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac"+
		"\5\26\f\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\5\2\2\2\u00ae\u00af\7\37\2\2"+
		"\u00af\u00b0\5\6\4\2\u00b0\u00b1\7\"\2\2\u00b1\u00be\3\2\2\2\u00b2\u00b3"+
		"\7%\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\b\n\1\2\u00b6"+
		"\u00be\3\2\2\2\u00b7\u00b8\7)\2\2\u00b8\u00bb\5\26\f\2\u00b9\u00ba\7\35"+
		"\2\2\u00ba\u00bc\5\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bdl\3\2\2\2\u00bdm\3\2\2\2\u00bdq\3\2\2\2\u00bdr\3\2"+
		"\2\2\u00bds\3\2\2\2\u00bdt\3\2\2\2\u00bdv\3\2\2\2\u00bdz\3\2\2\2\u00bd"+
		"\u0080\3\2\2\2\u00bd\u0085\3\2\2\2\u00bd\u0099\3\2\2\2\u00bd\u00aa\3\2"+
		"\2\2\u00bd\u00b2\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be\23\3\2\2\2\u00bf\u00c0"+
		"\7\n\2\2\u00c0\u00c1\7\62\2\2\u00c1\u00c2\7\n\2\2\u00c2\25\3\2\2\2\u00c3"+
		"\u00c8\7\62\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c7\7\62\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\27\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d0\7\62\2\2\u00cc\u00cd\7\7\2"+
		"\2\u00cd\u00cf\7\62\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d6\7\62\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\b\16\1\2\u00d8\u00e6\7*\2"+
		"\2\u00d9\u00e6\7#\2\2\u00da\u00e6\7/\2\2\u00db\u00e6\78\2\2\u00dc\u00e6"+
		"\7\63\2\2\u00dd\u00e6\7\f\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\5\34\17"+
		"\2\u00e0\u00e6\3\2\2\2\u00e1\u00e6\5(\25\2\u00e2\u00e3\5\62\32\2\u00e3"+
		"\u00e4\5\32\16\3\u00e4\u00e6\3\2\2\2\u00e5\u00d7\3\2\2\2\u00e5\u00d9\3"+
		"\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2"+
		"\2\2\u00e6\u00ed\3\2\2\2\u00e7\u00e8\f\4\2\2\u00e8\u00e9\5\60\31\2\u00e9"+
		"\u00ea\5\32\16\5\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\u00ef\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\33\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f7\5\f\7\2\u00f1\u00f7\5\36\20\2\u00f2\u00f3\7"+
		"\b\2\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\7\t\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\35\3\2\2"+
		"\2\u00f8\u00f9\5\f\7\2\u00f9\u00fa\5 \21\2\u00fa\u0101\3\2\2\2\u00fb\u00fc"+
		"\5\f\7\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\7\62\2\2\u00fe\u00ff\5 \21\2"+
		"\u00ff\u0101\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\37"+
		"\3\2\2\2\u0102\u0104\7\b\2\2\u0103\u0105\5\2\2\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\7\t\2\2\u0107\u010a\5("+
		"\25\2\u0108\u010a\7\63\2\2\u0109\u0102\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a!\3\2\2\2\u010b\u010c\7%\2\2\u010c\u010d\5$\23\2\u010d"+
		"#\3\2\2\2\u010e\u0110\7\b\2\2\u010f\u0111\5&\24\2\u0110\u010f\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\t\2\2\u0113\u0114"+
		"\5\6\4\2\u0114\u0115\7\"\2\2\u0115%\3\2\2\2\u0116\u0119\5\26\f\2\u0117"+
		"\u0118\7\3\2\2\u0118\u011a\7\f\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u011d\7\f\2\2\u011c\u0116\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\'\3\2\2\2\u011e\u0120\7\r\2\2\u011f\u0121\5*\26\2"+
		"\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123"+
		"\7\16\2\2\u0123)\3\2\2\2\u0124\u012a\5,\27\2\u0125\u0126\5.\30\2\u0126"+
		"\u0127\5,\27\2\u0127\u0129\3\2\2\2\u0128\u0125\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012f\5.\30\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f+\3\2\2\2\u0130\u0131\7\5\2\2\u0131\u0132\5\32\16\2\u0132\u0133"+
		"\7\6\2\2\u0133\u0134\7\35\2\2\u0134\u0135\5\32\16\2\u0135\u013b\3\2\2"+
		"\2\u0136\u0137\7\62\2\2\u0137\u0138\7\35\2\2\u0138\u013b\5\32\16\2\u0139"+
		"\u013b\5\32\16\2\u013a\u0130\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0139\3"+
		"\2\2\2\u013b-\3\2\2\2\u013c\u013d\t\2\2\2\u013d/\3\2\2\2\u013e\u013f\t"+
		"\3\2\2\u013f\61\3\2\2\2\u0140\u0141\t\4\2\2\u0141\63\3\2\2\2\379AEILS"+
		"`j\u0090\u0095\u00a3\u00bb\u00bd\u00c8\u00d0\u00d5\u00e5\u00ed\u00f6\u0100"+
		"\u0104\u0109\u0110\u0119\u011c\u0120\u012a\u012e\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}