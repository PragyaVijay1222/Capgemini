package merce.driver;
import merce.entity.*;
import java.util.Scanner;

public class CarDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the choice for engine: 1. Petrol, 2. Diesel: ");
		
		byte input = sc.nextByte();
		sc.nextLine();

//		Eager instantiation;
//		Car car = new Car();
		
		Engine engine = null;
		switch(input) {
		case 1:
//		Lazy instantiation.
			engine = new PetrolEngine();
			break;
		case 2:
			engine = new DieselEngine();
		}
		
//		Field Injection
		
//		car.engine = engine;              engine should be public for this as driver is in other package.
//		car.engine.run();
		
//		Setter Injection
		
//		car.setEngine(engine);
//		car.getEngine().run();
		
//		Constructor Injection
		
		Car car = new Car(engine);
		car.getEngine().run();
		
		System.out.println(car.getEngine().getClass());
		
		sc.close();
	}
}
