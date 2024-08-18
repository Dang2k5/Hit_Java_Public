package Bai1;

import java.util.Scanner;

public class School {
    private String name, date;
    public School(){

    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten truong: ");
        name = s.nextLine();
        System.out.print("Nhap ngay vao truong: ");
        date = s.nextLine();
    }

    public void output(){
        System.out.printf("%-15s %-15s%n", name, date);
    }
}
