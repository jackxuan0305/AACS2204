public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(double grossSale, double commissionRate) {
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee() {
        this(0, 0);
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String toString() {
        String string = "";
        string += "Gross Sale: " + grossSale + "\n";
        string += "Commission Rate: " + commissionRate + "\n";
        return string;
    }

    public double calculateSalary() {
        double salary = super.calculateSalary() + (grossSale * commissionRate);
        return salary;
        
    }

    public boolean equals(Object obj){
        if (obj instanceof CommissionEmployee){
            CommissionEmployee emp = (CommissionEmployee) obj;
            if (this.grossSale == emp.grossSale && this.commissionRate == emp.commissionRate){
                return true;
            }
        }
        return false;
    }
}
