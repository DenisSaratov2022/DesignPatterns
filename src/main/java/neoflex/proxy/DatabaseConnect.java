package neoflex.proxy;

public class DatabaseConnect {
    public static void main(String[] args) {
        DatabasesReader databasesReader = new DatabasesReader();
        DataBaseProxy dataBaseProxy = new DataBaseProxy(databasesReader);
        System.out.println(dataBaseProxy.getDatabase(1));
        System.out.println(dataBaseProxy.getDatabase(1));
    }
}
