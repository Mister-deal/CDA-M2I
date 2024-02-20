package com.example.tb_blog.controller;

import com.example.tb_blog.dto.CommentDTO;
import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.service.CommentService;
import com.example.tb_blog.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class BlogRestController {

    private final PostService postService;

    private final CommentService commentService;


    public BlogRestController(PostService postService, CommentService commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }

    @GetMapping("/list")
    public List<PostDTO> getAllPosts(){
        return postService.listPosts();
    }

    @PostMapping("/add")
    public PostDTO addPost(@RequestBody PostDTO dto){
        return postService.addPost(dto);
    }

    @GetMapping("/comments/list")
    public List<CommentDTO> getAllComments(){
        return commentService.listComments();
    }

    @PostMapping("/comment/add")
    public CommentDTO addComment(@RequestBody CommentDTO dto){
        return commentService.addComment(dto);
    }
}
