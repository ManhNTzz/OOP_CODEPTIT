
import java.util.Scanner;
import java.util.TreeSet;

// Cre by ManhNTzz
// Dùng Treeset

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        while (n-- > 0) {
            a.add(sc.nextInt());
        }
        TreeSet<Integer> b = new TreeSet<>();
        while (m-- > 0) {
            b.add(sc.nextInt());
        }
        for (Integer x : a) {
            // Kiểm tra b chứa x trong a
            if (b.contains(x)) {
                System.out.print(x + " ");
            }
        }
        sc.close();
    }
}

// Cách khác

// public class Main {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int[] a = new int[1000];
// int[] b = new int[1000];
// for (int i = 0; i < n; i++) {
// a[sc.nextInt()] = 1;
// }
// for (int i = 0; i < m; i++) {
// b[sc.nextInt()] = 1;
// }
// for (int i = 1; i < 1000; i++) {
// if (a[i] == 1 && b[i] == 1) {
// System.out.print(i + " ");
// }
// }
// System.out.println();
// sc.close();
// }
// }