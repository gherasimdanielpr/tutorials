package ntu.edu.exercitii.Unu.unu11;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class TestBook {
    public static void main(String[] args) {


    Author[] authors = new Author[2];
    authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();

    }
}
