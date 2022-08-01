import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Nhap vao so nguyen n (n != -1): ");
        int n = scanner.nextInt();

        if (n == -1) {
            System.out.println("Khong nhap -1, hay nhap lai so nguyen n: ");
        }
        else {
            for (int i = n; i >= -100; i--) {
                System.out.println(i);
            }
        }
    }
}
