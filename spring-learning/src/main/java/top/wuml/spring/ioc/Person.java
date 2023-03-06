package top.wuml.spring.ioc;

public class Person {
    private String name;
    private Clothes clothes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return name + "爱穿" + clothes.getColor() + "的" + clothes.getStyle();
    }
}
