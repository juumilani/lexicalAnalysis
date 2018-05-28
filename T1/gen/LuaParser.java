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
		RULE_expressao = 12, RULE_prefixoExpressao = 13, RULE_prefixoExpressao1 = 14, 
		RULE_chamadaFuncao = 15, RULE_chamadaFuncao1 = 16, RULE_argumento = 17, 
		RULE_definicaoFuncao = 18, RULE_corpoFuncao = 19, RULE_listaParametros = 20, 
		RULE_construtorTabela = 21, RULE_listaCampos = 22, RULE_campo = 23, RULE_separaCampos = 24, 
		RULE_opbinario = 25, RULE_opunario = 26;
	public static final String[] ruleNames = {
		"listaExpressoes", "programa", "bloco", "retorno", "trecho", "var", "varSufix", 
		"prefixoVar", "comando", "rotulo", "listaIdentificadores", "nomeFuncao", 
		"expressao", "prefixoExpressao", "prefixoExpressao1", "chamadaFuncao", 
		"chamadaFuncao1", "argumento", "definicaoFuncao", "corpoFuncao", "listaParametros", 
		"construtorTabela", "listaCampos", "campo", "separaCampos", "opbinario", 
		"opunario"
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
			setState(54);
			expressao(0);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(55);
				match(T__0);
				setState(56);
				expressao(0);
				}
				}
				setState(61);
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
			setState(62);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << BREAK) | (1L << DO) | (1L << FOR) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << LOCAL) | (1L << REPEAT) | (1L << WHILE) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(64);
				comando();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(70);
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
			setState(73);
			match(RETURN);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__25) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << CADEIA) | (1L << Digito))) != 0)) {
				{
				setState(74);
				listaExpressoes();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(77);
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
			setState(80);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(IDENTIFICADOR);
				setState(84);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__2);
				setState(88);
				expressao(0);
				setState(89);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__2);
				setState(92);
				expressao(0);
				setState(93);
				match(T__3);
				setState(94);
				varSufix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__4);
				setState(97);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((PrefixoVarContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixoVarContext)_localctx).var!=null?_input.getText(((PrefixoVarContext)_localctx).var.start,((PrefixoVarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				chamadaFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__5);
				setState(105);
				expressao(0);
				setState(106);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				var();
				setState(112);
				match(ATR);
				setState(113);
				listaExpressoes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				chamadaFuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				rotulo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				match(GOTO);
				setState(119);
				match(IDENTIFICADOR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				match(DO);
				setState(121);
				bloco();
				setState(122);
				match(END);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				match(WHILE);
				setState(125);
				expressao(0);
				setState(126);
				match(DO);
				setState(127);
				bloco();
				setState(128);
				match(END);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				match(REPEAT);
				setState(131);
				bloco();
				setState(132);
				match(UNTIL);
				setState(133);
				expressao(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				match(IF);
				setState(136);
				expressao(0);
				setState(137);
				match(THEN);
				setState(138);
				bloco();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(139);
					match(ELSEIF);
					setState(140);
					expressao(0);
					setState(141);
					match(THEN);
					setState(142);
					bloco();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(149);
					match(ELSE);
					setState(150);
					bloco();
					}
				}

				setState(153);
				match(END);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(155);
				match(FOR);
				setState(156);
				match(IDENTIFICADOR);
				setState(157);
				match(ATR);
				setState(158);
				expressao(0);
				setState(159);
				match(T__0);
				setState(160);
				expressao(0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(161);
					match(T__0);
					setState(162);
					expressao(0);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(DO);
				setState(169);
				bloco();
				setState(170);
				match(END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				match(FOR);
				setState(173);
				listaIdentificadores();
				setState(174);
				match(IN);
				setState(175);
				listaExpressoes();
				setState(176);
				match(DO);
				setState(177);
				bloco();
				setState(178);
				match(END);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				match(FUNCTION);
				setState(181);
				((ComandoContext)_localctx).nomeFuncao = nomeFuncao();
				setState(182);
				corpoFuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomeFuncao!=null?_input.getText(((ComandoContext)_localctx).nomeFuncao.start,((ComandoContext)_localctx).nomeFuncao.stop):null),Tipo.FUNCAO); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(185);
				match(LOCAL);
				setState(186);
				listaIdentificadores();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATR) {
					{
					setState(187);
					match(ATR);
					setState(188);
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
			setState(193);
			match(T__7);
			setState(194);
			match(IDENTIFICADOR);
			setState(195);
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
			setState(197);
			match(IDENTIFICADOR);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(T__0);
					setState(199);
					match(IDENTIFICADOR);
					}
					} 
				}
				setState(204);
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
			setState(205);
			match(IDENTIFICADOR);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(206);
				match(T__4);
				setState(207);
				match(IDENTIFICADOR);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(213);
				match(T__8);
				setState(214);
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
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				{
				setState(218);
				match(NIL);
				}
				break;
			case FALSE:
				{
				setState(219);
				match(FALSE);
				}
				break;
			case TRUE:
				{
				setState(220);
				match(TRUE);
				}
				break;
			case Digito:
				{
				setState(221);
				match(Digito);
				}
				break;
			case CADEIA:
				{
				setState(222);
				match(CADEIA);
				}
				break;
			case T__9:
				{
				setState(223);
				match(T__9);
				}
				break;
			case FUNCTION:
				{
				setState(224);
				definicaoFuncao();
				setState(225);
				prefixoExpressao();
				}
				break;
			case T__10:
				{
				setState(227);
				construtorTabela();
				}
				break;
			case T__13:
			case T__25:
			case NOT:
				{
				setState(228);
				opunario();
				setState(229);
				expressao(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
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
					setState(233);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(234);
					opbinario();
					setState(235);
					expressao(3);
					}
					} 
				}
				setState(241);
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
		public Token IDENTIFICADOR;
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public List<PrefixoExpressao1Context> prefixoExpressao1() {
			return getRuleContexts(PrefixoExpressao1Context.class);
		}
		public PrefixoExpressao1Context prefixoExpressao1(int i) {
			return getRuleContext(PrefixoExpressao1Context.class,i);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(IDENTIFICADOR);
				setState(243);
				prefixoExpressao1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				((PrefixoExpressaoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 TabelaDeSimbolos.adicionarSimbolo((((PrefixoExpressaoContext)_localctx).IDENTIFICADOR!=null?((PrefixoExpressaoContext)_localctx).IDENTIFICADOR.getText():null),Tipo.VARIAVEL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				chamadaFuncao();
				setState(247);
				prefixoExpressao1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				chamadaFuncao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				prefixoExpressao1();
				setState(251);
				match(T__5);
				setState(252);
				expressao(0);
				setState(253);
				match(T__6);
				setState(254);
				prefixoExpressao1();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(T__5);
				setState(257);
				expressao(0);
				setState(258);
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

	public static class PrefixoExpressao1Context extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrefixoExpressao1Context prefixoExpressao1() {
			return getRuleContext(PrefixoExpressao1Context.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public PrefixoExpressao1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixoExpressao1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixoExpressao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixoExpressao1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrefixoExpressao1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixoExpressao1Context prefixoExpressao1() throws RecognitionException {
		PrefixoExpressao1Context _localctx = new PrefixoExpressao1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_prefixoExpressao1);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__2);
				setState(263);
				expressao(0);
				setState(264);
				match(T__3);
				setState(265);
				prefixoExpressao1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__2);
				setState(268);
				expressao(0);
				setState(269);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(T__4);
				setState(272);
				match(IDENTIFICADOR);
				setState(273);
				prefixoExpressao1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(T__4);
				setState(275);
				match(IDENTIFICADOR);
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
		public Token IDENTIFICADOR;
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LuaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LuaParser.IDENTIFICADOR, i);
		}
		public PrefixoExpressao1Context prefixoExpressao1() {
			return getRuleContext(PrefixoExpressao1Context.class,0);
		}
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public ChamadaFuncao1Context chamadaFuncao1() {
			return getRuleContext(ChamadaFuncao1Context.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_chamadaFuncao);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(IDENTIFICADOR);
				setState(279);
				prefixoExpressao1();
				setState(280);
				argumento();
				setState(281);
				chamadaFuncao1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((ChamadaFuncaoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 TabelaDeSimbolos.adicionarSimbolo((((ChamadaFuncaoContext)_localctx).IDENTIFICADOR!=null?((ChamadaFuncaoContext)_localctx).IDENTIFICADOR.getText():null),Tipo.FUNCAO);
				setState(285);
				argumento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(IDENTIFICADOR);
				setState(287);
				prefixoExpressao1();
				setState(288);
				argumento();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				((ChamadaFuncaoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 TabelaDeSimbolos.adicionarSimbolo((((ChamadaFuncaoContext)_localctx).IDENTIFICADOR!=null?((ChamadaFuncaoContext)_localctx).IDENTIFICADOR.getText():null),Tipo.FUNCAO);
				setState(292);
				argumento();
				setState(293);
				chamadaFuncao1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(T__5);
				setState(296);
				expressao(0);
				setState(297);
				match(T__6);
				setState(298);
				prefixoExpressao1();
				setState(299);
				argumento();
				setState(300);
				chamadaFuncao1();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				match(T__5);
				setState(303);
				expressao(0);
				setState(304);
				match(T__6);
				setState(305);
				argumento();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
				match(T__5);
				setState(308);
				expressao(0);
				setState(309);
				match(T__6);
				setState(310);
				prefixoExpressao1();
				setState(311);
				argumento();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(313);
				match(T__5);
				setState(314);
				expressao(0);
				setState(315);
				match(T__6);
				setState(316);
				argumento();
				setState(317);
				chamadaFuncao1();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				((ChamadaFuncaoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(320);
				prefixoExpressao1();
				setState(321);
				match(T__8);
				setState(322);
				((ChamadaFuncaoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 TabelaDeSimbolos.adicionarSimbolo((((ChamadaFuncaoContext)_localctx).IDENTIFICADOR!=null?((ChamadaFuncaoContext)_localctx).IDENTIFICADOR.getText():null),Tipo.FUNCAO);
				setState(324);
				argumento();
				setState(325);
				chamadaFuncao1();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(327);
				match(IDENTIFICADOR);
				setState(328);
				match(T__8);
				setState(329);
				match(IDENTIFICADOR);
				setState(330);
				argumento();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(331);
				match(IDENTIFICADOR);
				setState(332);
				prefixoExpressao1();
				setState(333);
				match(T__8);
				setState(334);
				match(IDENTIFICADOR);
				setState(335);
				argumento();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(337);
				match(IDENTIFICADOR);
				setState(338);
				match(T__8);
				setState(339);
				match(IDENTIFICADOR);
				setState(340);
				argumento();
				setState(341);
				chamadaFuncao1();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(343);
				match(T__5);
				setState(344);
				expressao(0);
				setState(345);
				match(T__6);
				setState(346);
				prefixoExpressao1();
				setState(347);
				match(T__8);
				setState(348);
				match(IDENTIFICADOR);
				setState(349);
				argumento();
				setState(350);
				chamadaFuncao1();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(352);
				match(T__5);
				setState(353);
				expressao(0);
				setState(354);
				match(T__6);
				setState(355);
				match(T__8);
				setState(356);
				match(IDENTIFICADOR);
				setState(357);
				argumento();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(359);
				match(T__5);
				setState(360);
				expressao(0);
				setState(361);
				match(T__6);
				setState(362);
				prefixoExpressao1();
				setState(363);
				match(T__8);
				setState(364);
				match(IDENTIFICADOR);
				setState(365);
				argumento();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(367);
				match(T__5);
				setState(368);
				expressao(0);
				setState(369);
				match(T__6);
				setState(370);
				match(T__8);
				setState(371);
				match(IDENTIFICADOR);
				setState(372);
				argumento();
				setState(373);
				chamadaFuncao1();
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

	public static class ChamadaFuncao1Context extends ParserRuleContext {
		public PrefixoExpressao1Context prefixoExpressao1() {
			return getRuleContext(PrefixoExpressao1Context.class,0);
		}
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public ChamadaFuncao1Context chamadaFuncao1() {
			return getRuleContext(ChamadaFuncao1Context.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LuaParser.IDENTIFICADOR, 0); }
		public ChamadaFuncao1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadaFuncao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadaFuncao1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitChamadaFuncao1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncao1Context chamadaFuncao1() throws RecognitionException {
		ChamadaFuncao1Context _localctx = new ChamadaFuncao1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_chamadaFuncao1);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				prefixoExpressao1();
				setState(378);
				argumento();
				setState(379);
				chamadaFuncao1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				argumento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				prefixoExpressao1();
				setState(383);
				argumento();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				argumento();
				setState(386);
				chamadaFuncao1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				prefixoExpressao1();
				setState(389);
				match(T__8);
				setState(390);
				match(IDENTIFICADOR);
				setState(391);
				argumento();
				setState(392);
				chamadaFuncao1();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				match(T__8);
				setState(395);
				match(IDENTIFICADOR);
				setState(396);
				argumento();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				prefixoExpressao1();
				setState(398);
				match(T__8);
				setState(399);
				match(IDENTIFICADOR);
				setState(400);
				argumento();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(402);
				match(T__8);
				setState(403);
				match(IDENTIFICADOR);
				setState(404);
				argumento();
				setState(405);
				chamadaFuncao1();
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
		enterRule(_localctx, 34, RULE_argumento);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(T__5);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__25) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << CADEIA) | (1L << Digito))) != 0)) {
					{
					setState(410);
					listaExpressoes();
					}
				}

				setState(413);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				construtorTabela();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
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
		enterRule(_localctx, 36, RULE_definicaoFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(FUNCTION);
			setState(419);
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
		enterRule(_localctx, 38, RULE_corpoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__5);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==IDENTIFICADOR) {
				{
				setState(422);
				listaParametros();
				}
			}

			setState(425);
			match(T__6);
			setState(426);
			bloco();
			setState(427);
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
		enterRule(_localctx, 40, RULE_listaParametros);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				listaIdentificadores();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(430);
					match(T__0);
					setState(431);
					match(T__9);
					}
				}

				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
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
		enterRule(_localctx, 42, RULE_construtorTabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__10);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__25) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << IDENTIFICADOR) | (1L << CADEIA) | (1L << Digito))) != 0)) {
				{
				setState(438);
				listaCampos();
				}
			}

			setState(441);
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
		enterRule(_localctx, 44, RULE_listaCampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			campo();
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(444);
					separaCampos();
					setState(445);
					campo();
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(452);
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
		enterRule(_localctx, 46, RULE_campo);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(T__2);
				setState(456);
				expressao(0);
				setState(457);
				match(T__3);
				setState(458);
				match(ATR);
				setState(459);
				expressao(0);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(IDENTIFICADOR);
				setState(462);
				match(ATR);
				setState(463);
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
				setState(464);
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
		enterRule(_localctx, 48, RULE_separaCampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		enterRule(_localctx, 50, RULE_opbinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
		enterRule(_localctx, 52, RULE_opunario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3"+
		"\3\3\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\5\4J\n\4\3\5\3\5\5\5N\n\5\3\5\5\5"+
		"Q\n\5\3\6\3\6\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\be\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0093\n\n\f"+
		"\n\16\n\u0096\13\n\3\n\3\n\5\n\u009a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n"+
		"\n\5\n\u00c2\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00cb\n\f\f\f\16"+
		"\f\u00ce\13\f\3\r\3\r\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6\13\r\3\r\3\r\5"+
		"\r\u00da\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00ea\n\16\3\16\3\16\3\16\3\16\7\16\u00f0\n\16\f\16"+
		"\16\16\u00f3\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0107\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0117\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u017a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u019a\n\22\3\23\3\23\5\23\u019e\n\23\3\23\3"+
		"\23\3\23\5\23\u01a3\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u01aa\n\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u01b3\n\26\3\26\5\26\u01b6\n\26\3"+
		"\27\3\27\5\27\u01ba\n\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u01c2\n\30"+
		"\f\30\16\30\u01c5\13\30\3\30\5\30\u01c8\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u01d4\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\2\3\32\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\66\2\5\3\2\3\4\4\2\17\339:\5\2\20\20\34\34++\2\u0210\28\3\2\2\2\4"+
		"@\3\2\2\2\6E\3\2\2\2\bK\3\2\2\2\nR\3\2\2\2\fW\3\2\2\2\16d\3\2\2\2\20n"+
		"\3\2\2\2\22\u00c1\3\2\2\2\24\u00c3\3\2\2\2\26\u00c7\3\2\2\2\30\u00cf\3"+
		"\2\2\2\32\u00e9\3\2\2\2\34\u0106\3\2\2\2\36\u0116\3\2\2\2 \u0179\3\2\2"+
		"\2\"\u0199\3\2\2\2$\u01a2\3\2\2\2&\u01a4\3\2\2\2(\u01a7\3\2\2\2*\u01b5"+
		"\3\2\2\2,\u01b7\3\2\2\2.\u01bd\3\2\2\2\60\u01d3\3\2\2\2\62\u01d5\3\2\2"+
		"\2\64\u01d7\3\2\2\2\66\u01d9\3\2\2\28=\5\32\16\29:\7\3\2\2:<\5\32\16\2"+
		";9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@A\5\n\6"+
		"\2A\5\3\2\2\2BD\5\22\n\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2"+
		"\2\2GE\3\2\2\2HJ\5\b\5\2IH\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KM\7-\2\2LN\5\2"+
		"\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\7\4\2\2PO\3\2\2\2PQ\3\2\2\2Q\t\3"+
		"\2\2\2RS\5\6\4\2S\13\3\2\2\2TX\7\62\2\2UV\7\62\2\2VX\5\16\b\2WT\3\2\2"+
		"\2WU\3\2\2\2X\r\3\2\2\2YZ\7\5\2\2Z[\5\32\16\2[\\\7\6\2\2\\e\3\2\2\2]^"+
		"\7\5\2\2^_\5\32\16\2_`\7\6\2\2`a\5\16\b\2ae\3\2\2\2bc\7\7\2\2ce\5\f\7"+
		"\2dY\3\2\2\2d]\3\2\2\2db\3\2\2\2e\17\3\2\2\2fg\5\f\7\2gh\b\t\1\2ho\3\2"+
		"\2\2io\5 \21\2jk\7\b\2\2kl\5\32\16\2lm\7\t\2\2mo\3\2\2\2nf\3\2\2\2ni\3"+
		"\2\2\2nj\3\2\2\2o\21\3\2\2\2p\u00c2\7\4\2\2qr\5\f\7\2rs\7\35\2\2st\5\2"+
		"\2\2t\u00c2\3\2\2\2u\u00c2\5 \21\2v\u00c2\5\24\13\2w\u00c2\7\36\2\2xy"+
		"\7&\2\2y\u00c2\7\62\2\2z{\7\37\2\2{|\5\6\4\2|}\7\"\2\2}\u00c2\3\2\2\2"+
		"~\177\7\61\2\2\177\u0080\5\32\16\2\u0080\u0081\7\37\2\2\u0081\u0082\5"+
		"\6\4\2\u0082\u0083\7\"\2\2\u0083\u00c2\3\2\2\2\u0084\u0085\7,\2\2\u0085"+
		"\u0086\5\6\4\2\u0086\u0087\7\60\2\2\u0087\u0088\5\32\16\2\u0088\u00c2"+
		"\3\2\2\2\u0089\u008a\7\'\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7.\2\2"+
		"\u008c\u0094\5\6\4\2\u008d\u008e\7!\2\2\u008e\u008f\5\32\16\2\u008f\u0090"+
		"\7.\2\2\u0090\u0091\5\6\4\2\u0091\u0093\3\2\2\2\u0092\u008d\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7 \2\2\u0098\u009a\5\6\4\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\""+
		"\2\2\u009c\u00c2\3\2\2\2\u009d\u009e\7$\2\2\u009e\u009f\7\62\2\2\u009f"+
		"\u00a0\7\35\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\3\2\2\u00a2\u00a7"+
		"\5\32\16\2\u00a3\u00a4\7\3\2\2\u00a4\u00a6\5\32\16\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\37\2\2\u00ab\u00ac\5\6\4\2"+
		"\u00ac\u00ad\7\"\2\2\u00ad\u00c2\3\2\2\2\u00ae\u00af\7$\2\2\u00af\u00b0"+
		"\5\26\f\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\5\2\2\2\u00b2\u00b3\7\37\2\2"+
		"\u00b3\u00b4\5\6\4\2\u00b4\u00b5\7\"\2\2\u00b5\u00c2\3\2\2\2\u00b6\u00b7"+
		"\7%\2\2\u00b7\u00b8\5\30\r\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\b\n\1\2\u00ba"+
		"\u00c2\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc\u00bf\5\26\f\2\u00bd\u00be\7\35"+
		"\2\2\u00be\u00c0\5\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1p\3\2\2\2\u00c1q\3\2\2\2\u00c1u\3\2\2\2\u00c1v\3\2"+
		"\2\2\u00c1w\3\2\2\2\u00c1x\3\2\2\2\u00c1z\3\2\2\2\u00c1~\3\2\2\2\u00c1"+
		"\u0084\3\2\2\2\u00c1\u0089\3\2\2\2\u00c1\u009d\3\2\2\2\u00c1\u00ae\3\2"+
		"\2\2\u00c1\u00b6\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c4"+
		"\7\n\2\2\u00c4\u00c5\7\62\2\2\u00c5\u00c6\7\n\2\2\u00c6\25\3\2\2\2\u00c7"+
		"\u00cc\7\62\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00cb\7\62\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\27\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d4\7\62\2\2\u00d0\u00d1\7\7\2"+
		"\2\u00d1\u00d3\7\62\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00da\7\62\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\31\3\2\2\2\u00db\u00dc\b\16\1\2\u00dc\u00ea\7*\2"+
		"\2\u00dd\u00ea\7#\2\2\u00de\u00ea\7/\2\2\u00df\u00ea\78\2\2\u00e0\u00ea"+
		"\7\63\2\2\u00e1\u00ea\7\f\2\2\u00e2\u00e3\5&\24\2\u00e3\u00e4\5\34\17"+
		"\2\u00e4\u00ea\3\2\2\2\u00e5\u00ea\5,\27\2\u00e6\u00e7\5\66\34\2\u00e7"+
		"\u00e8\5\32\16\3\u00e8\u00ea\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9\u00dd\3"+
		"\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9"+
		"\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2"+
		"\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\f\4\2\2\u00ec\u00ed\5\64\33\2\u00ed"+
		"\u00ee\5\32\16\5\u00ee\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\33\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7\62\2\2\u00f5\u0107\5\36\20\2\u00f6\u00f7"+
		"\7\62\2\2\u00f7\u0107\b\17\1\2\u00f8\u00f9\5 \21\2\u00f9\u00fa\5\36\20"+
		"\2\u00fa\u0107\3\2\2\2\u00fb\u0107\5 \21\2\u00fc\u00fd\5\36\20\2\u00fd"+
		"\u00fe\7\b\2\2\u00fe\u00ff\5\32\16\2\u00ff\u0100\7\t\2\2\u0100\u0101\5"+
		"\36\20\2\u0101\u0107\3\2\2\2\u0102\u0103\7\b\2\2\u0103\u0104\5\32\16\2"+
		"\u0104\u0105\7\t\2\2\u0105\u0107\3\2\2\2\u0106\u00f4\3\2\2\2\u0106\u00f6"+
		"\3\2\2\2\u0106\u00f8\3\2\2\2\u0106\u00fb\3\2\2\2\u0106\u00fc\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0107\35\3\2\2\2\u0108\u0109\7\5\2\2\u0109\u010a\5\32\16"+
		"\2\u010a\u010b\7\6\2\2\u010b\u010c\5\36\20\2\u010c\u0117\3\2\2\2\u010d"+
		"\u010e\7\5\2\2\u010e\u010f\5\32\16\2\u010f\u0110\7\6\2\2\u0110\u0117\3"+
		"\2\2\2\u0111\u0112\7\7\2\2\u0112\u0113\7\62\2\2\u0113\u0117\5\36\20\2"+
		"\u0114\u0115\7\7\2\2\u0115\u0117\7\62\2\2\u0116\u0108\3\2\2\2\u0116\u010d"+
		"\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0114\3\2\2\2\u0117\37\3\2\2\2\u0118"+
		"\u0119\7\62\2\2\u0119\u011a\5\36\20\2\u011a\u011b\5$\23\2\u011b\u011c"+
		"\5\"\22\2\u011c\u017a\3\2\2\2\u011d\u011e\7\62\2\2\u011e\u011f\b\21\1"+
		"\2\u011f\u017a\5$\23\2\u0120\u0121\7\62\2\2\u0121\u0122\5\36\20\2\u0122"+
		"\u0123\5$\23\2\u0123\u017a\3\2\2\2\u0124\u0125\7\62\2\2\u0125\u0126\b"+
		"\21\1\2\u0126\u0127\5$\23\2\u0127\u0128\5\"\22\2\u0128\u017a\3\2\2\2\u0129"+
		"\u012a\7\b\2\2\u012a\u012b\5\32\16\2\u012b\u012c\7\t\2\2\u012c\u012d\5"+
		"\36\20\2\u012d\u012e\5$\23\2\u012e\u012f\5\"\22\2\u012f\u017a\3\2\2\2"+
		"\u0130\u0131\7\b\2\2\u0131\u0132\5\32\16\2\u0132\u0133\7\t\2\2\u0133\u0134"+
		"\5$\23\2\u0134\u017a\3\2\2\2\u0135\u0136\7\b\2\2\u0136\u0137\5\32\16\2"+
		"\u0137\u0138\7\t\2\2\u0138\u0139\5\36\20\2\u0139\u013a\5$\23\2\u013a\u017a"+
		"\3\2\2\2\u013b\u013c\7\b\2\2\u013c\u013d\5\32\16\2\u013d\u013e\7\t\2\2"+
		"\u013e\u013f\5$\23\2\u013f\u0140\5\"\22\2\u0140\u017a\3\2\2\2\u0141\u0142"+
		"\7\62\2\2\u0142\u0143\5\36\20\2\u0143\u0144\7\13\2\2\u0144\u0145\7\62"+
		"\2\2\u0145\u0146\b\21\1\2\u0146\u0147\5$\23\2\u0147\u0148\5\"\22\2\u0148"+
		"\u017a\3\2\2\2\u0149\u014a\7\62\2\2\u014a\u014b\7\13\2\2\u014b\u014c\7"+
		"\62\2\2\u014c\u017a\5$\23\2\u014d\u014e\7\62\2\2\u014e\u014f\5\36\20\2"+
		"\u014f\u0150\7\13\2\2\u0150\u0151\7\62\2\2\u0151\u0152\5$\23\2\u0152\u017a"+
		"\3\2\2\2\u0153\u0154\7\62\2\2\u0154\u0155\7\13\2\2\u0155\u0156\7\62\2"+
		"\2\u0156\u0157\5$\23\2\u0157\u0158\5\"\22\2\u0158\u017a\3\2\2\2\u0159"+
		"\u015a\7\b\2\2\u015a\u015b\5\32\16\2\u015b\u015c\7\t\2\2\u015c\u015d\5"+
		"\36\20\2\u015d\u015e\7\13\2\2\u015e\u015f\7\62\2\2\u015f\u0160\5$\23\2"+
		"\u0160\u0161\5\"\22\2\u0161\u017a\3\2\2\2\u0162\u0163\7\b\2\2\u0163\u0164"+
		"\5\32\16\2\u0164\u0165\7\t\2\2\u0165\u0166\7\13\2\2\u0166\u0167\7\62\2"+
		"\2\u0167\u0168\5$\23\2\u0168\u017a\3\2\2\2\u0169\u016a\7\b\2\2\u016a\u016b"+
		"\5\32\16\2\u016b\u016c\7\t\2\2\u016c\u016d\5\36\20\2\u016d\u016e\7\13"+
		"\2\2\u016e\u016f\7\62\2\2\u016f\u0170\5$\23\2\u0170\u017a\3\2\2\2\u0171"+
		"\u0172\7\b\2\2\u0172\u0173\5\32\16\2\u0173\u0174\7\t\2\2\u0174\u0175\7"+
		"\13\2\2\u0175\u0176\7\62\2\2\u0176\u0177\5$\23\2\u0177\u0178\5\"\22\2"+
		"\u0178\u017a\3\2\2\2\u0179\u0118\3\2\2\2\u0179\u011d\3\2\2\2\u0179\u0120"+
		"\3\2\2\2\u0179\u0124\3\2\2\2\u0179\u0129\3\2\2\2\u0179\u0130\3\2\2\2\u0179"+
		"\u0135\3\2\2\2\u0179\u013b\3\2\2\2\u0179\u0141\3\2\2\2\u0179\u0149\3\2"+
		"\2\2\u0179\u014d\3\2\2\2\u0179\u0153\3\2\2\2\u0179\u0159\3\2\2\2\u0179"+
		"\u0162\3\2\2\2\u0179\u0169\3\2\2\2\u0179\u0171\3\2\2\2\u017a!\3\2\2\2"+
		"\u017b\u017c\5\36\20\2\u017c\u017d\5$\23\2\u017d\u017e\5\"\22\2\u017e"+
		"\u019a\3\2\2\2\u017f\u019a\5$\23\2\u0180\u0181\5\36\20\2\u0181\u0182\5"+
		"$\23\2\u0182\u019a\3\2\2\2\u0183\u0184\5$\23\2\u0184\u0185\5\"\22\2\u0185"+
		"\u019a\3\2\2\2\u0186\u0187\5\36\20\2\u0187\u0188\7\13\2\2\u0188\u0189"+
		"\7\62\2\2\u0189\u018a\5$\23\2\u018a\u018b\5\"\22\2\u018b\u019a\3\2\2\2"+
		"\u018c\u018d\7\13\2\2\u018d\u018e\7\62\2\2\u018e\u019a\5$\23\2\u018f\u0190"+
		"\5\36\20\2\u0190\u0191\7\13\2\2\u0191\u0192\7\62\2\2\u0192\u0193\5$\23"+
		"\2\u0193\u019a\3\2\2\2\u0194\u0195\7\13\2\2\u0195\u0196\7\62\2\2\u0196"+
		"\u0197\5$\23\2\u0197\u0198\5\"\22\2\u0198\u019a\3\2\2\2\u0199\u017b\3"+
		"\2\2\2\u0199\u017f\3\2\2\2\u0199\u0180\3\2\2\2\u0199\u0183\3\2\2\2\u0199"+
		"\u0186\3\2\2\2\u0199\u018c\3\2\2\2\u0199\u018f\3\2\2\2\u0199\u0194\3\2"+
		"\2\2\u019a#\3\2\2\2\u019b\u019d\7\b\2\2\u019c\u019e\5\2\2\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a3\7\t\2\2\u01a0"+
		"\u01a3\5,\27\2\u01a1\u01a3\7\63\2\2\u01a2\u019b\3\2\2\2\u01a2\u01a0\3"+
		"\2\2\2\u01a2\u01a1\3\2\2\2\u01a3%\3\2\2\2\u01a4\u01a5\7%\2\2\u01a5\u01a6"+
		"\5(\25\2\u01a6\'\3\2\2\2\u01a7\u01a9\7\b\2\2\u01a8\u01aa\5*\26\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\t"+
		"\2\2\u01ac\u01ad\5\6\4\2\u01ad\u01ae\7\"\2\2\u01ae)\3\2\2\2\u01af\u01b2"+
		"\5\26\f\2\u01b0\u01b1\7\3\2\2\u01b1\u01b3\7\f\2\2\u01b2\u01b0\3\2\2\2"+
		"\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b6\7\f\2\2\u01b5\u01af"+
		"\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6+\3\2\2\2\u01b7\u01b9\7\r\2\2\u01b8"+
		"\u01ba\5.\30\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\7\16\2\2\u01bc-\3\2\2\2\u01bd\u01c3\5\60\31\2\u01be\u01bf"+
		"\5\62\32\2\u01bf\u01c0\5\60\31\2\u01c0\u01c2\3\2\2\2\u01c1\u01be\3\2\2"+
		"\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\5\62\32\2\u01c7\u01c6\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8/\3\2\2\2\u01c9\u01ca\7\5\2\2\u01ca\u01cb\5"+
		"\32\16\2\u01cb\u01cc\7\6\2\2\u01cc\u01cd\7\35\2\2\u01cd\u01ce\5\32\16"+
		"\2\u01ce\u01d4\3\2\2\2\u01cf\u01d0\7\62\2\2\u01d0\u01d1\7\35\2\2\u01d1"+
		"\u01d4\5\32\16\2\u01d2\u01d4\5\32\16\2\u01d3\u01c9\3\2\2\2\u01d3\u01cf"+
		"\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\61\3\2\2\2\u01d5\u01d6\t\2\2\2\u01d6"+
		"\63\3\2\2\2\u01d7\u01d8\t\3\2\2\u01d8\65\3\2\2\2\u01d9\u01da\t\4\2\2\u01da"+
		"\67\3\2\2\2!=EIMPWdn\u0094\u0099\u00a7\u00bf\u00c1\u00cc\u00d4\u00d9\u00e9"+
		"\u00f1\u0106\u0116\u0179\u0199\u019d\u01a2\u01a9\u01b2\u01b5\u01b9\u01c3"+
		"\u01c7\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}