package ntu.edu.exercitii.patru.patru4;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class TestCircle {
    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle(2);
        System.out.println(geometricObject);
        System.out.println("area : "+geometricObject.getArea());
        System.out.println("perimeter:"+ geometricObject.getPerimeter());

        GeometricObject geometricObject1 = new ResizableCircle(3);

    }
}
