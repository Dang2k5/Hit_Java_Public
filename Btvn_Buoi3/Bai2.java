import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = s.nextLine();
        // Cach 1
//        String areverse = "";
//        for(int i = a.length() - 1; i >= 0; i--){
//            areverse = areverse + a.charAt(i);
//        }
//        if(a.equals(areverse)){
//            System.out.println(a.toUpperCase());
//        }else{
//            System.out.println(a.toLowerCase());
//        }
        // Cach 2
        int i = 0, j = a.length() - 1;
        boolean flag = true;
        while (i < j){
            if(a.charAt(i) != a.charAt(j)){
                flag = false;
                break;
            }
            else {
                i++;
                j--;
            }
        }
        if(flag == true){
            System.out.println(a.toUpperCase());
        }else{
            System.out.println(a.toLowerCase());
        }
    }
}
