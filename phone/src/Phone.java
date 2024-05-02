
interface Comparable {
    String comparePhones(Phone otherPhone);
}

public class Phone implements Comparable {
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

    void printInfo() {
        System.out.println("Модель телефона: " + model);
        System.out.println("Версія телефона: " + version);
        System.out.println("Процесор телефона: " + memory);
        System.out.println("Колір телефона: " + color);
        System.out.println("Пам'ять' телефона: " + cell);
        System.out.println("Ціна телефона: " + price);
    }

    @Override
    public String comparePhones(Phone otherPhone) {
        if (this.model.equals(otherPhone.model) && this.version.equals(otherPhone.version)) {
            return "Телефони " + this.model + " та " + otherPhone.model + " - одна й та ж версія.";
        } else {
            return "Телефони " + this.model + " та " + otherPhone.model + " - різні версії.";
        }
    }

 
}
