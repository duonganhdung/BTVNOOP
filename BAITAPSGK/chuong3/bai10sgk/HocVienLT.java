package baitap.chuong3.bai10;

public class HocVienLT extends HocVIen {
	private double soBuoiHoc;
	private double donGia;
	private double uuTien;
	private int loai;
	//contructor
	public HocVienLT() {
		super();
	}
	public HocVienLT(String ten, String dc,double soBuoiHoc,double donGia,int loai) {
		super(ten, dc);
		this.soBuoiHoc = soBuoiHoc;
		this.donGia = donGia;

		this.loai = loai;
	}
	public double hocPhi()
	{
		if(loai == 1)
			uuTien = 1000000;
		else
			uuTien = 800000;
		return soBuoiHoc * donGia - uuTien;
	}
	
	
}
