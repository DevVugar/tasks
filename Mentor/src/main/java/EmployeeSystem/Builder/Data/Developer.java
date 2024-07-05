package Data;

import java.io.Serializable;

public class Developer extends Employee implements Serializable {
    private String developerWork;



    public Developer(int id,String name, String surname, int age, double salary, String developerWork) {
        super(id,name, surname, age, salary);
        this.developerWork=developerWork;
    }

    public String getDeveloperWork() {
        return developerWork;
    }

    public void setDeveloperWork(String developerWork) {
        this.developerWork = developerWork;
    }
}
