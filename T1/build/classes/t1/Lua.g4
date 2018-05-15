/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="<<726568_e_726552_e_726580>>";
}


/*ANALISADOR LEXICO*/ 

/*Palavras reservadas (todas)*/

AND: 'and';
BREAK: 'break';
DO: 'do';
ELSE: 'else';
ELSEIF: 'elseif';
END: 'end';
FALSE: 'false';
FOR: 'for';
FUNC: 'function';
IF: 'if';
IN: 'in';
LOCAL: 'local';
NIL: 'nil';
NOT: 'not';
OR: 'or';
REPEAT: 'repeat';
RETURN: 'return';
THEN: 'then';
TRUE: 'true';
UNTIL: 'until';
WHILE: 'while';

/*Símbolos reservados (todos)*/

SUM : '+';
SUB : '-';
MULT : '*';
DIV : '/';
PER : '%';
POW : '^';
LEN : '#';
EQUAL: '==';
DIF: '~=';
MINEQ: '<=';
MAXEQ: '>=';
MIN: '<';
MAX: '>';
ATR: '=';
PARL: '(';
PARR: ')';
COML: '{';
COMR: '}';
COLE: '[';
COLR: ']';
SEMC: ';';
COL: ':';
COMMA: ',';
DOT: '.';
DOTT: '..';
DOTTT: '...';

fragment Letra : ('a'..'z'|'A'..'Z');
fragment Digito : ('0'..'9');

/* Nomes */

NAME : (Letra|'_')(Letra|Digito|'_')* ;

/*Cadeias de caracteres (apenas as versões curtas, sem sequência de escape, 
 * quebras de linha não permitidas)*/

Cadeia : ('"'(~'"')*'"') | ([\\'](~[\\'])*[\\']);

/* Ignorar comentarios, espaços em branco e fim de linha. */

COM : '--'(~[\n]|[\r])+ -> skip; //Comentario
WS : (' ' | [\t]) -> skip; // Espaço em branco
EOL : ([\n] | [\r]) -> skip; // Fim de linha

/* Constantes numéricas apenas decimais, sem sinal, com dígitos
 * antes e depois do ponto decimal opcionais) */
    
DECIMAL : (Digito)+('.'(Digito)+)? ;


/* ANALISADOR SINTATICO */
