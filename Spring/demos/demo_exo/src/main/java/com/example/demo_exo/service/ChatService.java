package com.example.demo_exo.service;

import com.example.demo_exo.entity.Message;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Service
public class ChatService {

    private final Sinks.Many<Message> sink;

    public ChatService() {
        this.sink = Sinks.many().multicast().onBackpressureBuffer();
    }

    public void sendMessage(String author, String content){
        sink.tryEmitNext(Message.builder().content(content).author(author).build());
    }

    public Flux<Message> getMessage(){
        return sink.asFlux();
    }
}
