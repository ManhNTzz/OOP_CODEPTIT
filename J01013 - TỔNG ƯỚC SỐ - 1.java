
// Cre by ManhNTzz

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MAX = 2000001;
    
    // Tạo List lưu các thừa số nguyên tố
    private static ArrayList<Integer> primes;
    
    // Sàng số nguyên tố
    private static void Sang(){
        primes = new ArrayList<>();
        boolean [] isPrime = new boolean[MAX];
        // Số nguyên tố đại diện cho true
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i <= Math.sqrt(MAX); i++){
            if(isPrime[i]){
                for (int j = i * i; j < MAX;j += i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i < MAX; i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
    }
    public static void main(String[] args) {
        Sang();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while(t-- > 0) {
            int n = sc.nextInt();
            for(Integer x:primes){
                if(x * x > n){
                    break;
                }
                while(n % x == 0){
                    sum += x;
                    n /= x;
                }
            }
            if (n > 1){
                sum += n;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
