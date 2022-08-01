import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float width;
        float height;

//          khai bao doi tuong Scanner
        Scanner scanner = new Scanner(System.in);
//        nhap chieu dai
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
//        nhap chieu rong
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
//        Tinh dien tich
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}