package com.arthur.dao;

import com.arthur.domain.Feedback;

import java.util.List;

public interface FeedbackDao {
    Feedback selectById(int id);
    List<Feedback> listAll();
    int totalList();
}
