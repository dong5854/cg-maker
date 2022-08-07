package com.html.cgmaker.web.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    // 메시지 타입 : 입장, 대화
    public enum MessageType {
        JOIN, TALK
    }
    private MessageType type; // 메시지 타입
    private String roomId; // 대화방 아이디(번호)
    private String sender; // 메시지 발신자
    private String message; // 메시지
}
