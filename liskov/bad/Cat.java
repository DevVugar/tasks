package solid.liskov.bad;

public class Cat extends Animal {

    @Override
    public String fly() {
        throw new RuntimeException("cats don't fly");
    }

    @Override
    public String feed() {
        return "cats feed";
    }

    @Override
    public String walk() {
        return "cats walk";
    }
}
