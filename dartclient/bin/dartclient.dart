import 'dart:io';

import 'package:web_socket_channel/io.dart';

void main(List<String> arguments) {
  final channel = IOWebSocketChannel.connect('ws://echo.websocket.org');
  channel.sink.add('sending');
  channel.stream.listen((message) {
    print(message + ' from echo server');
    channel.sink.close(WebSocketStatus.goingAway);
  });
}
