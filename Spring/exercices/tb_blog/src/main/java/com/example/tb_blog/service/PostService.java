package com.example.tb_blog.service;

import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.mapper.PostMapper;
import com.example.tb_blog.model.Post;
import com.example.tb_blog.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostService(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    public List<PostDTO> listPosts(){
        return postRepository.findAll().stream().map(postMapper::postToPostDto).toList();
    }

    public PostDTO addPost(PostDTO dto){
        Post post = postMapper.postDtoToPost(dto);
        Post savedPost = postRepository.save(post);
        PostDTO savedDto = postMapper.postToPostDto(savedPost);
        return savedDto;
    }
}
