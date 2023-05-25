package Test;

import java.util.HashMap;
import java.util.Map;

public class ListBasketTest {
    private Map<Product, Integer> listProductBasket = new HashMap<>();
    double sum = 0;


    public void addProductInBasket(Product product, int count) {
        if (listProductBasket.containsKey(product)) {
            for (Map.Entry<Product, Integer> mapBasket : listProductBasket.entrySet()) {
                if (mapBasket.getKey().equals(product)) {
                    listProductBasket.put(product, mapBasket.getValue() + count);
                }
            }
        } else {
            listProductBasket.put(product, count);
        }
    }

    public void deleteProductInBasket(String productName) {
        for (Map.Entry<Product, Integer> mapBasket : listProductBasket.entrySet()) {
            if (mapBasket.getKey().getNameProduct().equalsIgnoreCase(productName)) {
                listProductBasket.remove(mapBasket.getKey());
            }
        }
    }

    public void deleteCountProductInBasket(String productName, Integer count) {
        ListStoreProductTest listStoreProductTest = new ListStoreProductTest();
        for (Map.Entry<Product, Integer> mapBasket : listProductBasket.entrySet()) {
            if (mapBasket.getKey().getNameProduct().equalsIgnoreCase(productName)) {
                listProductBasket.put(mapBasket.getKey(), mapBasket.getValue() - count);
                listStoreProductTest.deleteCountProduct(mapBasket.getKey(), count);
            }
        }
    }

    public Map<Product, Integer> getListProductForBasket() {
        return listProductBasket;
    }

    public void viewProductInBasketSum() {
        for (Map.Entry<Product, Integer> productsList : listProductBasket.entrySet()) {
            double sumForProduct = productsList.getValue() * productsList.getKey().getPrice();
            sumBasket(sumForProduct);
            System.out.println(productsList.getKey() + "Сумма за: " + productsList.getValue() + " = " + sumForProduct);
        }
        System.out.printf("Итог: %,.2f\n", sum);
    }

    public void order() {
        System.out.printf("Спасибо за вашь заказ.\nВаш заказ на сумму %,.2f, будет доставлен в течении дня.\n", sum);
        System.out.println("Номер заказа: " + 213213);
        //buyer.set(213213,"Ожидает подтверждения");
    }

    public void sumBasket(Double price) {
        sum += price;
    }
}