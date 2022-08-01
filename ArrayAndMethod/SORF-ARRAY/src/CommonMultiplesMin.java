import java.util.Scanner;

public class CommonMultiplesMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        System.out.println ("Enter number a: ");
        int a = sc.nextInt ();

        System.out.println ("Enter number b: ");
        int b = sc.nextInt ();
        int cm_min = (a > b) ? a : b;

        while (true) {
            if (cm_min % a == 0 && cm_min % b == 0) {
                System.out.printf ("Common Multiples Min of %d and %d is: %d", a, b, cm_min);
                break;
            }
            cm_min++;
        }
    }
}
