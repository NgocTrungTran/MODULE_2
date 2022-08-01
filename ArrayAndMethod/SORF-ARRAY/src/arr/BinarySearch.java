package arr;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    // Trả về chỉ mục của x nếu nó có trong arr[l..r]
    // ngược lại trả về -1
    int binarySearch(int[] arr, int l, int r, int x) {
        if ( r >= l ) {
            int mid = (l + r) / 2;

            if ( arr[mid] == x ) {
                return mid;
            }
            if ( arr[mid] > x ) {
                return binarySearch ( arr, l, mid - 1, x );
            } else {
                return binarySearch ( arr, mid + 1, r, x );
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch ();
        int[] arr = {6, 4, -8, 25, 69, 42, 16};

        InsertionSort insertionSort = new InsertionSort ();
        insertionSort.sort ( arr );
        System.out.println ( "Mảng sau khi sắp xếp tăng dần: " + Arrays.toString ( arr ) );
        int n = arr.length;

        Scanner sc = new Scanner ( System.in );
        System.out.println ("Nhập số cần tìm kiếm: ");
        int x = sc.nextInt ();
        int result = ob.binarySearch ( arr, 0, n - 1, x );
        if ( result == -1 )
            System.out.println ( "Phần tử không tồn tại." );
        else
            System.out.printf ( "Phần tử %d được tìm thấy tại vị trí: %d",x , result );
    }
}
