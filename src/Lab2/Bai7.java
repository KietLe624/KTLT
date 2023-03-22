package Lab2;

import java.util.Scanner;

public class Bai7 {
    public static float DTB(float diemtb) {
            if(diemtb < 5){
                System.out.println( "Hoc luc kem");
            }else if(diemtb >= 5 && diemtb <= 7){
                System.out.println( "Hoc luc trung binh");
            } else if (diemtb > 7 && diemtb <= 8) {
                System.out.println( "Hoc luc kha");
            } else if (diemtb > 8 && diemtb <= 9.5) {
                System.out.println( "Hoc luc gioi");
            }else System.out.println( "Hoc luc xuat sac");
        return diemtb;
    }

    public static void main(String[] args) {
        float diemtb;
        Scanner sc = new Scanner(System.in);
        char tt;
        do {
            do {
                System.out.print("Nhap diem trung binh: ");
                diemtb = sc.nextFloat();
                System.out.print(DTB(diemtb));
                if (diemtb < 0 || diemtb > 10) {
                    System.out.println(" Vui long nhap lai diem trung binh!");
                }
            }while(diemtb < 0 || diemtb > 10);
            System.out.print("Nhan y de tiep tuc hoac phim bat ki de thoat chuong trinh");
            tt = sc.next().charAt(0);
        }while (Character.toLowerCase(tt) == 'y');
            sc.close();
            System.out.println("Ket thuc chuong trinh");
    }

}
