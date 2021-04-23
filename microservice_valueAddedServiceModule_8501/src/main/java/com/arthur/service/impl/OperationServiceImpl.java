package com.arthur.service.impl;

import com.arthur.dao.OperationDao;
import com.arthur.domain.Operation;
import com.arthur.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
    @Autowired
    private  OperationDao operationDao ;

    public Integer insert(Operation operation) {
        return operationDao.insert(operation);
    }

}
