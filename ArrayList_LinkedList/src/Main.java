import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.remove (3);
        arr.add(1, 2);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
