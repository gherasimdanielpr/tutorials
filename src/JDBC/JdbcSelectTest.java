package JDBC;
import java.sql.*;
/**
 * Created by daniel.gherasim on 11/4/2015.
 */
public class JdbcSelectTest {
    public static void main(String[] args) {
        //1. Connection  object + Statement Object
        //2. SQL Query + create a result object

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root","");
            Statement statement = connection.createStatement();                                            )
        {
            //String query1 = "select title, price, qty from books";
            String query2 = "select * from books";
            System.out.println("the query is:"+query2);
            System.out.println();

            //ResultSet resultSet = statement.executeQuery(query1);
            ResultSet resultSet1= statement.executeQuery(query2);
            System.out.println("the records selected are:");

            int count = 0;
            while (resultSet1.next()){
                int id = resultSet1.getInt(1);
                String title = resultSet1.getString(2);
                String author = resultSet1.getString(3);
                double price = resultSet1.getDouble(4);
                int qty = resultSet1.getInt(5);
                System.out.println(id+"\t"+title+"\t"+author+"\t"+price+"\t"+qty);
                ++count;
            }
            System.out.println("Total number of records = " + count);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
