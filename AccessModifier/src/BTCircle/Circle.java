package BTCircle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    public double getRadius () {
        return this.radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
}
