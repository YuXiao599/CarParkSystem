package com.arthur.service.impl;

import com.arthur.domain.UserOrder;
import com.arthur.service.UserOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserOrderServiceImpl implements UserOrderService {
    @Resource
    private com.arthur.dao.UserOrderDao UserOrderDao;

    @Override
    public List<UserOrder> selectById(int userid){
        return UserOrderDao.getById(userid);

    }
}
