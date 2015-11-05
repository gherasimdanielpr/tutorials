package ntu.edu.exercise33;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class test {
    public static void main(String[] args) {
        Shape shape = new Shape("yellow",false);

        System.out.println(shape.toString());
        Circle circle = new Circle(shape.getColor(),shape.isFilled(),3.0);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(shape.getColor(), shape.isFilled(),4,5);
        System.out.println(rectangle.toString());
        Square square = new Square(shape.getColor(),shape.isFilled(),rectangle.getLength());
        System.out.println(square.toString());
    }
}
