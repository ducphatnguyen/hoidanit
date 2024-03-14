package lab04;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {

    }
    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getTax() {
        return this.tax;
    }

    public Product nhapThongTin(String name, double price, double tax) {
        Product product = new Product(name, price, tax);
        return product;
    }

    public void xuatThongTin(Product product) {
        System.out.println("name = " + product.getName() + " price = " + product.getPrice() + " tax = " + product.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }




}
