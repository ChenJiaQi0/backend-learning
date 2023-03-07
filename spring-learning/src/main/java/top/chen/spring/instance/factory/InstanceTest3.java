package top.chen.spring.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chen.spring.instance.static_factory.Bean2;

public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:bean3.xml");
        Bean3 bean3 = ac.getBean("bean3", Bean3.class);
        System.out.println(bean3);
    }
}
