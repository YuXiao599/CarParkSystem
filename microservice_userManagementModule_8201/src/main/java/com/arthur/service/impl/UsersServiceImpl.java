package com.arthur.service.impl;

import com.arthur.dao.UsersDao;
import com.arthur.domain.Users;
import com.arthur.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;
    @Override
    public int createUser(Users users)
    {
        int result = 0;
        try {
            result=usersDao.insert(users);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public boolean deleteById(int userId) {
        if (usersDao.deleteById(userId)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Users users) {
        if (usersDao.updateById(users)>0){
            return true;
        }
        return false;
    }

    @Override
    public Users selectById(int userId) {
        return usersDao.selectById(userId);
    }

    @Override
    public List<Users> getAll() {
        return usersDao.listAll();
    }
}
