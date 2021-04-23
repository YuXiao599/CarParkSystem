package com.arthur.service;

import com.arthur.domain.UserOrder;

import java.util.List;

public interface UserOrderService {
/**查询所有数据**/
    List<UserOrder> selectById(int userid);
}
