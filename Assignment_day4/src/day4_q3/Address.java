package day4_q3;


import java.io.Serializable;

public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	private String address;

	public Address(String address) {
		this.address = address;
	}
	public Address() {}
	
	public String getAddress() {
		return this.address;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Address : ").append(address);
		return stringBuilder.toString();
	}
	

}