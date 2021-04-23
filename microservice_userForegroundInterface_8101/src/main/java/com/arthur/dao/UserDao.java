package com.arthur.dao;

import com.arthur.bean.*;

import java.util.List;
import java.util.Map;

public interface UserDao {

    /** 用户注册 */
    Integer insert(User user);

    /** 用户登录 */
    User getByNamePwd(Map<String, Object> userInfoMap);

    /** 用户留言 */
    Integer fallbackmassage(Map<String, Object> fallBackMassageMap);

    /** 查找用户所有车辆 */
    List<Car> findMyCar(Long userid);

    /** 查找所有可兑换服务 */
    List<Gift> findAllGift();

    /** 查询已有礼券数量 */
    int getHaveScore(Long userid);

    /** 查找兑换礼物所需礼券 */
    int getNeedScore(int giftid);

    /** 更新用户礼券数量 */
    void updateScore(Map<String, Object> scoreAndUseridMap);

    /** 更新礼物数量 */
    void updateGiftNumber(int giftid);

    /** 查找所有停车位 */
    List<Parking> findAllPark();

    /** 查找所有增值服务 */
    List<AddValue> findAllAddValue();

    /** 添加一条购买服务信息 */
    void buyOneService(Map<String, Object> sidAndUidMap);

    /** 查找所有未预约，未停入的车辆 */
    List<Parking> findAllAppMnet();

    /** 添加一条预约信息 */
    int appOneInfo(Map<String, Object> reserveInfoMap);

    /** 更新车位情况 */
    void updateParkingInfo(Object parkingid);


}
