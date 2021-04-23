package com.arthur.service.impl;

import com.arthur.dao.AdminLoginDao;
import com.arthur.domain.Administrators;
import com.arthur.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
      @Autowired
      private AdminLoginDao adminLoginDao;
      @Override
      public Administrators findUserByNamePwd(String administratorname, String administratorpwd) {
        Administrators administrators=new Administrators();
        Map<String,Object> adminInfoMap=new HashMap<>();
        adminInfoMap.put("administratorname",administratorname);
        adminInfoMap.put("administratorpwd",administratorpwd);
        try {
            administrators=adminLoginDao.getByNamePwd(adminInfoMap);
        }catch (Exception e){
            e.printStackTrace();
        }
        return administrators;
    }
}
