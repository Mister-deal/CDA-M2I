package com.example.tb_blog.mapper;


import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.model.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {

    PostDTO postToPostDto(Post post);

    Post postDtoToPost(PostDTO dto);


}
