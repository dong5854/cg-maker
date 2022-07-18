package com.html.cgmaker.web.chat;

import com.html.cgmaker.domain.chat.ChatService;
import com.html.cgmaker.web.chat.dto.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ChatRoom createRoom(@RequestParam String name) {
        return chatService.createRoom(name);
    }

    @GetMapping
    public List<ChatRoom> findAllRoom(){
        return chatService.findAllRoom();
    }
}
