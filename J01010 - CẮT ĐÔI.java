
// Cre by ManhNtzz

import java.util.Scanner;
public class Main {

    private static String catDoi(String s) {
        String res = "";
        for (char c : s.toCharArray()) {
            if (c == '8' || c == '9' || c == '0') {
                // Xử lý trường hợp số 0 đầu tiên
                if (res.length() > 0) {
                    res += "0";
                }
            } else if (c == '1') {
                res += "1";
            } else {
                return "INVALID";
            }
        }
        return res.length() == 0 ? "INVALID" : res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(catDoi(s));
        }
        sc.close();
    }
}
