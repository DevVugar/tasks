package solid.liskov.good;

public class Cat extends Animal {



    @Override
    public String feed() {
        return "cats feed";
    }

    @Override
    public String walk() {
        return "cats walk";
    }
}
