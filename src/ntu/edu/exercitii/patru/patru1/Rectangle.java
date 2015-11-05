package ntu.edu.exercitii.patru.patru1;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Rectangle extends Shape {
    // Private member variables
    private int length;
    private int width;

    // Constructor
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle of length=" + length + " and width=" + width + ", subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
