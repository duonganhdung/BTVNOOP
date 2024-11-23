package baitap.chuong3.bai9;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
protected int hoursPerWeek;
	
	public PartTimeEmployee() {
		
	}
	
	public PartTimeEmployee(String name,int age,char gender,String employerName,String dateHired,int hoursPerWeek) {
	super(name,age,gender,employerName,dateHired);
	this.hoursPerWeek=hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	

	public void nhapTT() {
		Scanner sc =new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap so gio lam moi tuan:");
		this.hoursPerWeek=sc.nextInt();
		}
	
	public String toString() {
		 String i = super.toString()
				 + ", hourPerWeek: " + this.hoursPerWeek;
		 return i;
	}
	
	
}
