
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> st = new ArrayList<Student>();

    public static Student s1 = new Student();
    static Scanner s = new Scanner(System.in);
    public static void fakeData(){
        Student s1 = new Student("Dang", "HY", 2005, 0, 10, 10, 9);
        Student s2 = new Student("Long", "TB", 2001, 2, 8, 8, 9);
        Student s3 = new Student("Nam", "NB", 2003, 1, 9, 9,9);
        st.add(s1);
        st.add(s2);
        st.add(s3);

    }

    public static void xuat(){
        Student.inTieuDe();
        for(Student i : st){
            i.xuat();
        }
    }
    public static void them(){
        s1.nhap();
        st.add(s1);
        xuat();
    }
    public static void sua(){
        System.out.print("Nhap vi tri can sua: ");
        int index = s.nextInt();
        st.remove(index);
        s1.nhap();
        st.add(index, s1);
        xuat();
    }
    public static void xoa(){
        System.out.print("Nhap vi tri can xoa: ");
        int index = s.nextInt();
        st.remove(index);
        xuat();
    }
    public static void menu(){
        int choose;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("=============Menu==============");
            System.out.println("0.Thoat chuong trinh\n" +
                    "1.Them sinh vien moi\n" +
                    "2.Sua thong tin sinh vien\n" +
                    "3.Sap xep sinh vien theo tuoi\n" +
                    "4.Sap xep sinh vien theo GPA\n" +
                    "5.Sap xep sinh vien theo so tiet nghi\n" +
                    "6.Xoa sinh vien khoi danh sach");
            System.out.print("Nhap lua chon cua ban: ");
            choose = s.nextInt();
            switch (choose){
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;

                case 3:
                    Comparator c = new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return Integer.compare(o1.tinhTuoi(), o2.tinhTuoi());
                        }
                    };
                    Collections.sort(st, c);
                    System.out.println("Danh sach sinh vien sap xep theo tuoi: ");
                    xuat();
                    break;
                case 4:
                    Comparator c1 = new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return Double.compare(o1.tinhGPA(), o2.tinhGPA());
                        }
                    };
                    Collections.sort(st, c1);
                    System.out.println("Danh sach sinh vien sap xep theo GPA: ");
                    xuat();
                    break;
                case 5:
                    Comparator c2 = new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return Integer.compare(o1.getSoTietNghi(), o2.getSoTietNghi());
                        }
                    };
                    Collections.sort(st, c2);
                    System.out.println("Danh sach sinh vien sap xep theo so tiet nghi: ");
                    xuat();
                    break;
                case 6:
                    xoa();
                    break;
            }
        }while(choose != 0);
    }
    public static void main(String[] args) {
        Student students = new Student();
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s","Ma SV", "Ten", "Tuoi", "Dia chi", "Diem TX1", "Diem TX2", "Diem KTHP", "Diem GPA", "So tiet nghi"));
        for(int i = 0; i < st.size(); i++){
            Student student = students[i];
            System.out.println(String.format("%-15s %-15s %-15d %-15s %-15.1f %-15.1f %-15.1f %-15.1f %15d",
                    student.getTen(),
                    student.tinhTuoi(),
                    student.getDiaChi(),
                    student.getTx1(),
                    student.getTx2(),
                    student.getKthp(),
                    student.tinhGPA()));
        }
        fakeData();
        xuat();
        menu();
    }
}
