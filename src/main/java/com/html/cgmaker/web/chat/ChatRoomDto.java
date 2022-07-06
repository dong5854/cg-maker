package com.html.cgmaker.web.chat;

import com.html.cgmaker.domain.chat.ChatService;
import lombok.Builder;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;

public class ChatRoomDto {
    private String roomId;
    private String name;
    private Set<WebSocketSession> sessions = new HashSet<>();

    @Builder
    public ChatRoomDto(String roomId, String name){
        this.roomId = roomId;
        this.name =name;
    }

    public void handleActions(WebSocketSession session, ChatMesssageDto chatMesssageDto, ChatService chatService){
        if (chatMesssageDto.getType().equals(ChatMesssageDto.MessageType.ENTER)){
            sessions.add(session);
            chatMesssageDto.setMessage(chatMesssageDto.getSender() + "님이 입장하셨습니다.");
        }
        sendMessage(chatMesssageDto, chatService);
    }

    public <T> void sendMessage(T message, ChatService chatService){
        sessions.parallelStream().forEach(session -> chatService.sendMessage(session, message));
    }
}
