// 2/1/26
// Encapsulation

public class TwoJan {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(44);
		System.out.println("Radius: "+c.getRadius());
		System.out.println("Perimeter: "+c.calculatePerimeter(c.getRadius()));
		System.out.println("Area: "+c.calculateArea(c.getRadius()));
		
		
		
	}
	public static int add(int a, int b) {
		System.out.println("Add method start");
		return(a+b);
		System.out.println("Add method end");
	}
}

class Circle{
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calculateArea(int radius) {
		return(22/7 * radius*radius);
	}
	
	public double calculatePerimeter(int radius) {
		return(2*22/7*radius);
	}
}
