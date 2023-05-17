package Lab_8B;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRL_Bo {
    ArrayList<Bo> arr = new ArrayList<>();

    public void nhapDSDuaLai() {
        Bo b;
        String flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách bò: ");
        do {
            b = new Bo();
            b.nhapDL();
            arr.add(b);
            System.out.println("Nhập end để kết thúc: ");
            flag = sc.nextLine();
        } while (!flag.equals("end"));
        System.out.println("Mảng có : " + arr.size() + " phần tử.");
    }

    public void xuatDSDuaLai() {
        System.out.println("Xem Danh sách bò : ");
        for (Bo b : arr) {
            b.xuatTT();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ARRL_Bo obj = new ARRL_Bo();
        int chon;

        do {
            System.out.println("1/. Nhập Danh sách bò : ");
            System.out.println("2/. Xem Danh sách bò : ");
            System.out.println("3/. Tìm dứa theo tên x: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1 -> obj.nhapDSDuaLai();
                case 2 -> obj.xuatDSDuaLai();
                case 3 -> {
                    sc.nextLine();  //xử lý trôi lệnh
                    System.out.print("Nhập Tên cần tìm : ");
                    boolean t = false;
                    String ten = sc.nextLine();
                    for (Bo b : obj.arr)
                        if (b.giong.equalsIgnoreCase(ten)) {
                            t = true;
                            System.out.println("Tìm thấy bò có tên gọi: " + ten);
                            b.xuatTT();
                            break;
                        }
                    if (!t)
                        System.out.println("! Không tìm thấy bò có tên gọi: " + ten);
                }
            }
        } while (chon <= 3);
    }
}

