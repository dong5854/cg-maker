package com.html.cgmaker.web.chat.dto;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ChatRoom {
    private String roomId;
    private String name;

    // 채팅방 생성
    public static ChatRoom create(String name){
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }
}
