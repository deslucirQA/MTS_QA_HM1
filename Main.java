public class Main {

    // Метод main
    public static void main(String[] args) {

        Product product1 = new Product(10, 100.0, 0.75);   // Скидка 0.75%
        Product product2 = new Product(25, 200.0, 42.575);   // Скидка 42.575%
        Product product3 = new Product(33, 500.0, 59.1);     // Скидка 59.1%

        // Вызываем метод calculateTotal для каждого продукта и выводим результаты
        System.out.println("Итоговая сумма для товара 1: " + product1.calculateTotal());
        System.out.println("Итоговая сумма для товара 2: " + product2.calculateTotal());
        System.out.println("Итоговая сумма для товара 3: " + product3.calculateTotal());
    }
}
