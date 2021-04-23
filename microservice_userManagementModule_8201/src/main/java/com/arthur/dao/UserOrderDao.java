package com.arthur.dao;

import com.arthur.domain.UserOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserOrderDao {
    /**通过用户id显示订单**/
    List<UserOrder> getById(int userid);

}
