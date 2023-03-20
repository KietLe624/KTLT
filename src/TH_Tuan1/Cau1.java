package TH_Tuan1;
import java.util.Scanner;
public class Cau1 {
    public static void main(String[] args) {
        float d, r, chuVi, dienTich;
//      Nhap
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        d = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        r = sc.nextFloat();
        sc.close();
//        Tinh
        chuVi = (d + r) * 2 ;
        dienTich = d * r;
        System.out.printf("Chu vi: " + chuVi);
        System.out.printf("Dien tich: " + dienTich);

    }
}
