package Bai1;

import java.util.Scanner;

public class Main {
    static int soSV;
    static Student[] s = new Student[100];
    public static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sv: ");
        soSV = sc.nextInt();
        for(int i = 0; i < soSV; i++){
            s[i] = new Student();
            s[i].input();
        }
    }
    public static void xuat(){
        Student.inTieuDe();
        for(int i = 0; i < soSV; i++){
            s[i].output();
        }
    }

    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
