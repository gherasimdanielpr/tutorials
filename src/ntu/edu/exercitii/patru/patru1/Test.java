package ntu.edu.exercitii.patru.patru1;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Test {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red",4,5);
        System.out.println(s1);
        System.out.println("area is " +s1.getArea());
        Shape s2 = new Triangle("blue",4,5);
        System.out.println(s2);
        System.out.println("area is "+ s2.getArea());
        // Constructing a Shape instance poses problem!

    }
}
