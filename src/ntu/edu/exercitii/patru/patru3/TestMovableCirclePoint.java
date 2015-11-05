package ntu.edu.exercitii.patru.patru3;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class TestMovableCirclePoint {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5,6,10,10);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2,1,2,2,1);
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);

        Movable m3 =new MovableRectangle(new MovablePoint(2,2,2,2),new MovablePoint(1,1,1,1));
        System.out.println(m3);
        m3.moveRight();
        System.out.println(m3);



    }
}
