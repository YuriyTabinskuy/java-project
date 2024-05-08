class Phone extends Product {
    private String color; 
    private String network; 

    public Phone(String model, String processor, String ram, String storage, String color, int price) {
        super(model, processor, ram, storage, price);
        this.color = color;
    }

 
    public String getInfo() {
        return "Модель: " + this.model + ", Процесор: " + this.processor + ", RAM: " + this.ram + ", Пам'ять: " + this.storage + ", Колір: " + this.color + ", Ціна: $" + this.price;
    }

 
    public String compare(Phone otherPhone) {
        if (this.price < otherPhone.price) {
            return this.model + " дешевший, ніж " + otherPhone.model;
        } else if (this.price > otherPhone.price) {
            return this.model + " дорожчий, ніж " + otherPhone.model;
        } else {
            return this.model + " має таку саму ціну, як і " + otherPhone.model;
        }
    }
    public String checkNetworkCompatibility(Phone otherPhone) {
        if (this.network.equals(otherPhone.network)) {
            return "Телефони сумісні за мережевою технологією.";
        } else {
            return "Телефони не сумісні за мережевою технологією.";
        }
    }

 
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getNetwork() {
        return network;
    }
    public void setNetwork(String network) {
        this.network = network;
    }
}
