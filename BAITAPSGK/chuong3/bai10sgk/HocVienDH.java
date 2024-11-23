package baitap.chuong3.bai10;

public class HocVienDH extends HocVIen{
	private double soBuoiHoc;
	private double donGia;
	private double uuTien;
	private int loai;
	//contructor
	public HocVienDH() {
		super();
	}
	
	
	
	public HocVienDH(String ten, String dc,double soBuoiHoc,double donGia, int loai) {
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
			uuTien = 500000;
		return donGia * soBuoiHoc - uuTien;
		
	}
	
}
