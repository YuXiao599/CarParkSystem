package com.arthur.service.impl;

import com.arthur.dao.FeedbackDao;
import com.arthur.domain.Feedback;
import com.arthur.service.FeedbackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Resource
    private FeedbackDao feedbackDao;
    @Override
    public Feedback selectById(int ID) {
        return feedbackDao.selectById(ID);
    }
    @Override
    public List<Feedback> getAll() {
        return feedbackDao.listAll();
    }

    @Override
    public int totalPage(int pageSize) {
        int total= feedbackDao.totalList();
        int tp=0;
        if(total%pageSize==0){
            tp=total/pageSize;
        }else {
            tp = total/pageSize+1;
        }
        return tp;
    }

}
