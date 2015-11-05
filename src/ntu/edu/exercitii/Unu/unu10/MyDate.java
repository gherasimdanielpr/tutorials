package ntu.edu.exercitii.Unu.unu10;

import java.util.Arrays;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    private String[] strMonths={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"} ;
    private String[] strDays={"Sunday","Monday","Tuesday","Wednsday","Thuesday","Friday","Saturday"};
    private int daysInMonth[] ={31,28,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeapYear(int year){
        boolean isLeapYear = ((year%4 == 0)&&(year %100!=0)||(year%400 == 0));
        if (isLeapYear)
            return true;
        else
            return false;
    }

     public boolean isValidDate(int year, int month, int day){
         boolean isValidYear = ((year>=1)&&(year<=9999));
         boolean isValidMonth = ((month<=12) && (month>=1));
         if(month == 1 || month ==3 || month == 5 || month==7 || month ==8 ||month ==10){
             boolean isValid = ((day>=1)&&(day<=31));
             if(isValid)
                 return true;
             else
                 return false;
         }
         else if (isLeapYear(year)&&month == 12){
              boolean isValid2 = ((day>=1)&&(day<=31));
             if(isValid2)
                 return true;
             else
                 return false;
         }
         if (isValidMonth||isValidYear)
             return true;
         else
             return false;

     }

    public MyDate(int year, int month, int day) {
        setDate(year,month,day);
    }
    public void setDate(int year, int month, int day) {
        if(isValidDate(year,month,day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", strMonths=" + Arrays.toString(strMonths) +
                ", strDays=" + Arrays.toString(strDays) +
                ", daysInMonth=" + Arrays.toString(daysInMonth) +
                '}';
    }
}
