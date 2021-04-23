package arthur.dao;

import arthur.domain.ParkRecord;
import arthur.domain.Search;
import arthur.domain.Users;

import java.util.List;

public interface UserDao {
    /** 查找所有用户 */
    List<Users> listAll();

    /** 添加用户 */
    Integer insert(Users user);
    
    /** 根据id删除用户 */
    Integer deleteById(int reserveid);

    Integer update(ParkRecord parkRecord);
    
    /** 根据id查找用户 */
    Users getById(Integer id);

    ParkRecord getBycarId(Integer carid);

    List<Users> listAllReserve();

    List<Search> findList(Search search);
}
