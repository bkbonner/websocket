Ths project is a websocket (echo) server that can be used with the flutter client in this package.

To run this, install java 14 and then run gradlew (or install the java and springboot extensions) for vs-code.

This will basically echo a message back to the client.

Notes:

Initially when I set this up, I was testing with the flutter web client.   I didn't have origin set to '*' in the WebSocketConfig.  For the web client, this is a must if you're not going to serve it up from this web server.   For iOS and Android clients they can connect directly.