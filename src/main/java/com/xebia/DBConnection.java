package com.xebia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection()
            throws SQLException {

        String url = "jdbc:mysql://localhost:3306/demo_app";
        String username = "root";
        String password = "Root@1234";

        return DriverManager.getConnection(
                url, username, password
        );
    }
}
