package Bai2;

import java.util.Scanner;

public class May {
    private String maMay, tenMay, tinhTrang;

    public May() {
    }

    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma may: ");
        maMay = s.nextLine();
        System.out.print("Nhap ten may: ");
        tenMay = s.nextLine();
        System.out.print("Nhap tinh trang: ");
        tinhTrang = s.nextLine();
    }
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s%n", "Ma may", "Ten may", "Tinh trang");
    }
    public void xuat(){
        System.out.printf("%-15s %-15s %-15s%n", maMay, tenMay, tinhTrang);
    }
}
