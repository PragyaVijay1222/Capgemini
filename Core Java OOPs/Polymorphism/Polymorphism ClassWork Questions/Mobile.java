// 30/12/25

public class Mobile {
	String brand;
	int storage;
	boolean is5G;
	
	public Mobile() {
		this.brand = "Unknown";
		this.storage = 64;
		this.is5G = false;
	}
	
	public Mobile(String brand, int storage, boolean is5G) {
		this.brand = brand;
		this.storage = storage;
		this.is5G = is5G;
	}
	
	public Mobile(String brand) {
		this();
		this.brand = brand;
	}
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("abc");
		System.out.println(m1.brand);
		System.out.println(m1.storage);
		System.out.println(m1.is5G);
	}
}
