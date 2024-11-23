package baitap.chuong4.bai5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap muc luong cua ban: ");
        try {
            double salary = scanner.nextDouble();
            if (salary < 5000000 || salary > 20000000) {
                throw new OutOfRangeException("luong ngoai pham vi: " + salary);
            }
            System.out.println("luong hop le: " + salary);
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
