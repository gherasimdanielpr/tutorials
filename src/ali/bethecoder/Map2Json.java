package ali.bethecoder;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel.gherasim on 10/22/2015.
 */
public class Map2Json {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name","Petrovici");
        map.put("age",2);
        map.put("date",new Date(110, 4, 6));
        map.put("hobby","desen");

        JSONObject jsonObject = (JSONObject) JSONSerializer.toJSON(map);
        System.out.println(jsonObject.toString(2));
    }
}
