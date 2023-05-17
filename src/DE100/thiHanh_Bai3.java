package DE100;

import java.util.ArrayList;
import java.util.Scanner;

public class thiHanh_Bai3 {
    ArrayList<CanBo_Bai3> arr = new ArrayList<>();

    public void nhap() {
        CanBo_Bai3 x;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách cán bộ: ");
        do {
            x = new CanBo_Bai3();
            x.nhapTT();
            arr.add(x);
            System.out.println("Nhập END để kết thúc chương trình: ");
            temp = sc.nextLine();
        } while (!temp.equals("end"));
    }

    public void xuat() {
        System.out.println("Xem danh sách");
        for (CanBo_Bai3 a : arr) {
            a.xuatTT();
        }
    }

    public void locTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lọc danh sách cán bộ nghỉ hưu: ");
        for (CanBo_Bai3 a : arr) {
            if (60 <= a.tuoi()) {
                a.xuatTT();
            }
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        thiHanh_Bai3 thi = new thiHanh_Bai3();
        do {
            System.out.println("------------------------------------");
            System.out.println("1/. Nhập danh sách cán bộ ");
            System.out.println("2/. Xem danh sách ");
            System.out.println("3/. Tìm cán bộ đã nghỉ hưu ");
            num = sc.nextInt();
            switch (num) {
                case 1 -> {
                    thi.nhap();
                    break;
                }
                case 2 -> {
                    thi.xuat();
                    break;
                }
                case 3 -> {
                    thi.locTT();
                    break;
                }
            }
        } while (num <= 3);
        System.out.println("Kết thúc chương trình");
        System.out.print("----------------------------------------");
    }
}
