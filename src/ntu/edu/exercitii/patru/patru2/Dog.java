package ntu.edu.exercitii.patru.patru2;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}
