import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new  int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhap phan tu can chen vao mang: ");
        int element = scanner.nextInt();

        System.out.println("Nhap vi tri can chen vao mang: ");
        int index = scanner.nextInt();

        if (index <= -1 || index > array.length) {
            System.out.println("Khong ton tai vi tri nay");
        }
        else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = element;
        }
        System.out.println(Arrays.toString(array));
    }
}