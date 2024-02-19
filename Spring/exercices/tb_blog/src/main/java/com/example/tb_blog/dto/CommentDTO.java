package com.example.tb_blog.dto;

import com.example.tb_blog.model.Post;
import lombok.Data;

import java.util.UUID;
@Data
public class CommentDTO {

    private UUID id;
    private String mail;
    private String content;
    private Post post;

    public CommentDTO() {
    }

    public CommentDTO(UUID id, String mail, String content, Post post) {
        this.id = id;
        this.mail = mail;
        this.content = content;
        this.post = post;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


}
