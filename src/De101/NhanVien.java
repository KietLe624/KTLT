package De101;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    int heSoLuong;
    int tienPhuCap;
    public NhanVien() {
    }
    public NhanVien(String HoTen, String maDinhDanh, int namSinh,int luongCoBan,int heSoLuong, int tienPhuCap) {
        super(HoTen, maDinhDanh,namSinh, luongCoBan);
        this.heSoLuong = heSoLuong;
        this.tienPhuCap = tienPhuCap;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setTienPhuCap(int tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }

    public int getTienPhuCap() {
        return tienPhuCap;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhập hệ số lương");
        this.heSoLuong = sc.nextInt();
        System.out.print("Nhập số tiền phụ cấp: ");
        this.tienPhuCap = sc.nextInt();
    }

    public int luongThuc(){
        return ((heSoLuong * 1550) + tienPhuCap);
    }

    public void xuatTT() {
        super.outPut();
        System.out.println("Hệ số lương: " + getHeSoLuong());
        System.out.println("Tiền phụ cấp: " + getTienPhuCap());
        System.out.println("Lương thực lãnh: " + luongThuc());
        System.out.println("--------------------------------------------");
    }
}


