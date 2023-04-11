package BanHang;

import java.util.Scanner;

public class HoaDonMua extends HoaDon {
    String HoTenKH;
    private double thanhTien;

    public HoaDonMua(String x1, Date x2, char x3, String HoTenKH, double thanhTien) {
        super(x1, x2, x3);
        this.HoTenKH = HoTenKH;
        this.thanhTien = thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public double thueVAT() {
        double thueVAT = thanhTien * 0.1;
        return thueVAT;
    }

    public void outPut() {
        System.out.println("Ho ten khach hang: " + HoTenKH);
        System.out.printf("Thanh tien: %s%n", thanhTien + thueVAT());
    }
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten khach hang: ");
        HoTenKH = sc.nextLine();
        System.out.print("Nhap gia tien san pham: ");
        thanhTien = sc.nextDouble();
    }
}

