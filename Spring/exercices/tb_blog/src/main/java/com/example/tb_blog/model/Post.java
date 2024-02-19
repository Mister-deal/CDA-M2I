package com.example.tb_blog.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;

    private String title;
    private String content;
    private String author;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments=new ArrayList<>();
}
