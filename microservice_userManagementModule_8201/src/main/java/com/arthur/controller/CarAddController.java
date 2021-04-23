package com.arthur.controller;

import com.arthur.domain.Car;
import com.arthur.domain.Operation;
import com.arthur.service.CarService;
import com.arthur.service.OperationService;
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
public class CarAddController {
@Autowired
    CarService carService;
@Autowired
    OperationService operationService;
@RequestMapping("/CarAddController")
    public String CarAdd(@RequestBody Map<String,String> map, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    String carnumber = map.get("carnumber");
    String carinformation = map.get("carinformation");
    String sa = map.get("userid");
    int userid=Integer.parseInt(sa);

    Date date=new Date();
    Car car=new Car();
    car.setCarid((int)date.getTime());
    car.setCarnumber(carnumber);
    car.setCarinformation(carinformation);
    car.setUsersId(userid);
    int result =carService.createCar(car);

    Date currentTime = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMdd-HH:mm:ss");
    String dateString = formatter.format(currentTime);
    System.out.println("操作名称：添加车辆，操作时间："+dateString);
    insert_to_operation("添加车辆");

    response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();
    if (result==1) {
        out.println("1");
    } else {
        out.println("0");
    }
    return null;
}
    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);

        this.operationService.insert(operation);
    }
}
