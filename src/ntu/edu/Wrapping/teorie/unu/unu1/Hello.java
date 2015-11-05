package ntu.edu.Wrapping.teorie.unu.unu1;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Hello {
    private static String msgStatic = "hello static";
    private String msgInstance = "hello non-static";

    public static void main(String[] args) {
        System.out.println(msgStatic);
        //System.out.println(msgInstance); error
    }
}
