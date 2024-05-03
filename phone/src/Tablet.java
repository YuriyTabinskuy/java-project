public class Tablet {
    String model;
    String processor;
    String ram;
    String storage;
    String display;
    int price;

    public Tablet(String model, String processor, String ram, String storage, String display, int price) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.price = price;
    }
    void printInfo(){
        System.out.println("Модель планшета: " +model);
        System.out.println("Процесор планшета: " +processor);
        System.out.println("Оперативна пам'ять  планшета: " +ram);
        System.out.println("Накопичувач планшета: " +storage);
        System.out.println("Дисплей планшета: " +display);
        System.out.println("Ціна планшета: " +price);
    }
    public void upgradeRAM(String newRAM) {
        System.out.println("Оновлення оперативної пам'яті...");
        this.ram = newRAM;
        System.out.println("Оперативна пам'ять оновлена до: " + newRAM);
    }
    
    public void discountPrice(int discountPercentage) {
        System.out.println("Застосування знижки...");
        double discount = price * ((double) discountPercentage / 100);
        price -= discount;
        System.out.println("Ціна зі знижкою: " + price);
    }
}
