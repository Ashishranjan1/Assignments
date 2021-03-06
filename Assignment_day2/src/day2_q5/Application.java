package day2_q5;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of wheel, "
				+ "number of seats, "
				+ "Model, "
				+ "make and "
				+ "number of doors of the Vehicle");
		int noOfWheel=Integer.parseInt(in.nextLine());
		int noOfSeats=Integer.parseInt(in.nextLine());
		int model=Integer.parseInt(in.nextLine());
		String make=in.nextLine();
		int noOfDoors=Integer.parseInt(in.nextLine());
		
		System.out.println("---------Vehicle object creation----------");
		Vehicle obj=new Vehicle(noOfWheel,noOfSeats,model,make);
		obj.display();
		
		System.out.println("---------Car object creation-----------");
		Vehicle obj1=new Car(noOfWheel,noOfSeats,model,make,noOfDoors);
		obj1.display();
		
		System.out.println("-------Convertible object creation-----------");
		System.out.println("Hood is open or closed if open press y else press n");
		char ch=in.next().charAt(0);
		Boolean flag=false;
		if(ch=='y')
		{
			flag=true;
		}
		Vehicle obj2=new Convertible(noOfWheel,noOfSeats,model,make,noOfDoors,flag);
		obj2.display();
		
		System.out.println("-------SportsCar object creation--------");
		Vehicle obj3=new SportsCar(noOfWheel,noOfSeats,model,make,noOfDoors);
		obj3.display();
		
	}
}
