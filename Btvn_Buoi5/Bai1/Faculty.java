package Bai1;

import java.util.Scanner;

public class Faculty {
    private String name, date;
    private School x = new School();

    public Faculty() {
    }

    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten khoa: ");
        name = s.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        date = s.nextLine();
        x.input();
    }
    public void output(){
        System.out.printf("%-15s %-15s", name, date);
        x.output();
    }
}
