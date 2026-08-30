
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int dem = 0;
            int n = sc.nextInt();
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        dem++;
                    }
                    if (i != n / i) {
                        if (n / i % 2 == 0)
                            dem++;
                    }
                }
            }
            System.out.println(dem);
        }
        sc.close();
    }
}