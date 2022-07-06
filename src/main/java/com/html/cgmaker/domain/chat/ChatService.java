package com.html.cgmaker.domain.chat;

import org.springframework.web.socket.WebSocketSession;

public interface ChatService {
        <T> void sendMessage(WebSocketSession session, T message);
}
