package QuanLiSV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ARR_QLSinhVien {
    public static class ARR{
        ArrayList<SinhVien> arr = new ArrayList<>();
        public void nhap(){
            SinhVien x;
            String temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập danh sách sinh viên : ");
            do {
            x = new SinhVien();
            x.inPut();
            sc.nextLine();
            arr.add(x);
            System.out.print("Nhập END để kết thúc chương trình ");
            temp = sc.nextLine();
            } while (!temp.equals("end"));
            System.out.println("Mảng có : " + arr.size() + " phần tử.");
        }
        public void xuatArrayList() {
            System.out.println("Xem danh sách sinh viên : ");
            for (SinhVien a : arr) {
                a.outPut();
            }
            System.out.println("Mảng ARR_QLSinhVien có : " + arr.size() + " phần tử");
        }
    }
    public static void main(String[] args) {
        int i, j, chon;
        Scanner sc = new Scanner(System.in);
        ARR obj = new ARR();
        SinhVien x;
        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("Menu chương trình : ");
            System.out.println("1/. Nhập danh sách sinh viên : ");
            System.out.println("2/. Xem danh sách sinh viên : ");
            System.out.println("3/. Tìm sinh viên theo tên x: ");
            System.out.println("4/. Thêm sinh viên vào vị trí i: ");
            System.out.println("5/. Xóa sinh viên tại vị trí j: ");
            System.out.println("6/. Đảo ngược ArrayList: ");
            System.out.println("7/. Xóa toàn bộ ArrayList: ");
            System.out.println("8/. Kết thúc chương trình : ");
            System.out.println("Nhấn 1 số để chọn : ");

            System.out.println("--------------------------------------------------------");
            chon = sc.nextInt();
            switch (chon) {
                case 1 -> obj.nhap();
                case 2 -> obj.xuatArrayList();
                case 3 -> {
                    sc.nextLine();  //xử lý trôi lệnh
                    System.out.print("Nhập Tên cần tìm : ");
                    boolean tim = false;
                    String name = sc.nextLine();
                    for (SinhVien a : obj.arr)
                        if (a.getName().equalsIgnoreCase(name)) {
                            tim = true;
                            System.out.println("Tìm thấy Xe có tên gọi: " + name);
                            a.outPut();
                            break;
                        }
                    if (!tim)
                        System.out.println("! Không có sinh viên tên: " + name);
                }
                case 4 -> {
                    System.out.println("Thêm sinh viên vào vị trí i:");
                    x = new SinhVien();
                    x.inPut();
                    sc.nextLine(); //xử lý trôi lệnh
                    do {
                        System.out.print("Nhập vị trí thêm : ");
                        i = sc.nextInt();
                    } while (i < 0 || i >= obj.arr.size());
                    obj.arr.add(i, x);
                    System.out.println("Thêm xong.");
                }
                case 5 -> {
                    System.out.println("Xóa sinh viên tại vị trí j:");
                    do {
                        System.out.print("Nhập vị trí xóa : ");
                        j = sc.nextInt();
                    } while (j < 0 || j >= obj.arr.size());
                    obj.arr.remove(j);
                    System.out.println("Xóa xong.");
                }
                case 6 -> {
                    System.out.println("6/. Đảo ngược ArrayList: ");
                    Collections.reverse(obj.arr);
                    System.out.println("Đảo ngược ArrayList xong.");
                }
                case 7 -> {
                    System.out.println("Xóa toàn bộ ArrayList: ");
                    obj.arr.clear();
                    System.out.println("Xóa ArrayList  xong.");
                }
            }
        } while (chon <= 7);
        System.out.println("Kết thúc chương trình./.");
        sc.close();
    }
}


