grammar Oql;

whereclause: ('WHERE' | 'where') criteria;

criteria: condition (LOGICAL condition)*;

condition :  active_condition | in_condition | in_get_condition | sub_condition | simple_condition | simple_get_condition  ;

in_condition: FIELD ' IN SET (' value_array ')';

in_get_condition: GET_FIELD ' IN SET (' value_array ')';

simple_condition : FIELD COMPARATOR VALUE ;

simple_get_condition : GET_FIELD COMPARATOR VALUE ;

sub_condition : '(' condition (LOGICAL condition)* ')';

active_condition : 'get(\'active\')';

value_array    : VALUE (',' VALUE)*;

COMPARATOR : EQUAL | GT | LT | GTEQ | LTEQ | NE;
LOGICAL    : AND | OR ;
GET_FIELD  : GET '(' QUOTE [a-zA-Z0-9]+ QUOTE ')' ;  // field with the get()
FIELD      : [a-zA-Z0-9]+ ;                          // field without the get()
VALUE      : QUOTE .*? QUOTE | NUMBER | LONG;
NUMBER     : '-'? ('.' DIGIT+ | DIGIT+ ('.' DIGIT*)? ) ;
LONG       : (DIGIT+)('L');
GET        : 'get';
AND        : 'AND';
OR         : 'OR';
IN         : 'IN';
QUOTE      : '\'';
EQUAL      : '=';
GT         : '>';
LT         : '<';
GTEQ       : '>=';
LTEQ       : '<=';
NE         : '<>';
WS         : [ \t\r\n]+ -> skip ;

fragment
DIGIT : [0-9];
