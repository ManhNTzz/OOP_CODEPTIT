
import java.util.Arrays;
import java.util.Scanner;

// Cre by ManhNTzz

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[] mt = new int[n * n];
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                mt[dem++] = a[i][j];
            }
        }
        Arrays.sort(mt);
        int trai = 0, phai = n - 1, tren = 0, duoi = n - 1;
        int tmp = 0;
        while (tmp < dem) {
            for (int i = trai; i <= phai; i++) {
                b[tren][i] = mt[tmp++];
            }
            tren++;
            for (int i = tren; i <= duoi; i++) {
                b[i][phai] = mt[tmp++];
            }
            phai--;
            for (int i = phai; i >= trai; i--) {
                b[duoi][i] = mt[tmp++];
            }
            duoi--;
            for (int i = duoi; i >= tren; i--) {
                b[i][trai] = mt[tmp++];
            }
            trai++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}