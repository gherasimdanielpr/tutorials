package ntu.edu.exercitii.Unu.unu3;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle(new MyPoint(0, 0), 2);
        System.out.println(myCircle);
        System.out.println("radius " +myCircle.getRadius()+ " and area "+myCircle.getArea());

    }

}
