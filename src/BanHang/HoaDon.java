package BanHang;

import java.util.Scanner;

public class HoaDon {
    String soHD;
    private char loai;
    Date ngayLapHD;

    public HoaDon(String x1, Date x2, char x3) {
        this.soHD = x1;
        this.ngayLapHD = x2;
        this.loai = x3;
    }

    public void setLoai(char loai) {
        this.loai = loai;
    }

    public char getLoai() {
        return loai;
    }

    //    Date date = new Date(ngay, thang, nam);
    public void xemHD() {
        System.out.println("So hoa don: " + soHD);
        System.out.printf("Ngay lap hoa don: %s%n", ngayLapHD.xuatDate());
        System.out.println("Loai : " + loai);
    }

    public void nhapHD() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hoa don: ");
        soHD = sc.nextLine();
        System.out.print("Nhap loai: ");
        loai = sc.next().charAt(0);
    }
}
