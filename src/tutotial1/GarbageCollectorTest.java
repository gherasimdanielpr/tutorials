package tutotial1;

/**
 * Created by daniel.gherasim on 10/16/2015.
 */
public class GarbageCollectorTest {
    static int removedObjects;
    public static class Flower{
        String name;
        Flower(String name){
            this.name = name;
        }
        protected void finalize(){
            removedObjects++;
            System.err.println("The flower "+name+" is removed. Number of removed flowers is "+removedObjects);
        }
    }
    public static void main(String[] args) {
        Flower myF = null;
        for(int i=0;i<10000;i++)
            myF = new Flower(" Flower "+i);
    }
}
