package neoflex.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DatabasesReader implements IDatabasesReader {

    @Override
    public String getDatabase(int number) {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("Databases.txt");
        if (inputStream == null) {
            throw new NullPointerException("Файл не найден");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String dataBase;
        int index = 0;

        try {
            while (((dataBase = bufferedReader.readLine()) != null)) {
                if (number == index++) {
                    System.out.println("Считали название бд из файла");
                    return dataBase;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new NullPointerException("База данных не найдена");
    }
}
