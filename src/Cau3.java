import java.util.Scanner;
//import java.text.DecimalFormat;
public class Cau3 {
    float a;
   float b;


    public Cau3(){
    }
//    public Cau3(float a, float b) {
//        this.a = a;
//        this.b = b;
//    }
//    public void setA(float a) {
//        this.a = a;
//    }
//
//    public float getA() {
//        return a;
//    }
//
//    public void setB(float b) {
//        this.b = b;
//    }
//
//    public float getB() {
//        return b;
//    }
    public void inPut() {
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();
        sc.close();
    }
    public void giai() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            float nghiem = -b / a ;  // ép kiểu để cho ra kết quả chính xác
            System.out.format("Phương trình có nghiệm x = " + nghiem);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Cau3 c3 = new Cau3();
        c3.inPut();
        c3.giai();

    }
}

