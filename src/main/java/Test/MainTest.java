package Test;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        ListStoreProductTest listProduct = new ListStoreProductTest();
        ListBasketTest listBasket = new ListBasketTest();
        listProduct.addProduct(new Product("Капуста", 18.7), 8);
        listProduct.addProduct(new Product("Колбоса Докторская", 148.7), 12);
        listProduct.addProduct(new Product("Сыр", 157.1), 12);
        listProduct.addProduct(new Product("Молоко", 48.7), 21);
        listProduct.addProduct(new Product("Творог", 74.3), 9);
        listProduct.addProduct(new Product("Рыба", 338.7), 11);
        listProduct.addProduct(new Product("Картошка", 9.5), 99);
        listProduct.addProduct(new Product("Яблоко", 53.1), 81);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ассортимент магазина");
        listProduct.getListProduct();
        while (true) {
            System.out.println("Укажите что хотите сделать: Добавить,Удалить, Корзина, Заказать, Выход");
            String action = scanner.nextLine();
            switch (action) {
                case "Добавить":
                    while (true) {
                        System.out.println("Укажите наименование продукта: ");
                        String nameProduct = scanner.nextLine();
                        Product product = listProduct.getProduct(nameProduct).getKey();
                        System.out.println("Укажите количество: ");
                        int count = scanner.nextInt();
                        if (listProduct.getProduct(nameProduct).getValue() >= count) {
                            listBasket.addProductInBasket(product, count);
                            listProduct.deleteCountProduct(product, count);
                        } else {
                            System.out.println("Заданного количества нет. В наличии только: " + listProduct.getProduct(nameProduct).getValue());
                        }
                        System.out.println(listBasket.getListProductForBasket());
                        listProduct.getListProduct();
                        break;
                    }
                    break;
                case "Корзина":
                    if (listBasket.getListProductForBasket().size() <= 0) {
                        System.out.println("Ваша карзина пуста");
                    }
                    listBasket.viewProductInBasketSum();
                    break;
                case "Заказать":
                    listBasket.order();
                    break;
                case "Удалить товар":
                    System.out.println("Введите продукт который хотите удалить: ");
                    listBasket.deleteProductInBasket(scanner.nextLine());
                    break;
                case "Уменьшить количество товара":
                    System.out.println("Введите продукт который хотите удалить: ");
                    String productName = scanner.nextLine();
                    System.out.println("Введите количество продуктов для удаления: ");
                    int countProduct = scanner.nextInt();
                    listBasket.deleteCountProductInBasket(productName, countProduct);
                    break;
                case "Узнать статус заказа":

                    break;

            }
            if (action.equals("Выход"))
                break;
        }

    }
}