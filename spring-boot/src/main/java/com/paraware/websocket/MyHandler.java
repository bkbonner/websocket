package com.paraware.websocket;

import java.io.IOException;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        String payload = message.getPayload();
        System.out.println(session.getId());
        session.sendMessage(new TextMessage("Message from " + payload));
    }

}