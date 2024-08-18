package Bai1;

import java.util.Scanner;

public class Bai1 {
    static Scanner s = new Scanner(System.in);
    public static int count(String str){
        int cnt = 0;
        for(char i : str.toCharArray()){
            if(i == ' '){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {

        System.out.print("Nhap T: ");
        int T = s.nextInt();
        s.nextLine();
        for(int i = 0; i < T; i++){
            System.out.println("Nhap chuoi: ");
            String a = s.nextLine();
            System.out.println(count(a));
        }
    }

}
