package ntu.edu.exercitii.Unu.unu11;

import java.util.Arrays;

/**
 * Created by daniel.gherasim on 10/29/2015.
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = 0;
    }

    public Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
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

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public void printAuthors(){
        for(int i=0; i<=authors.length;i++)
            System.out.println(authors[i]);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(authors) +

                '}';
    }
}
