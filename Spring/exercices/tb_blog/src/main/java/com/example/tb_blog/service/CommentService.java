package com.example.tb_blog.service;

import com.example.tb_blog.dto.CommentDTO;
import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.mapper.CommentMapper;
import com.example.tb_blog.model.Comment;
import com.example.tb_blog.model.Post;
import com.example.tb_blog.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CommentService{

    private final CommentMapper commentMapper;
    private final CommentRepository commentRepository;


    public CommentService(CommentMapper commentMapper, CommentRepository commentRepository) {
        this.commentMapper = commentMapper;
        this.commentRepository = commentRepository;
    }

    public List<CommentDTO> listComments(){
        return commentRepository.findAll().stream().map(commentMapper::commentToCommentDto).toList();
    }

    public CommentDTO getComment(UUID id){
        Optional<Comment> postDTOOptional = commentRepository.findById(id);
        return postDTOOptional.map(commentMapper::commentToCommentDto).orElse(null);
    }

    public CommentDTO addComment(CommentDTO dto){
        Comment comment = commentMapper.commentDtoToComment(dto);
        Comment savedComment = commentRepository.save(comment);
        CommentDTO savedDto = commentMapper.commentToCommentDto(savedComment);
        return savedDto;
    }

    public CommentDTO deleteComment(UUID id){
        CommentDTO commentExist = getComment(id);
        if(commentExist != null){
            // Post exists, proceed with deletion
            Optional<Comment> commentOptional = commentRepository.findById(id);
            if (commentOptional.isPresent()) {
                Comment commentToDelete = commentOptional.get();
                commentRepository.delete(commentToDelete);
                return commentExist; // Return the deleted post DTO or null, depending on your needs
            } else {
                // Post not found, handle error or return appropriate response
                throw new RuntimeException("comment not found");
            }
        } else {
            // Post does not exist, handle error or return appropriate response
        }
        return null; // Or throw an exception indicating that the post was not found
    }

    public CommentDTO updatePost(CommentDTO dto, UUID id) throws Exception {
        CommentDTO commentExists = getComment(id);
        if(commentExists != null){
            Comment comment = commentMapper.commentDtoToComment(dto);
            Comment savedComment = commentRepository.save(comment);
            CommentDTO savedDto = commentMapper.commentToCommentDto(savedComment);
            return savedDto;
        }
        return null;
    }

}
