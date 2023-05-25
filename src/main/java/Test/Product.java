package Test;

public class Product {
    private String nameProduct;
    private Double price;

    public Product(String nameProduct, Double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Наименование " + nameProduct + " - " + price + " Руб. ";
    }
}
