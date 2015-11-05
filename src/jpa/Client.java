package jpa;

import net.sf.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by daniel.gherasim on 10/23/2015.
 */
public class Client {


    public static  String processing()
    {
        try {

            //Creare Obiect
            List<String> list = new ArrayList<String>();
            list.add("blue");
            list.add("grey");
            list.add("green");

            Product.Size size;
            size = Product.Size.Big;

            Product product = new Product();
            product.setNume("doll");
            product.setColor(list);
            product.setDataFabricatiei(new Date());
            product.setIdProduct(2);
            product.setSize(size);


            //Creare Json
            Date todayDate = product.getDataFabricatiei();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formatedDate = dateFormat.format(todayDate);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("nume", product.getNume());
            jsonObject.put("color", product.getColor());
            jsonObject.put("dataFabricatiei", formatedDate);
            jsonObject.put("size", product.getSize().toString());
            jsonObject.put("idProduct", product.getIdProduct());

            //Return string
            //System.out.println("Json from client:"+jsonObject);
            return jsonObject.toString();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


}
