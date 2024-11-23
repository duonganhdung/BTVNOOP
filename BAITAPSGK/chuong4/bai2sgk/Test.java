package baitap.chuong4.bai2;

public class Test {
    public static void main(String[] args) {
        try {
            ThoiGian tg = new ThoiGian(31, 13, 2023);
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
