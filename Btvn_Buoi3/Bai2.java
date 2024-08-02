import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = s.nextLine();
        String areverse = "";
        for(int i = a.length() - 1; i >= 0; i--){
            areverse = areverse + a.charAt(i);
        }
        if(a.equals(areverse)){
            System.out.println(a.toUpperCase());
        }else{
            System.out.println(a.toLowerCase());
        }
    }
}
