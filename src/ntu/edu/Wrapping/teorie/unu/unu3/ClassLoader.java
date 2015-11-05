package ntu.edu.Wrapping.teorie.unu.unu3;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class ClassLoader {
    //loads a class into memory+initializes static valuesin order
    private static int number1 = 11;
    static {
        number1 = 99;
        number2 = 88;//passes by becouse it`s not initialized
    }
    private static int number2 =22;

    public static void main(String[] args) {
        System.out.println("number1:"+number1);
        System.out.println("number2:"+number2);

    }


}
