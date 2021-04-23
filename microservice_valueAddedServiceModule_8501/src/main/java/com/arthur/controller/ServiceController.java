package com.arthur.controller;


import com.arthur.domain.Operation;
import com.arthur.domain.Services;
import com.arthur.service.AddValueService;
import com.arthur.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ServiceController {
    @Autowired
    private  AddValueService addValueService;
    @Autowired
    private  OperationService operationService;
    @RequestMapping("/service/all")
    @ResponseBody
    private Map<String,Object> listAll(){
        List<Services> services = addValueService.listAll();
        insert_to_operation("查看增值服务列表");
        System.out.println(services);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", services.size());
        map.put("data", services);
        return map;
    }

    @RequestMapping("/service/add")
    @ResponseBody
    private Map<String,Object> add(@RequestBody Services service){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：添加服务，操作时间："+dateString);
        insert_to_operation("添加服务");
        int result = addValueService.insert(service);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
            map.put("status", 1);
        } else {
            map.put("status", 0);
        }
        return map;
    }

    @RequestMapping("/service/delete/{serviceid}")
    @ResponseBody
    private Map<String,Object> deleteById(@PathVariable("serviceid") int serviceid){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：删除服务，操作时间："+dateString);
        insert_to_operation("删除服务");
        System.out.println(serviceid);
        int result=addValueService.deleteById(serviceid);
        Map<String,Object> map =new HashMap<String, Object>();
        if (result>0){
            map.put("status",1);
        }
        else {
            map.put("status",0);
        }
        return map;
    }

    @RequestMapping("/service/update")
    @ResponseBody
    private Map<String,Object> update(@RequestBody Services service){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：修改服务，操作时间："+dateString);
        insert_to_operation("修改服务");
        int result= addValueService.update(service);
        Map<String,Object> map=new HashMap<String, Object>();
        if(result>0){
            map.put("status",1);
        }else {
            map.put("status",0);
        }
        return map;
    }

    @RequestMapping("/service/search")
    @ResponseBody
    private Map<String,Object> findByName(HttpServletRequest request, HttpServletResponse response){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：增值服务模糊查询服务，操作时间："+dateString);
        String v=request.getParameter("query");
        System.out.println(v);
        List<Services> result= addValueService.findByName(v);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", result.size());
        map.put("data", result);
        System.out.println(result);
        return map;

    }
    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);
        this.operationService.insert(operation);
    }
}

