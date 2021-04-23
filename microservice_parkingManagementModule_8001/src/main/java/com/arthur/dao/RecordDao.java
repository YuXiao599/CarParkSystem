package com.arthur.dao;

import com.arthur.domain.Parkrecord;

import java.util.List;

public interface RecordDao {
    /** 查找所有用户 */
    List<Parkrecord> listAll();
    
    /* 添加用户 */
    Integer insert(Parkrecord parkrecord);
    
     /*根据id删除用户 */
    Integer deleteById(Integer parkrecordid);
    
    /*更新用户 */
    Integer update(Parkrecord parkrecord);
    /*根据id查找用户*/
    Parkrecord getById(Integer id);

    Integer updateCarnumber(Parkrecord parkrecord);

    Integer updateState(Parkrecord parkrecord);

    List<Parkrecord> findByName(String parkingid);
}
