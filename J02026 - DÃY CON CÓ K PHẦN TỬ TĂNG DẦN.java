
// Cre by ManhNTzz

import java.util.Arrays;
import java.util.Scanner;

// Dãy con có k phần tử tăng dần

public class Main {

    private static int n, k;
    private static int[] a = new int[105];
    private static int[] b = new int[105];

    // i: Vị trí đang xét trong tổ hợp (1 -> k)
    // start: Chỉ số bắt đầu chọn trong mảng a

    public static void Try(int i, int start) {
        for (int j = start; j <= n - k + i; j++) {
            b[i] = a[j];
            if (i == k) {
                for (int c = 1; c <= k; c++) {
                    System.out.print(b[c] + " ");
                }
                System.out.println();
            } else
                Try(i + 1, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 1, n + 1);
            Try(1, 1);
        }
        sc.close();
    }
}