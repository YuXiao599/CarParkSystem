package arthur.dao;



import arthur.domain.Reserve;
import arthur.domain.Search;

import java.util.List;

public interface ReserveDao {

    List<Reserve> findReserveList(Search search);
}
