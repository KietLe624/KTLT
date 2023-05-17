package Lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRL_Xe {
    ArrayList<XeViet> arr = new ArrayList<>();

    public void nhapArrayList() {
        XeViet x;
        String tt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách xe : ");
        do {
            x = new XeViet();
            x.NhapDL();
            arr.add(x);
            System.out.print("Nhập end để kết thúc: ");
            tt = sc.nextLine();
        } while (!tt.equals("end"));
    }
    public void xuatArrayList() {
        System.out.println("Xem danh sách Xe : ");
        for (XeViet a : arr) {
            a.xuatDL();
        }
    }
    public void xem() {
        Scanner sc = new Scanner(System.in);
        boolean find = false;
        System.out.print("Khoảng giá: ");
        double khoangGia = sc.nextDouble();
        for (XeViet a : arr) {
            if (a.getGiaSanXuat() >= khoangGia) {
                a.xuatDL();
            }
        }
    }
    public static void main(String[] args) {
        int i, j, num;
        Scanner sc = new Scanner(System.in);
        ARRL_Xe obj = new ARRL_Xe();
        XeViet xe;
        do{
            System.out.println("Menu chương trình : ");
            System.out.println("1/. Nhập danh sách xe : ");
            System.out.println("2/. Xem danh sách xe : ");
            System.out.println("3/. Tìm xe theo giá bán : ");
            num = sc.nextInt();
            switch (num){
                case 1 -> {
                    obj.nhapArrayList();
                    break;
                }
                case 2 -> {
                    obj.xuatArrayList();
                    break;
                }
                case 3 -> {
                    obj.xem();
                    break;
                }
            }
        }while (num <= 3);
            System.out.println("Kết thúc chương trình");
            System.out.println("----------------------------------------------------------------------------");
    }
}


