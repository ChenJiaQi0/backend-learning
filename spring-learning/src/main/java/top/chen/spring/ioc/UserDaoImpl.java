package top.chen.spring.ioc;

public class UserDaoImpl implements UserDao{
    @Override
    public void say() {
        System.out.println("UserDao say hi");
    }
}
