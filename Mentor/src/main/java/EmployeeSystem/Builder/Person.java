package Builder;

public class Person {

    private String name;
    private int age;
    private String address;

    public Person(){}

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static class Builder {

        private String name;
        private int age;
        private String address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            // Validate the builder state before creating the Person object (optional)
            if (name == null) {
                throw new IllegalArgumentException("Name is required");
            }
            return new Person(name, age, address);
        }
    }



    // Getters and other methods for Person object (optional)
}
