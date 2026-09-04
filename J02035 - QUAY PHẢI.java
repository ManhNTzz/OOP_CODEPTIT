
import java.util.Arrays;
import java.util.Scanner;

// Cre by ManhNTzz
// Ý tưởng: sort lại dãy qua mảng khác và tìm vị trí phần tử đầu tiên trong mảng ban đầu

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                b[i] = a[i];
            }
            Arrays.sort(b);
            for (int i = 0; i < n; i++) {
                if (b[0] == a[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}