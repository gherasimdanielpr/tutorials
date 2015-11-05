package ntu.edu.exercitii.trei.tre1;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(1,1,5,6);
        System.out.println(l1);
        System.out.println(l1.getLength());
        l1.setBeginXY(1, 2);
        l1.setEndXY(3, 4);
        System.out.println(l1);

        Point p1 = new Point(3, 0);
        Point p2 = new Point(0, 4);
        Line l2 = new Line(p1,p2);
        System.out.println(l2);
        System.out.println(l2.getLength());
        l2.setBegin(new Point(5,6));
        l2.setEnd(new Point(7,8));
        System.out.println(l2);
    }
}
