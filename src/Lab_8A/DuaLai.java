package Lab_8A;

import java.util.Scanner;

public class DuaLai implements QuaDau, QuaDua, QuaXoai {
    String name;
    String noitrong;
    String mausac;
    private float trongluong;
    private double giaban;

    public DuaLai(){}
//    public DuaLai(String name, String noitrong, String mausac, float trongluong, double giaban){
//        this.name = name;
//        this.noitrong = noitrong;
//        this.mausac = mausac;
//        this.trongluong = trongluong;
//        this.giaban = giaban;
//    }
    public void setTrongluong(float trongluong) {
        this.trongluong = trongluong;
    }
    public float getTrongluong() {
        return trongluong;
    }
    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
    public double getGiaban() {
        return giaban;
    }
    public double Tax(){
        return giaban * 0.1;
    }
    public void nhapDL(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten goi: ");
        name = sc.nextLine();
        System.out.print("Nhap noi trong: ");
        noitrong = sc.nextLine();
        System.out.print("Nhap mau sac: ");
        mausac = sc.nextLine();
        System.out.print("Nhap trong luong: ");
        trongluong = sc.nextFloat();
        System.out.print("Nhap gia ban: ");
        giaban = sc.nextDouble();
    }
    public void xuatTT(){
        System.out.println("Ten: " + this.name);
        System.out.println("Noi trong: " + this.noitrong);
        System.out.println("Mau sac: " + this.mausac);
        System.out.println("Trong luong: " + this.trongluong);
        System.out.println("Gia ban: " + this.giaban);

    }
}
