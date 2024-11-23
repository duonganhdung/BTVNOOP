package baitap.chuong3.bai11;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVien;
	//contructor
	public GiangVien() {

	}

	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {

		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiGiangVien() {
		return loaiGiangVien;
	}

	public void setLoaiGiangVien(String loaiGiangVien) {
		this.loaiGiangVien = loaiGiangVien;
	}

// phương thúc trừu tượng 
	public abstract double tinhLuong();
//  nhâp thông tin
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("nhap loai giang vien: ");
        loaiGiangVien = scanner.nextLine();
	}
// in thông tin
	public void inThongTin() {
		System.out.println("ho ten:" + hoTen);
		System.out.println("dia chi: " + diaChi);
        System.out.println("loai giang vien: " + loaiGiangVien);
        System.out.println("luong thang: " + tinhLuong() );
	}
}
