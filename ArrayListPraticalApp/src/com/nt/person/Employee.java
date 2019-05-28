package com.nt.person;

public class Employee extends Person {
	private int eno;
	private String ename;
	private String email;
	private String address;
	private int salery;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eno, String ename, int salery) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salery = salery;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public int getSalery() {
		return salery;
	}
	public void setSalery(int salery) {
		this.salery = salery;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + "\n "
				+ " ename=" + ename + "\n "
						+ " email=" + email + "\n "
								+ "address=" + address + "\n "
										+ " salery="+ salery +  "\n]";
	}

}
