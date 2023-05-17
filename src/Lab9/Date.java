package Lab9;

public class Date {
    int ngay;
    int thang;
    int nam;
    public Date(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public String xuatDate(){
        return "Ngày " + this.ngay + " / " + "tháng " + this.thang + " / " + "năm " + this.nam;
    }
}
