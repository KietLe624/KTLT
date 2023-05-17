package De101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    ArrayList<NhanVien> arr = new ArrayList<>();

    public void nhapTT(){
        NhanVien nv;
        String t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên: ");
        do{
            nv = new NhanVien();
            nv.nhapTT();
            arr.add(nv);
            System.out.println("Nhập end để kết thúc chương trình!");
            t = sc.nextLine();
        } while (!t.equals("end"));
    }
    public void xem(){
        System.out.println("Xem danh sách nhân viên");
        System.out.println("-----------------------------------------------");
        for(NhanVien nv : arr){
            nv.xuatTT();
        }
    }
    public void xuatTTsau(){
        System.out.println("Xem danh sách nhân viên sau sắp xếp: ");
        Collections.sort(arr, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.luongThuc() < nv2.luongThuc()) {
                    return 1;
                } else {
                    if (nv1.luongThuc() == nv2.luongThuc()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Tên: " + arr.get(i).HoTen + " Lương: " + arr.get(i).luongThuc());
        }
    ;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        Test test = new Test();
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("1/. Nhập danh sách nhân viên ");
            System.out.println("2/. Xem danh sách nhân viên ");
            System.out.println("3/. Sắp xếp danh sách nhân viên theo lương ");
            num = sc.nextInt();
            switch (num) {
                case 1 -> {
                    test.nhapTT();
                    break;
                }
                case 2 -> {
                    test.xem();
                    break;
                }
                case 3 -> {
                    test.xuatTTsau();
                    break;
                }
            }
        } while (num <= 3);
        System.out.println("Kết thúc chương trình");
        System.out.println("-----------------------------------------------");
    }
}
