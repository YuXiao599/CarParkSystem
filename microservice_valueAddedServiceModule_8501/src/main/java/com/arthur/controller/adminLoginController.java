package com.arthur.controller;

import com.arthur.domain.Administrators;
import com.arthur.domain.Operation;
import com.arthur.service.AdminLoginService;
import com.arthur.service.OperationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
public class adminLoginController {
    /**
     * 登录接口
     * @return
     */
    @Autowired
    private AdminLoginService adminLoginService;

    @Autowired
    private OperationService operationService;

    @RequestMapping("/LoginController")
    public Administrators login(@RequestBody Map<String,String> map , HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String administratorname = map.get("administratorname");
        String administratorpwd = map.get("administratorpwd");
        Administrators administrators=adminLoginService.findUserByNamePwd(administratorname,administratorpwd);
        System.out.println(administratorname+administratorpwd);
        insert_to_operation("登陆成功");
        return administrators;
    }

    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);
        this.operationService.insert(operation);
    }
}
