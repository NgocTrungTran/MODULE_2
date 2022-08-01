import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int n = scanner.nextInt();

        int check = isPrime(n);
        if (check == 1) {
            System.out.println(n + " is a prime number!");
        }
        else {
            System.out.println(n + " is NOT a prime number!");
        }
    }
    private static int isPrime(int n) {
        int flag = 1;

        if (n < 2) {
            return flag = 0;
        }
//          Dung vong lap while
//        int i = 2;
//        while (i < n) {
//            if (n % i == 0) {
//                flag = 0;
//                break;
//            }
//            i++;
//        }
//          Dung vong lap for
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }
}