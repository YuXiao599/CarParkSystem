package com.arthur.dao;

import com.arthur.domain.Parking;

import java.util.List;

public interface ParkingDao {
    /** 查找所有用户 */
    List<Parking> listAll();
    
   /** 添加用户 */
    Integer insert(Parking parking);
    
    /*根据id删除用户*/
    Integer deleteById(Integer parkingid);

    Integer update(Parking parking);

    Integer updateState(Parking parking);

    List<Parking> listAllAway();

    Integer updateStateOut(Parking parking);

    Integer updateOutTime(Parking parking);
    
    /* 更新用户
    Integer update(Parking parking);
    
    * 根据id查找用户
    Users getById(Integer id);*/
}
