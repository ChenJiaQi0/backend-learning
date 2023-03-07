package top.chen.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans6.xml");
        UserController userController = ac.getBean("userController", UserController.class);
        userController.say();
    }
}
