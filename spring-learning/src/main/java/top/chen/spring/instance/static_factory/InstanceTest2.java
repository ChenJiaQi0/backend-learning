package top.chen.spring.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chen.spring.instance.constructor.Bean1;

public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:bean2.xml");
        Bean2 bean2 = ac.getBean("bean2", Bean2.class);
        System.out.println(bean2);
    }
}
