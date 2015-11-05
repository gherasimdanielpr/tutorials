package ntu.edu.exercitii.Unu.unu6;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex myComplex = new MyComplex(2.1, 2.2);
        System.out.println(myComplex.toString());
        System.out.println(myComplex.argumentInRadians());
        System.out.println(myComplex.conjugate());
        System.out.println(myComplex.equals(new MyComplex(2.1,2.2)));
        System.out.println(myComplex.isReal());
        System.out.println(myComplex.magnitude());
    }
}
