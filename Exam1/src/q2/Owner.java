package q2;

import java.util.Date;

public class Owner {

	String name;
	Date dob;
	String nic;
	
	
	public Owner() {
		super();
	}

	
	public Owner(String name, Date dob, String nic) {
		super();
		this.name = name;
		this.dob = dob;
		this.nic = nic;
	}
	  public Owner(Owner o)
	    {
		   o.name = name;
			o.dob = dob;
			o.nic = nic;
	    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getNic() {
		return nic;
	}


	public void setNic(String nic) {
		this.nic = nic;
	}


	@Override
	public String toString() {
		return "Owner [name=" + name + ", dob=" + dob + ", nic=" + nic + "]";
	}


	public static void main(String[] args) {
	
	}

}
