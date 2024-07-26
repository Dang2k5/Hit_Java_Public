import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double r;
        double p = 3.14;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Nhap r: ");
            r = s.nextDouble();
        }while(r < 0 || r > 1000);
        System.out.println(2 * r * p + " " + r * r * p);
    }
}
