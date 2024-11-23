package baitap.chuong5.bai2;

import java.util.ArrayList;

public class Exchange {
    private ArrayList<Rate> rates;

    // Phuong thuc khoi tao
    public Exchange() {
        rates = new ArrayList<>();
    }

    // Them Rate vao danh sach
    public void addRate(Rate rate) {
        rates.add(rate);
    }

    // Phuong thuc chuyen doi tien te
    public double convert(String code1, String code2, double amount) {
        for (Rate rate : rates) {
            if (rate.getCode1().equalsIgnoreCase(code1) && rate.getCode2().equalsIgnoreCase(code2)) {
                return amount * rate.getRate();
            }
        }
        return -1; // Tra ve -1 neu khong tim thay ti gia tuong ung
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Rate rate : rates) {
            sb.append(rate).append("\n");
        }
        return sb.toString();
    }
}