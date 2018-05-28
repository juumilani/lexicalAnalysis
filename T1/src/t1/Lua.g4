/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="<<726568_e_726552_e_726580>>";
}


/*ANALISADOR LEXICO*/ 

/* TOKENS */

ATR: '=';
BREAK: 'break';
DO: 'do';
ELSE: 'else';
ELSEIF: 'elseif';
END: 'end';
FALSE: 'false';
FOR: 'for';
FUNCTION: 'function';
GOTO: 'goto';
IF: 'if';
IN: 'in';
LOCAL: 'local';
NIL: 'nil';
NOT: 'not';
REPEAT: 'repeat';
RETURN: 'return';
THEN: 'then';
TRUE: 'true';
UNTIL: 'until';
WHILE: 'while';

fragment Letra : ('a'..'z'|'A'..'Z');
fragment Digito : ('0'..'9');

/* Identificadores */

IDENTIFICADOR : (Letra|'_')(Letra|Digito|'_')*;

/* Cadeias de caracteres (apenas as versões curtas, sem sequência de escape, 
 * quebras de linha não permitidas) */

CADEIA : '"' (~('\\'|'\''|'"') )* '"'|'\'' (~('\\'|'\''|'"') )* '\'';

/* Ignorar comentarios, espaços em branco e fim de linha. */

COM : '--'(~[\n]|[\r])+ -> skip; //Comentario
WS : (' ' | [\t]) -> skip; // Espaço em branco
EOL : ([\n] | [\r]) -> skip; // Fim de linha

/* Constantes numéricas apenas decimais, sem sinal, com dígitos
 * antes e depois do ponto decimal opcionais) */
    
DECIMAL : (Digito)+('.'(Digito)+)?;


/* ANALISADOR SINTATICO */



/* O conjunto inicial é o programa, que possui trechos. Trechos são basicamente blocos,
 * e blocos, por sua vez, são listas de comandos executados sequencialmente.  */

listaExpressoes: expressao (',' expressao)*;

programa : trecho;

bloco: (comando)* (retorno)?;				// retorno é o último comando, que é aquele que retorna uma expressão

retorno: RETURN (listaExpressoes)? (';')?;

trecho : bloco; 




/* "var" identifica todas as possíveis variáveis presentes no programa. A regra "prefixoVar"
 * evita a recursividade da mesma */

var: IDENTIFICADOR | IDENTIFICADOR varSufix;

varSufix : '[' expressao ']' | '[' expressao ']' varSufix | '.' var;

prefixoVar: var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } | chamadaFuncao | '(' expressao ')';




/* Todos os comandos possíveis de serem executados através da linguagem */
comando: ';' |
		var ATR listaExpressoes |   /*listaVariaveis*/
		chamadaFuncao |
		rotulo |
		BREAK |
		GOTO IDENTIFICADOR |
		DO bloco END |
		WHILE expressao DO bloco END |
		REPEAT bloco UNTIL expressao |
		IF expressao THEN bloco (ELSEIF expressao THEN bloco)* (ELSE bloco)? END |
		FOR IDENTIFICADOR ATR expressao ',' expressao (',' expressao)* DO bloco END |
		FOR listaIdentificadores IN listaExpressoes DO bloco END |
		FUNCTION nomeFuncao corpoFuncao { TabelaDeSimbolos.adicionarSimbolo($nomeFuncao.text,Tipo.FUNCAO); } |
		LOCAL listaIdentificadores (ATR listaExpressoes)?;


/* O comando GOTO transfere o programa para um rótulo. Por razões sintáticas, rótulos em Lua são consideradas dessa maneira */
rotulo: '::' IDENTIFICADOR '::';



/* O nome de uma função é definida por identificadores (que são tokens) */

listaIdentificadores: IDENTIFICADOR (',' IDENTIFICADOR)*;

nomeFuncao: IDENTIFICADOR ('.' IDENTIFICADOR)* (':' IDENTIFICADOR)?; 



/* Expressões definidas pela linguagem. "prefixoExpressao" previne que haja recursividade na regra */


expressao: NIL | FALSE | TRUE | Digito | CADEIA | '...' | definicaoFuncao
		   prefixoExpressao | construtorTabela | expressao opbinario expressao  |
		   opunario expressao;

prefixoExpressao: var | chamadaFuncao | '(' expressao ')';


/* Maneira como as funções se comportam na linguagem, onde há o nome da função e seus argumentos.
 * Também é definido o corpo da função e seus parâmetros */

chamadaFuncao: var argumento | var ':' IDENTIFICADOR argumento;

argumento: '(' (listaExpressoes)? ')' | construtorTabela | CADEIA;

definicaoFuncao: FUNCTION corpoFuncao;

corpoFuncao: '(' (listaParametros)? ')' bloco END;

listaParametros: listaIdentificadores (',' '...')? | '...';




/* Construtores de tabelas são, como o nome diz, expressões que constroem tabelas. As tabelas
 * são compostas de campos. */

construtorTabela: '{' (listaCampos)? '}';

listaCampos: campo (separaCampos campo)* (separaCampos)?;

campo: '[' expressao ']' ATR expressao | IDENTIFICADOR ATR expressao | expressao;

separaCampos: ',' | ';';




/* Operações binárias e unárias */

opbinario: '+' | '-' | '*' | '/' | '^' | '%' | '..' | '<' |
		   '<=' | '>' | '>=' | '==' | '~=' | AND | OR;	 


opunario: '-' | NOT | '#';



		