package ali.codesuggestion;

/**
 * Created by daniel.gherasim on 10/22/2015.
 */
public class Employee {
    private String id;
    private String name;
    private String designation;
    private String email;




    public Employee(String id, String name, String designation, String email){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.email = email;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
