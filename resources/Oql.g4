grammar Oql;

whereclause: 'where' criteria;

criteria: condition (LOGICAL condition)*;

condition :  in_condition | sub_condition | simple_condition | simple_get_condition  ;

in_condition: GET_FIELD ' IN SET (' value_array ')';

simple_condition : FIELD COMPARATOR VALUE | FIELD COMPARATOR LONG;

simple_get_condition : GET_FIELD COMPARATOR LONG | GET_FIELD COMPARATOR VALUE ;

sub_condition : '(' condition (LOGICAL condition)* ')';

//active_condition : ' get(' QUOTE 'active' QUOTE ') ';
//active_condition : ' get(\'active\') ';

value_array    : VALUE (',' VALUE)*;

COMPARATOR : EQUAL | GT | LT | GTEQ | LTEQ | NE;
LOGICAL    : AND | OR ;
GET_FIELD  : [ ]* GET '(' QUOTE [a-zA-Z0-9]+ QUOTE ')' ;  // field with the get()
FIELD    : [a-zA-Z0-9]+ ;              // field without the get()
VALUE    : QUOTE [a-zA-Z0-9.]+ QUOTE | [a-zA-Z0-9.]+ | LONG;
LONG     : DIGIT+ 'L';
ID       : [a-z]+ ;
GET      : 'get';
AND      : 'AND';
OR       : 'OR';
IN       : 'IN';
FLOAT    : DIGIT+ '.' DIGIT* | '.' DIGIT+ ;
QUOTE    : '\'';
EQUAL    : '=';
GT       : '>';
LT       : '<';
GTEQ     : '>=';
LTEQ     : '<=';
NE       : '<>';
BR_OPEN  : '(';
BR_CLOSE : ')';
WS       : [ \t\r\n]+ -> skip ;

fragment
DIGIT : [0-9];
