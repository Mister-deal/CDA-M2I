package com.example.tb_blog.repository;

import com.example.tb_blog.model.Comment;
import com.example.tb_blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
    boolean addComment(Post post, Comment comment);

    boolean removeComment(UUID id);

    Comment editComment(UUID id,Comment comment);

    Comment getComment(UUID id);
}
