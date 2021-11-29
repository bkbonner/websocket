Some projects (a spring-boot server) and a couple of clients dartclient and flutterclient to talk via websockets.

Open spring-boot in vs code (java14, spring extension and java extensions)   run the WebSocketApplication

Then run flutter client (in either Web, Android or iOS mode) and it should echo it back from the server.

There's also a dartclient that is configured right now to talk to the html5rocks echo server, but it can be changed as indicated in the README.md in that directory.


Todo:  I don't have the python server working yet.
