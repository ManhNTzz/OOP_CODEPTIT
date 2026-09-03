
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    static int[] a = new int[105];
    static int n, k, dem = 0;

    public static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                dem++;
                for (int c = 1; c <= k; c++) {
                    System.out.print(a[c]);
                }
                System.out.print(" ");
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co " + dem + " to hop");
        sc.close();
    }
}