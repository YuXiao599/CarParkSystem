package com.arthur.service;

import com.arthur.domain.Parking;

import java.util.List;

public interface ParkingService {
    /** 查找所有用户 */
    List<Parking> listAll();

    /** 添加用户 */
    Integer insert(Parking parking);

    Integer update(Parking parking);

    Integer deleteById(Integer parkingid);

    Integer updateState(Parking parking);

    List<Parking> listAllAway();

    Integer updateStateOut(Parking parking);

    Integer updateOutTime(Parking parking);



    
   /* 根据id查找用户
    Users getById(Integer id);*/
}
