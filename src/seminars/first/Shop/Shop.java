/*package seminars.first.Shop;

import java.util.Collections;
import java.util.List;


public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice(List<Product> products) {
        Collections.sort(products);
        return products;
    }


    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct(List<Product> products) {
        int max = 0;
        Product mostExpensiveProduct = null;
        for (Product product : products) {
            if (product.getCost() > max) {
                max = product.getCost();
                mostExpensiveProduct = product;
            }

        }
        return mostExpensiveProduct;
    }*/
