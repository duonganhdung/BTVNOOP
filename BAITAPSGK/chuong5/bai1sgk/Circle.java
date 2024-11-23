package baitap.chuong5.bai1;
public class Circle {
    private double radius;

    // Phuong thuc khoi tao
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phuong thuc tinh dien tich
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phuong thuc toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", area=" + getArea() + "]";
    }

    // Getter va Setter cho ban kinh
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Kiem tra cac phuong thuc cua lop Circle
        Circle c1 = new Circle(5.0);
        System.out.println(c1);
        
        Circle c2 = new Circle(3.5);
        System.out.println(c2);
    }
}