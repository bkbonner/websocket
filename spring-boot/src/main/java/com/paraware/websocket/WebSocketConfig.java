package com.paraware.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // setAllowedOrigins is required when connecting from a web client that is not
        // in this app server.
        // the client gets a 403 error otherwise.
        registry.addHandler(myHandler(), "/echo").setAllowedOrigins("*");
    }

    @Bean
    public WebSocketHandler myHandler() {
        return new MyHandler();
    }

}
