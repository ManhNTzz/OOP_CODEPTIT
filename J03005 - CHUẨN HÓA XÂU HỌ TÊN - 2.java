
import java.util.Scanner;

// Cre by ManhNTzz

public class Main {

    private static String chuanHoa(String s) {
        String s1 = s.substring(0, 1).toUpperCase();
        String s2 = s.substring(1, s.length()).toLowerCase();
        return s1 + s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] res = s.trim().split("\\s+");
            for (int i = 1; i < res.length; i++) {
                System.out.print(chuanHoa(res[i]));
                if (i != res.length - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(", ");
                }
            }
            System.out.println(res[0].toUpperCase());
        }
        sc.close();
    }
}