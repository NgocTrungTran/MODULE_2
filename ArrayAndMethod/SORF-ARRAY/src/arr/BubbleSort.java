package arr;
public class BubbleSort {
    // Hàm sắp xếp nổi bọt
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // In các phần tử của arr
    void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) {
            System.out.print ( j + " " );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int[] arr = { 5, -11, 4, 2, 8 };
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
