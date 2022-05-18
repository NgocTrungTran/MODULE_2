package BTPoint_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

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

    public String toString(){
        return getX () + ", " + getY ();
    }

    public static void main(String[] args) {
        Point point = new Point ();
        point.setX ( 3.5f );
        point.setY ( 4.1f );
        System.out.println (point);
    }
}
