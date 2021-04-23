package com.arthur.controller;

import com.arthur.core.Result;
import com.arthur.domain.Operation;
import com.arthur.domain.Users;
import com.arthur.service.OperationService;
import com.arthur.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @Autowired
    private UsersService usersService;
    @Autowired
    OperationService operationService;
    @GetMapping("/Search")
    public Result getOne(@PathVariable("userId")int userId){
        Users users = usersService.selectById(userId);
        if(users==null){
            return Result.fail("没有该用户");
        }else {
            return Result.success(users);
        }
    }
    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }
}
