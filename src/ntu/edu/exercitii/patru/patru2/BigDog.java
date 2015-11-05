package ntu.edu.exercitii.patru.patru2;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}
