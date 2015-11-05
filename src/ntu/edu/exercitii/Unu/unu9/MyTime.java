package ntu.edu.exercitii.Unu.unu9;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class MyTime {
    private  int hour;
    private int minute;
    private  int second;

    public MyTime() {
    }

   /* public MyTime(int hour, int minute, int second) {
        if ((hour<=23 && hour>=0)&&(minute<=59 && minute>=0)&&(second<=59 && second>=0)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else
            throw new RuntimeException("give a valid time");

    }*/
    public void setTime(int hour, int minute, int second){
        if (hour<=23 && hour>=0)
        this.hour = hour;
        else if(hour == 24)
            this.hour = 0;

        if (minute<=59 && minute>=0)
            this.minute = minute;
        else    if(minute ==60) {
            this.minute = 0;
            this.hour++;
        }

        this.minute = minute;
        if (second<=59 && second>=0)
        this.second = second;
        else if (second == 60){
            this.second = 0;
            this.minute++;
        }
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }


    public String nextSecond(){
    setTime(this.hour,this.minute,this.second++);
    return  toString();
    }
    public String nextMinute(){
        setTime(this.hour,this.minute++,this.second);
        return  toString();
    }
    public String nextHour(){
        setTime(this.hour++,this.minute,this.second);
        return  toString();
    }

    public String previousSecond(){
        setTime(this.hour,this.minute,--this.second);
        return  toString();
    }
    public String previousMinute(){
        setTime(this.hour,--this.minute,this.second);
        return  toString();
    }
    public String previousHour(){
        setTime(--this.hour,this.minute,this.second);
        return  toString();
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
