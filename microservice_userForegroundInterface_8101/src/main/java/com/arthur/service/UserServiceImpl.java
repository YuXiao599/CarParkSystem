package com.arthur.service;

import com.arthur.bean.*;
import com.arthur.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public int creatUser(User user) {
        int result = 0;
        try {
            result=userDao.insert(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public User findUserByNamePwd(String username, String userpwd) {
        User user=new User();
        Map<String,Object> userInfoMap=new HashMap<>();
        userInfoMap.put("username",username);
        userInfoMap.put("userpwd",userpwd);
        try {
            user=userDao.getByNamePwd(userInfoMap);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public int fallbackmassage(long userid, String massage) {
        int result=0;
        Date date=new Date();
        long informationid=date.getTime();
        Map<String,Object> fallBackMassageMap=new HashMap<>();
        fallBackMassageMap.put("informationid",informationid);
        fallBackMassageMap.put("userid",userid);
        fallBackMassageMap.put("massage",massage);
        try {
            result=userDao.fallbackmassage(fallBackMassageMap);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Car> findMyCar(Long userid) {
        List<Car> carList=new ArrayList<>();
        try {
            carList=userDao.findMyCar(userid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return carList;
    }

    @Override
    public List<Gift> findAllGift() {
        List<Gift> giftList=new ArrayList<>();
        try {
            giftList=userDao.findAllGift();
        }catch (Exception e){
            e.printStackTrace();
        }
        return giftList;
    }

    @Override
    public String ChangeGift(Long userid, int giftid) {
        String result=null;
        Integer haveScore=0;
        Integer needScore=0;
        try {
            haveScore=userDao.getHaveScore(userid);
            needScore=userDao.getNeedScore(giftid);
        }catch ( Exception e){
            e.printStackTrace();
        }
        if (haveScore>=needScore){
            int surplusScore=haveScore-needScore;
            Map<String,Object> scoreAndUseridMap=new HashMap<>();
            scoreAndUseridMap.put("userid",userid);
            scoreAndUseridMap.put("surplusScore",surplusScore);
            userDao.updateScore(scoreAndUseridMap);
            userDao.updateGiftNumber(giftid);
            result="兑换成功！,剩余礼券"+(haveScore-needScore)+"张";
        }else {
            result="礼券数量不足，兑换失败";
        }
        return result;
    }

    @Override
    public String buyOneService(int serviceid, int userid) {
        String result="";
        Long recordid;
        Date date=new Date();
        recordid=date.getTime();
        Map<String,Object> SidAndUidMap=new HashMap<>();
        SidAndUidMap.put("recordid",recordid);
        SidAndUidMap.put("serviceid",serviceid);
        SidAndUidMap.put("userid",userid);
        try {
            userDao.buyOneService(SidAndUidMap);
            result=Long.toString(date.getTime());
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Parking> findAllAppMnet() {
        List<Parking> parkingList=new ArrayList<>();
        try {
            parkingList=userDao.findAllAppMnet();
        }catch (Exception e){
            e.printStackTrace();
        }
        return parkingList;
    }

    @Override
    public int appOneInfo(Map<String, Object> reserveInfoMap) {
        int result=0;
        try {
            userDao.appOneInfo(reserveInfoMap);
            userDao.updateParkingInfo(reserveInfoMap.get("parkingid"));
            result=1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Parking> findAllPark() {
        List<Parking> parkingList=new ArrayList<>();
        try {
            parkingList=userDao.findAllPark();
        }catch (Exception e){
            e.printStackTrace();
        }
        return parkingList;
    }

    @Override
    public List<AddValue> findAllAddValue() {
        List<AddValue> addValueList=new ArrayList<>();
        try {
            addValueList=userDao.findAllAddValue();
        }catch (Exception e){
            e.printStackTrace();
        }
        return addValueList;
    }


}
