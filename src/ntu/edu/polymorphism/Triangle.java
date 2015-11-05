package ntu.edu.polymorphism;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Triangle extends  Shape {
    // Private member variables
    private int base;
    private int height;

    // Constructor
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle of base=" + base + " and height=" + height + ", subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
