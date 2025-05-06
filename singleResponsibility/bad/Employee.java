package solid.singleResponsibility.bad;


public class Employee {
    String name;
    String surname;
    int age;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



//*****************************************

    public void saveToDatabase() {
        System.out.println("Saved employee:" + name);
    }


    public void calculateSalary() {
        salary+=salary * 0.1;
        System.out.println("salary: " +salary );
    }


}
