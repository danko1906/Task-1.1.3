package jm.task.core.jdbc.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:postgresql://localhost:5432/users_db";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";
    private static final String DRIVER = "org.postgresql.Driver";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER); // гаря, что драйвер зарегается
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); // подключаемя к БД
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
