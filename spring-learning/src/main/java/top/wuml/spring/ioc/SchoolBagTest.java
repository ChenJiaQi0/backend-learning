package top.wuml.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolBagTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SchoolBag schoolBag = context.getBean("schoolBag", SchoolBag.class);
        System.out.println(schoolBag);
    }
}
