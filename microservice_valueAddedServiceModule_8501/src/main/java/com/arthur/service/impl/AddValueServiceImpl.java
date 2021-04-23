package com.arthur.service.impl;

import com.arthur.dao.ServiceDao;
import com.arthur.domain.Services;
import com.arthur.service.AddValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddValueServiceImpl implements AddValueService {
    @Autowired
    private ServiceDao serviceDao;
    @Override
    public List<Services> listAll() {
        return serviceDao.listAll();
    }

    @Override
    public Integer insert(Services service) {
        return serviceDao.insert(service);
    }

    @Override
    public Integer deleteById(Integer serviceid) {
        return serviceDao.deleteById(serviceid);
    }

    @Override
    public Integer update(Services service) {
        return serviceDao.update(service);
    }

    @Override
    public List<Services> findByName(String servicename) {
        return serviceDao.findByName(servicename);
    }


}
