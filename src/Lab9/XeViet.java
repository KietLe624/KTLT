package Lab9;

import java.util.Scanner;

public class XeViet implements Toyota, Ford {
    String masoxe;
    String tengoi;
    private double giaSanXuat;
    Date ngayban;
    boolean trangThai;
    public XeViet(){}
    public XeViet(String masoxe, String tengoi, double giaSanXuat, Date ngayban, boolean trangThai){
        this.masoxe = masoxe;
        this.tengoi = tengoi;
        this.giaSanXuat = giaSanXuat;
        this.ngayban = ngayban;
        this.trangThai = trangThai;
    }

    public void setGiaSanXuat(double giaSanXuat) {
        this.giaSanXuat = giaSanXuat;
    }

    public double getGiaSanXuat() {
        return giaSanXuat;
    }

    @Override
    public double phiKiemDinh() {
        return getGiaSanXuat() * 0.05;
    }

    @Override
    public double phiBanQuyen() {
        return getGiaSanXuat() * 0.1;
    }

    @Override
    public double phiBaoHanh() {
        return getGiaSanXuat() * 0.1;
    }
    public double giaXe(){
        return getGiaSanXuat() + phiBanQuyen() + phiBaoHanh() + phiKiemDinh();
    }
    public void NhapDL(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã số xe: ");
        masoxe = sc.nextLine();
        System.out.print("Nhập tên gọi: ");
        tengoi = sc.nextLine();
        System.out.print("Giá sản xuất: ");
        this.giaSanXuat = sc.nextDouble();
        System.out.print("Ngày: ");
        int ngay = sc.nextInt();
        System.out.print("tháng: ");
        int thang = sc.nextInt();
        System.out.print("năm: ");
        int nam = sc.nextInt();
        Date dt = new Date(ngay, thang, nam);
        this.ngayban = dt;
        System.out.print("Nhập trạng thái sản xuất: ");
        int tt = sc.nextInt();
        if(tt == 1){
            this.trangThai = true;
        }else {
            this.trangThai = false;
        }
    }public void xuatDL(){
        System.out.println("Mã số xe: " + masoxe);
        System.out.println("Tên gọi: " + tengoi);
        System.out.println("Giá sản xuất: " + getGiaSanXuat());
        System.out.println("Ngày bán: " + ngayban.xuatDate());
        System.out.println("Trạng thái: " + trangThai);
        System.out.println("Đặc điểm máy: " + this.dacDiem);
        System.out.println("Đặc điểm vận hành: " + this.dacdiemvanhanh);
        System.out.println("Phí bản quyền: " + phiBanQuyen());
        System.out.println("Phí kiểm định: " + phiKiemDinh());
    }
}
