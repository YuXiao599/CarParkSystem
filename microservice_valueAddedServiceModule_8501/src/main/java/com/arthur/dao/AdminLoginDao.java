package com.arthur.dao;

import com.arthur.domain.Administrators;

import java.util.Map;

public interface AdminLoginDao {
    //查找数据库的用户名和密码


     Administrators getByNamePwd(Map<String, Object> adminInfoMap);
}
