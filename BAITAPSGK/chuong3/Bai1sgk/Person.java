package Bai1sgk;

public class Person {
	protected String name;
	protected String dob;
	protected String pob;
	protected char gender;
	protected String email;
	protected String phone;
	
	public Person() {}
	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getPob() {
		return pob;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String toString() {
		return "Ten : " + name + " , Ngay sinh : " + dob + " , Noi sinh : " + pob + " , Gioi tinh : " + gender + " , Email : " + email + " , So dien thoai : " + phone;
	}
}