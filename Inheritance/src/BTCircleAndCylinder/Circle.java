package BTCircleAndCylinder;

public class Circle {
    private double radius = 2.0;
    private String color = "White";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle has Radius = "
                + getRadius ()
                + ", color "
                + getColor ()
                + ", Area = "
                + getArea ()
                + " and Perimeter = "
                + getPerimeter ();
    }

    public static void main(String[] args) {
        Circle circle = new Circle ();
        System.out.println (circle);
    }
}
