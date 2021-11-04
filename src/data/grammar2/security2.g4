grammar security;

csadl: BEGIN statement+ END ;

statement: (assumption1  | assumption2 | guarantee1 | guarantee2 ) ENDSYMBOL ;

//assume iotDeviceA isConnectedTo serverA;
assumption1: ASSUMPTION ASSET_IOT_DEVICE ASSOCIATION_CONNECT ASSET_SERVER ;

//assumption asset_computer association_connect asset_server;
//assumption asset_computer association_connect asset_computer;
//assumption asset_computer association_connect asset_iot_device;
assumption2: ASSUMPTION ASSET_COMPUTER ASSOCIATION_CONNECT (ASSET_SERVER | ASSET_COMPUTER | ASSET_IOT_DEVICE) ;


//assume iotDeviceA has internetFeature;
//assume iotDeviceA has securityFeature;
//assume iotDeviceA has smartFeature;
// assume iotDeviceB has hardwareComponentCamera;
//assume iotDeviceC has hardwareComponentMicroprocessor;
assumption3: ASSUMPTION ASSET_IOT_DEVICE ASSOCIATION_HAS (ASSET_SOFTWARE_FEATURE | ASSET_HARDWARE_COMPONENT) ;

guarantee1: GUARANTEE ASSET_IOT_DEVICE ACTION_COMMUNICATE THING ASSET_SERVER ;
guarantee2: GUARANTEE ASSET_COMPUTER ACTION_COMMUNICATE THING (ASSET_SERVER | ASSET_COMPUTER | ASSET_IOT_DEVICE);
guarantee3: GUARANTEE ASSET_IOT_DEVICE ACTION_HAS SOFTWARE_FEATURE ; // come up with a guarantee for hardware components

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

IDENTIFIER: [A..Z]+[A..Z_0..9]+ ;
BEGIN: '{' ;
END: '}';
ENDSYMBOL:';';
GUARANTEE: 'guarantee';
ASSUMPTION: 'assume';

// ACTION_TYPES (Specific to asset: Eg; Message Action, Data Action)

ASSOCIATION_CONNECT: 'isConnectedTo' ;
ACTION_COMMUNICATE: 'send' | 'receive' ;

ASSOCIATION_HAS: 'has' ; // if it has a particular feature, then it can perform that action
ACTION_HAS: 'performs' ;

ACTION_COMPUTER: ;
ASSOCIATION_COMPUTER: 'is';

ACTION_HARDWARE_COMPONENT: ;
ACTION_SERVER: ;

ACTION:       'encryptMsgTo'   |'decryptMsgFrom'|'readMsgFrom'  |
              'sendMsgTo'      |'receiveMsgFrom'|   'forward'  ;

ASSOCIATION:  'hasConnectionWith'| 'knowKeyOf'  |
                  'hasKeyOf'     |'hasCreated';
SENSITIVITY:     'hasSensitive'|'hasNormal';
MESSAGE: 'msg' CHAR;
CONTENT: 'content';
WS: [ \t\u000C\r\n]+ -> skip;
