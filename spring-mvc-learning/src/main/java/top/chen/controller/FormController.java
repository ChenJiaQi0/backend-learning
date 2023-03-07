package top.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.chen.entity.R;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FormController {
    @PostMapping(value = "/form",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String form(@RequestParam(value = "name", defaultValue = "CHEN") String name, String course, @RequestParam List<Integer> purpose){
        System.out.println(name);
        System.out.println(course);
        String purpose2 = "";
        for (Integer integer : purpose) {
            switch (integer){
                case 1:
                    purpose2+="就业找工作\n";break;
                case 2:
                    purpose2+="纯粹感兴趣\n";break;
                case 3:
                    purpose2+="工作需求\n";break;
                case 4:
                    purpose2+="其他\n";break;
                default:
                    break;
            }
        }
        System.out.println(purpose2);
        R result = new R();
        result.setMessage("Success");
        Map<String,Object> data = new LinkedHashMap<>();
        data.put("Name", name);
        data.put("Course",course);
        data.put("Purpose",purpose2);
        result.setData(data);
        return result.toString();
    }
}
