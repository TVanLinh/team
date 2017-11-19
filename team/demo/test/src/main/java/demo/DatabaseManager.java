package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by linhtran on 08/08/17.
 */
public class DatabaseManager {
    private final String url = "jdbc:mysql://localhost:3306/banhang?jdbc:mysql://localhost:3306=UTC";
    private Connection connections;

    public Connection getConnection() throws SQLException {
        if (this.connections != null) {
            return this.connections;
        } else {
                this.connections = DriverManager.getConnection(this.url, "root","");


        }
        return this.connections;
    }


    public void loadConfigUrl() {
        Properties properties = new Properties();
        try {

//            InputStream inputStream = new FileInputStream("database.properties");
            InputStream in = getClass().getResourceAsStream("/database.properties");
            properties.load(in);
            System.out.println(properties.getProperty("msql.url"));
            System.out.println(properties.getProperty("msql.userName"));
            System.out.println(properties.getProperty("msql.passWord"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        (new DatabaseManager()).loadConfigUrl();
    }
}
