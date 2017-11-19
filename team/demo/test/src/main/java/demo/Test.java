package demo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by linhtran on 08/08/17.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        DatabaseManager databaseManager = new DatabaseManager();
        Connection connections = null;
        try {
            connections = databaseManager.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(connections);
    }
}
