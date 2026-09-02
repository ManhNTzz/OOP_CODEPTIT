// Sắp xếp chọn
// Duyệt vòng for i từ 0 -> n - 1 và tạo index = i
// Duyệt vòng for j từ i + 1 -> n 
// Nếu a[index] > a[j] thì index = j
// Đổi chỗ a[index] và a[i] rồi in

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[index] > a[j]) {
                    index = j;
                }
            }
            int tmp = a[index];
            a[index] = a[i];
            a[i] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}