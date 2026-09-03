
// Cre by ManhNTzz

import java.util.Scanner;

// Dãy con có tổng nguyên tố
// Sấp xếp mảng giảm dần
// Sử dụng phương pháp quay lui duyệt ngược
// Bảo toàn thứ tự mảng gốc: Điều kiện j > i
// đảm bảo các phần tử được chọn luôn theo đúng thứ tự từ trước ra sau trong mảng giảm dần ban đầu
// Do vòng lặp chạy từ j = a.length - 1 (phần tử nhỏ nhất) giảm dần về i + 1 (phần tử lớn hơn)
// Thuật toán sẽ luôn ưu tiên các số có giá trị nhỏ trước -> kết quả in ra luôn tăng dần theo thứ tự từ điển

public class Main {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void Try(int i, int[] a, int sum, String s) {
        if (isPrime(sum)) {
            System.out.println(s);
        }
        for (int j = a.length - 1; j > i; j--) {
            Try(j, a, sum + a[j], s + a[j] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (a[j] < a[j + 1]) {
                        int tmp = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            Try(-1, a, 0, "");
        }
        sc.close();
    }
}