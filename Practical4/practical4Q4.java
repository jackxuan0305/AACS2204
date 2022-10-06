import java.util.Scanner;

public class practical4Q4 {

    public static void main(String[] args) {

        int regNo = 1001;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of car registration: ");
        int num = input.nextInt();
        carRegistration[] arrayCar = new carRegistration[num];

        for(int i = 0; i < num; i++) {
            System.out.print("Enter name: ");
            String name = input.next();

            System.out.print("Enter IC number: ");
            int icNo = input.nextInt();

            System.out.print("Enter plate number: ");
            String plateNo = input.next();

            System.out.print("Enter color: ");
            String color = input.next();

            System.out.print("Enter year: ");
            int year = input.nextInt();

            System.out.println("Select Car :\n1.Toyota\t2.Nissan\t3.Honda");
            int car = input.nextInt();

            System.out.println("");

            String make = "";
            String model = "";
            float capacity = 0;

            if (car == 1){
                make = "Toyota";
                model = "Vios";
                capacity = 1.5f;
            }
            else if (car == 2){
                make = "Nissan";
                model = "Teana";
                capacity = 2.0f;
            }
            else if (car == 3){
                make = "Honda";
                model = "City";
                capacity = 1.6f;
            }
            else {
                System.out.println("Invalid input");
            }

            arrayCar[i] = new carRegistration(regNo++, name, icNo, plateNo, color, year, make, model, capacity);

        }

        System.out.printf("%s\t\t %-10s \t %s\t\t %-6s \t %-6s \t %s\t %-10s\t %-8s\t %s\n", "Reg No.", "Name", "IC No.", "Plate No.", "Color", "Year", "Make", "Model", "Capacity");

        for(int i = 0; i < num; i++) {
            System.out.println(arrayCar[i]);
        }
    }
}
