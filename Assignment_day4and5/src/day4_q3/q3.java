package day4_q3;


import java.io.*;

public class q3{
	
	private static void serializeObject(Employee emp, File file) {
		try(FileOutputStream fileOut = new FileOutputStream(file)){
			ObjectOutputStream oos = new ObjectOutputStream(fileOut);
			oos.writeObject(emp);
			oos.flush();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	private static void deserializeObject(File file) {
		try(FileInputStream fis = new FileInputStream(file)){
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee readEmp = (Employee) ois.readObject();
			readEmp.display();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		Address address = new Address("B-104, Derawal Nagar, Model Town, Delhi-9");
		Employee employee = new Employee("Paras", "YM329", address, 50000.0);
		File file = new File("C:\\Users\\ve00ym333\\Desktop\\Assignment4_q1.txt");
		serializeObject(employee, file);
		deserializeObject(file);
	}
}