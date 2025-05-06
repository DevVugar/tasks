package solid.dependencyInvesion.bad;

public class DataManager {
    private MySQLDatabase database;

    public DataManager() {
        this.database = new MySQLDatabase();
    }

    public void saveData(String data) {
        database.save(data);
    }
}