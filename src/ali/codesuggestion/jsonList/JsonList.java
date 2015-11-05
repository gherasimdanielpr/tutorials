package ali.codesuggestion.jsonList;

import ali.codesuggestion.Employee;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.gherasim on 10/22/2015.
 */
public class JsonList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("123", "Kumar Swamy", "Software Engg", "kumar@codesuggestions.com"));
        employees.add(new Employee("124", "Upender Godishala", "Team Lead", "upender@codesuggestions.com"));
        employees.add(new Employee("125", "Phani Rebba", "Project Lead", "phani@codesuggestions.com"));

        JSONObject jsonObject = getJsonFromEmployeeObject(employees);
        System.out.println(jsonObject);

    }

    public static JSONObject getJsonFromEmployeeObject(List<Employee> employees) {
        JSONObject jsonResponse = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        for (Employee employee : employees) {
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("empId", employee.getId());
            jsonObject.put("empName", employee.getName());
            jsonObject.put("designation", employee.getDesignation());
            jsonObject.put("emailId", employee.getEmail());

            jsonArray.put(jsonObject);

        }

        jsonResponse.put("employees", jsonArray);

        return jsonResponse;
        }




}
