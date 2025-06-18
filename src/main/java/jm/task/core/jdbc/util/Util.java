package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
;import static java.lang.Class.forName;

public class Util {
    // реализуйте настройку соеденения с БД
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "Local instance MySQL80";
    private final String LOGIN = "root";
    private final String PASS = "root";

    public Connection getConnection() {
        Connection connection = null;
        try {
            ;
            Class.forName("com.mysql.jdbc.Driver");
            ;
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME, LOGIN, PASS);
            System.out.println("Connection OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection ERROR");
        }
        return connection;
    }
}
