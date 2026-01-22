// 30-12-25

public class ThisChaining {

	int id;
	String name;
	double sal;
	
	public ThisChaining() {
		this.id = 101;
		this.name = "Unknown";
		this.sal = 500000.0;
	}
	
	public ThisChaining(int id) {
		this(); // Calling the no argument constructor. Constructor calling "this" keyword does not have PLI & IIB.
		this.id = id;
	}
	
	public ThisChaining(String name) {
		this();
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println("Main start");
		ThisChaining tc = new ThisChaining(25);
		System.out.println(tc.name);
		System.out.println(tc.id);
		System.out.println(tc.sal);
		System.out.println("Main end");
	}
}
