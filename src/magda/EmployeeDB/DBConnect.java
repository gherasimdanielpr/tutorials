package magda.EmployeeDB;
import java.sql.*;

/**
 * Created by daniel.gherasim on 11/6/2015.
 */
public class DBConnect {
    private static DBConnect instance;
    Statement statement = null;
    ResultSet resultSet = null;

    private Connection connection = null;
    private DBConnect() {
        connection = null;
    }

    public static DBConnect getInstance(){
        if(instance == null)
        {
            instance = new DBConnect();
            instance.connect();
        }
        return instance;
    }
    public void connect() {
        String url = "jdbc:mysql://localhost:3306/emplyeedb";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try{
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to the Database:");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Statement getStatement() {
        return statement;
    }
    public ResultSet executeQuery(String querry) throws SQLException{
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(querry);
        return resultSet;
    }
    public void execute(String querry) throws SQLException{
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(querry);
    }
}
