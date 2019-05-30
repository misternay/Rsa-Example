# Rsa-Example
Example project for Encrypt Decrypt RSA in JAVA Encrypt From JSEncrypt

JSEncrypt : https://github.com/travist/jsencrypt

## Generate pem

### note : use pubkey for encrypt and use private for decrypt 

> openssl genrsa -out rsa_2048_priv.pem 2048

> openssl rsa -pubout -in rsa_2048_priv.pem -out rsa_2048_pub.pem


> openssl pkcs8 -topk8 -inform PEM -in rsa_2048_priv.pem -out private_key.pem -nocrypt 

  note : use private_key.pem for JAVA
