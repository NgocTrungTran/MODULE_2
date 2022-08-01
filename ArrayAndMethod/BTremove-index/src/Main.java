import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{5, 3, 8, 7, 4, 2, 4, 9};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so can xoa trong mang: ");
        int x = scanner.nextInt();

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != x) {
                list.add(array[i]);
            }
        }

        array = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
    }
}
