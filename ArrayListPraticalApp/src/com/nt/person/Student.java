package com.nt.person;

public class Student extends Person {
	private int sno;
	private String sname;
	private String email;
	private String address;
	private String course;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sno, String sname, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + "\n "
				+ ", sname=" + sname + "\n ,"
						+ " email=" + email + "\n , address=" + address + "\n "
								+ ", course="
				+ course + " \n ]";
	}
	

}
