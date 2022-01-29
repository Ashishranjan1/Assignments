package day4_q3;
import java.io.Serializable;  

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	String name,id;
	Address address;
	double salary;
	
	public Employee(String name, String id, Address address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}

	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name : ").append(name)
		  .append(" ID : ").append(id)
		  .append(" Address : ").append(address.getAddress())
		  .append(" Salary : ").append(salary);
		System.out.println(sb.toString());
	}
}