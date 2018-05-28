// Generated from /home/mariana/Desktop/CC1/T1/T1/src/t1/Lua.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaLexer extends Lexer {
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
		CADEIA=49, COM=50, WS=51, EOL=52, DECIMAL=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "ATR", "BREAK", "DO", "ELSE", "ELSEIF", "END", "FALSE", "FOR", 
		"FUNCTION", "GOTO", "IF", "IN", "LOCAL", "NIL", "NOT", "REPEAT", "RETURN", 
		"THEN", "TRUE", "UNTIL", "WHILE", "Letra", "Digito", "IDENTIFICADOR", 
		"CADEIA", "COM", "WS", "EOL", "DECIMAL"
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
		"COM", "WS", "EOL", "DECIMAL"
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


	   public static String grupo="<<726568_e_726552_e_726580>>";


	public LuaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\5\63\u011f\n\63\3\63\3\63\3\63\7\63\u0124"+
		"\n\63\f\63\16\63\u0127\13\63\3\64\3\64\7\64\u012b\n\64\f\64\16\64\u012e"+
		"\13\64\3\64\3\64\3\64\7\64\u0133\n\64\f\64\16\64\u0136\13\64\3\64\5\64"+
		"\u0139\n\64\3\65\3\65\3\65\3\65\3\65\6\65\u0140\n\65\r\65\16\65\u0141"+
		"\3\65\3\65\3\66\5\66\u0147\n\66\3\66\3\66\3\67\5\67\u014c\n\67\3\67\3"+
		"\67\38\68\u0151\n8\r8\168\u0152\38\38\68\u0157\n8\r8\168\u0158\58\u015b"+
		"\n8\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\62g\63i\64k"+
		"\65m\66o\67\3\2\b\4\2C\\c|\5\2$$))^^\3\2\f\f\3\2\17\17\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r"+
		"{\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0082\3\2\2\2\25\u0084\3\2\2\2"+
		"\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37"+
		"\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3"+
		"\2\2\2)\u009b\3\2\2\2+\u009d\3\2\2\2-\u00a0\3\2\2\2/\u00a2\3\2\2\2\61"+
		"\u00a5\3\2\2\2\63\u00a8\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00af"+
		"\3\2\2\2;\u00b5\3\2\2\2=\u00b8\3\2\2\2?\u00bd\3\2\2\2A\u00c4\3\2\2\2C"+
		"\u00c8\3\2\2\2E\u00ce\3\2\2\2G\u00d2\3\2\2\2I\u00db\3\2\2\2K\u00e0\3\2"+
		"\2\2M\u00e3\3\2\2\2O\u00e6\3\2\2\2Q\u00ec\3\2\2\2S\u00f0\3\2\2\2U\u00f4"+
		"\3\2\2\2W\u00fb\3\2\2\2Y\u0102\3\2\2\2[\u0107\3\2\2\2]\u010c\3\2\2\2_"+
		"\u0112\3\2\2\2a\u0118\3\2\2\2c\u011a\3\2\2\2e\u011e\3\2\2\2g\u0138\3\2"+
		"\2\2i\u013a\3\2\2\2k\u0146\3\2\2\2m\u014b\3\2\2\2o\u0150\3\2\2\2qr\7."+
		"\2\2r\4\3\2\2\2st\7=\2\2t\6\3\2\2\2uv\7]\2\2v\b\3\2\2\2wx\7_\2\2x\n\3"+
		"\2\2\2yz\7\60\2\2z\f\3\2\2\2{|\7*\2\2|\16\3\2\2\2}~\7+\2\2~\20\3\2\2\2"+
		"\177\u0080\7<\2\2\u0080\u0081\7<\2\2\u0081\22\3\2\2\2\u0082\u0083\7<\2"+
		"\2\u0083\24\3\2\2\2\u0084\u0085\7\60\2\2\u0085\u0086\7\60\2\2\u0086\u0087"+
		"\7\60\2\2\u0087\26\3\2\2\2\u0088\u0089\7}\2\2\u0089\30\3\2\2\2\u008a\u008b"+
		"\7\177\2\2\u008b\32\3\2\2\2\u008c\u008d\7-\2\2\u008d\34\3\2\2\2\u008e"+
		"\u008f\7/\2\2\u008f\36\3\2\2\2\u0090\u0091\7,\2\2\u0091 \3\2\2\2\u0092"+
		"\u0093\7\61\2\2\u0093\"\3\2\2\2\u0094\u0095\7`\2\2\u0095$\3\2\2\2\u0096"+
		"\u0097\7\'\2\2\u0097&\3\2\2\2\u0098\u0099\7\60\2\2\u0099\u009a\7\60\2"+
		"\2\u009a(\3\2\2\2\u009b\u009c\7>\2\2\u009c*\3\2\2\2\u009d\u009e\7>\2\2"+
		"\u009e\u009f\7?\2\2\u009f,\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1.\3\2\2\2\u00a2"+
		"\u00a3\7@\2\2\u00a3\u00a4\7?\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6"+
		"\u00a7\7?\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7\u0080\2\2\u00a9\u00aa\7?"+
		"\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7%\2\2\u00ac\66\3\2\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae8\3\2\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7m\2\2\u00b4:\3\2\2\2\u00b5\u00b6"+
		"\7f\2\2\u00b6\u00b7\7q\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc>\3\2\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2\u00c3\7h\2\2\u00c3@\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7B\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cdD\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2"+
		"\2\u00d1F\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7"+
		"p\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\u00da\7p\2\2\u00daH\3\2\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd"+
		"\7q\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7q\2\2\u00dfJ\3\2\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7h\2\2\u00e2L\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9"+
		"\7e\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00ebP\3\2\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7n\2\2\u00efR\3\2\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7v\2\2\u00f3T\3\2\2\2\u00f4\u00f5"+
		"\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"\u00f9\7c\2\2\u00f9\u00fa\7v\2\2\u00faV\3\2\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7t\2\2"+
		"\u0100\u0101\7p\2\2\u0101X\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104\7j\2"+
		"\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106Z\3\2\2\2\u0107\u0108\7"+
		"v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7w\2\2\u010a\u010b\7g\2\2\u010b\\"+
		"\3\2\2\2\u010c\u010d\7w\2\2\u010d\u010e\7p\2\2\u010e\u010f\7v\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0111\7n\2\2\u0111^\3\2\2\2\u0112\u0113\7y\2\2\u0113"+
		"\u0114\7j\2\2\u0114\u0115\7k\2\2\u0115\u0116\7n\2\2\u0116\u0117\7g\2\2"+
		"\u0117`\3\2\2\2\u0118\u0119\t\2\2\2\u0119b\3\2\2\2\u011a\u011b\4\62;\2"+
		"\u011bd\3\2\2\2\u011c\u011f\5a\61\2\u011d\u011f\7a\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011d\3\2\2\2\u011f\u0125\3\2\2\2\u0120\u0124\5a\61\2\u0121"+
		"\u0124\5c\62\2\u0122\u0124\7a\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126f\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\7$\2\2\u0129"+
		"\u012b\n\3\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0139\7$\2\2\u0130\u0134\7)\2\2\u0131\u0133\n\3\2\2\u0132\u0131\3\2\2"+
		"\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\7)\2\2\u0138\u0128\3\2\2\2\u0138"+
		"\u0130\3\2\2\2\u0139h\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013c\7/\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u0140\n\4\2\2\u013e\u0140\t\5\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b\65\2\2\u0144j\3\2\2\2"+
		"\u0145\u0147\t\6\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\b\66\2\2\u0149l\3\2\2\2\u014a\u014c\t\7\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\b\67\2\2\u014en\3\2\2\2\u014f\u0151\5c\62\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u015a\3\2\2\2\u0154\u0156\7\60\2\2\u0155\u0157\5c\62\2"+
		"\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"p\3\2\2\2\20\2\u011e\u0123\u0125\u012c\u0134\u0138\u013f\u0141\u0146\u014b"+
		"\u0152\u0158\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}