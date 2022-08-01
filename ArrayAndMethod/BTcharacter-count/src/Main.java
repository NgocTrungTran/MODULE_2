import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi: ");
        String str = sc.nextLine();

        System.out.println("Nhap ki tu can dem: ");
        String string = sc.nextLine ();

        char character = string.charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if ( str.charAt(i) == character) {
                count += 1;
            }
        }
        System.out.printf("So lan ky tu %s xuat hien trong chuoi %s la: %d", character, str, count);
    }
}