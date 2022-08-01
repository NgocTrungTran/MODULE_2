import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("0000000");
                    System.out.println(" 0   0");
                    System.out.println("  0 0");
                    System.out.println("   0");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("0 0 0 0 0");
                    System.out.println("0       0");
                    System.out.println("0       0");
                    System.out.println("0       0");
                    System.out.println("0 0 0 0 0");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("0 0 0 0 0 0");
                    System.out.println("0         0");
                    System.out.println("0 0 0 0 0 0");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}