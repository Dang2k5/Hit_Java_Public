
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap n: ");
        int n = s.nextInt();
        int[] a = new int [n];
        System.out.println("Nhap mang: ");
        for(int i = 0; i < n; i++){
            System.out.printf("a[" + i + "]: ");
            a[i] = s.nextInt();
        }
        // Chữa
//        for(int i = 0; i < n; i++) {
//            if (i % 2 != 0) {
//                int p = 0;
//                if (i == n - 1) {
//                    p = a[i - 1];
//                } else {
//                    p = a[i - 1] - a[i + 1];
//                    if (p < 0) p *= -1;
//                }
//                a[i] += p;
//            }
//        }

// It's me
        for(int i = 1; i < n; i += 2){
            if (i == n - 1){
                a[i] += a[i - 1];
            }else {
                a[i] += Math.abs(a[i + 1] - a[i - 1]);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
