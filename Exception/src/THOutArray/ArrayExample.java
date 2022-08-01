package THOutArray;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRamdom() {
        Random random = new Random ();
        Integer[] arr = new Integer[100];
        System.out.println ("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt (100);
            System.out.println (arr[i] + " ");
        }
        return arr;
    }
}
