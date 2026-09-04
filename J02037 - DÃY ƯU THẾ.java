
// Dãy ưu thế
// Cre by ManhNTzz

import java.util.Scanner;

// Có bộ test, nhập vào không biết trước số lượng phần tử
// Sử dụng mảng String để nhập lấy các số đã nhập
// Sử dụng Integer.parseInt để tính

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            int dem = 0;
            for (int i = 0; i < s.length; i++) {
                if (Integer.parseInt(s[i]) % 2 == 0) {
                    dem++;
                }
            }
            if ((s.length % 2 == 0 && dem > (s.length - dem)) || (s.length % 2 == 1 && dem < (s.length - dem))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}