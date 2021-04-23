package com.arthur.dao;

import com.arthur.domain.Car;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarDao {
    Integer insert(Car car);
}
