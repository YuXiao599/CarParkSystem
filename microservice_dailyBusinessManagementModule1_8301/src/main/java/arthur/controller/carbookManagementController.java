package arthur.controller;

import arthur.domain.Users;
import arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class carbookManagementController {
    @Autowired
    UserService userService;

    @RequestMapping("/carbookManagement/all")
    @ResponseBody
    private Map<String, Object> listAllReserve() {
        List<Users> reserve = userService.listAllReserve();
        System.out.println(reserve);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", 4);
        map.put("data", reserve);
        return map;
    }
    @RequestMapping("/carbookManagement/{id}")
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("id") int id) {
        int result = userService.deleteById(id);
        Map<String, Object> map = new HashMap<String, Object>();
        if (result > 0) {
           map.put("status", 1);
        } else {
           map.put("status", 0);
        }
        return map;
    }
}
