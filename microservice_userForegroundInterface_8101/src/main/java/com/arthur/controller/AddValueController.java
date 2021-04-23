package com.arthur.controller;

import com.arthur.bean.AddValue;
import com.arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AddValueController {
    @Autowired
    private UserService userService;

    @RequestMapping("/AddValueController")
    public List<AddValue> AddValue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<AddValue> addValueList=new ArrayList<>();
        addValueList=userService.findAllAddValue();

        return addValueList;
    }
}
