grammar Ru;

programa
 : bloque EOF
 ;

bloque
 : sentencia*
 ;

sentencia
 : asignacion 
 | sentencia_if
 | sentencia_while
 | log
 | imprimir
 | OTRO {System.err.println("caracter desconocido: " + $OTRO.text);}
 ;

asignacion
 : ID ASIGNA expr PTOCOMA
 ;

sentencia_if
 : IF bloque_condicional (ELSE IF bloque_condicional)* (ELSE bloque_de_sentencia)?
 ;

bloque_condicional
 : APAR expr CPAR bloque_de_sentencia
 ;

bloque_de_sentencia
 : ALLAVE bloque CLLAVE
 | sentencia
 ;

sentencia_while
 : WHILE expr bloque_de_sentencia
 ;

log
 : LOG expr PTOCOMA
 ;
 
imprimir
: IMPRIMIR expr PTOCOMA
;


expr
 : expr POW<assoc=right> expr                      #powExpr
 | MENOS expr                                      #MenosUnarioExpr
 | NOT expr                                        #notExpr
 | expr op=(MULT | DIV | MOD) expr                 #multiplicacionExpr
 | expr op=(MAS | MENOS) expr                      #aditivaExpr
 | expr op=(MAYIG | MENIG | MENORQ | MAYORQ) expr  #relacionalExpr
 | expr op=(IGUAL | DIFQ) expr                     #igualdadExpr
 | expr AND expr                                   #andExpr
 | expr OR expr                                    #orExpr
 | atomo                                            #atomExpr
 ;

atomo
 : APAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

OR : '||';
AND : '&&';
IGUAL : '==';
DIFQ : '!=';
MAYORQ : '>';
MENORQ : '<';
MENIG : '<=';
MAYIG : '>=';
MAS : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

PTOCOMA : ';';
ASIGNA : '=';
APAR : '(';
CPAR : ')';
ALLAVE : '{';
CLLAVE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
LOG : 'log';

IMPRIMIR : 'imprime';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]* 
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
COMENTARIO
 : '#' ~[\r\n]* -> skip
 ;
ESPACIO
 : [ \t\r\n] -> skip
 ;
OTRO
 : . 
 ;
