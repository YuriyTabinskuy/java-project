public class Main {
    public static void main(String[] args) throws Exception {

        Phone obj1 = new Phone("M2003J6B2G", "Redmi Note 9 Pro", "Snapdragon 720G", "64GB RAM", "Blue", 250);
        Phone obj2 = new Phone("SM-G988B", "Samsung Galaxy S20 Ultra", "Exynos 990", "12GB RAM", "Black", 1200);
        Phone obj3 = new Phone("iPhone 13 Pro Max", "A15 Bionic", "256GB", "Gold", "iOS", 1099);
        

        System.out.println("Телефон 1:");
        System.out.println("Модель: " + obj1.model);
        System.out.println("Версія: " + obj1.version);
        System.out.println("Процесор: " + obj1.memory);
        System.out.println("Пам'ять: " + obj1.color);
        System.out.println("Колір: " + obj1.cell);
        System.out.println("Ціна: $" + obj1.price);
        System.out.println();
        
        System.out.println("Телефон 2:");
        System.out.println("Модель: " + obj2.model);
        System.out.println("Версія: " + obj2.version);
        System.out.println("Процесор: " + obj2.memory);
        System.out.println("Пам'ять: " + obj2.color);
        System.out.println("Колір: " + obj2.cell);
        System.out.println("Ціна: $" + obj2.price);
        System.out.println();
        
        System.out.println("Телефон 3:");
        System.out.println("Модель: " + obj3.model);
        System.out.println("Версія: " + obj3.version);
        System.out.println("Процесор: " + obj3.memory);
        System.out.println("Пам'ять: " + obj3.color);
        System.out.println("Колір: " + obj3.cell);
        System.out.println("Ціна: $" + obj3.price);
    }
}