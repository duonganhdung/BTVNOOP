package bai3sgk;

public class Test {
	public static void main(String[] args) {
		try // ngoai le try catch
		{
			NhanVien nv = new NhanVien();
			nv.nhap();
			System.out.print(nv.toString());
		}
		catch(Exception e)
		{
			System.out.println("chuong trinh sai ! ");
		}
	}
}