package arthur.dao;

import arthur.domain.ParkRecord;
import arthur.domain.Search;

import java.util.List;

public interface ParkRecordDao {

    List<ParkRecord> findTimeList(Search search);

    List<ParkRecord> findlocationList(Search search);

    List<ParkRecord> findcarnumber(Search search);
}
