package arthur.service;

import arthur.domain.ParkRecord;
import arthur.domain.Search;
import arthur.domain.Users;

import java.util.List;

public interface UserService {
    /** 查找所有用户 */
    List<Users> listAll();
    
    /** 添加用户 */
    Integer insert(Users user);
    
    /** 根据id删除用户 */
    Integer deleteById(int reserveid);
    
    /** 更新用户 */
    Integer update(ParkRecord parkRecord);
    /** 根据id查找用户 */
    Users getById(Integer id);

    ParkRecord getBycarId(Integer carid);

    List<Search> findList(Search search);

    List<Users> listAllReserve();
}
