package top.chen.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chen.spring.instance.constructor.Bean1;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:bean4.xml");
        System.out.println(ac.getBean("scope"));
        System.out.println(ac.getBean("scope"));
    }
}
