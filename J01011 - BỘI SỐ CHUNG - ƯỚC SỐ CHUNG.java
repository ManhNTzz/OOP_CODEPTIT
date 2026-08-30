
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    // Đệ quy tìm ucln
    public static long _gcd(long a, long b) {
        if (b == 0)
            return a;
        return _gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println((a * b) / _gcd(a, b) + " " + _gcd(a, b));
        }
        sc.close();
    }
}