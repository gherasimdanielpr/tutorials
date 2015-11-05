package ntu.edu.exercitii.Unu.unu6;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double iamg) {
        this.real = real;
        this.imag = iamg;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getIamg() {
        return imag;
    }

    public void setIamg(double iamg) {
        this.imag = iamg;
    }
    public void setValue(double real, double imag){
        this.imag = imag;
        this.real = real;
    }
    public boolean isReal(){
        if(imag == 0)
            return true;
        return false;
    }
    public boolean isImaginary(){
        if(imag != 0)
            return true;
        return false;
    }

    public  boolean equals(MyComplex another){
        if (this.imag == another.imag && this.real == another.real)
            return true;
        return false;
    }
    public double magnitude(){
        return Math.sqrt(this.real + this.imag);
    }
    public  double argumentInRadians(){
        return Math.atan2(real, imag);
    }
    public MyComplex conjugate(){
        return new MyComplex(real,-imag);
    }


    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", iamg=" + imag +
                '}';
    }
}
