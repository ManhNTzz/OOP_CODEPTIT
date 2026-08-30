
// Cre by ManhNTzz

import java.util.Scanner;

// Hàm trả về các kí tự sau khi cắt đôi, nếu không thỏa mãn trả về -1
// Duyệt xâu để lấy ra số tạo bởi xâu
// Kiểm số thỏa mãn nếu = 0 thì không in ra

public class Main {

    public static int catDoi(char c) {
        if (c == '0' || c == '9' || c == '8') {
            return 0;
        }
        if (c == '1') {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            char[] a = s.toCharArray();
            int ok = 1;
            long res = 0;
            for (int i = 0; i < s.length(); i++) {
                int x = catDoi(a[i]);
                if (x == -1) {
                    ok = 0;
                    System.out.println("INVALID");
                    break;
                }
                res = res * 10 + x;
            }
            if (res == 0) {
                if (ok == 1) {
                    System.out.println("INVALID");
                }
            } else
                System.out.println(res);
        }
        sc.close();
    }
}