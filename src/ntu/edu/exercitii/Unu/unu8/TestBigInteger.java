package ntu.edu.exercitii.Unu.unu8;

import java.math.BigInteger;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger bigInteger1 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
    }
}
