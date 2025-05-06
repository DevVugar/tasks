package solid.liskov.good;

public class Bird extends Animal implements Flyable{
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
