import java.util.Scanner;

public class Bai1 {
    public static final String s1 = "Square";
    public static final String s2 = "Triangle";
    public static final String s3 = "Circle";

    public static void main(String[] args) {
        System.out.println("Nhap hinh dang cua vien gach: ");
        String type;
        Scanner s = new Scanner(System.in);
        type = s.nextLine();
        if(type.equals(s1)){
            System.out.println("Nhap canh hinh vuong: ");
            double a = s.nextDouble();
            double dientich = Math.pow(a, 2.000);
            System.out.printf("Dien tich hinh vuong la:%.2f", dientich);
        } else if (type.equals(s2)) {
            double a, b, c;
            System.out.println("Nhap 3 canh cua tam giac: ");
            a = s.nextDouble();
            b = s.nextDouble();
            c = s.nextDouble();
            if(a + b >= c && a + c >= b && b + c >= a){
                double p = (a + b + c)/2;
                double dientich = Math.sqrt(p*(p - a) * (p - b) *(p - c));
                System.out.printf("Dien tich hinh tam giac la:%.2f",dientich);
            }
            else{
                System.out.println(-1);
            }
        } else if (type.equals(s3)) {
            double r;
            System.out.println("Nhap ban kinh hinh tron: ");
            r = s.nextDouble();
            double dientich = Math.pow(r, 2.0) * Math.PI;
            System.out.printf("Dien tich hinh tron la:%.2f",dientich);
        }else{
            System.out.println("Hinh dang khong hop le!");
        }
    }
}
