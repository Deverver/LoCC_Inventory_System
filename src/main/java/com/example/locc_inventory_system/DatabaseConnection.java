package com.example.locc_inventory_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String host = "w";

    private static final String userName = "w";

    private static final String userPass = "w";


    public Connection getConnection() {
        try {
            return DriverManager.getConnection(host, userName, userPass);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }// Connection end



}// End
