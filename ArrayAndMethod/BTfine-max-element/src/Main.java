import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so dong: ");
        int n = scanner.nextInt();

        System.out.println("Nhap so cot: ");
        int m = scanner.nextInt();

        int[][] array2D = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhap phan tu thu [" + i + "][" + j + "]");
                array2D[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Cac phan tu trong mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int max = array2D[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }
            }
        }
        System.out.println("Phan tu co gia tri lon nhat la: " + max);
    }
}