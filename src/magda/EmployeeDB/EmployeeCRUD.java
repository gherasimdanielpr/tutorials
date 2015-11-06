package magda.EmployeeDB;



import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by daniel.gherasim on 11/5/2015.
 */
public class EmployeeCRUD {
    DBConnect DBConn;

    public DBConnect getDBConn() {
        return DBConn;
    }
    public void setDBConn(DBConnect DBConn) {
        this.DBConn = DBConn;
    }

    public Person getPerson(String nume){
        try{
            ResultSet resultSet = DBConn.executeQuery("select * form emplyeesdb.employees where nume = "+nume);
            while (resultSet.next()){
                Person person = new Person(resultSet.getString("nume"),
                                            resultSet.getString("prenume"),
                                            resultSet.getInt("age"),
                                            resultSet.getString("dataNasterii"),
                                            resultSet.getString("skills"));
                System.out.println("Person taken");
                return person;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    return null;
    }

    public String createNewPerson(String nume,String prenume, int age, String dataNasterii,String skills){
        String querry = "INSERT INTO emplyeedb.employees (nume,prenume,age,dataNasterii,skills) VALUES " +
                "('"+nume+"','"+prenume+"',"+age+",'"+dataNasterii+"','"+skills+"')";
        System.out.println(querry);

        return querry;
    }





}
