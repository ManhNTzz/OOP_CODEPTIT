
import java.util.Scanner;

// Cre by ManhNTzz
// Sàng tính tổng ước số

public class Main {

    private static final int MAX = 1000001;
    private static int[] primes = new int[MAX];

    private static void Sang_Uoc() {
        for (int i = 1; i < MAX; i++) {
            for (int j = i * 2; j < MAX; j += i) {
                primes[j] += i;
            }
        }
    }

    public static void main(String[] args) {
        Sang_Uoc();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int dem = 0;
        for (int i = a; i <= b; i++) {
            if (primes[i] > i) {
                dem++;
            }
        }
        System.out.println(dem);
        sc.close();
    }
}