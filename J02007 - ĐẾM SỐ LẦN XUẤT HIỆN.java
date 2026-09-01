
import java.util.LinkedHashMap;
import java.util.Scanner;

// Cre by ManhNTzz
// Dùng LinkedHashmap

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            while (n-- > 0) {
                int m = sc.nextInt();
                map.put(m, map.getOrDefault(m, 0) + 1);
            }
            System.out.println("Test " + k + ":");
            for (Integer key : map.keySet()) {
                System.out.println(String.format("%d xuat hien %d lan", key, map.get(key)));
            }
        }
        sc.close();
    }
}

// Cách thông thường

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// for (int c = 1; c <= t; c++) {
// System.out.println("Test " + c + ":");
// int n = sc.nextInt();
// int[] a = new int[n];
// int[] b = new int[10000];
// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// b[a[i]]++;
// }
// for (int i : a) {
// if (b[i] > 0) {
// System.out.println(i + " xuat hien " + b[i] + " lan");
// b[i] = 0;
// }
// }
// }
// sc.close();
// }
// }