package tutorial2;

import java.util.ArrayList;

/**
 * Created by daniel.gherasim on 10/16/2015.
 */
public class ArrayListExample {
    // fixwed length
    //dinamically grow and shrink
    //example

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Ana");
        obj.add("are");
        obj.add("foarte multe");
        obj.add("mere");
        System.out.println("Currently the list has the following elements"+obj);
        //for (int i = 0;i<=100;i++)
          //  obj.add("mar "+i);

       //add
        obj.add(2,"sters");
        System.out.println("Currently the list has the following elements"+obj);
        //remove
        obj.remove(1);
        obj.remove("sters");
        System.out.println("Currently the list has the following elements"+obj);
        //replace(set)
        obj.set(2, "Tom");
        //index
        int pos = obj.indexOf("Tom");
        //returns objet from idex
        String str= obj.get(2);
        //sizw
        int numberofitems = obj.size();
        //return 1 or 0 boolean
        obj.contains("Steve");
        //clear
        obj.clear();

    }





}
