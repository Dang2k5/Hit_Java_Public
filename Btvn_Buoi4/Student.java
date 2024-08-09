import java.time.LocalDate;
import java.util.Scanner;

public class Student {
    private String ten, diaChi;
    private int namSinh, soTietNghi;
    private double tx1, tx2, kthp;


    public Student(){

    }

    public Student(String ten, String diaChi, int namSinh, int soTietNghi, double tx1, double tx2, double kthp) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.soTietNghi = soTietNghi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public static void inTieuDe(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %n",
                "Nam sinh","Tuoi","Dia chi","Diem TX1","Diem TX2", "Diem KTHP", "Diem GPA", "So tiet nghi");
    }

    public int tinhTuoi(){
        return LocalDate.now().getYear() - namSinh;
    }

    public double tinhGPA(){
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }

    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = s.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = s.nextInt();
        s.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = s.nextLine();
        System.out.print("Nhap diem tx1: ");
        tx1 = s.nextDouble();
        System.out.print("Nhap diem tx2: ");
        tx2 = s.nextDouble();
        System.out.print("Nhap diem kthp: ");
        kthp = s.nextDouble();
        System.out.print("Nhap so tiet nghi: ");
        soTietNghi = s.nextInt();
    }

    public void xuat(){
        System.out.printf("%-20s %-20d %-20s %-20f %-20f %-20f %-20f %-20d %n", ten, tinhTuoi()
        , diaChi, tx1, tx2, kthp, tinhGPA(),soTietNghi);
    }
}
