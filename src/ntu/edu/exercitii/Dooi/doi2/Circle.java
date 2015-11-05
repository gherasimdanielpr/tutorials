package ntu.edu.exercitii.Dooi.doi2;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI *radius;
    }

    @Override
    public String toString() {
        return "A Circle with" +
                "radius=" + radius +
                ", witch is a subclass of "+super.toString()+
                 "  ";
    }
}
