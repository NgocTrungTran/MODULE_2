package BTCircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle (2.6, "blue");

        System.out.printf ("Circle: Color(%s), Radius(%.1f), Area = %.1f", circle.getColor (), circle.getRadius (), circle.getArea ());
    }
}
