package Proxy;

import java.util.ArrayList;
import java.util.List;

public class DbReaderProxy implements IDbReader {
    private final DbReader dbReader;
    private final List<String> dbList;
    private final String url;

    public DbReaderProxy(DbReader dbReader) {
        this.dbReader = dbReader;
        dbList = new ArrayList<>();
        url = "localhost:8080/";
    }
    @Override
    public boolean getConnection (String dbName) {
        System.out.println("Trying to connect to DB " + dbName + "...");
        if (!this.dbList.contains(dbName)) {
            dbReader.getConnection(dbName);
            dbList.add(dbName);
        } else {
            System.out.println("Подключено к БД: proxy." + url + dbName);
        }
        return true;
    }
}
