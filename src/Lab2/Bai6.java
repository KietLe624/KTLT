package Lab2;
import java.time.Year;
import java.util.Scanner;
public class Bai6 {
    public static void check(long year) {
        if (Year.isLeap(year)) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
    }
    public static void main(String[] args) {
        char tt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập năm cần kiểm tra: ");
            long year = sc.nextLong();
            check(year);
            System.out.print("Nhan y de tiep tuc hoac phim bat ki de thoat chuong trinh");
            tt = sc.next().charAt(0);
        }while (Character.toLowerCase(tt) == 'y');
        sc.close();
        System.out.println("Ket thuc chuong trinh");
    }
}



