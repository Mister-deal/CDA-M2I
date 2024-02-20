package com.example.tb_blog.service;

import com.example.tb_blog.model.Comment;
import com.example.tb_blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BlogServiceImpl {


    /*
    public boolean addComment(Post post, Comment comment) {
        if(post==null || comment.getId()!=null)
            return false;
        comment.setId(UUID.randomUUID());
        post.getComments().add(comment);
        return true;
    }

    @Override
    public boolean removeComment(UUID id) {
        Comment comment=getComment(id);
        if(comment==null)
            return false;
        getPostByComment(comment).getComments().remove(comment);
        return true;
    }

    @Override
    public Comment editComment(UUID id, Comment comment) {
        Comment oldComment=getComment(id);
        if(oldComment==null)
            return null;
        oldComment.setContent(comment.getContent());
        oldComment.setMail(comment.getMail());
        return oldComment;
    }

    @Override
    public Comment getComment(UUID id) {
        for (Post post : postMap.values()) {
            List<Comment> comments = post.getComments();
            for (Comment comment : comments) {
                if (comment.getId().equals(id)) {
                    return comment;
                }
            }
        }
        return null;
    }

    @Override
    public boolean addPost(Post post) {
        if(post.getId()!=null)
            return false;
        post.setId(UUID.randomUUID());
        postMap.put(post.getId(),post);
        return true;
    }

    @Override
    public boolean removePost(UUID id) {
        if(getPost(id)==null)
            return false;
        return postMap.remove(id,getPost(id));
    }

    @Override
    public Post getPost(UUID id) {
        return postMap.get(id);
    }

    @Override
    public List<Post> getAllPost() {
        return postMap.values().stream().toList();
    }

    @Override
    public Post editPost(UUID id, Post post) {
        Post oldPost=getPost(id);
        if(oldPost==null)
            return null;
        oldPost.setContent(post.getContent());
        oldPost.setTitle(post.getTitle());
        oldPost.setAuthor(post.getAuthor());
        return oldPost;
    }

    public Post getPostByComment(Comment comment) {
        for (Post post : postMap.values()) {
            List<Comment> comments = post.getComments();
            for (Comment c : comments) {
                if (c.getId().equals(comment.getId())) {
                    return post;
                }
            }
        }
        return null;
    }

     */
}
