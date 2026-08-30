
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 1; c <= t; c++) {
            System.out.print("Test " + c + ": ");
            int n = sc.nextInt();
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i);
                    int dem = 0;
                    while (n % i == 0) {
                        n /= i;
                        dem++;
                    }
                    System.out.print("(" + dem + ")" + " ");
                }
            }
            if (n > 1) {
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
        sc.close();
    }
}