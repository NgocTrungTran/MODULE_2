import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int minValue = Integer.MIN_VALUE;

        System.out.print("Array: ");

        for (int i : myArray) {

            if (i < 0 && i % 2 != 0 && i > minValue) minValue = i;
            System.out.print(i + " ");

        }

        System.out.println("\n The minimum even positive number of array: " + minValue);
    }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhap so nguyen: ");
//        int n = scanner.nextInt();
//
//        int check = isPrime(n);
//        if (check == 1) {
//            System.out.println(n + " is a prime number!");
//        }
//        else {
//            System.out.println(n + " is NOT a prime number!");
//        }
//    }
//    private static int isPrime(int n) {
//        int flag = 1;
//
//        if (n < 2) {
//            return flag = 0;
//        }
////          Dung vong lap while
////        int i = 2;
////        while (i < n) {
////            if (n % i == 0) {
////                flag = 0;
////                break;
////            }
////            i++;
////        }
////          Dung vong lap for
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                flag = 0;
//                break;
//            }
//        }
//        return flag;
//    }
}
