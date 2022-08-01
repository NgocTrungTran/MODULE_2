package demo;

public class Circle {
    private double radius = 1;


    public Circle() {

    }

    public Circle(double radius) {
        if (radius <= 0)
            System.out.println ("Invalid radius!");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0)
            System.out.println ("Invalid radius!");
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}