public class practical4Q1 {

    public static void main(String[] args) {
        Employee employeeDetails = new Employee("Ethan", 5000);
        System.out.printf("%s's salary before raise was RM %.2f\n", employeeDetails.getName(),
                employeeDetails.getSalary());

        employeeDetails.raiseSalary(8);
        System.out.printf("%s's salary after raise is RM %.2f\n", employeeDetails.getName(),
                employeeDetails.getSalary());

        Employee employeeDetails2 = new Employee("Shawn", 6000);
        Employee employeeDetails3 = new Employee("Nicholas");

        if (employeeDetails2.getSalary() > employeeDetails3.getSalary()) {
            System.out.printf("%s has the highest salary of RM %.2f\n", employeeDetails2.getName(),employeeDetails2.getSalary());
        } 
        else {
            System.out.printf("%s has the highest salary of RM %.2f\n", employeeDetails3.getName(),employeeDetails3.getSalary());
        }
        
        System.out.printf("The total salary of the 2 employees is RM %.2f\n",employeeDetails2.getSalary() + employeeDetails3.getSalary());
    }
}
