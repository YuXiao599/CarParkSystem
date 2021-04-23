package com.arthur.service.impl;

import com.arthur.dao.RecordDao;
import com.arthur.domain.Parkrecord;
import com.arthur.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired


    RecordDao recordDao;

    @Override
    public List<Parkrecord> listAll() {
        return recordDao.listAll();
    }

    @Override
    public Integer insert(Parkrecord parkrecord) {
        return recordDao.insert(parkrecord);
    }

    @Override
    public Integer deleteById(Integer parkrecordid) {
        return recordDao.deleteById(parkrecordid);
    }



    @Override
    public Integer update(Parkrecord parkrecord) {
        return recordDao.update(parkrecord);
    }

    @Override
    public Integer updateCarnumber(Parkrecord parkrecord) {
        return recordDao.updateCarnumber(parkrecord);
    }

    @Override
    public Integer updateState(Parkrecord parkrecord) {
        return  recordDao.updateState(parkrecord);
    }

    @Override
    public List<Parkrecord> findByName(String parkingid) {
        return recordDao.findByName(parkingid);

    }

   /* @Override
    public Integer insert(Users user) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

    @Override
    public Integer update(Users user) {
        return null;
    }

    @Override
    public Users getById(Integer id) {
        return null;
    }*/

   /* @Override
    public Integer insert(Users user) {
        return userDao.insert(user);
    }

    @Override
    public Integer deleteById(Integer id) {
        return userDao.deleteById(id);
    }

    @Override
    public Integer update(Users user) {
        return userDao.update(user);
    }

    @Override
    public Users getById(Integer id) {
        return userDao.getById(id);
    }*/
}
