package top.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.chen.entity.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/fm")
public class FreemarkerController {
        @GetMapping("test")
    public ModelAndView showTest() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/test");
        User u1 = new User("chen","男");
        User u2 = new User("che","女");
        User u3 = new User("ch","男");
        User u4 = new User("c","女");
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        mav.addObject("users", list);
        return mav;
    }
}
