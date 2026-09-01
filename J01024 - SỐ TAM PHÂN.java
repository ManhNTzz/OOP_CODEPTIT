
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {

    private static boolean check(String s) {
        for (char c : s.toCharArray()) {
            if (c > '2') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(check(s) ? "YES" : "NO");
        }
        sc.close();
    }
}