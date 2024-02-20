package com.example.tb_blog.controller;

import com.example.tb_blog.dto.CommentDTO;
import com.example.tb_blog.dto.PostDTO;
import com.example.tb_blog.service.CommentService;
import com.example.tb_blog.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/post/{id}")
    public PostDTO getPost(@PathVariable UUID id){
        return postService.getPost(id);
    }

    @PostMapping("/add")
    public PostDTO addPost(@RequestBody PostDTO dto){
        return postService.addPost(dto);
    }
    @DeleteMapping("/post/{id}")
    public PostDTO deletePost(@PathVariable UUID id){
        return postService.deletePost(id);
    }
    /*
    @PutMapping("/post/{id}")
    public PostDTO updatePost(@PathVariable UUID id, @RequestBody PostDTO dto){
        return postService.updatePost(dto, id);
    }

     */


    @GetMapping("/comment/{id}")
    public CommentDTO getComment(@PathVariable UUID id){
        return commentService.getComment(id);
    }

    @GetMapping("/comments/list")
    public List<CommentDTO> getAllComments(){
        return commentService.listComments();
    }

    @PostMapping("/comment/add")
    public CommentDTO addComment(@RequestBody CommentDTO dto){
        return commentService.addComment(dto);
    }

    @DeleteMapping("/comment/{id}")
    public CommentDTO deleteComment(@PathVariable UUID id){
        return commentService.deleteComment(id);
    }
    /*
    @PutMapping("/comment/{id}")
    public PostDTO updateComment(@PathVariable UUID id, @RequestBody CommentDTO dto){
        return commentService.updatePost(dto, id);
    }

     */
}
