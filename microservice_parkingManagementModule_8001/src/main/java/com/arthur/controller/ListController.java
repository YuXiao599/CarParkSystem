package com.arthur.controller;

import com.arthur.domain.Operation;
import com.arthur.domain.Parking;
import com.arthur.service.OperationService;
import com.arthur.service.ParkingService;
import com.arthur.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ListController {
    @Autowired

    ParkingService parkingService;
    RecordService recordService;
    @Autowired
    OperationService operationService;
    
    @RequestMapping("/member-list/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        List<Parking> parking = parkingService.listAll();
        insert_to_operation("查看停车位列表");
        System.out.println(parking);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", parking.size());
        map.put("data", parking);
        return map;
    }
    
    @RequestMapping("/member-list/add")
    @ResponseBody
    private Map<String, Object> add(@RequestBody Parking parking) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：添加车位，操作时间："+dateString);
        insert_to_operation("添加车位");

        int result = parkingService.insert(parking);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }
    
    @RequestMapping("/member-list/{parkingid}")
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("parkingid") int parkingid) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：删除车位，操作时间："+dateString);
        insert_to_operation("删除车位");

        int result = parkingService.deleteById(parkingid);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }
    
    @RequestMapping("/member-list/update")
    @ResponseBody
    private Map<String, Object> update(@RequestBody Parking parking) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：更新车位，操作时间："+dateString);
        insert_to_operation("更新车位");


        int result = parkingService.update(parking);
        Map<String, Object> map = new HashMap<String, Object>();
       /* int state = Integer.parseInt(.getParameter("state"));
        */
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }

    @RequestMapping("/member-list/state")
    @ResponseBody
    private Map<String, Object> updateState(@RequestBody Parking parking) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：停车，操作时间："+dateString);
        insert_to_operation("停车");

        int result = parkingService.updateState(parking);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
            map.put("status", 1);
        } else {
            map.put("status", 0);
        }
        return map;
    }


    @RequestMapping("/member-list/stateout")
    @ResponseBody
    private Map<String, Object> updateStateOut(@RequestBody Parking parking) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：驶离，操作时间："+dateString);
        insert_to_operation("驶离");


        int result = parkingService.updateStateOut(parking);
        int state = parkingService.updateOutTime(parking);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0 && state>0) {
            map.put("status", 1);
        } else {
            map.put("status", 0);
        }
        return map;
    }


    @RequestMapping("/member-list/allaway")
    @ResponseBody
    private Map<String, Object> listAllAway() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println("操作名称：显示已停车列表，操作时间："+dateString);
        insert_to_operation("显示已停车列表");


        List<Parking> parking = parkingService.listAllAway();
        System.out.println(parking);
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        map.put("msg", "");
        map.put("count",parking.size() );
        map.put("data", parking);
        return map;
    }

    void insert_to_operation(String content){
        Operation operation=new Operation();

        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }
}
