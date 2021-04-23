package com.arthur.service;

import com.arthur.domain.Users;

import java.util.List;

public interface UsersService {
    int createUser(Users users);
    boolean deleteById(int userId);
    boolean update(Users users);
    Users selectById(int userId);
    List<Users> getAll();
}
