grammar security;

csadl: BEGIN statement+ END ;

statement: (assumption1  | assumption2 | guarantee ) ENDSYMBOL ;
assumption1:  ASSUMPTION ASSET ASSOCIATION (ASSET|MESSAGE) ;
assumption2: ASSUMPTION MESSAGE SENSITIVITY CONTENT;
guarantee:   GUARANTEE ASSET  ACTION  (ASSET|MESSAGE) ;

ASSET: 'computer' CHAR  ;
CHAR: 'A'..'Z' ;
BEGIN: '{' ;
END: '}';
ENDSYMBOL:';';
GUARANTEE: 'guarantee';
ASSUMPTION: 'assume';
ACTION:       'encryptMsgTo'   |'decryptMsgFrom'|'readMsgFrom'  |
              'sendMsgTo'      |'receiveMsgFrom'|   'forward'  ;

ASSOCIATION:  'hasConnectionWith'| 'knowKeyOf'  |
                  'hasKeyOf'     |'hasCreated';
SENSITIVITY:     'hasSensitive'|'hasNormal';
MESSAGE: 'msg' CHAR;
CONTENT: 'content';
WS: [ \t\u000C\r\n]+ -> skip;





