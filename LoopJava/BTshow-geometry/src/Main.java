import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle (4x8)");
            System.out.println("2. Print the square triangle (height: 6)");
            System.out.println("3. Print isosceles triangle (height: 7)");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 13; j++) {
                            if (j == 6 - i || j == 6 + i) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.print("\n");
                    }
                    for (int l = 0; l < 13; l++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}