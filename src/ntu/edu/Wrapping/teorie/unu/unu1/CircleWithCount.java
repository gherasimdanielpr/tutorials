package ntu.edu.Wrapping.teorie.unu.unu1;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class CircleWithCount {
    static int count = 0;
    private  double radius;

    public CircleWithCount(double radius) {
        ++count;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleWithCount{" +
                "radius=" + radius +
                '}';
    }
}
