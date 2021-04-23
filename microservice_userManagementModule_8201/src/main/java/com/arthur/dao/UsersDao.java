package com.arthur.dao;

import com.arthur.domain.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersDao {
   Integer insert(Users user);
   int deleteById(int userId);
   int updateById(Users users);
   Users selectById(int userId);
   List<Users> listAll();
}
