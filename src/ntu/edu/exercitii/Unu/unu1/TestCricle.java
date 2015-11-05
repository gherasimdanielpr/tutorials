package ntu.edu.exercitii.Unu.unu1;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestCricle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("the circle has radius of "+c1.getRadius()+" and area of" + c1.getArea()+ " color "+c1.getColor());
        Circle c2 = new Circle(2.0);
        System.out.println("the circle has radius of "+c2.getRadius()+" and area of" + c2.getArea()+ " color "+c2.getColor());
        Circle c3 = new Circle(3.0,"blue");
        c3.setColor("yellow");
        c3.setRadius(4.0);
        System.out.println("the circle has radius of "+c3.getRadius()+" and area of" + c3.getArea()+ " color "+c3.getColor());
        Circle c4 = new Circle(5.0);
        System.out.println(c4.toString());
        System.out.println(c4);
        System.out.println("stuff "+ c4);


    }
}
