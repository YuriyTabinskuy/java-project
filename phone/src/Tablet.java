

public class Tablet extends Product {
    private String display;

    public Tablet(String model, String processor, String ram, String storage, String display, int price) {
        super(model, processor, ram, storage, price);
        this.display = display;
    }

    public String getInfo() {
        return "Модель: " + this.model + ", Процесор: " + this.processor + ", RAM: " + this.ram + ", Пам'ять: " + this.storage + ", Дисплей: " + this.display + ", Ціна: $" + this.price;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String checkScreenSize() {
        double threshold = 10.0;
        double screenSize = Double.parseDouble(this.display.split("-")[0]); // Extract screen size
        if (screenSize >= threshold) {
            return "Великий екран";
        } else {
            return "Малий екран";
        }
    }
    public boolean isGamingTablet() {

        return this.ram.contains("8GB") && (this.processor.contains("Snapdragon") || this.processor.contains("Exynos"));
    }

    
}
