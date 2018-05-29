// Generated from /home/mariana/Desktop/CC1/T1/T1/src/t1/Lua.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(LuaParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(LuaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#rotulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotulo(LuaParser.RotuloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nomeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeId(LuaParser.NomeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listaVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVariaveis(LuaParser.ListaVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(LuaParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nomeAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeAux(LuaParser.NomeAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nomeFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeFuncao(LuaParser.NomeFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LuaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varSufixo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSufixo(LuaParser.VarSufixoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listaIds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIds(LuaParser.ListaIdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listaExpressoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpressoes(LuaParser.ListaExpressoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpUnario(LuaParser.OpUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LuaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#expressao1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao1(LuaParser.Expressao1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#expressao2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao2(LuaParser.Expressao2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#expressao3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao3(LuaParser.Expressao3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#expressao4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao4(LuaParser.Expressao4Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opBin1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin1(LuaParser.OpBin1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opBin2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin2(LuaParser.OpBin2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opBin3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin3(LuaParser.OpBin3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opBin4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin4(LuaParser.OpBin4Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcaoComposta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoComposta(LuaParser.FuncaoCompostaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#prefixoExpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixoExpressao(LuaParser.PrefixoExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(LuaParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcaoAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoAux(LuaParser.FuncaoAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(LuaParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#definicaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicaoFuncao(LuaParser.DefinicaoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#corpoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpoFuncao(LuaParser.CorpoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(LuaParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#construtorTabela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrutorTabela(LuaParser.ConstrutorTabelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listaCampos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaCampos(LuaParser.ListaCamposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(LuaParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#separaCampos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparaCampos(LuaParser.SeparaCamposContext ctx);
}