package com.adriel.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Adriel Rianson 1972040
 */
public class JDBCConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/modelKuis2PBO2",
                    "root", ""
            );
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
