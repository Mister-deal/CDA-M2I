package com.example.tb_blog.repository;

import com.example.tb_blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
    boolean addPost(Post post);

    boolean removePost(UUID id);

    Post getPost(UUID id);

    List<Post> getAllPost();

    Post editPost(UUID id,Post post);
}
