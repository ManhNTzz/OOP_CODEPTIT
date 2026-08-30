
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    private static boolean IsPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(IsPrime(n) ? "YES" : "NO");
        }
        sc.close();
    }
}