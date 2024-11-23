package Proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DbReader implements IDbReader {
    private final String url;

    public DbReader() {
        url = "localhost:8080/";
    }
    @Override
    public boolean getConnection(String dbName) {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("databases.txt");
        if (inputStream == null) {
            throw new NullPointerException("Файл не найден");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(dbName)) {
                    System.out.println("Подключено к БД: " + url + dbName);
                    return true;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        throw new NullPointerException("База данных не найдена");
    }
}
