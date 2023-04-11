package ArrayList;

import java.util.Scanner;

public class brandcar implements brand, GMC {
    String ten;
    int namSanXuat;
    double giaSanXuat;
    double thanhTien;

    public brandcar() {
    }

    public double phiBaoHanh() {
        return this.giaSanXuat * 1.2;
    }

    public double phiBanQuyen() {
        return this.giaSanXuat * 0.1;
    }

    public void InPut() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten xe: ");
        ten = sc.nextLine();
        System.out.print("Nhap nam san xuat: ");
        int nam = Integer.valueOf(sc.nextLine());
        System.out.print("Gia san xuat: ");
        double gia = Double.valueOf(sc.nextLine());
        this.ten = ten;
        this.namSanXuat = nam;
        this.giaSanXuat = gia;
        this.thanhTien = gia + (gia * 0.22);
    }
    public void OutPut() {
        System.out.println("\tTên gọi: " + this.ten);
        System.out.println("\tNăm sản xuất: " + this.namSanXuat);
        System.out.println("\tGiá sản xuất: " + this.giaSanXuat);
        System.out.println("\tPhí bản quyền: " + this.phiBanQuyen());
        System.out.println("\tPhí bảo hành: " + this.phiBaoHanh());
        System.out.println("\tThành tiền: " + this.thanhTien);

    }
}

