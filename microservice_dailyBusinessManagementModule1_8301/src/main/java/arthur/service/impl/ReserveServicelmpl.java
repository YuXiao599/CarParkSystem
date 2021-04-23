package arthur.service.impl;

import arthur.dao.ReserveDao;
import arthur.domain.Reserve;
import arthur.domain.Search;
import arthur.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reserveService")
public class ReserveServicelmpl implements ReserveService {
    @Autowired
    ReserveDao reserveDao;
    @Override
   public List<Reserve> findReserveList(String start_time, String end_time)
    {
        Search search=new Search();
        search.setStart_time(start_time);
        search.setEnd_time(end_time);
        return reserveDao.findReserveList(search);
    };

}
