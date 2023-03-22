package Lab2;

import java.util.Scanner;

public class Bai9 {
    public static void checkMonth(int month, long year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng " + month + " có 30 ngày");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng " + month + " có 31 ngày");
        } else if (month == 2) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Tháng 2 năm " + year + " có 29 ngày");
            else
                System.out.println("Tháng 2 năm " + year + " có 28 ngày");
        }
    }

    public static void main(String[] args) {
        char tt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập năm: ");
            int year = sc.nextInt();
            System.out.print("Nhập tháng: ");
            int month = sc.nextInt();
            checkMonth(month, year);
            System.out.print("Nhan y de tiep tuc hoac phim bat ki de thoat chuong trinh");
            tt = sc.next().charAt(0);
        }while (Character.toLowerCase(tt)=='y');
        sc.close();
        System.out.println("Ket thuc chuong trinh!");
    }
}

