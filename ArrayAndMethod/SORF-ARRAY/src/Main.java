public class Main {

    public static void main(String[] args) {
        maxNegative(new int[]{1,5,-5,-2,-15,2,4});
//        int[] array = {1,5,-4,2,-9,4,-10};
//        int maxNegative = 0;
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < 0) {
//                maxNegative = array[i];
//                break;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0 && array[i] > maxNegative) {
//                maxNegative = array[i];
//            }
//        }
//        if (maxNegative == 0) {
//            System.out.println("Mang khong co so am!");
//        } else {
//            System.out.println("So am lon nhat trong mang la: " + maxNegative);
//        }
    }
    public static void maxNegative(int[] array) {
        int maxNegative = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) {
                maxNegative = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] > maxNegative) {
                maxNegative = array[i];
            }
        }
        if (maxNegative == 0) {
            System.out.println("Mang khong co so am!");
        } else {
            System.out.println("So am lon nhat trong mang la: " + maxNegative);
        }
    }
}


