package top.chen.spring.ioc;

public class Pen {
private String name;

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

