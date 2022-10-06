public class Employee {
    private String name;
    private double salary;

    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    public Employee() {
        name = "";
        salary = 0.0;
    }
    
    public Employee(String employeeName) {
        name = employeeName;
        salary = 0.0;
    }

    public void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
