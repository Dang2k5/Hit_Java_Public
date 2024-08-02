import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(11);
        int b = r.nextInt(11);
        int c = r.nextInt(21);
        System.out.println(a + "+" + b + " = " +c);
        Scanner s = new Scanner(System.in);
        System.out.print("Phep tinh tren dung hay sai(Y/N): ");
        String str = s.nextLine();
        String y = "Y";
        String n = "N";
        if((a + b == c) && str.equals(y) || (a + b != c) && str.equals(n)){
            System.out.println("Chinh xac!");
        }else if((a + b != c) && str.equals(y) || (a + b == c) && str.equals(n)){
            System.out.println("Sai!");
        }else{
            System.out.println("Khong hop le!");
        }
    }
}
