
// Cre by ManhNTzz

import java.util.Scanner;

// Giả sử ban đầu tam giác có diện tích s và chiều cao h
// Công thức toán học
// Giả sử lát cắt 1 <= i <= n - 1 tính từ đỉnh sẽ tạo ra tam giác nhỏ đồng dạng
// với tam giác lớn
// diện tích tam giác nhỏ si = i/n * s
// Tỉ số diện tích của hai tam giác đồng dạng bằng bình phương tỉ số chiều cao
// si/s = (hi/h)^2 = i / n -> hi = h * sqrt(i/n)

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextInt();
            double h = sc.nextInt();
            for (double i = 1; i < n; i++) {
                double hi = h * Math.sqrt(i / n);
                System.out.printf("%.6f ", hi);
            }
            System.out.println("");
        }
        sc.close();
    }
}