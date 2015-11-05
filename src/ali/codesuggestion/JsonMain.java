package ali.codesuggestion;

import net.sf.json.JSONObject;

/**
 * Created by daniel.gherasim on 10/22/2015.
 */
public class JsonMain {
    public static void main(String[] args){
        JSONObject jsonObject = new JSONObject();
        Employee employee = new Employee("123", "Kumar Swamy", "Software Engg", "kumar@codesuggestions.com");

        jsonObject.put("empName", employee.getName());
        jsonObject.put("empId", employee.getId());

        jsonObject.put("designation", employee.getDesignation());
        jsonObject.put("emailId", employee.getEmail());

        System.out.println("Output: " + jsonObject);
        }
}
