/*package seminars.first.Shop;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
public class ShopTest {
    public static void main(String[] args) {


   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).

    Product beetroot = new Product(15, "Beetroot");
    Product broccoli = new Product(25, "Broccoli");
    Product cabbage = new Product(20, "Cabbage");
    Product potato = new Product(10, "Potato");
    Product bread = new Product(14, "Bread");

    Shop shop = new Shop(new ArrayList<>());
        shop.getProducts().add(beetroot);
        shop.getProducts().add(broccoli);
        shop.getProducts().add(cabbage);
        shop.getProducts().add(potato);
        shop.getProducts().add(bread);


    assertThat(shop.getProducts()).hasSize(5);
    assertThat(beetroot.getTitle()).isEqualTo("Beetroot");
    assertThat(broccoli.getTitle()).isEqualTo("Broccoli");
    assertThat(cabbage.getTitle()).isEqualTo("Cabbage");
    assertThat(potato.getTitle()).isEqualTo("Potato");
    assertThat(bread.getTitle()).isEqualTo("Bread");
    assertThat(shop.getMostExpensiveProduct(shop.getProducts())).isEqualTo(potato);
    assertThat(shop.sortProductsByPrice(shop.getProducts())).containsSequence(bread, potato, cabbage, broccoli, beetroot);

}
*/