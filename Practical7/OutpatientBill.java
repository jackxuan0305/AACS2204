public class OutpatientBill extends PatientBill {
    private static double registrationFees = 30.00;
    private double consultationFees;

    public OutpatientBill() {
    }
    
    public OutpatientBill(String name, double consultationFees) {
    super(name);
    this.consultationFees = consultationFees;
    }
    
    public double calculateTotalCharges(){
    return registrationFees + consultationFees;
    }
    
    public String toString() {
    String string = "";
    string += super.toString();
    string += "Consultation Fees: " + registrationFees + "\n";
    return string;
    }
}
