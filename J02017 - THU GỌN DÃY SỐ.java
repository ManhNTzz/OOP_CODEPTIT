
// Sử dụng stack để giải
// Lần lượt duyệt từng phần tử của dãy
// Nếu stack không rỗng và tổng của đỉnh stack và x là số chẵn -> pop đỉnh stack
// Ngược lại đẩy x vào stack
// in ra kích thước stack  (st.size())

// Cre by ManhNTzz

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!st.empty() && (st.peek() + x) % 2 == 0) {
                st.pop();
            } else {
                st.push(x);
            }
        }
        System.out.println(st.size());
        sc.close();
    }
}