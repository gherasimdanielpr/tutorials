package ntu.edu.exercitii.Unu.unu2;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("jhon","gon@go",'m');
        Book book = new Book("Gone with",author,20.0);
        Book book1 = new Book("more java",new Author("boo","2@2",'f'),3.0,88);

        System.out.println(book.toString());
        System.out.println(book1.toString());
        System.out.println(book.getAuthor().getName()+" "+book.getAuthor().getEmail());
        System.out.println(book1.getAuthor().getName()+" "+book1.getAuthor().getEmail());


    }
}
