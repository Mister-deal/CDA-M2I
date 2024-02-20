package com.example.tb_blog.repository;

import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
    List<PostDTO> listPosts();
    public PostDTO addPost(PostDTO dto);
}
