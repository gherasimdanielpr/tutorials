package magda.EmployeeDB;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by daniel.gherasim on 11/6/2015.
 */
public class TestDB {

    public static void main(String[] args) {
        DBConnect connect = DBConnect.getInstance();
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();
        String querry =employeeCRUD.createNewPerson("Dan","Dan",12,"date","cooking");
        try {
            ResultSet result = connect.executeQuery(querry);
            System.out.println("querried this to the Db:"+querry);
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }





}
