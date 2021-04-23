package com.arthur.controller;

import com.arthur.core.Result;
import com.arthur.domain.Operation;
import com.arthur.domain.Users;
import com.arthur.service.OperationService;
import com.arthur.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.arthur.domain.Usersa;

@RestController
public class UsersController {

    @Resource
    private UsersService usersService;
    @Autowired
    OperationService operationService;

    @RequestMapping("/users/{userId}")
    public Result deleteById(@PathVariable("userId")int userId){

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：删除用户，操作时间："+dateString);
        insert_to_operation("删除用户");

        if(usersService.deleteById(userId)){
            return Result.success("删除成功");
        }
        return Result.fail("删除失败");
    }
//    @RequestMapping("/users/{userId}")
//    public Result getOne(@PathVariable("userId")int userId){
//        Users users = usersService.selectById(userId);
//        if(users==null){
//            return Result.fail("没有该用户");
//        }else {
//            return Result.success(users);
//        }
//    }
    @RequestMapping("/users/update")
    public Result update(@RequestBody Users users) {

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：变更用户状态，操作时间："+dateString);
        insert_to_operation("变更用户状态");

        if(usersService.update(users)){
            return Result.success("变更成功");
        }
        return Result.fail("变更失败");
    }
//        @PostMapping("/list")
//    public Result listAll(int page, int limit){
//        if (page<0){
//            page=0;
//        }else if(page>usersService.totalPage(limit)){
//            page=usersService.totalPage(limit);
//        }
//        List<Users> list =  usersService.getAll(page,limit);
//            System.out.println(list);
//            insert_to_operation("查看用户列表");
//        return Result.success(list);
//    }
@RequestMapping("/users/list")
    @ResponseBody
    private Map<String,Object> listAll(){
        List<Users> services = usersService.getAll();
        insert_to_operation("查看用户列表");
        System.out.println(services);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", 4);
        map.put("data", services);
        return map;
    }

    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }

}
