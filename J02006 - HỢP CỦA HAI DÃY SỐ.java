
import java.util.Scanner;
import java.util.TreeSet;

// Cre by ManhNTzz
// Dùng Treeset

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> res = new TreeSet<>();
        for (int i = 0; i < n + m; i++) {
            res.add(sc.nextInt());
        }
        for (Integer x : res) {
            System.out.print(x + " ");
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
// for (int i = 0; i < n + m; i++) {
// a[sc.nextInt()] = 1;
// }
// for (int i = 1; i < 1000; i++) {
// if (a[i] == 1) {
// System.out.print(i + " ");
// }
// }
// System.out.println();
// sc.close();
// }
// }