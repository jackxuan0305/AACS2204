public class Clerk extends Employee {
    private double allowance;
    private double overtimeHours;
    private static double overtimeRate;

    public Clerk(double allowance, double overtimeHours) {
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
    }

    public Clerk() {
        this(0, 0);
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public static double getOvertimeRate() {
        return overtimeRate;
    }

    public static void setOvertimeRate(double overtimeRate) {
        Clerk.overtimeRate = overtimeRate;
    }

    public String toString() {
        String string = "";
        string += "Allowance: " + allowance + "\n";
        string += "Overtime Hours: " + overtimeHours + "\n";
        return string;
    }

    public double calculateSalary() {
        double overtimePay = overtimeHours * overtimeRate;
        double salary = super.calculateSalary() + allowance + overtimePay;
        return salary;
    }

    public boolean equals(Object obj){
        if (obj instanceof Clerk){
            Clerk emp = (Clerk) obj;
            if (this.allowance == emp.allowance && this.overtimeHours == emp.overtimeHours){
                return true;
            }
        }
        return false;
    }
    
}
