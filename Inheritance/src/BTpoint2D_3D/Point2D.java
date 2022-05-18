package BTpoint2D_3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x,y};
    }

    public String toString() {
        return getX () + ", " + getY ();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D ();
        point2D.setX ( 2.5f );
        point2D.setY ( 4.6f );
        System.out.println (point2D);
    }
}
