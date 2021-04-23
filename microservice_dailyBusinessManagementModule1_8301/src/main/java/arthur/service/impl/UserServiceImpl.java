package arthur.service.impl;

import arthur.dao.UserDao;
import arthur.domain.ParkRecord;
import arthur.domain.Search;
import arthur.domain.Users;
import arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired

    UserDao userDao;

    @Override
    public List<Users> listAll() {
        return userDao.listAll();
    }

    @Override
    public  List<Users> listAllReserve(){return userDao.listAllReserve();}
    @Override
    public Integer insert(Users user) {
        return userDao.insert(user);
    }

    @Override
    public Integer deleteById(int reserveid) {
        return userDao.deleteById(reserveid);
    }

    @Override
    public Integer update(ParkRecord parkRecord) {
        return userDao.update(parkRecord);
    }

    @Override
    public Users getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public ParkRecord getBycarId(Integer carid){return userDao.getBycarId(carid);}

    @Override
    public List<Search> findList(Search search) {
        return userDao.findList(search);
    }

}
