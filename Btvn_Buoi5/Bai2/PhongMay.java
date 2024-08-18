package Bai2;

import java.util.Scanner;

public class PhongMay {
    private String maPhong, tenPhong;
    private Double dienTich;
    private QuanLy x = new QuanLy() ;
    private May[] y = new May[100];
    private int n;
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        maPhong = s.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong = s.nextLine();
        System.out.print("Nhap dien tich: ");
        dienTich = s.nextDouble();
        x.nhap();
        System.out.print("Nhap so luong may tinh: ");
        n = s.nextInt();
        for(int i = 0; i < n; i++){
            y[i] = new May();
            y[i].nhap();
        }
    }
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n","Ma phong", "Ten phong", "Dien tich", "So may", "Ma Ql", "Ho ten Ql");
    }
    public void xuat(){
        System.out.printf("%-15s %-15s %-15.1f %-15d",maPhong, tenPhong, dienTich, n);
        x.xuat();
        May.inTieuDe();
        for(int i = 0; i < n; i++) {
            y[i].xuat();
        }
    }
}
