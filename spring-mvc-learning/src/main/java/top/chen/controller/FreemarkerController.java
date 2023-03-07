package top.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.chen.entity.User;

@Controller
@RequestMapping("/fm")
public class FreemarkerController {
    @GetMapping("/test")
    public ModelAndView showTest(){
        ModelAndView mav = new ModelAndView();
        User user = new User();
        user.setUsername("张三");
        user.setGender("男");
        mav.addObject("u", user);
        mav.setViewName("/WEB-INF/ftl/test.ftl");
        return mav;
    }
}
