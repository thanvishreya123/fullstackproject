package fullstack;

public class Product {
    private String productName;
    private String productPrice;
    private String productImage;

    // Constructor
    public Product(String productName, String productPrice, String productImage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    // Default Constructor
    public Product() {}

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
