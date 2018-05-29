// Generated from /home/mariana/Desktop/CC1/T1/T1/src/t1/Lua.g4 by ANTLR 4.7.1
package t1;
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ATR=29, BREAK=30, DO=31, ELSE=32, 
		ELSEIF=33, END=34, FALSE=35, FOR=36, FUNCTION=37, GOTO=38, IF=39, IN=40, 
		LOCAL=41, NIL=42, NOT=43, REPEAT=44, RETURN=45, THEN=46, TRUE=47, UNTIL=48, 
		WHILE=49, SEPARACAMPOS=50, ID=51, CADEIA=52, COM=53, WS=54, EOL=55, DECIMAL=56, 
		NOME=57;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_retorno = 2, RULE_trecho = 3, 
		RULE_comando = 4, RULE_rotulo = 5, RULE_nomeId = 6, RULE_listaVariaveis = 7, 
		RULE_nome = 8, RULE_nomeAux = 9, RULE_nomeFuncao = 10, RULE_var = 11, 
		RULE_varSufixo = 12, RULE_listaIds = 13, RULE_listaExpressoes = 14, RULE_opUnario = 15, 
		RULE_expressao = 16, RULE_expressao1 = 17, RULE_expressao2 = 18, RULE_expressao3 = 19, 
		RULE_expressao4 = 20, RULE_opBin1 = 21, RULE_opBin2 = 22, RULE_opBin3 = 23, 
		RULE_opBin4 = 24, RULE_funcaoComposta = 25, RULE_prefixoExpressao = 26, 
		RULE_chamadaFuncao = 27, RULE_funcaoAux = 28, RULE_argumentos = 29, RULE_definicaoFuncao = 30, 
		RULE_corpoFuncao = 31, RULE_listaParametros = 32, RULE_construtorTabela = 33, 
		RULE_listaCampos = 34, RULE_campo = 35, RULE_separaCampos = 36;
	public static final String[] ruleNames = {
		"programa", "bloco", "retorno", "trecho", "comando", "rotulo", "nomeId", 
		"listaVariaveis", "nome", "nomeAux", "nomeFuncao", "var", "varSufixo", 
		"listaIds", "listaExpressoes", "opUnario", "expressao", "expressao1", 
		"expressao2", "expressao3", "expressao4", "opBin1", "opBin2", "opBin3", 
		"opBin4", "funcaoComposta", "prefixoExpressao", "chamadaFuncao", "funcaoAux", 
		"argumentos", "definicaoFuncao", "corpoFuncao", "listaParametros", "construtorTabela", 
		"listaCampos", "campo", "separaCampos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'::'", "'.'", "':'", "'('", "')'", "'-'", "'#'", 
		"'...'", "'<'", "'<='", "'>'", "'>='", "'=='", "'~='", "'and'", "'or'", 
		"'^'", "'%'", "'..'", "'*'", "'/'", "'+'", "'{'", "'}'", "'['", "']'", 
		"'='", "'break'", "'do'", "'else'", "'elseif'", "'end'", "'false'", "'for'", 
		"'function'", "'goto'", "'if'", "'in'", "'local'", "'nil'", "'not'", "'repeat'", 
		"'return'", "'then'", "'true'", "'until'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ATR", "BREAK", "DO", "ELSE", "ELSEIF", 
		"END", "FALSE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "LOCAL", "NIL", 
		"NOT", "REPEAT", "RETURN", "THEN", "TRUE", "UNTIL", "WHILE", "SEPARACAMPOS", 
		"ID", "CADEIA", "COM", "WS", "EOL", "DECIMAL", "NOME"
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					comando();
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(77);
						match(T__0);
						}
					}

					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK || _la==RETURN) {
				{
				setState(85);
				retorno();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(86);
					match(T__0);
					}
				}

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
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_retorno);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(RETURN);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__24) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << ID) | (1L << CADEIA) | (1L << DECIMAL))) != 0)) {
					{
					setState(92);
					listaExpressoes();
					}
				}

				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(BREAK);
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
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trecho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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

	public static class ComandoContext extends ParserRuleContext {
		public ListaVariaveisContext listaVariaveis() {
			return getRuleContext(ListaVariaveisContext.class,0);
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
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
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
		public NomeIdContext nomeId() {
			return getRuleContext(NomeIdContext.class,0);
		}
		public ListaIdsContext listaIds() {
			return getRuleContext(ListaIdsContext.class,0);
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
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				listaVariaveis();
				setState(101);
				match(ATR);
				setState(102);
				listaExpressoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				chamadaFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				rotulo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(BREAK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				match(GOTO);
				setState(108);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(DO);
				setState(110);
				bloco();
				setState(111);
				match(END);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				match(WHILE);
				setState(114);
				expressao(0);
				setState(115);
				match(DO);
				setState(116);
				bloco();
				setState(117);
				match(END);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(REPEAT);
				setState(120);
				bloco();
				setState(121);
				match(UNTIL);
				setState(122);
				expressao(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				match(IF);
				setState(125);
				expressao(0);
				setState(126);
				match(THEN);
				setState(127);
				bloco();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(128);
					match(ELSEIF);
					setState(129);
					expressao(0);
					setState(130);
					match(THEN);
					setState(131);
					bloco();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(138);
					match(ELSE);
					setState(139);
					bloco();
					}
				}

				setState(142);
				match(END);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				match(FOR);
				setState(145);
				nomeId();
				setState(146);
				match(ATR);
				setState(147);
				expressao(0);
				setState(148);
				match(T__1);
				setState(149);
				expressao(0);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(150);
					match(T__1);
					setState(151);
					expressao(0);
					}
				}

				setState(154);
				match(DO);
				setState(155);
				bloco();
				setState(156);
				match(END);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				match(FOR);
				setState(159);
				listaIds();
				setState(160);
				match(IN);
				setState(161);
				listaExpressoes();
				setState(162);
				match(DO);
				setState(163);
				bloco();
				setState(164);
				match(END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(166);
				match(FUNCTION);
				setState(167);
				nomeFuncao();
				setState(168);
				corpoFuncao();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(170);
				match(LOCAL);
				setState(171);
				match(FUNCTION);
				setState(172);
				match(ID);
				setState(173);
				corpoFuncao();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(174);
				match(LOCAL);
				setState(175);
				listaIds();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATR) {
					{
					setState(176);
					match(ATR);
					setState(177);
					nomeId();
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
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
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
	}

	public final RotuloContext rotulo() throws RecognitionException {
		RotuloContext _localctx = new RotuloContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rotulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__2);
			setState(183);
			match(ID);
			setState(184);
			match(T__2);
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

	public static class NomeIdContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
		public NomeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomeId(this);
		}
	}

	public final NomeIdContext nomeId() throws RecognitionException {
		NomeIdContext _localctx = new NomeIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nomeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((NomeIdContext)_localctx).ID = match(ID);
			TabelaDeSimbolos.adicionarSimbolo((((NomeIdContext)_localctx).ID!=null?((NomeIdContext)_localctx).ID.getText():null),Tipo.VARIAVEL); 
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

	public static class ListaVariaveisContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListaVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaVariaveis(this);
		}
	}

	public final ListaVariaveisContext listaVariaveis() throws RecognitionException {
		ListaVariaveisContext _localctx = new ListaVariaveisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaVariaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			var();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(190);
				match(T__1);
				setState(191);
				var();
				}
				}
				setState(196);
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

	public static class NomeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LuaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LuaParser.ID, i);
		}
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNome(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nome);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(198);
				match(T__3);
				setState(199);
				match(ID);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(205);
				match(T__4);
				setState(206);
				match(ID);
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

	public static class NomeAuxContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
		public NomeAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomeAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomeAux(this);
		}
	}

	public final NomeAuxContext nomeAux() throws RecognitionException {
		NomeAuxContext _localctx = new NomeAuxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nomeAux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((NomeAuxContext)_localctx).ID = match(ID);
			TabelaDeSimbolos.adicionarSimbolo(((((NomeAuxContext)_localctx).ID!=null?((NomeAuxContext)_localctx).ID.getText():null)),Tipo.VARIAVEL); 
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
		public NomeContext nome;
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
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
	}

	public final NomeFuncaoContext nomeFuncao() throws RecognitionException {
		NomeFuncaoContext _localctx = new NomeFuncaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nomeFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((NomeFuncaoContext)_localctx).nome = nome();
			TabelaDeSimbolos.adicionarSimbolo(((((NomeFuncaoContext)_localctx).nome!=null?_input.getText(((NomeFuncaoContext)_localctx).nome.start,((NomeFuncaoContext)_localctx).nome.stop):null)),Tipo.FUNCAO); 
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
		public PrefixoExpressaoContext prefixoExpressao() {
			return getRuleContext(PrefixoExpressaoContext.class,0);
		}
		public VarSufixoContext varSufixo() {
			return getRuleContext(VarSufixoContext.class,0);
		}
		public NomeIdContext nomeId() {
			return getRuleContext(NomeIdContext.class,0);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				prefixoExpressao(0);
				setState(216);
				varSufixo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				nomeId();
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

	public static class VarSufixoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
		public VarSufixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSufixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarSufixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarSufixo(this);
		}
	}

	public final VarSufixoContext varSufixo() throws RecognitionException {
		VarSufixoContext _localctx = new VarSufixoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varSufixo);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__5);
				setState(222);
				expressao(0);
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(223);
					match(T__6);
					}
					break;
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(T__3);
				setState(227);
				match(ID);
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

	public static class ListaIdsContext extends ParserRuleContext {
		public List<NomeAuxContext> nomeAux() {
			return getRuleContexts(NomeAuxContext.class);
		}
		public NomeAuxContext nomeAux(int i) {
			return getRuleContext(NomeAuxContext.class,i);
		}
		public ListaIdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaIds(this);
		}
	}

	public final ListaIdsContext listaIds() throws RecognitionException {
		ListaIdsContext _localctx = new ListaIdsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaIds);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			nomeAux();
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(T__1);
					setState(232);
					nomeAux();
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
			exitRule();
		}
		return _localctx;
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
	}

	public final ListaExpressoesContext listaExpressoes() throws RecognitionException {
		ListaExpressoesContext _localctx = new ListaExpressoesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaExpressoes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					expressao(0);
					setState(239);
					match(T__1);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(246);
			expressao(0);
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

	public static class OpUnarioContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LuaParser.NOT, 0); }
		public OpUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpUnario(this);
		}
	}

	public final OpUnarioContext opUnario() throws RecognitionException {
		OpUnarioContext _localctx = new OpUnarioContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << NOT))) != 0)) ) {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Expressao1Context expressao1() {
			return getRuleContext(Expressao1Context.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public OpBin4Context opBin4() {
			return getRuleContext(OpBin4Context.class,0);
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
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(251);
			expressao1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(253);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(254);
					opBin4();
					setState(255);
					expressao1(0);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Expressao1Context extends ParserRuleContext {
		public Expressao2Context expressao2() {
			return getRuleContext(Expressao2Context.class,0);
		}
		public Expressao1Context expressao1() {
			return getRuleContext(Expressao1Context.class,0);
		}
		public OpBin3Context opBin3() {
			return getRuleContext(OpBin3Context.class,0);
		}
		public Expressao1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpressao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpressao1(this);
		}
	}

	public final Expressao1Context expressao1() throws RecognitionException {
		return expressao1(0);
	}

	private Expressao1Context expressao1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao1Context _localctx = new Expressao1Context(_ctx, _parentState);
		Expressao1Context _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressao1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(263);
			expressao2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expressao1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao1);
					setState(265);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(266);
					opBin3();
					setState(267);
					expressao2(0);
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Expressao2Context extends ParserRuleContext {
		public Expressao3Context expressao3() {
			return getRuleContext(Expressao3Context.class,0);
		}
		public Expressao2Context expressao2() {
			return getRuleContext(Expressao2Context.class,0);
		}
		public OpBin2Context opBin2() {
			return getRuleContext(OpBin2Context.class,0);
		}
		public Expressao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpressao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpressao2(this);
		}
	}

	public final Expressao2Context expressao2() throws RecognitionException {
		return expressao2(0);
	}

	private Expressao2Context expressao2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao2Context _localctx = new Expressao2Context(_ctx, _parentState);
		Expressao2Context _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expressao2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
			expressao3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expressao2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao2);
					setState(277);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(278);
					opBin2();
					setState(279);
					expressao3(0);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Expressao3Context extends ParserRuleContext {
		public Expressao4Context expressao4() {
			return getRuleContext(Expressao4Context.class,0);
		}
		public Expressao3Context expressao3() {
			return getRuleContext(Expressao3Context.class,0);
		}
		public OpBin1Context opBin1() {
			return getRuleContext(OpBin1Context.class,0);
		}
		public Expressao3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpressao3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpressao3(this);
		}
	}

	public final Expressao3Context expressao3() throws RecognitionException {
		return expressao3(0);
	}

	private Expressao3Context expressao3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao3Context _localctx = new Expressao3Context(_ctx, _parentState);
		Expressao3Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expressao3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			expressao4();
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expressao3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao3);
					setState(289);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(290);
					opBin1();
					setState(291);
					expressao4();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Expressao4Context extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(LuaParser.NIL, 0); }
		public TerminalNode NOT() { return getToken(LuaParser.NOT, 0); }
		public TerminalNode FALSE() { return getToken(LuaParser.FALSE, 0); }
		public TerminalNode DECIMAL() { return getToken(LuaParser.DECIMAL, 0); }
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
		public OpUnarioContext opUnario() {
			return getRuleContext(OpUnarioContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Expressao4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpressao4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpressao4(this);
		}
	}

	public final Expressao4Context expressao4() throws RecognitionException {
		Expressao4Context _localctx = new Expressao4Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressao4);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(NIL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(NOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(DECIMAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(CADEIA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				match(T__9);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				definicaoFuncao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
				prefixoExpressao(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(306);
				construtorTabela();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(307);
				opUnario();
				setState(308);
				expressao(0);
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

	public static class OpBin1Context extends ParserRuleContext {
		public OpBin1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBin1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpBin1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpBin1(this);
		}
	}

	public final OpBin1Context opBin1() throws RecognitionException {
		OpBin1Context _localctx = new OpBin1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_opBin1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class OpBin2Context extends ParserRuleContext {
		public OpBin2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBin2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpBin2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpBin2(this);
		}
	}

	public final OpBin2Context opBin2() throws RecognitionException {
		OpBin2Context _localctx = new OpBin2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_opBin2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class OpBin3Context extends ParserRuleContext {
		public OpBin3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBin3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpBin3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpBin3(this);
		}
	}

	public final OpBin3Context opBin3() throws RecognitionException {
		OpBin3Context _localctx = new OpBin3Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_opBin3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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

	public static class OpBin4Context extends ParserRuleContext {
		public OpBin4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBin4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpBin4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpBin4(this);
		}
	}

	public final OpBin4Context opBin4() throws RecognitionException {
		OpBin4Context _localctx = new OpBin4Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_opBin4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__23) ) {
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

	public static class FuncaoCompostaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
		public VarSufixoContext varSufixo() {
			return getRuleContext(VarSufixoContext.class,0);
		}
		public FuncaoCompostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoComposta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncaoComposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncaoComposta(this);
		}
	}

	public final FuncaoCompostaContext funcaoComposta() throws RecognitionException {
		FuncaoCompostaContext _localctx = new FuncaoCompostaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcaoComposta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(ID);
			setState(321);
			varSufixo();
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

	public static class PrefixoExpressaoContext extends ParserRuleContext {
		public FuncaoCompostaContext funcaoComposta;
		public FuncaoCompostaContext funcaoComposta() {
			return getRuleContext(FuncaoCompostaContext.class,0);
		}
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrefixoExpressaoContext prefixoExpressao() {
			return getRuleContext(PrefixoExpressaoContext.class,0);
		}
		public FuncaoAuxContext funcaoAux() {
			return getRuleContext(FuncaoAuxContext.class,0);
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
	}

	public final PrefixoExpressaoContext prefixoExpressao() throws RecognitionException {
		return prefixoExpressao(0);
	}

	private PrefixoExpressaoContext prefixoExpressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrefixoExpressaoContext _localctx = new PrefixoExpressaoContext(_ctx, _parentState);
		PrefixoExpressaoContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_prefixoExpressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(324);
				((PrefixoExpressaoContext)_localctx).funcaoComposta = funcaoComposta();
				TabelaDeSimbolos.adicionarSimbolo(((((PrefixoExpressaoContext)_localctx).funcaoComposta!=null?_input.getText(((PrefixoExpressaoContext)_localctx).funcaoComposta.start,((PrefixoExpressaoContext)_localctx).funcaoComposta.stop):null)),Tipo.FUNCAO); 
				}
				break;
			case 2:
				{
				setState(327);
				match(ID);
				}
				break;
			case 3:
				{
				setState(328);
				match(T__5);
				setState(329);
				expressao(0);
				setState(330);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrefixoExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_prefixoExpressao);
					setState(334);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(335);
					funcaoAux();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public PrefixoExpressaoContext prefixoExpressao;
		public PrefixoExpressaoContext prefixoExpressao() {
			return getRuleContext(PrefixoExpressaoContext.class,0);
		}
		public FuncaoAuxContext funcaoAux() {
			return getRuleContext(FuncaoAuxContext.class,0);
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
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			((ChamadaFuncaoContext)_localctx).prefixoExpressao = prefixoExpressao(0);
			setState(342);
			funcaoAux();
			TabelaDeSimbolos.adicionarSimbolo(((((ChamadaFuncaoContext)_localctx).prefixoExpressao!=null?_input.getText(((ChamadaFuncaoContext)_localctx).prefixoExpressao.start,((ChamadaFuncaoContext)_localctx).prefixoExpressao.stop):null)),Tipo.FUNCAO); 
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

	public static class FuncaoAuxContext extends ParserRuleContext {
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public FuncaoAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncaoAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncaoAux(this);
		}
	}

	public final FuncaoAuxContext funcaoAux() throws RecognitionException {
		FuncaoAuxContext _localctx = new FuncaoAuxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funcaoAux);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__24:
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				argumentos();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__4);
				setState(347);
				match(NOME);
				setState(348);
				argumentos();
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

	public static class ArgumentosContext extends ParserRuleContext {
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public ConstrutorTabelaContext construtorTabela() {
			return getRuleContext(ConstrutorTabelaContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argumentos);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__5);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__24) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << ID) | (1L << CADEIA) | (1L << DECIMAL))) != 0)) {
					{
					setState(352);
					listaExpressoes();
					}
				}

				setState(355);
				match(T__6);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				construtorTabela();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
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
	}

	public final DefinicaoFuncaoContext definicaoFuncao() throws RecognitionException {
		DefinicaoFuncaoContext _localctx = new DefinicaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_definicaoFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(FUNCTION);
			setState(361);
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
	}

	public final CorpoFuncaoContext corpoFuncao() throws RecognitionException {
		CorpoFuncaoContext _localctx = new CorpoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_corpoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__5);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==ID) {
				{
				setState(364);
				listaParametros();
				}
			}

			setState(367);
			match(T__6);
			setState(368);
			bloco();
			setState(369);
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
		public ListaIdsContext listaIds() {
			return getRuleContext(ListaIdsContext.class,0);
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
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listaParametros);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				listaIds();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(372);
					match(T__1);
					setState(373);
					match(T__9);
					}
				}

				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
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
	}

	public final ConstrutorTabelaContext construtorTabela() throws RecognitionException {
		ConstrutorTabelaContext _localctx = new ConstrutorTabelaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_construtorTabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__24);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__24) | (1L << T__26) | (1L << FALSE) | (1L << FUNCTION) | (1L << NIL) | (1L << NOT) | (1L << ID) | (1L << CADEIA) | (1L << DECIMAL))) != 0)) {
				{
				setState(380);
				listaCampos();
				}
			}

			setState(383);
			match(T__25);
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
	}

	public final ListaCamposContext listaCampos() throws RecognitionException {
		ListaCamposContext _localctx = new ListaCamposContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listaCampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			campo();
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(386);
					separaCampos();
					setState(387);
					campo();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARACAMPOS) {
				{
				setState(394);
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
		public TerminalNode ID() { return getToken(LuaParser.ID, 0); }
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
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_campo);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(T__26);
				setState(398);
				expressao(0);
				setState(399);
				match(T__27);
				setState(400);
				match(ATR);
				setState(401);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(ID);
				setState(404);
				match(ATR);
				setState(405);
				expressao(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				expressao(0);
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

	public static class SeparaCamposContext extends ParserRuleContext {
		public TerminalNode SEPARACAMPOS() { return getToken(LuaParser.SEPARACAMPOS, 0); }
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
	}

	public final SeparaCamposContext separaCampos() throws RecognitionException {
		SeparaCamposContext _localctx = new SeparaCamposContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_separaCampos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(SEPARACAMPOS);
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
		case 16:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 17:
			return expressao1_sempred((Expressao1Context)_localctx, predIndex);
		case 18:
			return expressao2_sempred((Expressao2Context)_localctx, predIndex);
		case 19:
			return expressao3_sempred((Expressao3Context)_localctx, predIndex);
		case 26:
			return prefixoExpressao_sempred((PrefixoExpressaoContext)_localctx, predIndex);
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
	private boolean expressao1_sempred(Expressao1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressao2_sempred(Expressao2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressao3_sempred(Expressao3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean prefixoExpressao_sempred(PrefixoExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u019e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\5\3Q\n\3\7\3S\n\3"+
		"\f\3\16\3V\13\3\3\3\3\3\5\3Z\n\3\5\3\\\n\3\3\4\3\4\5\4`\n\4\3\4\5\4c\n"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\5\6\u008f\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00b5\n\6\5\6\u00b7\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t"+
		"\u00c3\n\t\f\t\16\t\u00c6\13\t\3\n\3\n\3\n\7\n\u00cb\n\n\f\n\16\n\u00ce"+
		"\13\n\3\n\3\n\5\n\u00d2\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\5\r\u00de\n\r\3\16\3\16\3\16\5\16\u00e3\n\16\3\16\3\16\5\16\u00e7\n\16"+
		"\3\17\3\17\3\17\7\17\u00ec\n\17\f\17\16\17\u00ef\13\17\3\20\3\20\3\20"+
		"\7\20\u00f4\n\20\f\20\16\20\u00f7\13\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0104\n\22\f\22\16\22\u0107\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0110\n\23\f\23\16\23\u0113\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u011c\n\24\f\24\16\24\u011f\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0128\n\25\f\25\16\25\u012b"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0139\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014f\n\34\3\34\3\34\7\34"+
		"\u0153\n\34\f\34\16\34\u0156\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\5\36\u0160\n\36\3\37\3\37\5\37\u0164\n\37\3\37\3\37\3\37\5\37\u0169"+
		"\n\37\3 \3 \3 \3!\3!\5!\u0170\n!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0179\n\""+
		"\3\"\5\"\u017c\n\"\3#\3#\5#\u0180\n#\3#\3#\3$\3$\3$\3$\7$\u0188\n$\f$"+
		"\16$\u018b\13$\3$\5$\u018e\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u019a\n"+
		"%\3&\3&\3&\2\7\"$&(\66\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJ\2\7\4\2\n\13--\3\2\r\24\3\2\25\27\3\2\30\31"+
		"\4\2\n\n\32\32\2\u01b3\2L\3\2\2\2\4T\3\2\2\2\6b\3\2\2\2\bd\3\2\2\2\n\u00b6"+
		"\3\2\2\2\f\u00b8\3\2\2\2\16\u00bc\3\2\2\2\20\u00bf\3\2\2\2\22\u00c7\3"+
		"\2\2\2\24\u00d3\3\2\2\2\26\u00d6\3\2\2\2\30\u00dd\3\2\2\2\32\u00e6\3\2"+
		"\2\2\34\u00e8\3\2\2\2\36\u00f5\3\2\2\2 \u00fa\3\2\2\2\"\u00fc\3\2\2\2"+
		"$\u0108\3\2\2\2&\u0114\3\2\2\2(\u0120\3\2\2\2*\u0138\3\2\2\2,\u013a\3"+
		"\2\2\2.\u013c\3\2\2\2\60\u013e\3\2\2\2\62\u0140\3\2\2\2\64\u0142\3\2\2"+
		"\2\66\u014e\3\2\2\28\u0157\3\2\2\2:\u015f\3\2\2\2<\u0168\3\2\2\2>\u016a"+
		"\3\2\2\2@\u016d\3\2\2\2B\u017b\3\2\2\2D\u017d\3\2\2\2F\u0183\3\2\2\2H"+
		"\u0199\3\2\2\2J\u019b\3\2\2\2LM\5\b\5\2M\3\3\2\2\2NP\5\n\6\2OQ\7\3\2\2"+
		"PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"U[\3\2\2\2VT\3\2\2\2WY\5\6\4\2XZ\7\3\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2"+
		"\2[W\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2]_\7/\2\2^`\5\36\20\2_^\3\2\2\2_`\3"+
		"\2\2\2`c\3\2\2\2ac\7 \2\2b]\3\2\2\2ba\3\2\2\2c\7\3\2\2\2de\5\4\3\2e\t"+
		"\3\2\2\2fg\5\20\t\2gh\7\37\2\2hi\5\36\20\2i\u00b7\3\2\2\2j\u00b7\58\35"+
		"\2k\u00b7\5\f\7\2l\u00b7\7 \2\2mn\7(\2\2n\u00b7\7\65\2\2op\7!\2\2pq\5"+
		"\4\3\2qr\7$\2\2r\u00b7\3\2\2\2st\7\63\2\2tu\5\"\22\2uv\7!\2\2vw\5\4\3"+
		"\2wx\7$\2\2x\u00b7\3\2\2\2yz\7.\2\2z{\5\4\3\2{|\7\62\2\2|}\5\"\22\2}\u00b7"+
		"\3\2\2\2~\177\7)\2\2\177\u0080\5\"\22\2\u0080\u0081\7\60\2\2\u0081\u0089"+
		"\5\4\3\2\u0082\u0083\7#\2\2\u0083\u0084\5\"\22\2\u0084\u0085\7\60\2\2"+
		"\u0085\u0086\5\4\3\2\u0086\u0088\3\2\2\2\u0087\u0082\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\"\2\2\u008d\u008f\5\4\3\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7$\2\2\u0091"+
		"\u00b7\3\2\2\2\u0092\u0093\7&\2\2\u0093\u0094\5\16\b\2\u0094\u0095\7\37"+
		"\2\2\u0095\u0096\5\"\22\2\u0096\u0097\7\4\2\2\u0097\u009a\5\"\22\2\u0098"+
		"\u0099\7\4\2\2\u0099\u009b\5\"\22\2\u009a\u0098\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7!\2\2\u009d\u009e\5\4\3\2\u009e"+
		"\u009f\7$\2\2\u009f\u00b7\3\2\2\2\u00a0\u00a1\7&\2\2\u00a1\u00a2\5\34"+
		"\17\2\u00a2\u00a3\7*\2\2\u00a3\u00a4\5\36\20\2\u00a4\u00a5\7!\2\2\u00a5"+
		"\u00a6\5\4\3\2\u00a6\u00a7\7$\2\2\u00a7\u00b7\3\2\2\2\u00a8\u00a9\7\'"+
		"\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\5@!\2\u00ab\u00b7\3\2\2\2\u00ac"+
		"\u00ad\7+\2\2\u00ad\u00ae\7\'\2\2\u00ae\u00af\7\65\2\2\u00af\u00b7\5@"+
		"!\2\u00b0\u00b1\7+\2\2\u00b1\u00b4\5\34\17\2\u00b2\u00b3\7\37\2\2\u00b3"+
		"\u00b5\5\16\b\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3"+
		"\2\2\2\u00b6f\3\2\2\2\u00b6j\3\2\2\2\u00b6k\3\2\2\2\u00b6l\3\2\2\2\u00b6"+
		"m\3\2\2\2\u00b6o\3\2\2\2\u00b6s\3\2\2\2\u00b6y\3\2\2\2\u00b6~\3\2\2\2"+
		"\u00b6\u0092\3\2\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00ac"+
		"\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9"+
		"\u00ba\7\65\2\2\u00ba\u00bb\7\5\2\2\u00bb\r\3\2\2\2\u00bc\u00bd\7\65\2"+
		"\2\u00bd\u00be\b\b\1\2\u00be\17\3\2\2\2\u00bf\u00c4\5\30\r\2\u00c0\u00c1"+
		"\7\4\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00cc\7\65\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00cb\7\65\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\7\2\2\u00d0"+
		"\u00d2\7\65\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\23\3\2\2"+
		"\2\u00d3\u00d4\7\65\2\2\u00d4\u00d5\b\13\1\2\u00d5\25\3\2\2\2\u00d6\u00d7"+
		"\5\22\n\2\u00d7\u00d8\b\f\1\2\u00d8\27\3\2\2\2\u00d9\u00da\5\66\34\2\u00da"+
		"\u00db\5\32\16\2\u00db\u00de\3\2\2\2\u00dc\u00de\5\16\b\2\u00dd\u00d9"+
		"\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\31\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0"+
		"\u00e2\5\"\22\2\u00e1\u00e3\7\t\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e5\7\6\2\2\u00e5\u00e7\7\65\2\2\u00e6"+
		"\u00df\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\33\3\2\2\2\u00e8\u00ed\5\24\13"+
		"\2\u00e9\u00ea\7\4\2\2\u00ea\u00ec\5\24\13\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\35\3\2\2"+
		"\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\5\"\22\2\u00f1\u00f2\7\4\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\5\"\22\2\u00f9\37\3\2\2\2\u00fa\u00fb\t\2\2\2\u00fb!\3\2\2\2\u00fc"+
		"\u00fd\b\22\1\2\u00fd\u00fe\5$\23\2\u00fe\u0105\3\2\2\2\u00ff\u0100\f"+
		"\4\2\2\u0100\u0101\5\62\32\2\u0101\u0102\5$\23\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106#\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\b\23\1\2\u0109\u010a"+
		"\5&\24\2\u010a\u0111\3\2\2\2\u010b\u010c\f\4\2\2\u010c\u010d\5\60\31\2"+
		"\u010d\u010e\5&\24\2\u010e\u0110\3\2\2\2\u010f\u010b\3\2\2\2\u0110\u0113"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112%\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\b\24\1\2\u0115\u0116\5(\25\2\u0116\u011d\3"+
		"\2\2\2\u0117\u0118\f\4\2\2\u0118\u0119\5.\30\2\u0119\u011a\5(\25\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\'\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121"+
		"\b\25\1\2\u0121\u0122\5*\26\2\u0122\u0129\3\2\2\2\u0123\u0124\f\4\2\2"+
		"\u0124\u0125\5,\27\2\u0125\u0126\5*\26\2\u0126\u0128\3\2\2\2\u0127\u0123"+
		"\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		")\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0139\7,\2\2\u012d\u0139\7-\2\2\u012e"+
		"\u0139\7%\2\2\u012f\u0139\7:\2\2\u0130\u0139\7\66\2\2\u0131\u0139\7\f"+
		"\2\2\u0132\u0139\5> \2\u0133\u0139\5\66\34\2\u0134\u0139\5D#\2\u0135\u0136"+
		"\5 \21\2\u0136\u0137\5\"\22\2\u0137\u0139\3\2\2\2\u0138\u012c\3\2\2\2"+
		"\u0138\u012d\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0130"+
		"\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0133\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0139+\3\2\2\2\u013a\u013b\t\3\2\2"+
		"\u013b-\3\2\2\2\u013c\u013d\t\4\2\2\u013d/\3\2\2\2\u013e\u013f\t\5\2\2"+
		"\u013f\61\3\2\2\2\u0140\u0141\t\6\2\2\u0141\63\3\2\2\2\u0142\u0143\7\65"+
		"\2\2\u0143\u0144\5\32\16\2\u0144\65\3\2\2\2\u0145\u0146\b\34\1\2\u0146"+
		"\u0147\5\64\33\2\u0147\u0148\b\34\1\2\u0148\u014f\3\2\2\2\u0149\u014f"+
		"\7\65\2\2\u014a\u014b\7\b\2\2\u014b\u014c\5\"\22\2\u014c\u014d\7\t\2\2"+
		"\u014d\u014f\3\2\2\2\u014e\u0145\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014a"+
		"\3\2\2\2\u014f\u0154\3\2\2\2\u0150\u0151\f\4\2\2\u0151\u0153\5:\36\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\67\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\5\66\34\2\u0158"+
		"\u0159\5:\36\2\u0159\u015a\b\35\1\2\u015a9\3\2\2\2\u015b\u0160\5<\37\2"+
		"\u015c\u015d\7\7\2\2\u015d\u015e\7;\2\2\u015e\u0160\5<\37\2\u015f\u015b"+
		"\3\2\2\2\u015f\u015c\3\2\2\2\u0160;\3\2\2\2\u0161\u0163\7\b\2\2\u0162"+
		"\u0164\5\36\20\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3"+
		"\2\2\2\u0165\u0169\7\t\2\2\u0166\u0169\5D#\2\u0167\u0169\7\66\2\2\u0168"+
		"\u0161\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169=\3\2\2\2"+
		"\u016a\u016b\7\'\2\2\u016b\u016c\5@!\2\u016c?\3\2\2\2\u016d\u016f\7\b"+
		"\2\2\u016e\u0170\5B\"\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\7\t\2\2\u0172\u0173\5\4\3\2\u0173\u0174\7$"+
		"\2\2\u0174A\3\2\2\2\u0175\u0178\5\34\17\2\u0176\u0177\7\4\2\2\u0177\u0179"+
		"\7\f\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u017c\7\f\2\2\u017b\u0175\3\2\2\2\u017b\u017a\3\2\2\2\u017cC\3\2\2\2"+
		"\u017d\u017f\7\33\2\2\u017e\u0180\5F$\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\34\2\2\u0182E\3\2\2\2\u0183"+
		"\u0189\5H%\2\u0184\u0185\5J&\2\u0185\u0186\5H%\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0184\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\5J&\2\u018d\u018c"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018eG\3\2\2\2\u018f\u0190\7\35\2\2\u0190"+
		"\u0191\5\"\22\2\u0191\u0192\7\36\2\2\u0192\u0193\7\37\2\2\u0193\u0194"+
		"\5\"\22\2\u0194\u019a\3\2\2\2\u0195\u0196\7\65\2\2\u0196\u0197\7\37\2"+
		"\2\u0197\u019a\5\"\22\2\u0198\u019a\5\"\22\2\u0199\u018f\3\2\2\2\u0199"+
		"\u0195\3\2\2\2\u0199\u0198\3\2\2\2\u019aI\3\2\2\2\u019b\u019c\7\64\2\2"+
		"\u019cK\3\2\2\2&PTY[_b\u0089\u008e\u009a\u00b4\u00b6\u00c4\u00cc\u00d1"+
		"\u00dd\u00e2\u00e6\u00ed\u00f5\u0105\u0111\u011d\u0129\u0138\u014e\u0154"+
		"\u015f\u0163\u0168\u016f\u0178\u017b\u017f\u0189\u018d\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}