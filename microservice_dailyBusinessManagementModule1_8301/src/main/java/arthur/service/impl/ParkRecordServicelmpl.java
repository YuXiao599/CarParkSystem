package arthur.service.impl;

import arthur.dao.ParkRecordDao;
import arthur.domain.ParkRecord;
import arthur.domain.Search;
import arthur.service.ParkRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("parkRecordService")
public class ParkRecordServicelmpl implements ParkRecordService {
    @Autowired
    ParkRecordDao parkRecordDao;
    @Override
   public List<ParkRecord> findTimeList(String start_time, String end_time)
    {
        Search search=new Search();
        search.setStart_time(start_time);
        search.setEnd_time(end_time);
        return parkRecordDao.findTimeList(search);
    };
    public List<ParkRecord> findlocationList(String location){
        Search search=new Search();
        search.setLocation(location);
        return parkRecordDao.findlocationList(search);
    }
    public List<ParkRecord> findcarnumberList(String carnumber){
        Search search=new Search();
        search.setCarnumber(carnumber);
        return parkRecordDao.findcarnumber(search);
    }

}
