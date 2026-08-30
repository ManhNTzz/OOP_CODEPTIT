
// cre by ManhNTzz

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = s.toCharArray();
        int dem4 = 0, dem7 = 0;
        for (char c : a) {
            if (c == '4')
                dem4++;
            else if (c == '7')
                dem7++;
        }
        if (dem4 + dem7 == 4 || dem4 + dem7 == 7) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        sc.close();
    }
}