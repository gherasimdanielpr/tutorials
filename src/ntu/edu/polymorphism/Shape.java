package ntu.edu.polymorphism;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Shape {
    // Private member variable
    private String color;

    // Constructor
    public Shape (String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape of color=\"" + color + "\"";
    }

    // All shapes must has a method called getArea()
    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;   // Need a return to compile the program
    }
}
