package com.arthur.controller;

import com.arthur.core.Result;
import com.arthur.domain.Operation;
import com.arthur.domain.UserOrder;
import com.arthur.service.OperationService;
import com.arthur.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserOrderController {
    @Resource
    UserOrderService userOrderService;
    @Autowired
    OperationService operationService;
    @RequestMapping("/order_list/{userid}")
    public Result selectById(@PathVariable("userid")int userid)
    {
        List <UserOrder> list=userOrderService.selectById(userid);
        System.out.println(list);
        insert_to_operation("查看用户的订单列表");
        return Result.success(list);
    }
    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }
}
