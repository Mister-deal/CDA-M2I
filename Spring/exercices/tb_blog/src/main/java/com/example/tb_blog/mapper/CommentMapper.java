package com.example.tb_blog.mapper;


import com.example.tb_blog.dto.CommentDTO;
import com.example.tb_blog.model.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    CommentDTO commentToCommentDto(Comment comment);

    Comment commentDtoToComment(CommentDTO dto);

}
