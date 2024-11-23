package baitap.chuong3.bai8;

public class Triangle extends Shape {
	private int base; 
    private int height;
    //contructor
    
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
	
	// tính diện tích tam giác
   
    

	public double getArea() {
        return 0.5 * base * height; 
    }

   
    public String toString() {
        return "Triangle [color=" + color + ", base=" + base + ", height=" + height + ", area=" + getArea() + "]";
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
