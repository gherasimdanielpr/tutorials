package ntu.edu.exercitii.Unu.unu3;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setX(x1);
        this.v1.setY(y1);
        this.v2.setXY(x2,y2);
        this.v3.setXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double getPerimeter(){
        return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
    }
    public String printType(){
        if (v1.distance(v2) == v1.distance(v3) && v1.distance(v3) == v2.distance(v3))
            return "equilateral";

            return "scalene";
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
}
