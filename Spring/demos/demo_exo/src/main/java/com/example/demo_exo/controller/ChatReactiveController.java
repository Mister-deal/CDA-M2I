package com.example.demo_exo.controller;

import com.example.demo_exo.dto.MessageDTO;
import com.example.demo_exo.entity.Message;
import com.example.demo_exo.service.ChatService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.awt.*;

@RestController
@RequestMapping("messages")
public class ChatReactiveController {

    private final ChatService chatService;

    public ChatReactiveController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Message> get(){
        return chatService.getMessage();
    }

    @PostMapping
    public void post(@RequestBody MessageDTO messageDTO){
        chatService.sendMessage(messageDTO.getAuthor(), messageDTO.getContent());
    }
}
