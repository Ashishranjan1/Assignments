package com.empapp.model.persistence;

public class Employee {

	private int eid;
	private String ename;
	private String city;
	private double salary;
	
	public Employee()
	{
		
	}
	public Employee(int eid, String ename, String city, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", city=" + city + ", salary=" + salary + "]";
	}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		
	}

}
