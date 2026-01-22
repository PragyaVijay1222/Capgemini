// 8/1/26
import java.util.Scanner;
//Question 1. Speed Up.
class Vehicle{
	public int speedUp(int initial) {
		int x=30;
		return x+initial;
	}
}
class Car1 extends Vehicle{
	
	@Override
	public int speedUp(int initial) {
		int x = 20;
		return x+initial;
	}
	
}
class Bicycle extends Vehicle{
	
	@Override
	public int speedUp(int initial) {
		int x = 5;
		return x+initial;
	}
}

//Question 2. Area of Shapes.

class Shape{
	public double calculateArea() {
		return 0;
	}
}
class Circle1 extends Shape{
	
	@Override
	public double calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		sc.close();
		return 3.14*radius*radius;
	}
}
class Rectangle extends Shape{
	
	@Override
	public double calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double len = sc.nextDouble();
		System.out.println();
		System.out.print("Enter the breadth: ");
		double bdh = sc.nextDouble();
		sc.close();
		return len*bdh;
	}
}
class Triangle extends Shape{
	
	@Override
	public double calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height: ");
		double len = sc.nextDouble();
		System.out.println();
		System.out.print("Enter the base: ");
		double bdh = sc.nextDouble();
		sc.close();
		return 0.5*len*bdh;
	}
}

public class EightJanuary {
	public static void main(String[] args) {
		Car1 car = new Car1();
    car.speedUp(10);
	}
}

