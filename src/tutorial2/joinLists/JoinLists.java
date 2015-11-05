package tutorial2.joinLists;

import java.util.ArrayList;

/**
 * Created by daniel.gherasim on 10/21/2015.
 */
public class JoinLists {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<String>();
        for(int i = 0; i<=5; i++)
            array1.add("Jhonn "+i);
        ArrayList<String> array2 = new ArrayList<String>();
        for(int i = 6; i<=10; i++)
            array2.add("Jhonn "+i);
        System.out.println("array 1 "+array1);
        System.out.println("array 2 "+array2);

        ArrayList<String> array3 = new ArrayList<String>();
        array3.addAll(array1);
        array3.addAll(array2);
        System.out.println("array 3 "+array3);

    }
}
