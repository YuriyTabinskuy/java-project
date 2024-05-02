public class Phone {
    String model;
    String version;
    String memory;
    String color;
    String cell;
    int price;

    public Phone(String model, String version, String memory, String color, String cell, int price) {
        this.model = model;
        this.version = version;
        this.memory = memory;
        this.color = color;
        this.cell = cell;
        this.price = price;
    }
    void printInfo(){
        System.out.println("Модель телефона: " +model);
        System.out.println("Версія телефона: " +version);
        System.out.println("Процесор телефона: " +memory);
        System.out.println("Колір телефона: " +color);
        System.out.println("Пам'ять' телефона: " +cell);
        System.out.println("Ціна телефона: " +price);
    }

    
}

