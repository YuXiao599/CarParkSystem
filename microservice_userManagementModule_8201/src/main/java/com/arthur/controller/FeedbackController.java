package com.arthur.controller;

import com.arthur.domain.Feedback;
import com.arthur.domain.Operation;
import com.arthur.service.FeedbackService;
import com.arthur.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FeedbackController {
    @Resource
    FeedbackService feedbackService;
    @Autowired
    OperationService operationService;
    @RequestMapping("/feedback/list")
    @ResponseBody()
    private Map<String,Object> listAll(){
        List<Feedback> services = feedbackService.getAll();
        insert_to_operation("查看反馈列表");
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
