
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {

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
            long n = sc.nextLong();
            int check = 0;
            for (int i = 0; i <= 92; i++) {
                if (n == f[i]) {
                    check = 1;
                    break;
                }
            }
            if (check == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}