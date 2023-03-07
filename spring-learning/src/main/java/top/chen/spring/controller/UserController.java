package top.chen.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import top.chen.spring.ioc.UserService;

@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    public void say(){
        userService.say();
    }
}
