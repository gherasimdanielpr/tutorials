package ntu.edu.exercitii.Dooi.doi;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Cylinder extends Circle {  //save as "Cylinder.java"
    private double height;  // private variable

    public Cylinder() {
        super();        // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    public Cylinder(double height) {
        super();        // call superclass no-arg constructor Circle()
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    //override getArea
    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " +super.toString() +
                " height=" + height +
                '}';
    }
}