
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        if (d <= 0 || r <= 0) {
            System.out.println(0);
        } else {
            System.out.println((d + r) * 2 + " " + d * r);
        }
        sc.close();
    }
}