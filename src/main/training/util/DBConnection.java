package src.main.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public DBConnection() throws SQLException {
    }

    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kldb", "root", "root");
        System.out.println(con);
        return con;
    }
}
