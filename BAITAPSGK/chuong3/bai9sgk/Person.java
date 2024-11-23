package baitap.chuong3.bai9;

import java.util.Scanner;

public class Person {
	
		protected String name;
		protected int age;
		protected char gender;
		
		//constructor
		public Person() {
			
		}
		
		public Person(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender=gender;
		}

	
		

		
		//phuong thuc nhap vao thong tin
		public void nhapTT() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ten:");
			this.name=sc.next();
			
			System.out.println("Nhap tuoi:");
			this.age=sc.nextInt();
			
			System.out.println("Nhap gioi tinh: ");
			this.gender=sc.next().charAt(0);
			
		}
		//get and set
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		
		public String toString() {
			String i = "Name: " + this.name
					+ ", age: " + this.age
					+ ", gender: " +this.gender;
			return i;
		}
		

		
		
		
	}
