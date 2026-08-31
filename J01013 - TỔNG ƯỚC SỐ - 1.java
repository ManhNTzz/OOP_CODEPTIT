
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    // Mảng dp[] được dùng để lưu ước số nguyên tố nhỏ nhất của i
    // Dùng sàng để tính
    static long[] dp = new long[2000005];

    public static void sangUoc() {
        for (int i = 0; i <= 2000000; i++) {
            dp[i] = i;
        }
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= Math.sqrt(2000000); i++) {
            if (dp[i] == i) {
                // dp[i] = i nghĩa là i là số nguyên tố, duyệt qua các bội số của i
                for (int j = i * i; j <= 2000000; j += i) {
                    dp[j] = i;
                }
            }
        }
    }

    // Hàm tính tổng các ước số nguyên tố của 1 số
    public static long solve(int n) {
        long sum = 0;
        while (n > 1) {
            sum += dp[n];
            n /= dp[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sangUoc();
        int t = sc.nextInt();
        long sum = 0;
        // Cho t-- vào trong while thì mới có thể AC :v
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            sum += solve(n);
        }
        System.out.println(sum);
        sc.close();
    }
}