package tutorial2.subLists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.gherasim on 10/16/2015.
 */
public class SublistExample {
    // it`s an arrayList method
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        for (int i=0; i<5;i++)
            array.add("number "+i);
        System.out.println("Currently the list has the following elements"+array);

        //sublist to ArrayList
        ArrayList<String> array2 = new ArrayList<String>(array.subList(0,1));
        System.out.println("Currently the list has the following elements"+array2);

        ArrayList<String> array3 =new ArrayList<String>(array.subList(0, 2));
        System.out.println("Currently the list has the following elements"+array3);

        //sublist to list
        List<String> list = array.subList(0,3);
        System.out.println("this is a list not an arrayList:"+list);
    }

}
