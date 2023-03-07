package top.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.chen.entity.User;

@Controller
@ResponseBody
public class loginController {
    @GetMapping(value = "/login",produces = "text/html;charset=utf-8")
    public String login(User user){
        System.out.println(user.getUsername()+user.getPassword());
        String str =  "<fieldset><legend>登陆成功</legend>用户名：" +user.getUsername()+ "<br>密码："+user.getPassword()+"</fieldset>";
        return str;
    }
}
