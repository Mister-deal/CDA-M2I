package com.example.tb_blog.repository;

import com.example.tb_blog.dto.CommentDTO;
import com.example.tb_blog.model.Comment;
import com.example.tb_blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {

    List<CommentDTO> listComments();

    CommentDTO addComment(CommentDTO dto);
}
