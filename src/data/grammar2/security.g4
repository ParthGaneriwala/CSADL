grammar security;

csadl: BEGIN statement+ END ;

statement: (assumption1  | assumption2 | assumption3 | assumption4 | assumption5 | guarantee1 | guarantee2  |guarantee3 |guarantee4) ENDSYMBOL ;

//assume iotDeviceA isConnectedTo serverA;
assumption1: ASSUMPTION ASSET_IOT_DEVICE ASSOCIATION_CONNECT ASSET_SERVER ;

//assume computerA isConnectedTo serverA;
//assume computerA isConnectedTo computerB;
//assume computerA isConnectedTo iotDeviceA;
assumption2: ASSUMPTION ASSET_COMPUTER ASSOCIATION_CONNECT (ASSET_SERVER | ASSET_COMPUTER | ASSET_IOT_DEVICE) ;


//assume iotDeviceA has internetFeature;
//assume iotDeviceA has securityFeature;
//assume iotDeviceA has smartFeature;
//assume iotDeviceB has hardwareComponentCamera;
//assume iotDeviceC has hardwareComponentMicroprocessor;
assumption3: ASSUMPTION ASSET_IOT_DEVICE ASSOCIATION_HAS (ASSET_SOFTWARE_FEATURE | ASSET_HARDWARE_COMPONENT) ;

//assume computerA knowKeyOf computerB;
//assume iotDeviceA knowKeyOf serverA;
//assume serverA hasKeyOf iotDeviceA;
assumption4: ASSUMPTION (ASSET_COMPUTER | ASSET_IOT_DEVICE |ASSET_SERVER) ASSOCIATION_KEY (ASSET_COMPUTER | ASSET_IOT_DEVICE |ASSET_SERVER);

//assume message hasSensitive content
//assume data hasNormal content
assumption5: ASSUMPTION THING SENSITIVITY CONTENT;

//assume computerA hasCreated messageA;
//assume iotDeviceA hasCreated messageB;
assumption6: ASSUMPTION (ASSET_COMPUTER | ASSET_IOT_DEVICE) ASSOCIATION_CREATE THING;

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
guarantee2: GUARANTEE ASSET_COMPUTER ACTION_COMMUNICATE THING (ASSET_SERVER | ASSET_COMPUTER | ASSET_IOT_DEVICE);

//guarantee iotDeviceA performs accessPointCreation;
//guarantee iotDevice performs thermalImageRecognition;
guarantee3: GUARANTEE ASSET_IOT_DEVICE ACTION_HAS SOFTWARE_FEATURE ; // come up with a guarantee for hardware components

guarantee4: GUARANTEE (ASSET_COMPUTER | ASSET_IOT_DEVICE | ASSET_SERVER) ACTION_COMMUNICATE (ASSET_COMPUTER | ASSET_IOT_DEVICE |THING);
// assumption1:  ASSUMPTION ASSET ASSOCIATION (ASSET|MESSAGE) ;
// assumption2: ASSUMPTION MESSAGE SENSITIVITY CONTENT;
// guarantee:   GUARANTEE ASSET  ACTION  (ASSET|MESSAGE) ;

ASSET_COMPUTER: 'computer' IDENTIFIER ;
ASSET_IOT_DEVICE: 'iotDevice' IDENTIFIER ;
ASSET_SERVER: 'server' IDENTIFIER ;

ASSET_SOFTWARE_FEATURE : 'internetFeature' | 'securityFeature' | 'smartFeature' ;
ASSET_HARDWARE_COMPONENT: 'hardwareComponent' IDENTIFIER ;

SOFTWARE_FEATURE: IDENTIFIER ; // the identifier can hold a value such as accessPointCreation etc.
THING: 'data' | 'message';

IDENTIFIER: [A-Z]+[A-Z_0-9]+ ;
BEGIN: '{' ;
END: '}';
ENDSYMBOL:';';
GUARANTEE: 'guarantee';
ASSUMPTION: 'assume';

// ACTION_TYPES (Specific to asset: Eg; Message Action, Data Action)

ASSOCIATION_CONNECT: 'isConnectedTo' ;
ACTION_COMMUNICATE:   'encrypt'   | 'decrypt' | 'read'  |
                      'send'      | 'receive' | 'forward' ;

ASSOCIATION_HAS: 'has' ; // if it has a particular feature, then it can perform that action
ACTION_HAS: 'performs' ;

ACTION_COMPUTER: ;
ASSOCIATION_COMPUTER: 'is';

ACTION_HARDWARE_COMPONENT: ;
ACTION_SERVER: ;

//ACTION:       'encrypt'   | 'decrypt' | 'read'  |
//              'send'      | 'receive' | 'forward'  ;

ASSOCIATION_KEY:  'knowKeyOf'  | 'hasKeyOf';
ASSOCIATION_CREATE: 'created';
SENSITIVITY:     'hasSensitive'|'hasNormal';
//MESSAGE: 'msg' CHAR;
CONTENT: 'content';
WS: [ \t\u000C\r\n]+ -> skip;
