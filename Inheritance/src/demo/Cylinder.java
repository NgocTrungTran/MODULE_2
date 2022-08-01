package demo;

public class Cylinder extends Circle {
    private double height = 1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if ( height <= 0 )
            System.out.println ("Invalid height!");
        this.height = height;
    }

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        super(radius);
        if ( height <= 0 )
            System.out.println ("Invalid height!");
        this.height = height;
    }

    public double getAreaCylinder() {
        return 2 * getArea () + getPerimeter () * height;
    }

    public double getVolumeCylinder() {
        return getArea () * height;
    }
}
