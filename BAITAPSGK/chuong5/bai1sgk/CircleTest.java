package baitap.chuong5.bai1;

import java.util.ArrayList;
import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random rand = new Random();
        CircleCollection collection = new CircleCollection();

        // Tao danh sach cac hinh tron voi ban kinh ngau nhien
        for (int i = 0; i < 5; i++) {
            double radius = 1 + (10 - 1) * rand.nextDouble(); // Ban kinh tu 1 den 10
            collection.addCircle(new Circle(radius));
        }

        // Hien thi thong tin cac hinh tron
        System.out.println("Danh sach cac hinh tron:");
        System.out.println(collection);

        // Tinh tong dien tich cac hinh tron
        System.out.println("Tong dien tich cac hinh tron: " + collection.calSumArea());

        // Hien thi dien tich lon nhat
        System.out.println("Dien tich lon nhat: " + collection.findMaxArea());
    }
}

