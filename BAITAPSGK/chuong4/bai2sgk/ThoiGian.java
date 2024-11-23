package baitap.chuong4.bai2;

public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (ngay <= 0 || thang <= 0 || thang > 12 || ngay > 31) {
            throw new InvalidDateException("Invalid date: " + ngay + "/" + thang + "/" + nam);
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
}
