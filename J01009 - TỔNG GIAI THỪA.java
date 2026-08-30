
// Cre by ManhNTzz
// Đệ quy tính giai thừa

import java.util.Scanner;

public class Main {
    private static long giaiThua(long n) {
        if (n == 0 || n == 1)
            return 1;
        return n * giaiThua(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += giaiThua(i);
        }
        System.out.println(sum);
        sc.close();
    }
}