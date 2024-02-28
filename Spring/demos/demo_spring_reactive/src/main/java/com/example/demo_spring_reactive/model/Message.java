package com.example.demo_spring_reactive.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
@Table("message")
public class Message {

    @Id
    private Long id;

    private String sender;
    private String content;

    @Column("message_date_time")
    private LocalDateTime messageDateTime;
}
