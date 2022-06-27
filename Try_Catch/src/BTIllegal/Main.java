package BTIllegal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter a: " );
        int a = Integer.parseInt ( scanner.nextLine () );
        System.out.print ( "Enter b: " );
        int b = Integer.parseInt ( scanner.nextLine () );
        System.out.print ( "Enter c: " );
        int c = Integer.parseInt ( scanner.nextLine () );
        boolean checkSum = (a + b) > c || (b + c) > a || (a + c) > b;
        boolean checkMinus = a > 0 && b > 0 && c > 0;
        if ( checkSum && checkMinus ) {
            System.out.printf ("Triangle has a: %d, b: %d, c: %d",a,b,c);
        } else {
            throw new IllegalTriangleException();
        }
    }

    private static class IllegalTriangleException extends Throwable {
    }
}
