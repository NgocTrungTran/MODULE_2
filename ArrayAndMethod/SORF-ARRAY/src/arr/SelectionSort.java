package arr;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    void sort(int[] arr) {
        //   [4,5,1,7]
        int n = arr.length;
//        Duyệt các phần tử trong mảng
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
//            Duyệt các phần tử sau vị trí i
            for (int j = i + 1; j < n; j++) {
                if ( arr[j] < arr[minIndex] ) {
                    minIndex = j;
                }
            }
//              Hoán đổi vị trí phần tử nhỏ nhất
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int[] arr) {
        System.out.print( Arrays.toString ( arr ) );
        System.out.println ();
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        Scanner scanner = new Scanner ( System.in );

        System.out.println ("Enter size of array: ");
        int size = scanner.nextInt ();
        int[] arr = new int[size];
        if (size > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println ("Enter index " + i + ": ");
                arr[i] = scanner.nextInt ();
            }
        }
//        SelectionSort ob = new SelectionSort();
//        int [] arr1 = {4,5,1,7};
        System.out.println("Array before: ");
        ob.printArray(arr);

        ob.sort(arr);
        System.out.println("Array after: ");
        ob.printArray(arr);
    }
}
