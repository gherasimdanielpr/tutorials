package ntu.edu.exercitii.Unu.unu13;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1,1,1,2,-2);
        System.out.println(ball);
        ball.move();
        System.out.println(ball);
        ball.reflectHorizontal();
        System.out.println(ball);
        ball.reflectVertical();
        System.out.println(ball);

        Ball ball1 = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball); // manual check the position of the ball
        }

    }
}
