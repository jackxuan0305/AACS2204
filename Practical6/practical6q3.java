public class practical6q3 {

    public static String printElements(Employee[] employees) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            string += employees[i].toString();
            string += "Monthly Salary: " + employees[i].calculateSalary() + "\n";
        }
        return string;
    }
    public static void main(String[] args){
        Employee[] empArray = new Employee[3];
        empArray[0] = new Employee("Nicholas", 2010, 2000);
        empArray[1] = new CommissionEmployee(10000, 0.1);
        empArray[2] = new Clerk(100, 10);
        System.out.println(printElements(empArray));
    }
}
