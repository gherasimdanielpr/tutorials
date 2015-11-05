package ntu.edu.Wrapping.teorie.unu.unu1;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class TestCircleWithCount {
    public static void main(String[] args) {
        CircleWithCount circleWithCount = new CircleWithCount(1.0);
        System.out.println(circleWithCount);
        System.out.println("number of instances(circles created):"+CircleWithCount.count);
        CircleWithCount circleWithCount1 = new CircleWithCount(2.0);
        System.out.println(circleWithCount1);
        System.out.println("number of instances(circles created):"+CircleWithCount.count);
    }
}
