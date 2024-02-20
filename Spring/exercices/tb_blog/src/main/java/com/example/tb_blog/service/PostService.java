package com.example.tb_blog.service;

import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.mapper.PostMapper;
import com.example.tb_blog.model.Post;
import com.example.tb_blog.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public PostDTO getPost(UUID id){
        Optional<Post> postDTOOptional = postRepository.findById(id);
        return postDTOOptional.map(postMapper::postToPostDto).orElse(null);
    }

    public PostDTO addPost(PostDTO dto){
        Post post = postMapper.postDtoToPost(dto);
        Post savedPost = postRepository.save(post);
        PostDTO savedDto = postMapper.postToPostDto(savedPost);
        return savedDto;
    }

    public PostDTO deletePost(UUID id){
        PostDTO postExist = getPost(id);
        if(postExist != null){
            // Post exists, proceed with deletion
            Optional<Post> postOptional = postRepository.findById(id);
            if (postOptional.isPresent()) {
                Post postToDelete = postOptional.get();
                postRepository.delete(postToDelete);
                return postExist; // Return the deleted post DTO or null, depending on your needs
            } else {
                // Post not found, handle error or return appropriate response
                throw new RuntimeException("post not found");
            }
        } else {
            // Post does not exist, handle error or return appropriate response
        }
        return null; // Or throw an exception indicating that the post was not found
    }

    public PostDTO updatePost(PostDTO dto, UUID id) throws Exception {
        PostDTO postExists = getPost(id);
        if(postExists != null){
            Post post = postMapper.postDtoToPost(dto);
            Post savedPost = postRepository.save(post);
            PostDTO savedDto = postMapper.postToPostDto(savedPost);
            return savedDto;
        }
        return null;
    }
}
