package com.endava.utils;

import java.sql.*;

public class DataBase {
    public static Connection getConnection() throws SQLException {
        //connect to database
       // Class.forName("oracle.jdbc.OracleDriver");
        String serverName = "localhost";
        String portNumber = "1521";
        String sid = "juno";
        //jdbc:oracle:thin:@localhost:1521:juno
        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
        String username = "SYSTEM";
        String password = "Admon";
        return DriverManager.getConnection(url, username, password);
    }
}
