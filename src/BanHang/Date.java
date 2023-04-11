package BanHang;
import java.util.Scanner;

public class Date {
    int ngay;
    int thang;
    int nam;
    public Date(){}
    public Date(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public void nhapDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
    }
    public String xuatDate() {
        return ngay +"/" + thang + "/" + nam;
    }
}
