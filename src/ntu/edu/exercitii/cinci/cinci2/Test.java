package ntu.edu.exercitii.cinci.cinci2;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Test {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        System.out.println(polyLine);
        polyLine.appendPoint(2,2);
        polyLine.appendPoint(new Point(1,1));
        polyLine.appendPoint(new Point(4,4));
        System.out.println(polyLine);

    }
}
