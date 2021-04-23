package com.arthur.service.impl;

import com.arthur.dao.GiftDao;
import com.arthur.domain.Gifts;
import com.arthur.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftServiceImpl implements GiftService {

    @Autowired
    private GiftDao giftDao;
    @Override
    public List<Gifts> listAll() {
        return giftDao.listAll();
    }

    @Override
    public Integer insert(Gifts gift) {
        return giftDao.insert(gift);
    }

    @Override
    public Integer deleteById(Integer giftid) {
        return giftDao.deleteById(giftid);
    }

    @Override
    public Integer update(Gifts gift) {
        return giftDao.update(gift);
    }

    @Override
    public Gifts getById(Integer id) {
        return giftDao.getById(id);
    }

    @Override
    public List<Gifts> findByName(String giftname) {
        return giftDao.findByName(giftname);
    }
}
