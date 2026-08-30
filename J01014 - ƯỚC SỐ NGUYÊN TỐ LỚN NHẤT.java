
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    private static boolean snt(long n) {
        if (n < 2)
            return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long res = 0;
            while (n % 2 == 0) {
                res = 2;
                n /= 2;
            }
            for (long i = 3; i * i <= n; i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        res = i;
                        n /= i;
                    }
                }
            }
            if (n > 1)
                res = n;

            System.out.println(res);
        }
        sc.close();
    }
}