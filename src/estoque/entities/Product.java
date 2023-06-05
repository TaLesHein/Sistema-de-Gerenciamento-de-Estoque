package estoque.entities;

/*
 * Classe destinada a criação e manipulação do objeto Product
 */
public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {

        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void infoProduct() {

        System.out.println("Product Data: " + getName() + ", " + getQuantity() + " units, " + totalValueStock());

    }

    public void infoProduct(String txt) {

        System.out.println(txt + getName() + ", " + getQuantity() + ", " + totalValueStock());

    }

    public double totalValueStock() {

        return this.quantity * price;
    }

    public void addProducts(int quantity) {

        this.quantity += quantity;
        infoProduct("Update Data: ");
    }

    public void removeProducts(int quantity) {

        this.quantity -= quantity;
        infoProduct("Update Data: ");
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
