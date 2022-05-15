public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){

    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }

    public  void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

    public  String toString(){
        if(getOn()){
            return String.format("Speed: %d\nColor: %s\nRadius: %.1f\nfan is on",getSpeed(),getColor(),getRadius());
        }else {
            return String.format("Color: %s\nRadius: %.1f\nfan is off",getColor(),getRadius());
        }
    }
    public static class TestFan {
        public static void main(String[] args) {
            Fan fan1 = new Fan();
            fan1.setOn(true);
            fan1.setSpeed(Fan.FAST);
            fan1.setRadius(10);
            fan1.setColor("Yellow");
            System.out.println(fan1.toString());
            Fan fan2 = new Fan();
            fan2.setOn(false);
            fan2.setSpeed(Fan.MEDIUM);
            fan2.setRadius(5);
            fan2.setColor("Blue");
            System.out.println(fan2.toString());
        }
    }
}
