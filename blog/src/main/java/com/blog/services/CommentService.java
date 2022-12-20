package com.blog.services;

import com.blog.payloads.CommentDto;
import com.blog.repositories.CommentRepo;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, Integer postId);
    void deleteComment(Integer commentId);
}
