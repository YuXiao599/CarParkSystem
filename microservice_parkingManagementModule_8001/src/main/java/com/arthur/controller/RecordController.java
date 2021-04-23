package com.arthur.controller;

import com.arthur.domain.Operation;
import com.arthur.domain.Parkrecord;
import com.arthur.service.OperationService;
import com.arthur.service.RecordService;
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

@Controller
public class RecordController {
    @Autowired


    RecordService recordService;
    @Autowired
    OperationService operationService;

    @RequestMapping("/car-stop/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        List<Parkrecord> parkrecords = recordService.listAll();
        insert_to_operation("查看停车位列表");
        System.out.println(parkrecords);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", parkrecords.size());
        map.put("data", parkrecords);
        return map;
    }
    
//    @RequestMapping("/car-stop/add")
//    @ResponseBody
//    private Map<String, Object> add(@RequestBody Parkrecord parkrecord) {
//
//
//        int result = recordService.insert(parkrecord);
//        Map<String, Object> map = new HashMap<String, Object>();
//        if (result > 0) {
//           map.put("status", 1);
//        } else {
//           map.put("status", 0);
//        }
//        return map;
//    }
    
    @RequestMapping("/car-stop/{parkrecordid}")
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("parkrecordid") int parkrecordid) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：删除停车记录，操作时间："+dateString);
        insert_to_operation("删除停车记录");

        int result = recordService.deleteById(parkrecordid);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }
    
//    @RequestMapping("/car-stop/update")
//    @ResponseBody
//    private Map<String, Object> update(@RequestBody Parkrecord parkrecord) {
//        int result = recordService.update(parkrecord);
//        Map<String, Object> map = new HashMap<String, Object>();
//        if (result > 0) {
//           map.put("status", 1);
//        } else {
//           map.put("status", 0);
//        }
//        return map;
//    }

    @RequestMapping("/car-stop/carnumber")
    @ResponseBody
    private Map<String, Object> updateCarnumber(@RequestBody Parkrecord parkrecord) {


        int result = recordService.updateCarnumber(parkrecord);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
            map.put("status", 1);
        } else {
            map.put("status", 0);
        }
        return map;
    }

    //模糊查询
    @RequestMapping("/car-stop/search")
    @ResponseBody
    private Map<String, Object> findByName(HttpServletRequest request, HttpServletResponse response){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：查询车位记录，操作时间："+dateString);
        String v=request.getParameter("query");
        System.out.println(v);
        List<Parkrecord> result= recordService.findByName(v);
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", result.size());
        map.put("data", result);
        System.out.println(result);
        return map;
    }

    void insert_to_operation(String content){
        Operation operation=new Operation();

        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }
}
