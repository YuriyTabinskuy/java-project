public class Computer {
    String model;
    String processor;
    String ram;
    String storage;
    String gpu;
    int price;

    public Computer(String model, String processor, String ram, String storage, String gpu, int price) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.price = price;
    }
    void printInfo(){
        System.out.println("Модель комп'ютера: " +model);
        System.out.println("Процесор комп'ютера: " +processor);
        System.out.println("Оперативна пам'ять  комп'ютера: " +ram);
        System.out.println("Накопичувач комп'ютера: " +storage);
        System.out.println("Графічний адаптер комп'ютера: " +gpu);
        System.out.println("Ціна комп'ютера: " +price);
        
    }
    public double calculatePriceWithTax(double taxRate) {
        double taxAmount = price * (taxRate / 100);
        return price + taxAmount;
    }
    public String comparePrice(Computer otherComputer) {
        if (this.price < otherComputer.price) {
            return this.model + " дешевший, ніж " + otherComputer.model;
        } else if (this.price > otherComputer.price) {
            return this.model + " дорожчий, ніж " + otherComputer.model;
        } else {
            return this.model + " має таку саму ціну, як і " + otherComputer.model;
        }
    }

    
    
}