package com.example.tb_blog.service;

import com.example.tb_blog.model.Post;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public interface PostService {
    HashMap<UUID, Post> postMap = new HashMap<>();

    boolean addPost(Post post);

    boolean removePost(UUID id);

    Post getPost(UUID id);

    List<Post> getAllPost();

    Post editPost(UUID id,Post post);
}
