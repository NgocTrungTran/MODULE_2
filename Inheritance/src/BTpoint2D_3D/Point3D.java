package BTpoint2D_3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX (),getY (), z};
    }

    public void setXYZ(float x, float y, float z) {
        this.setX ( x );
        this.setY ( y );
        this.setZ ( z );
    }

    public String toString() {
        return "(" + super.toString () + ", " + getZ () + ")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D ();
        point3D.setXYZ ( 1.5f, 3.6f, 9.5f );
        System.out.println (point3D);
    }
}
