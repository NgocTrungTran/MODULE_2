public class CmOfArray {
    public static void main(String[] args) {
        int[] arr = {3,4,9};
        int temp = 0;
        int bcnn = arr[0] > arr[1] ? arr[0] : arr[1];
        while (true) {
            if ( bcnn % arr[0] == 0 && bcnn % arr[1] == 0 ) {
                break;
            }
            bcnn++;
        }
        for (int i = 2; i < arr.length; i++) {
            temp = bcnn > arr[i] ? bcnn : arr[i];
            while (true) {
                if (temp % bcnn == 0 && temp % arr[i] == 0) {
                    break;
                }
                temp++;
            }
            bcnn = temp;
        }
        System.out.println(temp);
    }
}
