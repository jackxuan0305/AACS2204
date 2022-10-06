public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    public Employee(){
        this("", 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String toString(){
        String string = "";
        string += "Name: " + name + "\n";
        string += "Year Joined: " + yearJoined + "\n";
        string += "Basic Salary: " + basicSalary + "\n";
        return string;
    }

    public double calculateSalary(){
        return basicSalary;
    }
    
    public boolean equals(Object obj){
        if (obj instanceof Employee){
            Employee emp = (Employee) obj;
            if (this.name.equals(emp.name) && this.yearJoined == emp.yearJoined && this.basicSalary == emp.basicSalary){
                return true;
            }
        }
        return false;
    }
}
