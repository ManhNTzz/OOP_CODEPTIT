
// Cre by ManhNTzz

import java.util.Scanner;

// Sử dụng chia để trị
// Quy ước bài toán: s[1] = '0', s[2] = '1'
// với n >= 3: s[n] = s[n - 2] + s[n - 1] ( ghép nối xâu s[n - 2] vào xâu s[n - 1]
// Mảng f[i] lưu độ dài xâu s[i] chính là dãy fibonacci
// Ý tưởng:
// Đệ quy thu hẹp về n = 1 -> trả về '0'
// Khi thu hẹp về n = 2 -> trả về '1'
// nếu k <= f[n - 2] -> kí tự thứ k chắc chắn thuộc xâu f[n - 2] -> gọi đệ quy fiboWord(n - 2, k)
// Nếu k > f[n - 2] -> kí tự thứ k thuộc xâu f[n - 1] 
// Để tính chỉ số tương úng trong xâu s[n - 1] ta phải trừ độ dài phần xâu đã bỏ qua: k1 = k - f[n - 2]
// Gọi đệ quy fiboWord(n - 1, k - f[n - 2])

public class Main {

    static long[] f = new long[100];

    public static char fiboWord(int n, long k) {
        if (n == 1)
            return '0';
        if (n == 2)
            return '1';
        if (k <= f[n - 2])
            return fiboWord(n - 2, k);
        else
            return fiboWord(n - 1, k - f[n - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fiboWord(n, k));
        }
        sc.close();
    }
}