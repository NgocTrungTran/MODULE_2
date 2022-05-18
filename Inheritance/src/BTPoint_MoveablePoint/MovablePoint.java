package BTPoint_MoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
@Override
    public String toString() {
        return "(" + super.toString () + ")"
                + ", speed = (" + getxSpeed () + ", " + getySpeed () + ")";
    }

    public MovablePoint move(){
        super.setX (super.getX () + xSpeed);
        super.setY (super.getY () + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint mP = new MovablePoint ();
        mP.setX ( 6.3f );
        mP.setY ( 1.5f );
        mP.setxSpeed (3.5f);
        mP.setySpeed (3.7f);
        System.out.println (mP);
        System.out.println ("Move: ");
        System.out.println ( mP.move ());
    }
}
