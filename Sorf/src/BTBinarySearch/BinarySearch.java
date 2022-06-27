package BTBinarySearch;

public class BinarySearch {
    //1. khởi tạo 1 mảng bất kì
    private static int[] list = {2,5,7,9,13,16,18,26,29,34,45,56,67,78};
    //2. sắp xếp lại theo thứ tự từ bé đến lớn

    //3. khai báo hàm binarySearch
    public static int binarySearch(int[] arr, int left, int right, int value)
    {
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (arr[middle] == value)
                return middle;
            else if (arr[middle] > value)
                right = middle - 1;
            else
                left = middle + 1;
            return binarySearch(arr,left,right,value);
        }
        return -1;
    }
    //4. khai báo biến middle và gán giá trị tb cộng
    //5. nếu  arr[mid] = value => trả về midle
    //6. value > arr[mid] thì so sánh phần từ bên phải thay left = mid + 1
    //7. value < arr[mid] thì so sánh phần từ bên trái của mid right = mid - 1;


    public static void main(String[] args) {
        System.out.println(binarySearch(list,0, list.length - 1 , 2));
        System.out.println(binarySearch(list,0, list.length - 1 , 6));
        System.out.println(binarySearch(list,0, list.length - 1 , 14));
        System.out.println(binarySearch(list,0, list.length - 1 , 67));
        System.out.println(binarySearch(list,0, list.length - 1 , 78));
        System.out.println(binarySearch(list,0, list.length - 1 , 56));
    }
}
