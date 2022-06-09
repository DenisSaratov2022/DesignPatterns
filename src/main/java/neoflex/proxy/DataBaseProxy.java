package neoflex.proxy;

import java.util.HashMap;
import java.util.Map;

public class DataBaseProxy implements IDatabasesReader{

    private DatabasesReader databasesReader;
    private Map<Integer, String> cache;

    public DataBaseProxy(DatabasesReader databasesReader) {
        this.databasesReader = databasesReader;
        cache = new HashMap<>();
    }

    @Override
    public String getDatabase(int number) {
        if (!cache.containsKey(number)) {
            String dataBase = databasesReader.getDatabase(number);
            cache.put(number, dataBase);
            return dataBase;
        }
        System.out.println("Считали название бд из кеша");
        return "localhost:port/"+cache.get(number);
    }
}
