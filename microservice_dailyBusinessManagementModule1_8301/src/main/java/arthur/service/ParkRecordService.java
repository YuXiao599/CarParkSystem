package arthur.service;

import arthur.domain.ParkRecord;

import java.util.List;

public interface ParkRecordService {

    List<ParkRecord> findTimeList(String start_time, String end_time);

    List<ParkRecord> findlocationList(String location);

    List<ParkRecord> findcarnumberList(String carnumber);
}
