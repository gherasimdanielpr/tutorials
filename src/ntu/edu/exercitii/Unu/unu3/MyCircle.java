package ntu.edu.exercitii.Unu.unu3;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class MyCircle {
    private MyPoint center;
    private int radius;
    private int x;
    private int y;

    public MyCircle() {
        this.radius = 1;
    }

    public MyCircle(int x,int y,int radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
         }
    public double getArea(){
        return 2*Math.PI*radius*radius;
    }


}
