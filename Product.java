/*
     Класс Product представляет товар с его количеством, ценой и скидкой.
     Он предоставляет методы для расчета итоговой стоимости товара с учетом скидки.
     */
public class Product {
    private int quantity; // Количество товаров
    private double price; // Цена товара
    private double discount; // Скидка на товар в процентах

    public Product(int quantity, double price, double discount) {
        this.quantity = quantity; // Инициализация количества товаров
        this.price = price;       // Инициализация цены товара
        this.discount = discount; // Инициализация скидки на товар
    }

    // Метод для расчета общей суммы покупки
    public double calculateTotal() {
        double totalWithoutDiscount = quantity * price; // Общая сумма без скидки
        double totalDiscount = totalWithoutDiscount * (discount / 100); // Сумма скидки
        double totalWithDiscount = totalWithoutDiscount - totalDiscount; // Общая сумма со скидкой

        return Math.round(totalWithDiscount * 100.0) / 100.0; // Округление до 2 знаков после запятой
    }
}