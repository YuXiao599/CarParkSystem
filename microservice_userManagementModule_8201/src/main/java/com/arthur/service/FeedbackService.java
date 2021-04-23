package com.arthur.service;

import com.arthur.domain.Feedback;

import java.util.List;

public interface FeedbackService {
    Feedback selectById(int id);
    List<Feedback> getAll();
    int totalPage(int PageSize);
}
