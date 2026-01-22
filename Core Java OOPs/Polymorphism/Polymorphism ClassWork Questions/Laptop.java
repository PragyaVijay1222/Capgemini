// 2/1/26
public class Laptop {
	
	String brand;
	int ramSize;
	double price;
	
	public Laptop() {
		this.brand = "Unknown";
		this.ramSize = 8;
		this.price = 50000.0;
	}
	
	public Laptop(String brand) {
		this();
		this.brand = brand;
	}
	
	public Laptop(String brand, int ramSize) {
		this(brand);
		this.ramSize = ramSize;
	}
	
	public Laptop(String brand, int ramSize, double price) {
		this.brand = brand;
		this.ramSize = ramSize;
		this.price = price;
	}
	
	public void printDetails() {
		System.out.println("Laptop brand: "+ this.brand);
		System.out.println("Ram Size: "+ this.ramSize);
		System.out.println("Price: "+ this.price);
	}
	
	public static void main(String[] args) {
		Laptop obj1 = new Laptop();
		System.out.println("Obj1 Details: ");
		obj1.printDetails();
		
		Laptop obj2 = new Laptop("Lenovo");
		System.out.println("Obj2 Details: ");
		obj2.printDetails();
		
		Laptop obj3 = new Laptop("HP", 16);
		System.out.println("Obj3 Details: ");
		obj3.printDetails();
		
		Laptop obj4 = new Laptop("Asus", 16, 80000.0);
		System.out.println("Obj4 Details: ");
		obj4.printDetails();
	}
}
