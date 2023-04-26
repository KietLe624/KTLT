package Lab_8A;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRL_DuaLai {
    ArrayList<DuaLai> arr = new ArrayList<>();

    public void nhapDSDuaLai() {
        DuaLai d;
        String flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách dứa: ");
        do {
            d = new DuaLai();
            d.nhapDL();
            arr.add(d);
            System.out.println("Nhập end để kết thúc: ");
            flag = sc.nextLine();
        } while (!flag.equals("end"));
        System.out.println("Mảng có : " + arr.size() + " phần tử.");
    }

    public void xuatDSDuaLai() {
        System.out.println("Xem Danh sách dứa : ");
        for (DuaLai d : arr) {
            d.xuatTT();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ARRL_DuaLai obj = new ARRL_DuaLai();
        int chon;

        do {
            System.out.println("1/. Nhập Danh sách dứa : ");
            System.out.println("2/. Xem Danh sách dứa : ");
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
                    for (DuaLai d : obj.arr)
                        if (d.name.equalsIgnoreCase(ten)) {
                            t = true;
                            System.out.println("Tìm thấy loại dứa có tên gọi: " + ten);
                            d.xuatTT();
                            break;
                        }
                    if (!t)
                        System.out.println("! Không tìm thấy loại dứa có tên gọi: " + ten);
                }
            }
        } while (chon <= 3);
    }
}
