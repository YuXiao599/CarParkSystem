package arthur.service;

import arthur.domain.Reserve;

import java.util.List;

public interface ReserveService {

    List<Reserve> findReserveList(String start_time, String end_time);
}
