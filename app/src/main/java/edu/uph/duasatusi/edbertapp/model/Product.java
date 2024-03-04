package edu.uph.duasatusi.edbertapp.model;

public class Product {

    private final String productName;
    private final int productPrice;
    private final int productImage;

    public Product(String productName, int productPrice, int productImage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }


    public int getProductPrice() {
        return productPrice;
    }


    public int getProductImage() {
        return productImage;
    }

}
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//    public void setProductPrice(int productPrice) {
//        this.productPrice = productPrice;
//    }
//    public void setProductImage(int productImage) {
//        this.productImage = productImage;
//    }