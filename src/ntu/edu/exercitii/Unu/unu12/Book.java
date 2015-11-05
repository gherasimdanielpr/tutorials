package ntu.edu.exercitii.Unu.unu12;


import java.util.Arrays;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Book {
    private String name;
    private Author[] authors = new Author[5];
    private double price;
    private int numAuthors=0;
    private int qtyInStock;

    public Book(String name, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = 0;
    }

    public Book(String name, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    public void addAuthor(Author author) {
        authors[numAuthors] = author;
        ++numAuthors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", numAuthors=" + numAuthors +
                ", qtyInStock=" + qtyInStock +
                '}';
    }
}
