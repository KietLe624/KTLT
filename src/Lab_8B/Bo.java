package Lab_8B;
import java.util.Scanner;
public class Bo implements ThuLai{
    String giong;
    String xuatxu;
    private int soluong;
    float trongluong;
    private double giatien;

    public Bo(){

    }
    public Bo(String giong, String xuatxu, int soluong, float trongluong, double giatien){
        this.giong= giong;
        this.xuatxu = xuatxu;
        this.soluong = soluong;
        this.trongluong = trongluong;
        this.giatien = giatien;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public double getGiatien() {
        return giatien;
    }

    @Override
    public double philaiTao() {
        return this.giatien * 0.15;
    }
    public void nhapDL(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giống: ");
        giong = sc.nextLine();
        System.out.print("Nhập xuất xứ: ");
        xuatxu = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        soluong = sc.nextInt();
        System.out.print("Nhập trọng lượng: ");
        trongluong = sc.nextFloat();
        System.out.print("Giá tiền: ");
        giatien = sc.nextDouble();
    }
    public void xuatTT() {
        System.out.println("Giống " + this.giong);
        System.out.println("Xuất xứ: " + this.xuatxu);
        System.out.println("Số lượng: " + this.soluong);
        System.out.println("Trọng lượng: " + this.trongluong);
        System.out.println("Giá tiền: " + this.giatien);
    }
}
