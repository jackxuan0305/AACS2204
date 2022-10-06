package Tutorial4;

//Airplane.java

public class Airplane {
    private String id;
    private double price;
    private int yearOfPurchased;
    private int numOfPassenger;
    private int numOfAirplane;

    public Airplane() {
        this.id = "";
        this.price = 0.0;
        this.yearOfPurchased = 0;
        this.numOfPassenger = 0;
        this.numOfAirplane = 0;
    }

    public Airplane(String id, double price, int yearOfPurchased, int numOfPassenger) {
        this.id = id;
        this.price = price;
        this.yearOfPurchased = yearOfPurchased;
        this.numOfPassenger = numOfPassenger;
        this.numOfAirplane++;
    }

    public double calCurrentValue(){
        double currentValue = price - (price * 0.1 * (2011- yearOfPurchased));
        return currentValue;
    }

    public String toString(){
        return String.format("%s RM %-10.2f %-10d %-10d %d", id, price, yearOfPurchased, numOfPassenger, numOfAirplane);
    }

    public void setID(String id){
        this.id = id;
    }

    public void setNumOfPassenger(int numOfPassenger){
        this.numOfPassenger = numOfPassenger;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfPurchased() {
        return yearOfPurchased;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public int getNumOfAirplane() {
        return numOfAirplane;
    }

}
