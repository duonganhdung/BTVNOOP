package baitap.chuong3.bai9;

import java.util.Scanner;

public class Employee extends Person {

	
		protected String employerName;
		protected String dateHired;
		
		
		
		//contructor
		
		public Employee() {
			
		}
		
		public Employee(String name, int age, char gender, String employerName, String dateHired) {
			super(name,age,gender);
			this.employerName = employerName;
			this.dateHired = dateHired;
		}

		
		
		
		//nhap thong tin
		public void nhapTT() {
			Scanner input =new Scanner(System.in);
			super.nhapTT();
			System.out.println("Nhap ten nguoi quanly: ");
			this.employerName=input.next();
			
			System.out.println("Nhap ngay nhan: ");
			this.dateHired=input.next();
		
		}

		//set and get
		public String getEmployerName() {
			return employerName;
		}

		public void setEmployerName(String employerName) {
			this.employerName = employerName;
		}

		public String getDateHired() {
			return dateHired;
		}

		public void setDateHired(String dateHired) {
			this.dateHired = dateHired;
		}

		public String toString() {
			String i = super.toString()
				+ ", employerName:  " +this.employerName
				+ ", dateHired: " + this.dateHired;
			return i;
		}
		
		
		
		
		
	}
