package baitap.chuong3.bai9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap so luong nhan vien: ");
	int n = sc.nextInt();
	PartTimeEmployee pt[] = new PartTimeEmployee[n];
	
	//khoi tao gia tri cho n doi tuong
	for(int i=0; i<pt.length; i++)
		pt[i] = new PartTimeEmployee();
	
	for(int i=0; i<pt.length;i++) {
		System.out.println("Nhap thong tin nhan vien " + (i+1) + ": ");
		pt[i].nhapTT();
	}
		
	
	
	for(int i=0; i<pt.length; i++)
		System.out.println(pt[i].toString());
	
	}
}