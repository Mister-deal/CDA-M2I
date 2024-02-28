package com.example.demo_spring_reactive.service;

import com.example.demo_spring_reactive.model.Message;
import com.example.demo_spring_reactive.repository.MessageRepository;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.time.LocalDateTime;

@Service
public class MessageService {

    private final Sinks.Many<Message> sink;
    private final MessageRepository messageRepository;
    private final ConnectionFactory connectionFactory;

    public MessageService(MessageRepository messageRepository, ConnectionFactory connectionFactory) {
        this.messageRepository = messageRepository;
        this.connectionFactory = connectionFactory;
        createTable();
        sink = Sinks.many().multicast().onBackpressureBuffer();
    }

    public void sendMessage(String sender, String content) {
        Message message = Message.builder().content(content).sender(sender).messageDateTime(LocalDateTime.now()).build();
        messageRepository.save(message).subscribe((m) ->sink.tryEmitNext(m));
    }

    public Flux<Message> getFlux() {
        messageRepository.findAll().onBackpressureBuffer().subscribe((m)-> {
            //Une action pour vérifier qu'un message n'est pas dans le sink déjà
            System.out.println(m);
            sink.tryEmitNext(m);
        });
        return sink.asFlux();
    }

    private void createTable() {
        DatabaseClient databaseClient = DatabaseClient.create(connectionFactory);
        Mono<Void> monoCreateTable = databaseClient.sql("CREATE TABLE IF NOT EXISTS " +
                "message(" +
                "id int primary key auto_increment," +
                        "content TEXT," +
                        "sender varchar(100)," +
                        "message_date_time datetime" +
                ")")
                .then();
        monoCreateTable.subscribe();
    }
}
