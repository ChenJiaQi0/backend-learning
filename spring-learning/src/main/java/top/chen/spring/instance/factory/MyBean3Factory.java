package top.chen.spring.instance.factory;

import top.chen.spring.instance.static_factory.Bean2;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("Bean3实例化中");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
