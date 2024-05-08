class Computer extends Product {
    private String graphicsCard; 

    public Computer(String model, String processor, String ram, String storage, String graphicsCard, int price) {
        super(model, processor, ram, storage, price);
        this.graphicsCard = graphicsCard;
    }

 
    public String getInfo() {
        return "Модель: " + this.model + ", Процесор: " + this.processor + ", RAM: " + this.ram + ", Пам'ять: " + this.storage + ", Графічна карта: " + this.graphicsCard + ", Ціна: $" + this.price;
    }

 
    public int calculatePriceWithTax(int taxRate) {
        double tax = (double) taxRate / 100;
        double totalPrice = this.price * (1 + tax);
        return (int) totalPrice;
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

  
    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
