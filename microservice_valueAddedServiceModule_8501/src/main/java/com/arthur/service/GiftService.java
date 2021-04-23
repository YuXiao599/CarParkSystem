package com.arthur.service;

import com.arthur.domain.Gifts;

import java.util.List;

public interface GiftService {
    /** 查找所有礼券 */
    List<Gifts> listAll();

    /** 添加礼券 */
    Integer insert(Gifts gift);

    /** 根据id删除礼券 */
    Integer deleteById(Integer giftid);

    /** 更新礼券 */
    Integer update(Gifts gift);

    /** 根据id查找礼券 */
    Gifts getById(Integer id);

    /** 根据name查找礼券 */
    List<Gifts> findByName(String giftname);
}
