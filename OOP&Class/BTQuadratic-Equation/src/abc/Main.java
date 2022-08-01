package abc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Enter a (a != 0): ");
        double a = scanner.nextDouble ();
        System.out.println ("Enter b: ");
        double b = scanner.nextDouble ();
        System.out.println ("Enter c: ");
        double c = scanner.nextDouble ();

        QuadraticEquation quadraticEquation = new QuadraticEquation (a, b, c);

        double delta = quadraticEquation.getDelta ();
        if (a == 0) {
            System.out.println ( "Please enter a other than 0" );
        } else {
            if ( delta < 0 ) {
                System.out.println ( "The equation has no solution" );
            } else if ( delta == 0 ) {
                double x = (-b) / 2 * a;
                System.out.printf ( "Equation with double solution x1 = x2 = %f", x );
            } else {
                double x1 = (-b + Math.pow ( delta, 0.5 )) / 2 * a;
                double x2 = (-b - Math.pow ( delta, 0.5 )) / 2 * a;
                System.out.printf ( "The equation has two solutions: %.3f and %.3f", x1, x2 );
            }
        }
        System.out.println (quadraticEquation.display());
    }
}