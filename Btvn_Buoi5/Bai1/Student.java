package Bai1;

import java.util.Scanner;

public class Student {
    private String name, Class;
    private Double score;
    private Faculty y = new Faculty();

    public Student() {
    }

    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten sv: ");
        name = s.nextLine();
        System.out.print("Nhap lop: ");
        Class = s.nextLine();
        System.out.print("Nhap diem: ");
        score = s.nextDouble();
        y.input();
    }
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s%n", "Ten", "Lop", "Diem", "Ten Khoa", "Ngay vao khoa", "Ten Truong", "Ngay Vao Truong");
    }
    public void output(){
        System.out.printf("%-15s %-15s %-15s", name, Class, score);
        y.output();
    }
}
