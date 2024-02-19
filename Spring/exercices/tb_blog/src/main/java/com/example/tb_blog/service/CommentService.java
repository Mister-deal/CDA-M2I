package com.example.tb_blog.service;

import com.example.tb_blog.model.Comment;
import com.example.tb_blog.model.Post;

import java.util.HashMap;
import java.util.UUID;

public interface CommentService {


    boolean addComment(Post post,Comment comment);

    boolean removeComment(UUID id);

    Comment editComment(UUID id,Comment comment);

    Comment getComment(UUID id);
}
