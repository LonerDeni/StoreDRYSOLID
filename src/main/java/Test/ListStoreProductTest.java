package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListStoreProductTest {

    private Map<Product, Integer> listProduct = new HashMap<>();


    public void addProduct(Product product, Integer amount) {
        listProduct.put(product, amount);
    }

    public void deleteCountProduct(Product product, int count) {
        for (Map.Entry<Product, Integer> delProducte : listProduct.entrySet()) {
            if (delProducte.getKey().equals(product)) {
                listProduct.put(product, delProducte.getValue() - count);
            }
        }
    }

    public void getListProduct() {
        for (Map.Entry<Product, Integer> product : listProduct.entrySet()) {
            System.out.println(product);
        }
    }

    public Map.Entry<Product, Integer> getProduct(String nameProduct) {
        for (Map.Entry<Product, Integer> product : listProduct.entrySet()) {
            if (product.getKey().getNameProduct().toLowerCase().contains(nameProduct.toLowerCase())) {
                return product;
            }
        }
        return null;
    }
}