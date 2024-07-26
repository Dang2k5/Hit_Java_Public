import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = s.nextInt();
        int[][] a = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = s.nextInt();
            }
        }
        int hang1 = 0, hang2 = n - 1;
        int cot1 = 0, cot2 = n - 1;
        int dem = 1;
        while(hang1 <= hang2 && cot1 <= cot2){
            // xay canh tren
            for(int i = cot1; i <= cot2; i++){
                a[hang1][i] = dem;
                ++dem;
            }
            ++hang1;
            // xay canh trai
            for(int i = hang1; i <= hang2; i++){
                a[i][cot2] = dem;
                ++dem;
            }
            --cot2;
            // xay canh duoi
            for(int i = cot2; i >= cot1; i--){
                a[hang2][i] = dem;
                ++dem;
            }
            // xay canh phai
            --hang2;
            for(int i = hang2; i >= hang1; i--){
                a[i][cot1] = dem;
                ++dem;
            }
            ++cot1;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
