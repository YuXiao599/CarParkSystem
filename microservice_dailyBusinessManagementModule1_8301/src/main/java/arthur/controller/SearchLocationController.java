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

public class SearchLocationController {
    @Autowired
    ParkRecordService parkRecordService;
    @RequestMapping("/cardetailEnquiry/findlocation")
   @ResponseBody
    public Map askforlocationList(HttpServletRequest request) {

        String location = request.getParameter("carlocation");
//        String start_time="2020-10-13 22:49:01";
//        String end_time="2020-10-16 22:49:01";
       Map map=new HashMap();
        List<ParkRecord> parkRecordsList=parkRecordService.findlocationList(location);
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", 4);
        map.put("data", parkRecordsList);
            return map;
    }
}
