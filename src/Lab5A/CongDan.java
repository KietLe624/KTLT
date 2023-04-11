package Lab5A;
public class CongDan {
    private String socancuoc;
    String hoten;
    String noisinh;
    private int namsinh;

    public CongDan(){}
    public CongDan(String x1, String x2, String x3, int x4){
        this.socancuoc = x1;
        this.hoten = x2;
        this.noisinh = x3;
        this.namsinh = x4;
    }

    public void setSocancuoc(String socancuoc) {
        this.socancuoc = socancuoc;
    }
    public String getSocancuoc() {
        return socancuoc;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public int getNamsinh() {
        return namsinh;
    }
    public void xemTT(){
        System.out.println("So CCCD: " + socancuoc);
        System.out.println("Ho va ten: " + hoten);
        System.out.println("Noi sinh: " + noisinh);
        System.out.println("Nam sinh: " + namsinh);
    }
}
