package bai5sgk;

public class Truong {
    private String tenTr;
    private String diaChi;
    private String hieuTruong;
    public Truong() {
        super();
    }
    public Truong(String tenTr, String diaChi, String hieuTruong) {
        super();
        this.tenTr = tenTr;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }
    public String getTenTr() {
        return tenTr;
    }
    public void setTenTr(String tenTr) {
        this.tenTr = tenTr;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getHieuTruong() {
        return hieuTruong;
    }
    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    @Override
    public String toString() {
        return "Truong [tenTr=" + tenTr + ", diachi=" + diaChi + ", hieutruong=" + hieuTruong + "]";
    }
}