public abstract class PatientBill {
    protected int id;
    protected String name;
    private static int currentId = 1000;

    public PatientBill(String name) {
        this.name = name;
        this.id = currentId++;
    }

    public PatientBill() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object obj) {
        PatientBill otherBill = (PatientBill) obj;
        return name.compareTo(otherBill.name);
    }

    public String toString() {
        String string = "";
        string += "Patient ID: " + id + "\n";
        string += "Patient Name: " + name + "\n";
        return string;
    }

    public abstract double calculateTotalCharges();

}