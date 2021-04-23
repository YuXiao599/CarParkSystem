package arthur.controller;

import arthur.domain.ParkRecord;
import arthur.service.ParkRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SearchController {
    @Autowired
    ParkRecordService parkRecordService;

    @RequestMapping("/cardetailEnquiry/find")
    @ResponseBody
    public Map askforleaveList(HttpServletRequest request) {
        String start_time = request.getParameter("start_time");
        String end_time = request.getParameter("end_time");
        Map map = new HashMap();
//        String start_time="2020-10-13 22:49:01";
//        String end_time="2020-10-16 22:49:01";
            List<ParkRecord> parkRecordList = parkRecordService.findTimeList(start_time, end_time);
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", 4);
            map.put("data", parkRecordList);
        return map;
    }
}