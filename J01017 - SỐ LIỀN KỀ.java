
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            char a[] = s.toCharArray();
            int ok = 1;
            for (int i = 0; i < a.length - 1; i++) {
                int x = a[i] - '0';
                int y = a[i + 1] - '0';
                if (x - y != 1 && y - x != 1) {
                    ok = 0;
                    break;
                }
            }
            if (ok == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}