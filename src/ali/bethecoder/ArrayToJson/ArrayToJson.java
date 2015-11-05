package ali.bethecoder.ArrayToJson;

import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;

/**
 * Created by daniel.gherasim on 10/22/2015.
 */
public class ArrayToJson {
    public static void main(String[] args) {
        Object [] genArray = new Object [] {
                "one",
                new Integer(2),
                new Long(3),
                new Double(4.26),
                true,
                new char [] { 'A', 'B', 'C' }
        };

        JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON(genArray);
        System.out.println(jsonArray.toString(2));
    }
}
