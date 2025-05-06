package solid.dependencyInvesion.good;

public class MySQLDatabase implements Database{
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}
