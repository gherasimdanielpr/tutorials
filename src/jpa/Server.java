package jpa;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by daniel.gherasim on 10/23/2015.
 */
public class Server {

    public static String processing(String stringJson) {
        //String to Json
        JSONObject sentJson = (JSONObject) JSONSerializer.toJSON(stringJson);
        //Json to object Product
        Product sentProduct = new Product();
        sentProduct.setNume(sentJson.getString("nume"));
        sentProduct.setIdProduct(sentJson.getInt("idProduct"));

        String enumString = sentJson.getString("size");
        sentProduct.setSize(Product.Size.valueOf(enumString));

        String sentDate = sentJson.getString("dataFabricatiei");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date sentFormatedDate = df.parse(sentDate);
            sentProduct.setDataFabricatiei(sentFormatedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        JSONArray jsonArray = sentJson.getJSONArray("color");
        List<String> colorList = new ArrayList<>();
        for(int i=0; i<colorList.size();i++){
            colorList.add((String )jsonArray.get(i));
        }
        sentProduct.setColor(colorList);
        return sentProduct.toString();

    }


}
