package ntu.edu.exercitii.Unu.unu9;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime();
        myTime.setHour(59);
        myTime.setMinute(59);
        myTime.setSecond(59);

        System.out.println(myTime);
        System.out.println(myTime.nextHour());
    }
}
