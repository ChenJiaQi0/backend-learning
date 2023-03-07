package top.chen.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Value("hello")
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }



    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        System.out.println("UserService say hi");
        this.userDao.say();
        System.out.println(hello);
    }

}
