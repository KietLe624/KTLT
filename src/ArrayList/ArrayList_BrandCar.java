package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_BrandCar {

    ArrayList<brandcar> arr = new ArrayList<brandcar>();

    public void nhapArrayList() {
        brandcar x;
        String tt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách xe : ");
        do {
            x = new brandcar();
            x.InPut();
            sc.nextLine(); //xử lý trôi lệnh
            arr.add(x);
            System.out.print("Nhập end để kết thúc: ");
            tt = sc.nextLine();
        } while (!tt.equals("end"));
        System.out.println("Mảng có : " + arr.size() + " phần tử.");
    }

    public void xuatArrayList() {
        System.out.println("Xem Danh sách Xe : ");
        for (brandcar a : arr) {
            a.OutPut();
        }
        System.out.println("Mảng có : " + arr.size() + " phần tử.");
    }

    public static void main(String[] args) {
        int i, j, chon;
        Scanner sc = new Scanner(System.in);
        ArrayList_BrandCar obj = new ArrayList_BrandCar();
        brandcar x;
        do {
            System.out.println("Menu chương trình : ");
            System.out.println("1/. Nhập Danh sách Xe : ");
            System.out.println("2/. Xem Danh sách Xe : ");
            System.out.println("3/. Tìm Xe theo tên x: ");
            System.out.println("4/. Thêm Xe vào vị trí i: ");
            System.out.println("5/. Xóa Xe tại vị trí j: ");
            System.out.println("6/. Đảo ngược ArrayList: ");
            System.out.println("7/. Xóa toàn bộ ArrayList: ");
            System.out.println("8/. Kết thúc chương trình : ");
            System.out.print("Nhấn 1 số để chọn : ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    obj.nhapArrayList();
                    break;
                case 2:
                    obj.xuatArrayList();
                    break;
                case 3:
                    sc.nextLine();  //xử lý trôi lệnh
                    System.out.print("Nhập Tên cần tìm : ");
                    boolean tim = false;
                    String ten = sc.nextLine();
                    for (brandcar a : obj.arr)
                        if (a.ten.equalsIgnoreCase(ten)) {
                            tim = true;
                            System.out.println("Tìm thấy Xe có tên gọi: " + ten);
                            a.OutPut();
                            break;
                        }
                    if (tim == false)
                        System.out.println("! Không tìm thấy Xe có tên gọi: " + ten);
                    break;
                case 4:
                    System.out.println("Thêm xe vào vị trí i:");
                    x = new brandcar();
                    x.InPut();
                    sc.nextLine(); //xử lý trôi lệnh
                    do {
                        System.out.print("Nhập vị trí thêm : ");
                        i = sc.nextInt();
                    } while (i < 0 || i >= obj.arr.size());
                    obj.arr.add(i, x);
                    System.out.println("Thêm xong.");
                    break;
                case 5:
                    System.out.println("Xóa xe tại vị trí j:");
                    do {
                        System.out.print("Nhập vị trí xóa : ");
                        j = sc.nextInt();
                    } while (j < 0 || j >= obj.arr.size());
                    obj.arr.remove(j);
                    System.out.println("Xóa xong.");
                    break;
                case 6:
                    System.out.println("6/. Đảo ngược ArrayList: ");
                    Collections.reverse(obj.arr);
                    System.out.println("Đảo ngược ArrayList xong.");
                    break;
                case 7:
                    System.out.println("Xóa toàn bộ ArrayList: ");
                    obj.arr.clear();
                    System.out.println("Xóa ArrayList  xong.");
                    break;
            }
        } while (chon <= 7);
        System.out.println("Kết thúc chương trình./.");
        sc.close();
    }
}

