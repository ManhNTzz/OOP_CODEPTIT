
// Tạo 1 mảng ArraysList để add a[i] vào xong rồi sort và in ra thôi :))
// Cre by ManhNtzz

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(a[i]);
            Collections.sort(res);
            System.out.print("Buoc " + i + ": ");
            for (Integer x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}