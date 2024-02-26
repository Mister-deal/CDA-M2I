package com.example.demo_exo.entity;

import jdk.jfr.DataAmount;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {

    private Long id;
    private String author;
    private String content;
}
