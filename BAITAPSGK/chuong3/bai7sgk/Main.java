package baitap.chuong3.bai7;

public class Main {
	public static void main(String[] args) {
		// khởi tạo đối tượng ResizableCircle 
		ResizableCircle resizableCircle = new ResizableCircle(10.0);

		// hiển thị các thông tin 
		System.out.println("ban kinh ban dau: " + resizableCircle.getRadius());
		System.out.println("chu vi ban dau: " + resizableCircle.Perimeter());
		System.out.println("dien tich ban dau: " + resizableCircle.Area());

		// thay đổi bán kính của hình tròn
		int resizePercentage = 50; 
		resizableCircle.resize(resizePercentage);

		// hiển thị cá thông tin sau khi thay đổi
		System.out.println("\nsau khi thay doi kich thuoc " + resizePercentage + "%:");
		System.out.println("ban kinh moi: " + resizableCircle.getRadius());
		System.out.println("chu vi moi: " + resizableCircle.Perimeter());
		System.out.println("dien tich moi: " + resizableCircle.Area());
	}

}
