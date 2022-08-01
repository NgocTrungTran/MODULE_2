import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so dong: ");
        int n = sc.nextInt();

        System.out.println("Nhap so cot: ");
        int m = sc.nextInt();

        int[][] arr2D = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhap phan tu vi tri " + i + "," + j + ": ");
                arr2D[i][j] = sc.nextInt();
            }

        }

        System.out.println("Nhap vao cot can tinh tong: ");
        int col = sc.nextInt();

        int total = 0;

        if (col <= m) {
            for (int i = 0; i < n; i++) {
                total = total + arr2D[i][col];
            }
        } else System.out.println("Khong hop le!");
        System.out.printf("Tong cac phan tu o cot %d la: %d", col, total);
    }
}