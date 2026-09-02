
import java.util.Scanner;

// Cre by ManhNTzz

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int s = 0;
            int dem = -1;
            for (int i = 0; i < n; i++) {
                if (s == sum - a[i] - s) {
                    dem = i + 1;
                    break;
                }
                s += a[i];
            }
            System.out.println(dem);
        }
        sc.close();
    }
}