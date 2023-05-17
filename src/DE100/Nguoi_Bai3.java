package DE100;

import java.util.Scanner;

public class Nguoi_Bai3 {
    String HoTen;
    String gioiTinh;
    int namSinh;

    public Nguoi_Bai3() {
    }

    public Nguoi_Bai3(String HoTen, String gioiTinh, int namSinh) {
        this.HoTen = HoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int tuoi() {
        return 2023 - getNamSinh();
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.HoTen = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = sc.nextInt();
    }

    public void outPut() {
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Giới tính: " + getGioiTinh());
        System.out.println("Năm sinh: " + getNamSinh());
        System.out.println("Tuổi: " + tuoi());
    }
}
