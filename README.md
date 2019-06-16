# one-way-ssl-demo


1- Generating a Self-Signed Certificate

  a> PKCS12: Public Key Cryptographic Standards is a password protected format that can contain multiple certificates and keys;      it’s an industry-wide used format
  b> JKS: Java KeyStore is similar to PKCS12; it’s a proprietary format and is limited to the Java environment

2- Generate a keystore

  We can use the following command to generate our PKCS12 keystore format:
  $ keytool -genkeypair -alias https-demo -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650
  
  We can use the following command to generate our JKS keystore format:
  $ keytool -genkeypair -alias https-demo -keyalg RSA -keysize 2048 -keystore keystore.jks -validity 3650

  Note: It is recommended to use the PKCS12 format which is an industry standard format. So in case we already have a JKS               keystore, we can convert it to PKCS12 format using the following command
        $ keytool -importkeystore -srckeystore keystore.jks -destkeystore keystore.p12 -deststoretype pkcs12
        
3- Congfigure SSL Properties
   
   server.port=8085

  server.ssl.key-store-type=PKCS12
  server.ssl.key-store=/home/vineet/Projects/certificates/keystore.p12
  server.ssl.key-store-password=password
  server.ssl.key-alias=https-demo
  
  Exception: 
  #server.ssl.key-store=classpath:resources/keystore/keystore.p12 // This will throw : class path resource        [keystore/keystore.p12] cannot be resolved to URL because it does not exist
  
  
  
   

 
