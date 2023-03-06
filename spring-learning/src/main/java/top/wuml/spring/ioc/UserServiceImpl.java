package top.wuml.spring.ioc;

import org.springframework.beans.factory.annotation.Value;

public class UserServiceImpl implements UserService{
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
