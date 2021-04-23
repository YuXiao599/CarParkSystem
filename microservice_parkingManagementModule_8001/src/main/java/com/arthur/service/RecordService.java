package com.arthur.service;

import com.arthur.domain.Parkrecord;

import java.util.List;

public interface RecordService {
    /** 查找所有用户 */
    List<Parkrecord> listAll();

    Integer insert(Parkrecord parkrecord);

    Integer deleteById(Integer parkrecordid);

    Integer update(Parkrecord parkrecord);

    Integer updateCarnumber(Parkrecord parkrecord);

    Integer updateState(Parkrecord parkrecord);

    List<Parkrecord> findByName(String parkingid);

    /* *//** 添加用户 *//*
    Integer insert(Users user);
    
    *//** 根据id删除用户 *//*
    Integer deleteById(Integer id);
    
    *//** 更新用户 *//*
    Integer update(Users user);
    
    *//** 根据id查找用户 *//*
    Users getById(Integer id);*/
}
