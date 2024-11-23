package baitap.chuong3.bai10;
import java.util.Scanner;
public abstract class HocVIen {
	private String ten;
	private String dc;
	
	//contructor
	public HocVIen() {
		
	}
	public HocVIen(String ten, String dc) {
		
		this.ten = ten;
		this.dc = dc;
		
	}
	//phuong thuc truu tuong
	public abstract double hocPhi();
	//nhap thong tin
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten ");
		ten = sc.next();
		System.out.println("nhap dia chi ");
		dc = sc.next();
		
	}
	//in thong tin

	public String toString() {
		return "HocVIen [ten=" + ten + ", dc=" + dc + "]";
	}
	//get and set
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	
	
	
	
	
}
