package Builder;

public class Main {
    public static void main(String[] args) {
        Person p= new Person.Builder()
                .setAge(3)
                .name("A")
                .setAddress("b")
                .build();





    }
}
