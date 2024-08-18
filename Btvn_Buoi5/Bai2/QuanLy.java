package Bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQL, hoTen;

    public QuanLy() {
    }

    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma QL: ");
        maQL = s.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
    }
    public void xuat(){
        System.out.printf("%-15s %-15s%n", maQL, hoTen);
    }
}
