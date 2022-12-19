package com.blog.services;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;

import java.util.List;

public interface PostService{
    //create
    PostDto createPost(PostDto postDto, Integer userId , Integer categoryId);

//    PostDto createPost(PostDto postDto);

    //update
    PostDto updatePost(PostDto postDto , Integer postId);
    //delete
    void deletePost(Integer postId);
    //get all posts
    List<PostDto> getAllPost(Integer pageNumber , Integer pageSize);
    //get single post
    PostDto getPostById(Integer postId);
    //get all post by category
    List<PostDto> getPostsByCategory(Integer categoryId);
    //get all post by user
    List<PostDto> getPostsByUser(Integer userId);
    //search posts
    List<PostDto> searchPosts(String keyword);
}
