package com.power.JavaHomeWork;
//class and object

public class Student {
	String name;
	int roll_no;
	String address;
	long phone_no;

	Student() {
		this.name = "not given";
		this.roll_no = 00;
		this.address = "not given";
		this.phone_no = 00;
	}

	Student(String name, int roll_no, String address, long phone_no) {
		this.name = name;
		this.roll_no = roll_no;
		this.address = address;
		this.phone_no = phone_no;
	}

	void display() {
		System.out.println("\n\t\tStudent information:");
		System.out.println("Name:" + name);
		System.out.println("Roll_no: " + roll_no);
		System.out.println("Address:" + address);
		System.out.println("phone no:" + phone_no);
	}

	void headdisplay() {
		System.out.println("\n\t\tStudent information:");
	}

	public String getName() {
		System.out.println("Name:" + name);
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		System.out.println("Roll no: " + roll_no);
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getAddress() {
		System.out.println("Address:" + address);
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone_no() {
		System.out.println("phone no:" + phone_no);
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public static void main(String args[]) {
		Student s1 = new Student();
		s1.headdisplay();
		s1.setName("Gauri");
		s1.setRoll_no(16);
		s1.setPhone_no(4576165);
		s1.setAddress("Nagar");
		s1.getName();
		s1.getRoll_no();
		s1.getAddress();
		s1.getPhone_no();
		Student s2 = new Student();
		s2.display();
	}

}
