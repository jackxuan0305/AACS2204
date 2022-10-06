public class practical7q3 {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(10);
        ComparableCircle c2 = new ComparableCircle(12);

        if (c1.compareTo(c2) > 0) {
            System.out.println("C1 is bigger than C2");
        } else if (c1.compareTo(c2) < 0) {
            System.out.println("C1 is smaller than C2");
        } else {
            System.out.println("C1 and C2 are equal size");
        }
    }
}
