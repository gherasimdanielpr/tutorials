package ali.codesuggestion.jasonMap;
import java.util.HashMap;
import java.util.Map;
import ali.codesuggestion.Employee;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

/**
 * Created by daniel.gherasim on 10/22/2015.
 */
public class JsonMap {

    public static void main(String[] args) {

        Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

        employees.put(1, new Employee("123", "Kumar Swamy", "Software Engg", "kumar@codesuggestions.com"));
        employees.put(2, new Employee("124", "Upender Godishala", "Team Lead", "upender@codesuggestions.com"));
        employees.put(3, new Employee("125", "Phani Rebba", "Project Lead", "phani@codesuggestions.com"));

        JSONObject jsonObject = (JSONObject) JSONSerializer.toJSON(employees);

        //  jsonObject.accumulate(employees);
        System.out.println(jsonObject);

    }
}
