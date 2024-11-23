package baitap.chuong5.bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exchange exchange = new Exchange();

        // Khoi tao mang ti gia
        String[] MonArr = {
                "USD;VND;17000",
                "EUR;USD;1.2",
                "USD;IDN;15789",
                "USD;EUR;0.83",
                "CAD;IDN;16869"
        };

        // Them cac doi tuong Rate vao danh sach
        for (String rateInfo : MonArr) {
            String[] parts = rateInfo.split(";");
            String code1 = parts[0];
            String code2 = parts[1];
            double rate = Double.parseDouble(parts[2]);
            exchange.addRate(new Rate(code1, code2, rate));
        }

        // Nhap ma tien te va so tien can chuyen doi
        System.out.print("Nhap vao ma tien te thu nhat: ");
        String code1 = scanner.nextLine();
        System.out.print("Nhap vao ma tien te thu hai: ");
        String code2 = scanner.nextLine();
        System.out.print("Nhap vao luong tien can chuyen doi: ");
        double amount = scanner.nextDouble();

        // Chuyen doi tien te va hien thi ket qua
        double result = exchange.convert(code1, code2, amount);
        if (result != -1) {
            System.out.println("Luong tien sau khi doi: " + result);
        } else {
            System.out.println("Khong tim thay ti gia tuong ung.");
        }
    }
}