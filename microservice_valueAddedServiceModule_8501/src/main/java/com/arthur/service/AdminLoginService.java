package com.arthur.service;

import com.arthur.domain.Administrators;

public interface AdminLoginService {
    Administrators findUserByNamePwd(String administratorname, String administratorpwd);
}
