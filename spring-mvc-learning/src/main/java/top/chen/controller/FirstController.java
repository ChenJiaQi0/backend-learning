package top.chen.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //创建模型视图对象
        ModelAndView mav = new ModelAndView();
        //向模型中添加数据
        mav.addObject("msg","第一个Spring MVC应用");
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("username","张三");
        mav.addObject("map",map);
        //设置视图名称
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }
}
