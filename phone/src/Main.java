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
                    printPhones();
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

    public static void printPhones() {
        Phone otherPhone = new Phone("SomeModel", "SomeVersion", "SomeMemory", "SomeColor", "SomeCell", 999);
        otherPhone.setNetwork("SomeNetwork"); 
    
        Phone[] phones = {
            new Phone("M2003J6B2G", "Redmi Note 9 Pro", "Snapdragon 720G", "64GB RAM", "Blue", 250),
            new Phone("SM-G988B", "Samsung Galaxy S20 Ultra", "Exynos 990", "12GB RAM", "Black", 1200),
            new Phone("iPhone 13 Pro Max", "A15 Bionic", "256GB", "Gold", "iOS", 1099),
            new Phone("Pixel 6 Pro", "Google", "Tensor", "128GB RAM", "Silver", 899),
            new Phone("OnePlus 10 Pro", "OnePlus", "Snapdragon 8 Gen 1", "256GB RAM", "Green", 999),
            new Phone("Mi 12 Ultra", "Xiaomi", "Snapdragon 8 Gen 1", "512GB RAM", "White", 1199),
            new Phone("Galaxy Z Fold 4", "Samsung", "Exynos 2200", "512GB RAM", "Mystic Bronze", 1799),
            new Phone("iPhone SE 3", "Apple", "A15 Bionic", "128GB RAM", "Product Red", 499)
        };
    
        for (Phone phone : phones) {
            phone.setNetwork("SomeNetwork"); 
            System.out.println(phone.getInfo());
            System.out.println(phone.compare(otherPhone));
            System.out.println(phone.checkNetworkCompatibility(otherPhone)); 
            System.out.println();
        }
    }
    
    

    public static void printComputers() {
        Computer obj11 = new Computer("Dell XPS 15", "Intel Core i7-11800H", "16GB RAM", "512GB SSD", "NVIDIA GeForce RTX 3050 Ti", 1899);
        Computer[] computers = {
            obj11,
            new Computer("MacBook Pro 14", "Apple M1 Pro", "16GB RAM", "512GB SSD", "Integrated", 1999),
            new Computer("Asus ROG Zephyrus G14", "AMD Ryzen 9 5900HS", "32GB RAM", "1TB SSD", "NVIDIA GeForce RTX 3060", 1999),
            new Computer("HP Spectre x360", "Intel Core i7-1165G7", "16GB RAM", "512GB SSD", "Integrated", 1399),
            new Computer("Lenovo Legion 5 Pro", "AMD Ryzen 7 5800H", "16GB RAM", "1TB SSD", "NVIDIA GeForce RTX 3060", 1399),
            new Computer("Microsoft Surface Laptop 4", "AMD Ryzen 5 4680U", "8GB RAM", "256GB SSD", "Integrated", 999),
            new Computer("Acer Predator Helios 300", "Intel Core i7-11800H", "16GB RAM", "512GB SSD", "NVIDIA GeForce RTX 3070", 1599),
            new Computer("Alienware x17", "Intel Core i9-12900HK", "32GB RAM", "1TB SSD", "NVIDIA GeForce RTX 3080", 3299)
        };

        for (Computer computer : computers) {
            System.out.println(computer.getInfo());
            System.out.println("Ціна комп'ютера з податком (ПДВ 20%): $" + computer.calculatePriceWithTax(20));
            System.out.println(obj11.comparePrice(computer));
            System.out.println();
        }
    }

    public static void printTablets() {
        Tablet[] tablets = {
            new Tablet("iPad Air", "Apple A14 Bionic", "4GB RAM", "64GB SSD", "10.9-inch Retina", 599),
            new Tablet("Samsung Galaxy Tab S7", "Snapdragon 865+", "8GB RAM", "256GB SSD", "11-inch Super AMOLED", 649),
            new Tablet("Microsoft Surface Pro 8", "Intel Core i5", "8GB RAM", "128GB SSD", "13-inch PixelSense", 899),
            new Tablet("Lenovo Tab P11 Pro", "Snapdragon 730G", "6GB RAM", "128GB SSD", "11.5-inch OLED", 499),
            new Tablet("Huawei MatePad Pro", "Kirin 990", "6GB RAM", "128GB SSD", "10.8-inch IPS LCD", 599),
            new Tablet("Amazon Fire HD 10", "MediaTek Helio P60T", "4GB RAM", "64GB SSD", "10.1-inch IPS LCD", 149),
            new Tablet("Google Pixel Slate", "Intel Core i5", "8GB RAM", "128GB SSD", "12.3-inch Molecular Display", 799),
            new Tablet("Xiaomi Mi Pad 5", "Snapdragon 870", "6GB RAM", "128GB SSD", "11-inch IPS LCD", 499)
        };

        for (Tablet tablet : tablets) {
            System.out.println(tablet.getInfo());
            System.out.println("Розмір екрану: " + tablet.checkScreenSize());
            System.out.println("Підтримка ігор: " + tablet.isGamingTablet()); 
            System.out.println();
    }
}
}