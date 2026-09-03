
// Cre by ManhNTzz

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] a = new int[105];
    private static int n;
    private static boolean[] vs = new boolean[105];

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!vs[j]) {
                vs[j] = true;
                a[i] = j;
                if (i == n) {
                    int ok = 1;
                    for (int c = 1; c < n; c++) {
                        if (Math.abs(a[c] - a[c + 1]) == 1) {
                            ok = 0;
                            break;
                        }
                    }
                    if (ok == 1) {
                        for (int c = 1; c <= n; c++) {
                            System.out.print(a[c]);
                        }
                        System.out.println();
                    }
                } else
                    Try(i + 1);
                vs[j] = false;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            Arrays.fill(vs, false);
            Try(1);
        }
        sc.close();
    }
}