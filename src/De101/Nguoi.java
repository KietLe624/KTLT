package De101;

import java.util.Scanner;

public class Nguoi {
    String HoTen;
    String maDinhDanh;
    int namSinh;
    int luongCoBan;
    public Nguoi() {
    }

    public Nguoi(String HoTen, String maDinhDanh, int namSinh, int luongCoBan) {
        this.HoTen = HoTen;
        this.maDinhDanh = maDinhDanh;
        this.namSinh = namSinh;
        this.luongCoBan = luongCoBan;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.maDinhDanh = gioiTinh;
    }

    public String getGioiTinh() {
        return maDinhDanh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public int tuoi() {
        return 2023 - getNamSinh();
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.HoTen = sc.nextLine();
        System.out.print("Nhập mã định danh: ");
        this.maDinhDanh = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = sc.nextInt();
        System.out.print("Lương cơ bản: ");
        this.luongCoBan = sc.nextInt();
    }

    public void outPut() {
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Mã định danh: " + getGioiTinh());
        System.out.println("Năm sinh: " + getNamSinh());
        System.out.println("Tuổi: " + tuoi());
        System.out.println("Lương cơ bản: " + getLuongCoBan());
    }
}

