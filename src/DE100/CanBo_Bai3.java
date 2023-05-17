package DE100;

import java.util.Scanner;

public class CanBo_Bai3 extends Nguoi_Bai3 {
    int heSoThamNien;
    int mucLuong;
    int tienAn;

    public CanBo_Bai3() {
    }

    public CanBo_Bai3(String HoTen, String gioiTinh, int namSinh, int heSoThamNien, int mucLuong, int tienAn) {
        super(HoTen, gioiTinh, namSinh);
        this.heSoThamNien = heSoThamNien;
        this.mucLuong = mucLuong;
        this.tienAn = tienAn;
    }

    public void setHeSoThamNien(int heSoThamNien) {
        this.heSoThamNien = heSoThamNien;
    }

    public int getHeSoThamNien() {
        return heSoThamNien;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public void setTienAn(int tienAn) {
        this.tienAn = tienAn;
    }

    public int getTienAn() {
        return tienAn;
    }

    public double tienLuong() {
        return getMucLuong() * getHeSoThamNien() + getTienAn();
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhập hệ số thâm niên: ");
        this.heSoThamNien = sc.nextInt();
        System.out.print("Nhập mức lương: ");
        this.mucLuong = sc.nextInt();
        System.out.print("Nhập tiền ăn: ");
        this.tienAn = sc.nextInt();
    }

    public void xuatTT() {
        super.outPut();
        System.out.println("Hệ số thâm niên: " + getHeSoThamNien());
        System.out.println("Mức lương: " + getMucLuong());
        System.out.println("Tiền ăn: " + getTienAn());
        System.out.println("Tiền lương: " + tienLuong());
    }
}
