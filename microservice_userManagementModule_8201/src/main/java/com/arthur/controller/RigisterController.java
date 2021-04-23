package com.arthur.controller;

import com.arthur.domain.Operation;
import com.arthur.domain.Users;
import com.arthur.service.OperationService;
import com.arthur.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class RigisterController {
    @Autowired
    UsersService usersService;
    @Autowired
    OperationService operationService;
    @RequestMapping("/RigisterController")
    public String register(@RequestBody Map<String,String> map, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = map.get("username");
        String userpwd = map.get("userpwd");
        String phone = map.get("phone");
        Date date=new Date();
        Users user=new Users();
        user.setUserid((int)date.getTime());
        user.setUsername(username);
        user.setUserpwd(userpwd);
        user.setPhone(phone);
        user.setUserstate("1");
        user.setScore("0");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：添加用户，操作时间："+dateString);
        insert_to_operation("添加用户");

        int result = usersService.createUser(user);

        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        if (result==1) {
            out.println("1");
        } else {
            out.println("0");
        }
        return null;
        //        request.setCharacterEncoding("UTF-8");
//        String username = request.getParameter("username");
//        String userpwd = request.getParameter("userpwd");
//        String phone = request.getParameter("phone");
//        System.out.println(username+userpwd);
//        Date date=new Date();
//        Users user=new Users();
//        user.setUserid((int)date.getTime());
//        user.setUsername(username);
//        user.setUserpwd(userpwd);
//        user.setPhone(phone);
//        user.setUserstate("1");
//        user.setScore("0");
//        Date currentTime = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
//        String dateString = formatter.format(currentTime);
//        System.out.println("操作名称：添加用户，操作时间："+dateString);
//        insert_to_operation("添加用户");
//
//        int result = usersService.createUser(user);
//
//        response.setCharacterEncoding("UTF-8");
//        PrintWriter out = response.getWriter();
//        if (result==1) {
//            out.println("1");
//        } else {
//            out.println("0");
//        }
//        return null;
    }
    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }
}
