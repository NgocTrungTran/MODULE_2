import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        int x, output;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2 * n; j++){
                x = j - n;
                if (x < 0) {
                    x = x * -1;
                }
                output = i - x;

                if (output > 0) {
                    System.out.printf("%3d", output);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }
}
