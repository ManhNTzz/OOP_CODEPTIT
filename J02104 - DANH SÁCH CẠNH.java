
import java.util.Scanner;

// Cre by ManhNTzz

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (sc.nextInt() == 1 && i < j) {
                    System.out.println(String.format("(%d,%d)", i, j));
                }
            }
        }
        sc.close();
    }
}