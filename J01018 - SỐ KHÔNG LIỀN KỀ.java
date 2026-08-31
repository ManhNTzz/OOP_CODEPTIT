
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
            int ok1 = 1;
            for (int i = 0; i < a.length - 1; i++) {
                int x = a[i] - '0';
                int y = a[i + 1] - '0';
                if (x - y != 2 && y - x != 2) {
                    ok1 = 0;
                    break;
                }
            }
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i] - '0';
            }
            int ok2 = 1;
            if (sum % 10 != 0)
                ok2 = 0;
            if (ok1 == 1 && ok2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            sc.close();
        }
    }

}