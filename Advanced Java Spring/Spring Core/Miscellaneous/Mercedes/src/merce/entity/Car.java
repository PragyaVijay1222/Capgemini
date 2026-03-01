package merce.entity;

public class Car {
	
//	Loose coupling
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
		
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}
}
