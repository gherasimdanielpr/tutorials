package JDBC;

import java.sql.*;


/**
 * Created by daniel.gherasim on 11/4/2015.
 */
public class JdbcUpdate {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root","");
            Statement statement = connection.createStatement();)
        {
            String strUpdate = "update books set price = price*0.7, qty = qty+1 where id = 1001";
            System.out.println("The SQL query is: " + strUpdate);
            int countUpdated = statement.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.");
            String query2 = "select * from books";
            ResultSet resultSet1= statement.executeQuery(query2);
            while(resultSet1.next()) {   // Move the cursor to the next row
                System.out.println(resultSet1.getInt(1) + ", "
                        + resultSet1.getString(2) + ", "
                        + resultSet1.getString(3) + ", "
                        + resultSet1.getDouble(4) + ", "
                        + resultSet1.getInt(5));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
