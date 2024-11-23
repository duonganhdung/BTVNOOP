package bai4sgk;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        try {
        	Scanner sc = new Scanner(System.in);
            
            System.out.print("Nhap n: ");
            int n = sc.nextInt();       
            
            BenhNhan[] bnList = new BenhNhan[n]; 
            
            for(int i = 0 ; i < n ; i++){
                BenhNhan bn = new BenhNhan();
                bn.nhap();
                bnList[i] = bn;
            }
            
            System.out.println("Ten benh vien: " + bnList[0].layTenBenhVien());
        }
        catch(Exception e)
        {
        	System.out.println("loi !");
        }
    }
}