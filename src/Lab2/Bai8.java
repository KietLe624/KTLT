package Lab2;

import java.util.Scanner;

public class Bai8 {
    public static void run(int num){
        switch (num) {
            case 2 -> System.out.println("Thu 2");
            case 3 -> System.out.println("Thu 3");
            case 4 -> System.out.println("Thu 4");
            case 5 -> System.out.println("Thu 5");
            case 6 -> System.out.println("Thu 6");
            case 7 -> System.out.println("Thu 7");
            default -> System.out.println("Chu nhat");
        }
    }

    public static void main(String[] args) {
        int num;
        char tt;
        Scanner sc = new Scanner(System.in);
    do {
        System.out.print("Nhap: ");
        num = sc.nextInt();
        run(num);
        System.out.print("Nhan y de tiep tuc hoac phim bat ki de thoat chuong trinh");
        tt = sc.next().charAt(0);
    }while (Character.toLowerCase(tt)=='y');
        sc.close();
        System.out.println("Ket thuc chuong trinh: ");
    }
}
