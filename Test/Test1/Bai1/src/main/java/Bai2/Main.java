package Bai2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Mobile[] m = new Mobile[5];
    public static void fakeData(){
        m[0] = new Mobile("001", "Iphone11", 1000000, 3, "Iphone", "64GB");
        m[1] = new Mobile("002", "Iphone12", 1250000, 5, "Iphone", "128GB");
        m[2] = new Mobile("003", "SamSung", 5700000, 8, "SamSung", "32GB");
        m[3] = new Mobile("004", "Oppo", 3500000, 7, "Oppo", "16GB");
        m[4] = new Mobile("005", "Xiaomi", 5000000, 12, "Xiaomi", "64GB");
        print();
    }
    public static void print(){
        Mobile.printTittle();
        for(Mobile i : m){
            i.printData();
        }
    }
    public static void sort(){
        Comparator c = new Comparator<Mobile>() {
            @Override
            public int compare(Mobile o1, Mobile o2) {
                return Double.compare(o1.getTotalPrice(), o2.getTotalPrice());
            }
        };
        Arrays.sort(m, c);
        System.out.println("Danh sach sau khi sap xep theo TotalPrice: ");
        print();
    }
    public static void find(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap vao ten can tim: ");
        String a = s.nextLine();
        boolean check = false;
        for(Mobile i : m){
            if(i.getName().equals(a)){
                System.out.println("Tim thay!");
                i.printData();
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Khong tim thay!");
        }
    }
    public static void main(String[] args) {
        fakeData();
        sort();
        find();
    }
}