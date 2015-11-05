package jpa;

import java.util.Date;
import java.util.List;

/**
 * Created by daniel.gherasim on 10/23/2015.
 */
public class Product {
    private int idProduct;
    private String nume;
    private Date dataFabricatiei;
    private List<String> color;
    public enum Size{
        Big,
        Small,
        Medium
    }
    private Size size;

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public Product(int idProduct, String nume, Date dataFabricatiei, List<String> color, Size size) {
        this.idProduct = idProduct;
        this.nume = nume;
        this.dataFabricatiei = dataFabricatiei;
        this.color = color;
        this.size = size;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getDataFabricatiei() {
        return dataFabricatiei;
    }
    public void setDataFabricatiei(Date dataFabricatiei) {
        this.dataFabricatiei = dataFabricatiei;
    }

    public List<String> getColor() {
        return color;
    }
    public void setColor(List<String> color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nume='" + nume + '\'' +
                ", dataFabricatiei=" + dataFabricatiei +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
