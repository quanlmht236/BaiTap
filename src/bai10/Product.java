package bai10;

public class Product {
    private String description;
    private String ProductID;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", ProductID='" + ProductID + '\'' +
                ", price=" + price +
                '}';
    }

    public Product() {
    }

    public Product(String description, String productID, double price) {
        this.description = description;
        ProductID = productID;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
