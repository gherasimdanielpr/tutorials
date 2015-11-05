package ali;
import net.sf.json.JSONObject;
/**
 * Created by daniel.gherasim on 10/21/2015.
 */

public class First {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "Sriram");
        obj.put("age", 2);
        obj.put("hobby", "painting");

        System.out.println(obj.toString(2)); //pretty print with indent
    }

}
