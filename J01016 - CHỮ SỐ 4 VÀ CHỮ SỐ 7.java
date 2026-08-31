
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dem = 0;
        for (char c:s.toCharArray()){
            if(c == '4' || c == '7'){
                dem++;
            }
        }
        System.out.println((dem == 4 || dem == 7) ? "YES" : "NO");
        sc.close();
    }
}
