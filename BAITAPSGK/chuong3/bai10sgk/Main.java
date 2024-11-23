package baitap.chuong3.bai10;

public class Main {
	public static void main(String[] args) {
		HocVienDH hv1 = new HocVienDH("hoa","hung yen",15,30000,1);
		HocVienLT hv2 = new HocVienLT("huy","ha noi", 16, 20000,2);
		System.out.println("hoc phi cua hoc vien 1 la " + hv1.hocPhi());
		System.out.println("hoc phi cua hoc vien 2 la " + hv2.hocPhi());
		
	}
}
