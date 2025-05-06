package solid.dependencyInvesion.good;

public class DataManager {
    private Database database;

    public DataManager() {
        this.database = new MySQLDatabase();
    }

    public void saveData(String data) {
        database.save(data);
    }
}