
import java.util.Scanner;

// Cre by ManhNTzz

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 1; c <= t; c++) {
            System.out.println("Test " + c + ":");
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int tong = 0;
                    for (int k = 0; k < m; k++) {
                        tong += a[i][k] * a[j][k];
                    }
                    System.out.print(tong + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
