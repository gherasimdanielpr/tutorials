package ntu.edu.exercitii.trei.tre1;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class TestPoint3D {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        System.out.println(p1);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getZ());
        p1.setX(4);
        p1.setY(5);
        p1.setZ(1);
        System.out.println(p1);

    }
}
