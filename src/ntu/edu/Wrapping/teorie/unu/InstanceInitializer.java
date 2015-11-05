package ntu.edu.Wrapping.teorie.unu.unu4;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class InstanceInitializer {
    int number;     // an instance variable
    {               // an instance initializer block - run once per instantiation
        number = 88;
        System.out.println("Creating an instance...");
    }

    public InstanceInitializer(int number) {
        super();// run instance initializer before the body of the constructor
    }

}
