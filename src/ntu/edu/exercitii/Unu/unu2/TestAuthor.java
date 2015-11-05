package ntu.edu.exercitii.Unu.unu2;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("marius marius", "to@to", 'm');
        System.out.println(author);
        author.setEmail("r@r");
        System.out.println(author);
    }
}
