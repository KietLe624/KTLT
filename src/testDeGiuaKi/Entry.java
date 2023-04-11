package testDeGiuaKi;
import java.util.Scanner;
public class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();

        NhanVien NV = new NhanVien();
        NV.nhapTT();
        NV.xuatTT();

        NhanVienGioi NVG = new NhanVienGioi();
        NVG.nhapTT();
        NVG.xuatTT();
    }
}
