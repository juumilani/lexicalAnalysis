// Generated from /home/mariana/Desktop/CC1/T1/T1/src/t1/Lua.g4 by ANTLR 4.7.1
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link LuaParser#nomeId}.
	 * @param ctx the parse tree
	 */
	void enterNomeId(LuaParser.NomeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nomeId}.
	 * @param ctx the parse tree
	 */
	void exitNomeId(LuaParser.NomeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListaVariaveis(LuaParser.ListaVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListaVariaveis(LuaParser.ListaVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(LuaParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(LuaParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nomeAux}.
	 * @param ctx the parse tree
	 */
	void enterNomeAux(LuaParser.NomeAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nomeAux}.
	 * @param ctx the parse tree
	 */
	void exitNomeAux(LuaParser.NomeAuxContext ctx);
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
	 * Enter a parse tree produced by {@link LuaParser#varSufixo}.
	 * @param ctx the parse tree
	 */
	void enterVarSufixo(LuaParser.VarSufixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varSufixo}.
	 * @param ctx the parse tree
	 */
	void exitVarSufixo(LuaParser.VarSufixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void enterListaIds(LuaParser.ListaIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void exitListaIds(LuaParser.ListaIdsContext ctx);
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
	 * Enter a parse tree produced by {@link LuaParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void enterOpUnario(LuaParser.OpUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void exitOpUnario(LuaParser.OpUnarioContext ctx);
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
	 * Enter a parse tree produced by {@link LuaParser#expressao1}.
	 * @param ctx the parse tree
	 */
	void enterExpressao1(LuaParser.Expressao1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expressao1}.
	 * @param ctx the parse tree
	 */
	void exitExpressao1(LuaParser.Expressao1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expressao2}.
	 * @param ctx the parse tree
	 */
	void enterExpressao2(LuaParser.Expressao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expressao2}.
	 * @param ctx the parse tree
	 */
	void exitExpressao2(LuaParser.Expressao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expressao3}.
	 * @param ctx the parse tree
	 */
	void enterExpressao3(LuaParser.Expressao3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expressao3}.
	 * @param ctx the parse tree
	 */
	void exitExpressao3(LuaParser.Expressao3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expressao4}.
	 * @param ctx the parse tree
	 */
	void enterExpressao4(LuaParser.Expressao4Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expressao4}.
	 * @param ctx the parse tree
	 */
	void exitExpressao4(LuaParser.Expressao4Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opBin1}.
	 * @param ctx the parse tree
	 */
	void enterOpBin1(LuaParser.OpBin1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opBin1}.
	 * @param ctx the parse tree
	 */
	void exitOpBin1(LuaParser.OpBin1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opBin2}.
	 * @param ctx the parse tree
	 */
	void enterOpBin2(LuaParser.OpBin2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opBin2}.
	 * @param ctx the parse tree
	 */
	void exitOpBin2(LuaParser.OpBin2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opBin3}.
	 * @param ctx the parse tree
	 */
	void enterOpBin3(LuaParser.OpBin3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opBin3}.
	 * @param ctx the parse tree
	 */
	void exitOpBin3(LuaParser.OpBin3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opBin4}.
	 * @param ctx the parse tree
	 */
	void enterOpBin4(LuaParser.OpBin4Context ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opBin4}.
	 * @param ctx the parse tree
	 */
	void exitOpBin4(LuaParser.OpBin4Context ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcaoComposta}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoComposta(LuaParser.FuncaoCompostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcaoComposta}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoComposta(LuaParser.FuncaoCompostaContext ctx);
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
	 * Enter a parse tree produced by {@link LuaParser#funcaoAux}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoAux(LuaParser.FuncaoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcaoAux}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoAux(LuaParser.FuncaoAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(LuaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(LuaParser.ArgumentosContext ctx);
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
}