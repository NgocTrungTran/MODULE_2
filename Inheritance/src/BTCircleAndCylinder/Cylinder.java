package BTCircleAndCylinder;

public class Cylinder extends Circle {
    private double height = 4.0;

    public Cylinder(){

    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double darius, String color, double height) {
        super(darius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * getRadius () * getRadius () * Math.PI
                + 2 * getRadius () * height * Math.PI;
    }

    public double getVolume() {
        return getRadius () * getRadius () * height * Math.PI;
    }

    public String toString() {
        return "A Cylinder has radius = "
                + super.getRadius ()
                + ", color "
                + super.getColor ()
                + ", Area = "
                + getArea ()
                + " and Volume = "
                + getVolume ()
                + super.toString ();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder ();
        System.out.println (cylinder);
    }
}
