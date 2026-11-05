
import java.util.Scanner;

// Cre by ManhNTzz

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            int dem_1 = 0;
            for (int j = 0; j < 3; j++) {
                if (sc.nextInt() == 1) {
                    dem_1++;
                }
            }
            if (dem_1 > 3 - dem_1) {
                dem++;
            }
        }
        System.out.println(dem);
        sc.close();
    }
}