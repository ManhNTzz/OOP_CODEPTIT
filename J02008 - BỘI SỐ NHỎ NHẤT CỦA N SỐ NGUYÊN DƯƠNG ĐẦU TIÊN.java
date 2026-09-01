
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    public static long _gcd(long a, long b) {
        if (b == 0)
            return a;
        return _gcd(b, a % b);
    }

    public static long boiChung(long a, long b) {
        return a * b / _gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long res = 1;
            for (int i = 2; i <= n; i++) {
                res = boiChung(res, i);
            }
            System.out.println(res);
        }
        sc.close();
    }
}