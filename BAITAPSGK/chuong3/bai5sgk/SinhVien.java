package bai5sgk;

import bai4sgk.Nguoi;
public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong=new Truong();
    public SinhVien(String ten,int tuoi,char gioitinh) {
        super();
    }
    public SinhVien(String lop, String nganh, Truong truong,String ten,int tuoi,String gioitinh) {
        super();
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public Truong getTruong() {
        return truong;
    }
    public void setTruong(Truong truong) {
        this.truong = truong;
    }
    @Override
    public String toString() {
        return "SinhVien [lop=" + lop + ", nganh=" + nganh +  "]" + truong.toString()+super.toString();
    }
}
