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

SEPARACAMPOS: ',' | ';';

fragment Letra : ('a'..'z'|'A'..'Z');
fragment Digito : ('0'..'9');

/* Identificadores */

ID: (Letra|'_')(Letra|Digito|'_')*;

/* Cadeias de caracteres (apenas as versões curtas, sem sequência de escape,
 * quebras de linha não permitidas) */

CADEIA : '"' (~('\\'|'\''|'"') )* '"'|'\'' (~('\\'|'\''|'"') )* '\'';

/* Ignorar comentarios, espaços em branco e fim de linha. */

COM : '--' ~([\n]|[\r])+ -> skip; 				// Comentario
WS : (' ' | [\t]) -> skip;						// Espaço em branco
EOL : ([\n] | [\r]) -> skip;    				// Fim de linha

/* Constantes numéricas apenas decimais, sem sinal, com dígitos
 * antes e depois do ponto decimal opcionais) */

DECIMAL : (Digito)+('.'(Digito)+)?;


/* ANALISADOR SINTATICO */



/* O conjunto inicial é o programa, que possui trechos. Trechos são basicamente blocos,
 * e blocos, por sua vez, são listas de comandos executados sequencialmente.  */

programa : trecho;

bloco: (comando (';')?)*  (retorno (';')?)?;				// retorno é o último comando, que é aquele que retorna uma expressão

retorno: RETURN (listaExpressoes)? | 'break' ;

trecho : bloco;



/* Todos os comandos possíveis de serem executados através da linguagem */

comando:	listaVariaveis ATR listaExpressoes |
		chamadaFuncao |
		rotulo |
		BREAK |
		GOTO ID |
		DO bloco END |
		WHILE expressao DO bloco END |
		REPEAT bloco UNTIL expressao |
		IF expressao THEN bloco (ELSEIF expressao THEN bloco)* (ELSE bloco)? END |
		FOR nomeId ATR expressao ',' expressao (',' expressao)? DO bloco END |
		FOR listaIds IN listaExpressoes DO bloco END |
		FUNCTION nomeFuncao corpoFuncao |
		LOCAL FUNCTION ID corpoFuncao | LOCAL listaIds (ATR nomeId)?;


/* O comando GOTO transfere o programa para um rótulo. Por razões sintáticas, rótulos em Lua são consideradas dessa maneira */
rotulo: '::' ID '::';

/* nomeId é usado para uma chamada simples de função, ou seja, onde não há mais "nada" para o analisador ler
 * É feita também a inserção do nome desta variável na tabela */
nomeId : ID {TabelaDeSimbolos.adicionarSimbolo($ID.text,Tipo.VARIAVEL); };


/* O nome de uma função é definida por identificadores (que são tokens) */

listaVariaveis : var (',' var)*;

/* Existem o nomeFuncao e o nome para que seja possível a inserção na tabela
 * nomeAux também existe para esse mesmo motivo, mas é aplicado apenas em listas de variaveis */
nome : ID ('.' ID)* (':' ID)?;
nomeAux : ID {TabelaDeSimbolos.adicionarSimbolo(($ID.text),Tipo.VARIAVEL); };
nomeFuncao : nome {TabelaDeSimbolos.adicionarSimbolo(($nome.text),Tipo.FUNCAO); };


/* var foi dividido em duas partes para eliminar a recursão */
var : prefixoExpressao varSufixo | nomeId;
varSufixo : '(' expressao ')'? | '.'  ID;

listaIds : nomeAux (',' nomeAux)*;
listaExpressoes : (expressao ',')* expressao;

/* Definição de operadores unários */
opUnario: '-' | NOT | '#';

/* Definição de operadores binários e suas precedências
 * A escala adotada foi: opBin1 > opBin2 > opBin3 > opBin4 */

expressao : expressao opBin4 expressao1 | expressao1;
expressao1 : expressao1 opBin3 expressao2 | expressao2;
expressao2 : expressao2 opBin2 expressao3 | expressao3;
expressao3 : expressao3 opBin1 expressao4 | expressao4;
expressao4 : NIL | NOT | FALSE | DECIMAL | CADEIA | '...' | definicaoFuncao | prefixoExpressao |
			 construtorTabela | opUnario expressao;

opBin1 : '<' | '<=' | '>' | '>=' | '==' | '~=' |  'and' | 'or';
opBin2 : '^' | '%' | '..';
opBin3 : '*' | '/' ;
opBin4 : '+' | '-' ;


/* Definição das chamadas compostas de função */
funcaoComposta : ID varSufixo;

/* O nome da função também pode fazer parte da expressão, por isso foram necessárias regras
 * auxiliares a fim de evitar a recursão */
prefixoExpressao : funcaoComposta  {TabelaDeSimbolos.adicionarSimbolo(($funcaoComposta.text),Tipo.FUNCAO); } |
				   ID | prefixoExpressao funcaoAux | '(' expressao ')';

chamadaFuncao : prefixoExpressao funcaoAux {TabelaDeSimbolos.adicionarSimbolo(($prefixoExpressao.text),Tipo.FUNCAO); } ;


/* Maneira como as funções se comportam na linguagem, onde há o nome da função e seus argumentos.
 * Também é definido o corpo da função e seus parâmetros */
funcaoAux : argumentos | ':' NOME argumentos;
argumentos : '(' (listaExpressoes)? ')' | construtorTabela | CADEIA;

definicaoFuncao : FUNCTION corpoFuncao;
corpoFuncao : '(' (listaParametros)? ')' bloco END;

listaParametros: listaIds (',' '...')? | '...';


/* Construtores de tabelas são, como o nome diz, expressões que constroem tabelas. As tabelas
 * são compostas de campos. */
construtorTabela: '{' (listaCampos)? '}';

listaCampos: campo (separaCampos campo)* (separaCampos)?;

campo: '[' expressao ']' ATR expressao | ID ATR expressao | expressao;

separaCampos: SEPARACAMPOS;