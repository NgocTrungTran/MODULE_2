import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr_1 = new int[3];

        for (int i = 0; i < arr_1.length; i++) {
            System.out.println("Element " + (i + 1) + " of arr_1: ");
            arr_1[i] = scanner.nextInt();
        }

        int[] arr_2 = new int[4];
        for (int i = 0; i < arr_2.length; i++) {
            System.out.println("Element " + (i + 1) + " of arr_1: ");
            arr_2[i] = scanner.nextInt();
        }

        int[] arr_3 = new int[7];

        for (int i = 0; i < arr_1.length; i++) {
            for (int j = i; j < arr_3.length; j++) {
                arr_3[j] = arr_1[i];
            }
        }
        for (int i = 0; i < arr_2.length; i++) {
            for (int j = i + 3; j < arr_3.length; j++) {
                arr_3[j] = arr_2[i];
            }
        }
        System.out.println(Arrays.toString(arr_3));
    }
}