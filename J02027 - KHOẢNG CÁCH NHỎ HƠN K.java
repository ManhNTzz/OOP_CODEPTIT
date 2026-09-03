
// Cre by ManhNTzz

import java.util.Arrays;
import java.util.Scanner;

// Khoảng cách nhỏ hơn k
// Ý tưởng: Sắp xếp dãy xong dùng tìm kiếm nhị phân
// Sắp xếp mảng tăng dần 
// Điều kiện a[j] - a[i] < k (a[j] là phần tử đứng sau a[i])
// -> a[j] < a[i] + k
// với mỗi i tìm vị trí p đầu tiên trong đoạn [i + 1, n - 1] mà a[p] > a[i] + k
// -> Mọi chỉ số từ i + 1 đến p - 1 đều thỏa mãn
// -> có p - 1 - (i + 1) + 1 = p - i - 1 cặp thỏa mãn cộng dồn vào biến dem

public class Main {

    // Tìm vị trí đầu tiên trong đoạn [left, right] có giá trị >= x
    // Nếu không có phần tử nào >= x, trả về right + 1

    public static int lower_bound(int[] a, int l, int r, int x) {
        int res = r + 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] >= x) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            long dem = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < n - 1; i++) {
                int p = lower_bound(a, i + 1, n - 1, a[i] + k);
                dem += p - i - 1;
            }
            System.out.println(dem);
        }
        sc.close();
    }
}