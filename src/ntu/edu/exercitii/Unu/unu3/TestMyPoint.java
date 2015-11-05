package ntu.edu.exercitii.Unu.unu3;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestMyPoint {
    public static void main(String[] args) {


        MyPoint myPoint = new MyPoint(2, 3);
        MyPoint myPoint1 = new MyPoint(0, 2);
        MyPoint myPoint2 = new MyPoint();

        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint.distance(1,2));

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i<10; i++){
            points[i] = new MyPoint(i+1,i+1);
            System.out.println(points[i].toString());
        }

    }

}
