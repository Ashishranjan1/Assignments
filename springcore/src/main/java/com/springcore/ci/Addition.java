package com.springcore.ci;

public class Addition {
	private int a,b;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("int : int");
	}

	public Addition(double a,double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("double : double");
	}
	
	public void dosum()
	{
		System.out.println("Sum is :"+ (a+b));
	}
	
	

}
