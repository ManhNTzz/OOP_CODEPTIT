
// Cre by ManhNTzz
// Sử dụng mảng để lưu số fibo

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
        sc.close();
    }
}