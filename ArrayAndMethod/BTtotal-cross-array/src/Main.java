import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap size ma tran vuong: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhap phan tu vi tri " + i + "," + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < size; i++) {
                total = total + matrix[i][i];
        }
        System.out.printf("Tong duong cheo cua matrix la: %d", total);
    }
}