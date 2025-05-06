package solid.liskov.bad;

public class Bird extends Animal {
    @Override
    public String fly() {
        return "Bird flying";
    }

    @Override
    public String feed() {
        return "Bird feed";
    }

    @Override
    public String walk() {
        return "Bird walk";
    }
}
