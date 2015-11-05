package ntu.edu.Wrapping.teorie.wrapping;

/**
 * Created by daniel.gherasim on 11/4/2015.
 */
public class Wrap {
    public static void main(String[] args) {
        Integer integer = new Integer(8163);
        int i = integer.intValue();
        short s = integer.shortValue();
        byte b = integer.byteValue();
        System.out.println(i+" "+s+ " "+ b);
        Double aDouble = new Double(22.11);
        double d = aDouble.doubleValue();
        int i1 =aDouble.intValue();
        System.out.println(d+" "+i1+ " ");
        Character character = new Character('z');
        char c = character.charValue();
        Boolean aBoolean = new Boolean(false);
        boolean v =aBoolean.booleanValue();
        System.out.println(c+" "+v+ " ");

        // Integer class
        System.out.println(Integer.MAX_VALUE);   // 2147483647
        System.out.println(Integer.MIN_VALUE);   // -2147483648
        System.out.println(Integer.SIZE);        // 32
// Double class
        System.out.println(Double.MAX_VALUE);    // 1.7976931348623157E308
        System.out.println(Double.MIN_VALUE);    // 4.9E-324
        System.out.println(Double.SIZE);         // 64
        System.out.println(Double.MAX_EXPONENT); // 1023
        System.out.println(Double.MIN_EXPONENT); // -1022
        System.out.println(Short.MAX_VALUE);   //32767

    }
}
