public class InpatientBill extends PatientBill {
    private static double standardRoomCharge = 100.00;
    private static double privateRoomCharge = 200.00;

    private double specialistCharges;
    private double labCharges;
    private String roomType;
    private int durationOfStay;

    public InpatientBill() {
    }

    public InpatientBill(String name, double specialistCharges, double labCharges,
            String roomType, int durationOfStay) {
        super(name);
        this.specialistCharges = specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationOfStay = durationOfStay;
    }

    public double calculateTotalCharges() {
        double roomRate = 0.0;

        if (roomType.equals("S")) {
            roomRate = standardRoomCharge;
        } else if (roomType.equals("P")) {
            roomRate = privateRoomCharge;
        }

        return specialistCharges + labCharges +
                (durationOfStay * roomRate);
    }

    public String toString() {
        String string = "";
        string += super.toString();
        string += "Specialist Charges: " + specialistCharges + "\n";
        string += "Lab Charges: " + labCharges + "\n";
        string += "Room Type: " + roomType + "\n";
        string += "Duration of Stay: " + durationOfStay + "\n";
        return string;
    }
}
