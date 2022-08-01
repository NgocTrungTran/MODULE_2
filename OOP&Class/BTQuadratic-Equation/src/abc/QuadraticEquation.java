package abc;

public class QuadraticEquation {

    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return this.b * this.b - 4 * this.a * this.c;
    }
    public String display(){
        return " Quadratic Equation: "+ a + "x2" +" + "+ b + "x" +" + "+ c + " = 0";
    }
}
