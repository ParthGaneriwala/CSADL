grammar Security;

@header
{
    package edu.fit.assist.csadl.lib.antlr.csadlverifiernew;
}

//csadl: BEGIN statement+ END ;
csadl : statements+ ;

statements: assumption+ | guarantee+;

assumption :(connection| feature | context | generation| server_type) ENDSYMBOL ;

guarantee :(guarantee1 | guarantee2  |guarantee3 |guarantee4|guarantee5|guarantee6) ENDSYMBOL ;

connection:assumption1 | assumption2;
feature:assumption3 | assumption4;
context:assumption5;
generation:assumption6;
server_type:assumption7;
//assume iotDeviceA isConnectedTo serverA;
assumption1: ASSUMPTION ASSET_IOT_DEVICE ASSOCIATION_CONNECT ASSET_SERVER ;

//assume computerA isConnectedTo serverA;
//assume computerA isConnectedTo computerB;
//assume computerA isConnectedTo iotDeviceA;
assumption2: ASSUMPTION (ASSET_SERVER | ASSET_COMPUTER) (ASSOCIATION_CONNECT|SECURE_ACTION_CONNECT) (ASSET_SERVER | ASSET_COMPUTER | ASSET_IOT_DEVICE) ;


//assume iotDeviceA has internetFeature;
//assume iotDeviceA has securityFeature;
//assume iotDeviceA has smartFeature;
//assume iotDeviceB has hardwareComponentCamera;
//assume iotDeviceC has hardwareComponentMicroprocessor;
assumption3: ASSUMPTION ASSET_IOT_DEVICE ASSOCIATION_HAS (ASSET_SOFTWARE_FEATURE | ASSET_HARDWARE_COMPONENT) ;

//assume computerA knowKeyOf computerB;
//assume iotDeviceA knowKeyOf serverA;
//assume serverA hasKeyOf iotDeviceA;
assumption4: ASSUMPTION (ASSET_COMPUTER | ASSET_IOT_DEVICE |ASSET_SERVER) ENCRYPTION (ASSET_COMPUTER | ASSET_IOT_DEVICE |ASSET_SERVER);

//assume message hasSensitive content
//assume data hasNormal content
assumption5: ASSUMPTION THING SENSITIVITY CONTENT;

//assume computerA hasCreated messageA;
//assume iotDeviceA hasCreated messageB;
assumption6: ASSUMPTION (ASSET_COMPUTER | ASSET_IOT_DEVICE) ASSOCIATION_CREATE THING;

assumption7: ASSUMPTION ASSET_SERVER SERVER_TYPE;

//guarantee iotDeviceA send data serverA;
//guarantee iotDeviceA send message serverA;
//guarantee iotDeviceA receive data serverA;
//guarantee iotDeviceA receive message serverA;
guarantee1: GUARANTEE ASSET_IOT_DEVICE ACTION_COMMUNICATE THING ASSET_SERVER ;

//guarantee computerA send data serverA;
//guarantee computerA send message serverA;
//guarantee computerA receive data serverA;
//guarantee computerA receive message serverA;

//guarantee computerA send data computerB;
//guarantee computerA send message computerB;
//guarantee computerB receive data computerA;
//guarantee computerB receive message computerA;

//guarantee computerA send data iotDeviceA;
//guarantee computerA send message iotDeviceA;
//guarantee computerB receive data iotDeviceA;
//guarantee computerB receive message iotDeviceA;

//guarantee iotDeviceA performs accessPointCreation;
//guarantee iotDevice performs thermalImageRecognition;
guarantee2: GUARANTEE ASSET_IOT_DEVICE ACTION_HAS SOFTWARE_FEATURE ; // come up with a guarantee for hardware components
guarantee3: GUARANTEE (ASSET_COMPUTER | ASSET_IOT_DEVICE | ASSET_SERVER) SECURE_ACTION_CONNECT (ASSET_COMPUTER | ASSET_IOT_DEVICE | ASSET_SERVER);

guarantee4: GUARANTEE (ASSET_COMPUTER | ASSET_IOT_DEVICE | ASSET_SERVER) (ACTION_COMMUNICATE|SECURE_ACTION_COMMUNICATE) THING (ASSET_SERVER|ASSET_COMPUTER | ASSET_IOT_DEVICE |);
// assumption1:  ASSUMPTION ASSET ASSOCIATION (ASSET|MESSAGE) ;
// assumption2: ASSUMPTION MESSAGE SENSITIVITY CONTENT;
// guarantee:   GUARANTEE ASSET  ACTION  (ASSET|MESSAGE) ;

guarantee5: GUARANTEE ASSET_SERVER ACTION_COMMUNICATE THING;

guarantee6: GUARANTEE ASSET_SERVER SECURITY;

ASSET_COMPUTER: 'computer' IDENTIFIER ;
ASSET_IOT_DEVICE: 'iotDevice' IDENTIFIER ;
ASSET_SERVER: 'server' IDENTIFIER ;

ASSET_SOFTWARE_FEATURE : 'internetFeature' | 'securityFeature' | 'smartFeature' ;
ASSET_HARDWARE_COMPONENT: 'hardwareComponent' IDENTIFIER ;

SOFTWARE_FEATURE: IDENTIFIER ; // the identifier can hold a value such as accessPointCreation etc.
THING: ('data' | 'message') IDENTIFIER;

IDENTIFIER: [A-Z][A-Z0-9]* ;
//BEGIN: '{' ;
//END: '}';
ENDSYMBOL:';';
GUARANTEE: 'guarantee';
ASSUMPTION: 'assume';

// ACTION_TYPES (Specific to asset: Eg; Message Action, Data Action)

ASSOCIATION_CONNECT: 'isConnectedTo' ;
ACTION_COMMUNICATE:   'encrypt'   | 'decrypt' | 'read'  |
                      'send'      | 'receive' | 'forward' ;

SECURE_ACTION_CONNECT: 'isSecurelyConnectedTo';
SECURE_ACTION_COMMUNICATE : 'securelySend' | 'securelyReceive' | 'securelyForward';
ASSOCIATION_HAS: 'has' ; // if it has a particular feature, then it can perform that action
ACTION_HAS: 'performs' ;

//ACTION_COMPUTER: ;
//ASSOCIATION_COMPUTER: 'is';
//ASSOCIATION_SERVER: 'is';
SERVER_TYPE: 'isFirstParty' | 'isThirdParty' | 'isDemExternal' | 'isDemInternal' ;

//ACTION_HARDWARE_COMPONENT: ;
SECURITY: 'isSecure';
ENCRYPTION: 'hasFeatureEventEncryption';

//ACTION:       'encrypt'   | 'decrypt' | 'read'  |
//              'send'      | 'receive' | 'forward'  ;

ASSOCIATION_KEY:  'knowKeyOf'  | 'hasKeyOf';
ASSOCIATION_CREATE: 'created';
SENSITIVITY:     'hasSensitive'|'hasNormal';
//MESSAGE: 'msg' CHAR;
CONTENT: 'content';
WS: [ \t\u000C\r\n]+ -> skip;
