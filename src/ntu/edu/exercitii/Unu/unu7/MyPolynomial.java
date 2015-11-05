package ntu.edu.exercitii.Unu.unu7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public MyPolynomial(String filename){
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int degree = in.nextInt();
        coeffs = new double[degree+1];
        for (int i=0;i<coeffs.length;++i){
            coeffs[i] = in.nextDouble();
        }
    }

}
