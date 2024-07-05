package Data;

import java.io.Serializable;

public class Instructor extends Employee implements Serializable {
    private String instructorWork;

    public Instructor(int id,String name, String surname, int age, double salary,String instructorWork) {
        super(id,name, surname, age, salary);
        this.instructorWork=instructorWork;
    }
}
