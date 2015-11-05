package ntu.edu.Wrapping.teorie.unu.unu2;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class StaticInitializer {
    static int number; //a static variable
    static {            // a static initializer block - run only once when the class is loaded
        number = 88;
        System.out.println(number);
    }
}
