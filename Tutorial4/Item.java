package Tutorial4;

//Item.java
public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public Item(String description) {
        this.description = description;
        this.price = 0.0;
    }

    public Item(double price){
        this.description = "";
        this.price = price;
    }

    public Item(){
        this.description = "";
        this.price = 0.0;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
