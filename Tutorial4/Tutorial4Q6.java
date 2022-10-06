package Tutorial4;

//Tutorial4Q6.java
public class Tutorial4Q6 {
    public static void main(String[] args) {
        //Q6a
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane("XYZ0001", 250000, 2005, 100);

        //Q6b
        airplane1.setID("AWX0003");
        airplane1.setNumOfPassenger(190);

        System.out.println("ID      Price    YearOfPurchased NumOfPassenger NumOfAirplane");
        System.out.println(airplane1.toString());
        System.out.println(airplane2.toString());

    }
    
}
