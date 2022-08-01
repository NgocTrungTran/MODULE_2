package demo;

public class Cone extends Cylinder {
    private double ruling = 1.0;

    public Cone() {

    }

    public Cone(double radius, double height, double ruling) {
        super(radius, height );
        if ( ruling <= 0 )
            System.out.println ("Invalid!");
        this.ruling = ruling;
    }

    public double getRuling() {
        return ruling;
    }

    public void setRuling(double ruling) {
        if (ruling <= 0)
            System.out.println ("Invalid ruling!");
        this.ruling = ruling;
    }

    public double getAreaCone() {
        return getArea () + Math.PI + getRadius () * ruling;
    }

    public double getVolumeCone() {
        return (Math.PI * Math.pow ( getRadius (), 2 ) * getHeight ()) / 3;
    }
}
