
// Cre by ManhNTzz

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long max = 0;
            long n = sc.nextLong();
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    max = i;
                    while(n % i == 0) {
                        n/=i;
                    }
                }
            }
            if(n > 1) {
                max = n;
            }
            System.out.println(max);
        }
        sc.close();
    }
}
