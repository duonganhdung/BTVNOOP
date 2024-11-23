package baitap.chuong4.bai1;

import java.util.Scanner;

public class Chia0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap so thu nhat: ");
            int soThuNhat = scanner.nextInt();

            System.out.print("Nhap so thu hai: ");
            int soThuHai = scanner.nextInt();

            // Kiểm tra điều kiện chia cho 0
            if (soThuHai == 0) {
                throw new ArithmeticException("khong the chia cho 0");
            }

            int ketQua = soThuNhat / soThuHai;
            System.out.println("Ket qua: " + ketQua);

        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}