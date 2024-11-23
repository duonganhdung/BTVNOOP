package baitap.chuong3.bai8;

public abstract class Shape {
	protected String color;

	public Shape(String color) {
		this.color = color;
	}

	// phương thức trừu tượng 
	public abstract double getArea();
	public abstract String toString();
}
