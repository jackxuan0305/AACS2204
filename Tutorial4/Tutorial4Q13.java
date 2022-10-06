package Tutorial4;

//Tutorial4Q13.java
public class Tutorial4Q13 {
    public static void main(String[] args) {
        Item item2 = new Item("Corn flakes");
        Item item3 = new Item(3.95);
        Item item4 = new Item("Corn flakes", 3.95);
        Item item1 = new Item();

        System.out.println("Item 1: " + item1.getDescription() + " RM " + item1.getPrice());
        System.out.println("Item 2: " + item2.getDescription() + " RM " + item2.getPrice());
        System.out.println("Item 3: " + item3.getDescription() + " RM " + item3.getPrice());
        System.out.println("Item 4: " + item4.getDescription() + " RM " + item4.getPrice());

    }
}
