package ntu.edu.exercitii.Unu.unu3;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestMyTriangle {
    public static void main(String[] args) {
        //MyTriangle myTriangle = new MyTriangle(1,2,1,2,1,2);
        MyTriangle myTriangle1 = new MyTriangle(new MyPoint(2,2),new MyPoint(2,2),new MyPoint(2,2));

        System.out.println(myTriangle1);
        System.out.println("perimeter:"+myTriangle1.getPerimeter());
        System.out.println("type:"+myTriangle1.printType());
    }
}
