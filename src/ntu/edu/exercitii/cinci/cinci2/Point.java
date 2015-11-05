package ntu.edu.exercitii.cinci.cinci2;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Point {
    private int x;
    private int y;;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
