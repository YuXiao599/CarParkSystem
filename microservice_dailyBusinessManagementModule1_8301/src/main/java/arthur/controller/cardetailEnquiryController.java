package arthur.controller;

import arthur.domain.Operation;
import arthur.domain.ParkRecord;
import arthur.domain.Users;
import arthur.service.OperationService;
import arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class cardetailEnquiryController {
    @Autowired
    UserService userService;
    @Autowired
    OperationService operationService;

    @RequestMapping("/cardetailEnquiry/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        List<Users> parkRecord = userService.listAll();
        System.out.println(parkRecord);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", 4);
        map.put("data", parkRecord);
        return map;
    }
    @RequestMapping("/cardetailEnquiry/update")
    @ResponseBody
    private Map<String, Object> update(@RequestBody ParkRecord parkRecord) {
        insert_to_operation("计算费用");
        int result = userService.update(parkRecord);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }

    void insert_to_operation(String content){
        Operation operation = new Operation();
        operation.setOperationcontent(content);
        this.operationService.insert(operation);
    }
}
