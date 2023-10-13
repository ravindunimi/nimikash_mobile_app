package com.nimikash.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection(String host, String port, String databaseName, String username, String password) throws SQLException {
//        String url = "jdbc:postgresql://" + "nimikash-qa.ckb6drg41mil.us-east-2.rds.amazonaws.com" + ":" + "5432" + "/" + "nimikash-qa.ckb6drg41mil.us-east-2.rds.amazonaws.com";
//
//        username = "postgres";
//        password = "SwKD2ZnLBhumxi5";
//
//        return DriverManager.getConnection(url, username, password);
        String url = "jdbc:postgresql://" + host + ":" + port + "/" + databaseName;
        return DriverManager.getConnection(url, username, password);
    }

}
