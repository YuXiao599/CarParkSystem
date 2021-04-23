package com.arthur.service.impl;

import com.arthur.dao.CarDao;
import com.arthur.domain.Car;
import com.arthur.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CarServiceImpl implements CarService {
    @Resource
    private CarDao carDao;
    @Override
    public Integer createCar(Car car){
        int result = 0;
        try {
            result=carDao.insert(car);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
