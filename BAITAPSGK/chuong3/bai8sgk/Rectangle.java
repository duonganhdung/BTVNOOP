package baitap.chuong3.bai8;

public class Rectangle extends Shape {
	private int length; 
    private int width; 

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    // tính dien tich 
    
    

	public double getArea() {
        return length * width;
    }

   
    public String toString() {
        return "Rectangle [color=" + color + ", length=" + length + ", width=" + width + ", area=" + getArea() + "]";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
