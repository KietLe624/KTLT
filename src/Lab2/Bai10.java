package Lab2;

import java.util.Scanner;

public class Bai10 {
    public static void kiemtra (int year) {
            String can = "", chi = "";

        switch (year % 10) {
            case 0 -> can = "Canh";
            case 1 -> can = "Tân";
            case 2 -> can = "Nhâm";
            case 3 -> can = "Quý";
            case 4 -> can = "Giáp";
            case 5 -> can = "Ất";
            case 6 -> can = "Bính";
            case 7 -> can = "Đinh";
            case 8 -> can = "Mậu";
            case 9 -> can = "Kỷ";
        }
        switch (year % 12) {
            case 0 -> chi = "Thân";
            case 1 -> chi = "Dậu";
            case 2 -> chi = "Tuất";
            case 3 -> chi = "Hợi";
            case 4 -> chi = "Tí";
            case 5 -> chi = "Sửu";
            case 6 -> chi = "Dần";
            case 7 -> chi = "Mão";
            case 8 -> chi = "Thìn";
            case 9 -> chi = "Tỵ";
            case 10 -> chi = "Ngọ";
            case 11 -> chi = "Mùi";
        }
            System.out.println("Năm duơng lịch: " + year);
            System.out.println("Năm âm lịch tương ứng: " + (can + " " + chi));
        }
        public static void main(String[] args) {
             char tt;
                Scanner sc = new Scanner(System.in);

                System.out.println("Nhập năm dương lịch: ");
                do {
                    int year = sc.nextInt();
                    kiemtra(year);
                    System.out.println("Nhập kí tự y để tiếp tục hoặc kí tự khác để thoát chưong trình.");
                    tt = sc.next().charAt(0);
                } while (Character.toLowerCase(tt) == 'y');
                sc.close();
                System.out.println("Kết thúc chương trình");
            }

    }




