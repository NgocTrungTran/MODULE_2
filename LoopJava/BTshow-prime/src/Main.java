import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can hien thi: ");
        int numPrimes = scanner.nextInt();

        int check = 1;
        int n = 3;

        if (numPrimes >= 1) {
            System.out.println(numPrimes + " so nguyen to dau tien la: ");
            System.out.println(2);
        }
        for (int i = 2; i <= numPrimes; ) {
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    check = 0;
                    break;
                }
            }
            if (check != 0) {
                System.out.println(n);
                i++;
            }
            check = 1;
            n++;
        }
    }
}
