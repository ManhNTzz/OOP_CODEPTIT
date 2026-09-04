
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

// Cre by ManhNTzz
// Dùng HashSet để kiểm tra

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet();
        while (n-- > 0) {
            set.add(sc.nextInt());
        }
        int max = Collections.max(set);
        if (set.size() == max) {
            System.out.println("Excellent!");
        } else {
            for (int i = 1; i <= max; i++) {
                if (!set.contains(i)) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}