package top.chen.spring.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:bean1.xml");
        Bean1 bean1 = ac.getBean("bean1", Bean1.class);
        System.out.println(bean1);
    }
}
