public class Circle {
	private double radius;
	private String color;
	public Circle() {
		radius=1.0;
		color="red";
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}


	public static void main(String[] args) {
		Circle circle=new Circle();
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		Circle circle2=new Circle(52.3);
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getArea());
	}
}

