package com.arthur.service.impl;

import com.arthur.dao.ParkingDao;
import com.arthur.domain.Parking;
import com.arthur.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {
    @Autowired

    ParkingDao parkingDao;

    @Override
    public List<Parking> listAll() {
        return parkingDao.listAll();
    }

    @Override
    public Integer insert(Parking parking) {
        return parkingDao.insert(parking);
    }

    @Override
    public Integer update(Parking parking) {
        return parkingDao.update(parking);
    }

    @Override
    public Integer deleteById(Integer parkingid) {
        return parkingDao.deleteById(parkingid);
    }

    @Override
    public Integer updateState(Parking parking) {
        return parkingDao.updateState(parking);
    }

    @Override
    public List<Parking> listAllAway() {
        return parkingDao.listAllAway();
    }

    @Override
    public Integer updateStateOut(Parking parking) {
        return parkingDao.updateStateOut(parking);
    }

    @Override
    public Integer updateOutTime(Parking parking) {
        return parkingDao.updateOutTime(parking);
    }

    /*@Override
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
