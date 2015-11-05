package ntu.edu.exercitii.patru.patru4;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Circle implements GeometricObject {

    protected double radius;

    public Circle() {
        this.radius =1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
