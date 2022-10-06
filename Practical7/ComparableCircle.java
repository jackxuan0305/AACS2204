public class ComparableCircle extends Circle implements Colorable, Comparable<Circle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(Circle o) {
        return Double.compare(radius, o.getRadius());
    }

    public void howToColor() {

    }
}