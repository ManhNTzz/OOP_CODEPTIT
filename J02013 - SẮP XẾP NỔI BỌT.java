
import java.util.Scanner;

// Thuật toán sắp xếp nổi bọt
// Dùng hai vòng lặp so sánh để đổi chỗ
// Đk dừng sớm: dùng biến check
// Sau 1 lượt duyệt mà không có phép hoán đổi -> mảng đã được sắp xếp -> check = false -> dừng sớm

// Cre by ManhNTzz

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            int check = 1;
            for (int j = 1; j < n; j++) {
                if (a[j] < a[j - 1])
                    check = 0;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            if (check == 1)
                break;
            System.out.println();
        }
        sc.close();
    }
}