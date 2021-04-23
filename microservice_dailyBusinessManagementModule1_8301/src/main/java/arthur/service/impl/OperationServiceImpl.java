package arthur.service.impl;

import arthur.dao.OperationDao;
import arthur.domain.Operation;
import arthur.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
    @Autowired
    OperationDao operationDao ;
    public Integer insert(Operation operation) {
        return operationDao.insert(operation);
    }

}
