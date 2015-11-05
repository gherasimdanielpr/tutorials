package JDBC;

import java.sql.*;

/**
 * Created by daniel.gherasim on 11/4/2015.
 */
public class ConnectionManager {
    public static String url = "jdbc:mysql://localhost:3306/ebookshop";
    public static String username = "root";
    public static String password = "";
    public static Connection connection;

    public static Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection(url,username,password);

        } catch (SQLException ex){
            System.out.println("Failed to connect");
        }
        return connection;
    }

}
