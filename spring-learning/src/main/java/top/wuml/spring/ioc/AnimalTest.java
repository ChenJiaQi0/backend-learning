package top.wuml.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = (Dog) context.getBean("dog");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }
}
