package baitap.chuong3.bai11;

public class Main {
	public static void main(String[] args) {
		
		GVThinhGiang gvThinhGiang = new GVThinhGiang("van hoa", "Hung yen", "Thinh giang", 10);
		gvThinhGiang.nhapThongTinGVThinhGiang();
		System.out.println("");
		gvThinhGiang.inThongTin();
		GVCoHuu gvCoHuu = new GVCoHuu("van huy", "ha noi", "Co huu", 13);
		gvCoHuu.nhapThongTinGVCoHuu();
		System.out.println("\n Thong tin gv ch:");
		gvCoHuu.inThongTin();
	}
}
