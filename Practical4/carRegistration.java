public class carRegistration {

    int regNo;
    String name;
    int icNo;
    String plateNo;
    String color;
    int year;
    String make;
    String model;
    float capacity;

    //parameterized constructor 
    public carRegistration(int regNo, String name, int icNo, String plateNo, String color, int year, String make, String model, float capacity) {
        this.regNo = regNo;
        this.name = name;
        this.icNo = icNo;
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public String toString() {
        return String.format("%d\t\t %-10s \t %d\t\t %-6s \t %-6s \t %d\t %-10s\t %-8s\t %.1f", regNo, name, icNo, plateNo, color, year, make, model, capacity);
    }
}
