package com.example.tb_blog.service;

import com.example.tb_blog.dto.CommentDTO;
import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.mapper.CommentMapper;
import com.example.tb_blog.model.Comment;
import com.example.tb_blog.model.Post;
import com.example.tb_blog.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService {

    private final CommentMapper commentMapper;
    private final CommentRepository commentRepository;


    public CommentService(CommentMapper commentMapper, CommentRepository commentRepository) {
        this.commentMapper = commentMapper;
        this.commentRepository = commentRepository;
    }

    public List<CommentDTO> listComments(){
        return commentRepository.findAll().stream().map(commentMapper::commentToCommentDto).toList();
    }

    public CommentDTO addComment(CommentDTO dto){
        Comment comment = commentMapper.commentDtoToComment(dto);
        Comment savedComment = commentRepository.save(comment);
        CommentDTO savedDto = commentMapper.commentToCommentDto(savedComment);
        return savedDto;
    }
}
