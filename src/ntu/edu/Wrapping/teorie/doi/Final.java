package ntu.edu.Wrapping.teorie.doi;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Final {
    public static final int MAX = 123;
    public static void main(String[] args) {
        System.out.println(MAX);
        final StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(",world");  /// can append
        System.out.println(stringBuffer);
        //compilation error
        //stringBuffer = new StringBuffer("word");
    }
}
