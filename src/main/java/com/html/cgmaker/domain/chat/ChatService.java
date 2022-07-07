package com.html.cgmaker.domain.chat;

import com.html.cgmaker.web.chat.ChatRoomDto;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;

public interface ChatService {
        void init();
        public List<ChatRoomDto> findAllRoom();
        public ChatRoomDto findRoomById(String roomId);
        public ChatRoomDto createRoom(String name);
        public <T> void sendMessage(WebSocketSession session, T message);
}
