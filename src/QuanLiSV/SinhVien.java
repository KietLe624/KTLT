package QuanLiSV;

import java.util.Scanner;

public class SinhVien {
    private int MSSV;
    private String name;
    private String address;
    private float sdt;

    public SinhVien() {

    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSdt(float sdt) {
        this.sdt = sdt;
    }

    public float getSdt() {
        return sdt;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap MSSV: ");
        MSSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        name = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.print("Nhap sdt: ");
        sdt = sc.nextFloat();
    }

    public String outPut() {
        return "-----------------------------------------------------" +
                    "1. MSSV: " + getMSSV() +
                    "2. Ho ten: " + getName() +
                    "3. Dia chi: " + getAddress() +
                    "4. SDT: " + getSdt() +
                "-----------------------------------------------------"
                ;
    }
}
