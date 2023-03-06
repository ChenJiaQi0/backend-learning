package top.wuml.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book) context.getBean("book");
        Book bookByConstructor = (Book) context.getBean("bookByConstructor");
        System.out.println(book);
        System.out.println(bookByConstructor);
    }
}
