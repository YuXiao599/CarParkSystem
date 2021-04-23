package com.arthur.controller;

import com.arthur.domain.Gifts;
import com.arthur.domain.Operation;
import com.arthur.service.GiftService;
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
public class GiftController {
    @Autowired
    private  GiftService giftService;
    @Autowired
    private  OperationService operationService;

    @RequestMapping("/gift/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        List<Gifts> gifts = giftService.listAll();
//        System.out.println(gifts);
        insert_to_operation("查看礼券列表");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", gifts.size());
        map.put("data", gifts);
        return map;
    }
    //模糊查询
    @RequestMapping("/gift/search")
    @ResponseBody
    private Map<String,Object> findByName(HttpServletRequest request, HttpServletResponse response){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：礼券模糊查询服务，操作时间："+dateString);
        String v=request.getParameter("query");
        System.out.println(v);
        List<Gifts> result= giftService.findByName(v);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", result.size());
        map.put("data", result);
        System.out.println(result);
        return map;
    }

    @RequestMapping("/gift/add")
    @ResponseBody
    private Map<String, Object> add(@RequestBody Gifts gift) {
        //打印输出操作内容和时间

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：添加礼券，操作时间："+dateString);
        insert_to_operation("添加礼券");
        int result = giftService.insert(gift);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
            map.put("status", 1);
        } else {
            map.put("status", 0);
        }
        return map;
    }

    @RequestMapping("/gift/delete/{giftid}")
    @ResponseBody
    private Map<String,Object> deleteById(@PathVariable("giftid") int giftid){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：删除礼券，操作时间："+dateString);
        insert_to_operation("删除礼券");
      int result=giftService.deleteById(giftid);
      Map<String,Object> map =new HashMap<String, Object>();
      if (result>0){
          map.put("status",1);
      }
      else {
          map.put("status",0);
      }
      return map;
    }

    @RequestMapping("/gift/update")
    @ResponseBody
    private Map<String,Object> update(@RequestBody Gifts gift){
        //打印输出操作内容和时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：修改礼券，操作时间："+dateString);
        insert_to_operation("修改礼券");
    int result= giftService.update(gift);
    Map<String,Object> map=new HashMap<String, Object>();
if(result>0){
    map.put("status",1);
}else {
    map.put("status",0);
}
return map;
    }


    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }
}