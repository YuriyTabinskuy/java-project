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
}