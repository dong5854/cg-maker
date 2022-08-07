package com.html.cgmaker.web.chat;

import com.html.cgmaker.domain.chat.ChatRoomRepository;
import com.html.cgmaker.web.chat.dto.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/chat")
public class ChatRoomController {

    private final ChatRoomRepository chatRoomRepository;

    // 모든 채팅방 목록 반환
    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoom> rooms(){
        return chatRoomRepository.findAllRoom();
    }

    //채팅방 생성
    @PostMapping("/room")
    @ResponseBody
    public ChatRoom createRoom(@RequestParam String name){
        return chatRoomRepository.createChatRoom(name);
    }

    //특정 채팅방 조회
    @GetMapping("room/{roodId}")
    @ResponseBody
    public ChatRoom roomInfo(@PathVariable String roodId){
        return chatRoomRepository.findRoomById(roodId);
    }
}
