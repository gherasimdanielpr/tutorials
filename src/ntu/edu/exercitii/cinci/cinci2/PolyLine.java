package ntu.edu.exercitii.cinci.cinci2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class PolyLine {
    private List<Point> points =new ArrayList<>();

    public PolyLine() {

    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }
    public void appendPoint(int x, int y){
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }
    public void appendPoint(Point point){

        points.add(point);
    }

    @Override
    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }
}
