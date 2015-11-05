package ntu.edu.exercitii.patru.patru2;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal = new Cat();
        animal.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal1 = new BigDog();
        animal1.greeting();


        // Downcastg(bigDog1);
        Dog dog = (Dog) animal2;
        BigDog bigDog = (BigDog) animal1;
        Cat cat = (Cat) animal;
        dog.greeting(dog1);
        bigDog.greeting();

    }
}
