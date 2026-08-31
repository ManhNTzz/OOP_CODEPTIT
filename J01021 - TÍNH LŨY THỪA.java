
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {

    private static final int mod = (int) 1e9 + 7;

    private static long Power(long n, long k) {
        if (k == 0) {
            return 1;
        }
        long pt = Power(n, k / 2);
        long so = pt * pt % mod;
        if (k % 2 == 1) {
            return so * n % mod;
        }
        return so;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 20;
        while (t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong();
            if (n == 0 && k == 0) {
                break;
            }
            System.out.println(Power(n, k));
        }
        sc.close();
    }
}