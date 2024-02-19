package com.example.tb_blog.controller;


import com.example.tb_blog.model.Comment;
import com.example.tb_blog.model.Post;
import com.example.tb_blog.service.BlogServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
@AllArgsConstructor
public class BlogController {
    private final BlogServiceImpl service;

    @GetMapping
    public String home(Model model){
        model.addAttribute("posts",service.getAllPost());
        return "home";
    }

    @GetMapping("/post/{id}")
    public String postDetail(@PathVariable UUID id,Model model){
        Post post=service.getPost(id);
        if(post==null)
            return "redirect:/";
        model.addAttribute("post",post);
        return "post/detail";
    }

    @GetMapping("/post/add")
    public String postAdd(Model model){
        model.addAttribute("post",new Post());
        return "post/form";
    }

    @PostMapping("/post/add")
    public String postPost(@Valid @ModelAttribute("post") Post post, BindingResult result){
        if(!result.hasErrors()){
            service.addPost(post);
            return "redirect:/";
        }
        return "post/form";
    }

    @GetMapping("/post/edit/{id}")
    public String postEdit(@PathVariable UUID id,Model model){
        Post post=service.getPost(id);
        if(post==null)
            return "redirect:/";
        model.addAttribute("post",post);
        return "post/form";
    }

    @PostMapping("/post/edit/{id}")
    public String postEditPost(@Valid @ModelAttribute("post") Post post,BindingResult result){
        if(!result.hasErrors()){
            service.editPost(post.getId(),post);
            return "redirect:/";
        }
        return "post/form";
    }

    @GetMapping("post/{id}/comment")
    public String addComment(@PathVariable UUID id,Model model){
        if(service.getPost(id)==null)
            return "redirect:/";
        Comment comment=new Comment();
        comment.setPost(service.getPost(id));
        model.addAttribute(comment);
        return "comment/form";
    }
}
