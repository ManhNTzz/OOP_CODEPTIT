
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {

    private static boolean check(int n) {
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(check(n) ? "YES" : "NO");
        }
        sc.close();
    }
}