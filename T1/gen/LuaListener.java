// Generated from /home/mariana/Desktop/CC1/T1/T1/src/t1/Lua.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void enterListaExpressoes(LuaParser.ListaExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void exitListaExpressoes(LuaParser.ListaExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LuaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LuaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varSufix}.
	 * @param ctx the parse tree
	 */
	void enterVarSufix(LuaParser.VarSufixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varSufix}.
	 * @param ctx the parse tree
	 */
	void exitVarSufix(LuaParser.VarSufixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#prefixoVar}.
	 * @param ctx the parse tree
	 */
	void enterPrefixoVar(LuaParser.PrefixoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#prefixoVar}.
	 * @param ctx the parse tree
	 */
	void exitPrefixoVar(LuaParser.PrefixoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LuaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LuaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#rotulo}.
	 * @param ctx the parse tree
	 */
	void enterRotulo(LuaParser.RotuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#rotulo}.
	 * @param ctx the parse tree
	 */
	void exitRotulo(LuaParser.RotuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void enterListaIdentificadores(LuaParser.ListaIdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void exitListaIdentificadores(LuaParser.ListaIdentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nomeFuncao}.
	 * @param ctx the parse tree
	 */
	void enterNomeFuncao(LuaParser.NomeFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nomeFuncao}.
	 * @param ctx the parse tree
	 */
	void exitNomeFuncao(LuaParser.NomeFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LuaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LuaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#prefixoExpressao}.
	 * @param ctx the parse tree
	 */
	void enterPrefixoExpressao(LuaParser.PrefixoExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#prefixoExpressao}.
	 * @param ctx the parse tree
	 */
	void exitPrefixoExpressao(LuaParser.PrefixoExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(LuaParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(LuaParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(LuaParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(LuaParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#definicaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicaoFuncao(LuaParser.DefinicaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#definicaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicaoFuncao(LuaParser.DefinicaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#corpoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterCorpoFuncao(LuaParser.CorpoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#corpoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitCorpoFuncao(LuaParser.CorpoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(LuaParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(LuaParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#construtorTabela}.
	 * @param ctx the parse tree
	 */
	void enterConstrutorTabela(LuaParser.ConstrutorTabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#construtorTabela}.
	 * @param ctx the parse tree
	 */
	void exitConstrutorTabela(LuaParser.ConstrutorTabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaCampos}.
	 * @param ctx the parse tree
	 */
	void enterListaCampos(LuaParser.ListaCamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaCampos}.
	 * @param ctx the parse tree
	 */
	void exitListaCampos(LuaParser.ListaCamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(LuaParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(LuaParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#separaCampos}.
	 * @param ctx the parse tree
	 */
	void enterSeparaCampos(LuaParser.SeparaCamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#separaCampos}.
	 * @param ctx the parse tree
	 */
	void exitSeparaCampos(LuaParser.SeparaCamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opbinario}.
	 * @param ctx the parse tree
	 */
	void enterOpbinario(LuaParser.OpbinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opbinario}.
	 * @param ctx the parse tree
	 */
	void exitOpbinario(LuaParser.OpbinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opunario}.
	 * @param ctx the parse tree
	 */
	void enterOpunario(LuaParser.OpunarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opunario}.
	 * @param ctx the parse tree
	 */
	void exitOpunario(LuaParser.OpunarioContext ctx);
}