package baitap.chuong5.bai1;

import java.util.ArrayList;

public class CircleCollection {
    private ArrayList<Circle> circles;

    // Phuong thuc khoi tao
    public CircleCollection() {
        circles = new ArrayList<>();
    }

    // Them mot hinh tron vao danh sach
    public void addCircle(Circle c) {
        circles.add(c);
    }

    // Lay hinh tron tai vi tri pos trong danh sach
    public Circle getCircle(int pos) {
        if (pos >= 0 && pos < circles.size()) {
            return circles.get(pos);
        } else {
            return null;
        }
    }

    // Thiet lap gia tri cho phan tu thu pos trong danh sach
    public void setCircle(int pos, Circle c) {
        if (pos >= 0 && pos < circles.size()) {
            circles.set(pos, c);
        }
    }

    // Tra ve thong tin cua tat ca cac hinh tron trong danh sach
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Circle c : circles) {
            sb.append(c).append("\n");
        }
        return sb.toString();
    }

    // Tinh tong dien tich cua tat ca cac hinh tron trong danh sach
    public double calSumArea() {
        double sum = 0;
        for (Circle c : circles) {
            sum += c.getArea();
        }
        return sum;
    }

    // Tra ve dien tich hinh tron lon nhat trong danh sach
    public double findMaxArea() {
        double maxArea = 0;
        for (Circle c : circles) {
            if (c.getArea() > maxArea) {
                maxArea = c.getArea();
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // Tao mot doi tuong CircleCollection va them cac hinh tron vao
        CircleCollection collection = new CircleCollection();
        collection.addCircle(new Circle(5.0));
        collection.addCircle(new Circle(3.0));
        collection.addCircle(new Circle(7.0));

        // Hien thi thong tin cac hinh tron
        System.out.println("Danh sach cac hinh tron:");
        System.out.println(collection);

        // Tinh tong dien tich cac hinh tron
        System.out.println("Tong dien tich cac hinh tron: " + collection.calSumArea());

        // Hien thi dien tich lon nhat
        System.out.println("Dien tich lon nhat: " + collection.findMaxArea());
    }
}