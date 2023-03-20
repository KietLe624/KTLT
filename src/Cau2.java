import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        a = sc.nextInt();
        System.out.print("Nhap canh b: ");
        b = sc.nextInt();
        System.out.print("Nhap canh c: ");
        c = sc.nextInt();
        sc.close();
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            if (a == b && a == c) {
                System.out.print("Tam giac deu");
            } else if (a == b || a == c || b == c) {
                System.out.print("Tam giac can");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.print("Tam giac vuong");
            } else {
                System.out.print("Tam giac thuong");
            }
        } else {
            System.out.print("Loi dinh dang!");
        }
    }
}

