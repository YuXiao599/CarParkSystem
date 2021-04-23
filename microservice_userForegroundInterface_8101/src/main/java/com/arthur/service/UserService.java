package com.arthur.service;

import com.arthur.bean.*;

import java.util.List;
import java.util.Map;

public interface UserService {

    int creatUser(User user);

    User findUserByNamePwd(String username, String userpwd);

    int fallbackmassage(long  userid, String massage);

    List<Car> findMyCar(Long userid);

    List<Gift> findAllGift();

    String ChangeGift(Long userid, int giftid);

    List<Parking> findAllPark();

    List<AddValue> findAllAddValue();

    String buyOneService(int serviceid, int userid);

    List<Parking> findAllAppMnet();

    int appOneInfo(Map<String, Object> reserveInfoMap);
}
