import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Оберіть категорію: ");
            System.out.println("1. Телефон");
            System.out.println("2. Комп'ютер");
            System.out.println("3. Планшет");
            System.out.println("0. Вийти");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Створюємо об'єкт телефону для порівняння
                    Phone otherPhone = new Phone("SomeModel", "SomeVersion", "SomeMemory", "SomeColor", "SomeCell", 999);
                    printPhones(otherPhone);
                    break;
                case 2:
                    printComputers();
                    break;
                case 3:
                    printTablets();
                    break;
                case 0:
                    System.out.println("Програма завершує роботу.");
                    break;
                default:
                    System.out.println("Неправильний вибір.");
            }
        } while (choice != 0);

        scanner.close();
    }
    
    public static void printPhones(Phone otherPhone) {
        Phone obj1 = new Phone("M2003J6B2G", "Redmi Note 9 Pro", "Snapdragon 720G", "64GB RAM", "Blue", 250);
        Phone obj2 = new Phone("SM-G988B", "Samsung Galaxy S20 Ultra", "Exynos 990", "12GB RAM", "Black", 1200);
        Phone obj3 = new Phone("iPhone 13 Pro Max", "A15 Bionic", "256GB", "Gold", "iOS", 1099);
        Phone obj4 = new Phone("Pixel 6 Pro", "Google", "Tensor", "128GB RAM", "Silver", 899);
        Phone obj5 = new Phone("OnePlus 10 Pro", "OnePlus", "Snapdragon 8 Gen 1", "256GB RAM", "Green", 999);
        Phone obj6 = new Phone("Mi 12 Ultra", "Xiaomi", "Snapdragon 8 Gen 1", "512GB RAM", "White", 1199);
        Phone obj7 = new Phone("Galaxy Z Fold 4", "Samsung", "Exynos 2200", "512GB RAM", "Mystic Bronze", 1799);
        Phone obj8 = new Phone("iPhone SE 3", "Apple", "A15 Bionic", "128GB RAM", "Product Red", 499);
        
        System.out.println("Телефон 1:");
        obj1.printInfo();
        System.out.println(obj1.comparePhones(otherPhone));
        System.out.println();
        
        System.out.println("Телефон 2:");
        obj2.printInfo();
        System.out.println(obj2.comparePhones(otherPhone));
        System.out.println();
        
        System.out.println("Телефон 3:");
        obj3.printInfo();
        System.out.println(obj3.comparePhones(otherPhone));
        System.out.println();

        System.out.println("Телефон 4:");
        obj4.printInfo();
        System.out.println(obj4.comparePhones(otherPhone));
        System.out.println();

        System.out.println("Телефон 5:");
        obj5.printInfo();
        System.out.println(obj5.comparePhones(otherPhone));
        System.out.println();

        System.out.println("Телефон 6:");
        obj6.printInfo();
        System.out.println(obj6.comparePhones(otherPhone));
        System.out.println();

        System.out.println("Телефон 7:");
        obj7.printInfo();
        System.out.println(obj7.comparePhones(otherPhone));
        System.out.println();

        System.out.println("Телефон 8:");
        obj8.printInfo();
        System.out.println(obj8.comparePhones(otherPhone));
        System.out.println();

    }

        //Computer

        public static void printComputers() {
        Computer obj11 = new Computer("Dell XPS 15", "Intel Core i7-11800H", "16GB RAM", "512GB SSD", "NVIDIA GeForce RTX 3050 Ti", 1899);
        Computer obj12 = new Computer("MacBook Pro 14", "Apple M1 Pro", "16GB RAM", "512GB SSD", "Integrated", 1999);
        Computer obj13 = new Computer("Asus ROG Zephyrus G14", "AMD Ryzen 9 5900HS", "32GB RAM", "1TB SSD", "NVIDIA GeForce RTX 3060", 1999);
        Computer obj14 = new Computer("HP Spectre x360", "Intel Core i7-1165G7", "16GB RAM", "512GB SSD", "Integrated", 1399);
        Computer obj15 = new Computer("Lenovo Legion 5 Pro", "AMD Ryzen 7 5800H", "16GB RAM", "1TB SSD", "NVIDIA GeForce RTX 3060", 1399);
        Computer obj16 = new Computer("Microsoft Surface Laptop 4", "AMD Ryzen 5 4680U", "8GB RAM", "256GB SSD", "Integrated", 999);
        Computer obj17 = new Computer("Acer Predator Helios 300", "Intel Core i7-11800H", "16GB RAM", "512GB SSD", "NVIDIA GeForce RTX 3070", 1599);
        Computer obj18 = new Computer("Alienware x17", "Intel Core i9-12900HK", "32GB RAM", "1TB SSD", "NVIDIA GeForce RTX 3080", 3299);

        System.out.println("Комп'ютер 1:");
        obj11.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj11.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj11));
        System.out.println();

        System.out.println("Комп'ютер 2:");
        obj12.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj12.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj12));
        System.out.println();

        System.out.println("Комп'ютер 3:");
        obj13.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj13.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj13));
        System.out.println();

        System.out.println("Комп'ютер 4:");
        obj14.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj14.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj14));
        System.out.println();

        System.out.println("Комп'ютер 5:");
        obj15.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj15.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj15));
        System.out.println();

        System.out.println("Комп'ютер 6:");
        obj16.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj16.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj16));
        System.out.println();

        System.out.println("Комп'ютер 7:");
        obj17.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj17.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj17));
        System.out.println();

        System.out.println("Комп'ютер 8:");
        obj18.printInfo();
        System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + obj18.calculatePriceWithTax(20));
        System.out.println(obj11.comparePrice(obj18));
        System.out.println();
        
        }


        //Tablet

        public static void printTablets( ) {
        Tablet obj21 = new Tablet("iPad Air", "Apple A14 Bionic", "4GB RAM", "64GB SSD", "10.9-inch Retina", 599);
        Tablet obj22 = new Tablet("Samsung Galaxy Tab S7", "Snapdragon 865+", "8GB RAM", "256GB SSD", "11-inch Super AMOLED", 649);
        Tablet obj23 = new Tablet("Microsoft Surface Pro 8", "Intel Core i5", "8GB RAM", "128GB SSD", "13-inch PixelSense", 899);
        Tablet obj24 = new Tablet("Lenovo Tab P11 Pro", "Snapdragon 730G", "6GB RAM", "128GB SSD", "11.5-inch OLED", 499);
        Tablet obj25 = new Tablet("Huawei MatePad Pro", "Kirin 990", "6GB RAM", "128GB SSD", "10.8-inch IPS LCD", 599);
        Tablet obj26 = new Tablet("Amazon Fire HD 10", "MediaTek Helio P60T", "4GB RAM", "64GB SSD", "10.1-inch IPS LCD", 149);
        Tablet obj27 = new Tablet("Google Pixel Slate", "Intel Core i5", "8GB RAM", "128GB SSD", "12.3-inch Molecular Display", 799);
        Tablet obj28 = new Tablet("Xiaomi Mi Pad 5", "Snapdragon 870", "6GB RAM", "128GB SSD", "11-inch IPS LCD", 499);

        System.out.println("Планшет 1:");
        obj21.printInfo();
        System.out.println();

        System.out.println("Планшет 2:");
        obj22.printInfo();
        System.out.println();

        System.out.println("Планшет 3:");
        obj23.printInfo();
        System.out.println();

        System.out.println("Планшет 4:");
        obj24.printInfo();
        System.out.println();

        System.out.println("Планшет 5:");
        obj25.printInfo();
        System.out.println();

        System.out.println("Планшет 6:");
        obj26.printInfo();
        System.out.println();

        System.out.println("Планшет 7:");
        obj27.printInfo();
        System.out.println();

        System.out.println("Планшет 8:");
        obj28.printInfo();
        System.out.println();

    }

}
