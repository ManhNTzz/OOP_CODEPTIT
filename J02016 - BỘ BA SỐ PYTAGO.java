// Thuật toán O(n ^ 2) dùng 2 con trỏ
// Lưu mảng dưới dạng bình phương, sắp xếp mảng tăng dần
// Cố định cạnh huyền chạy từ a[n - 1] về a[2]
// Dùng hai con trở l = 0 và r = i - 1 để tìm 
// Do cạnh huyền đã cố định nên hai cạnh còn lại phải nhỏ hơn i - 1 

// Cre by ManhNTzz

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                a[i] = x * x;
            }
            Arrays.sort((a));
            int ok = 0;
            for (int i = n - 1; i >= 2; i--) {
                int l = 0, r = i - 1;
                if (ok == 1)
                    break;
                while (l < r) {
                    if (a[l] + a[r] == a[i]) {
                        ok = 1;
                        break;
                    } else if (a[l] + a[r] < a[i]) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
            System.out.println((ok == 1) ? "YES" : "NO");
        }
        sc.close();
    }
}