import java.util.Scanner;

// How to use non static variable inside non static context ? 
//-> Directly
//-> With the help of "this" keyword;

//How to use static members inside non static context?
//-> Directly (non static context will first check object, if not found it will check the class static area)
//->With the help of class name
//->With the help of "this" keyword;
public class ThirtyDecember {
	int id;
	String name;
	
//	Default constructor
	public ThirtyDecember() {
		System.out.println("Constructor called");                                                                         
	}
//	Parameterized constructor
	public ThirtyDecember(int id, String name) {
		this.id = id;
		this.name = name;
	}
//	Copy constructor
	public ThirtyDecember(ThirtyDecember obj) {
		this.id = obj.id;
		this.name = obj.name;                                                                         
	}
	
	int a = 10;
	static int b = 20;
	{
//		Non static block or instance initializer block.
		System.out.println("---New object created for this class---");
		
	}
	static {
		ThirtyDecember td = new ThirtyDecember();
		td.test();
	}
	public void test() {
		System.out.println("Test start");
		System.out.println("Directly non static : "+a);
		System.out.println("With the help of 'this' (non static): "+this.a);
		System.out.println("Directly static : "+b);
		System.out.println("With the help of class name (static): "+ThirtyDecember.b);
		System.out.println("With the help of 'this' (static): "+this.b);
		System.out.println("Test end");
	}
	public static void main(String[] args) {
		System.out.println("main start");
//		ThirtyDecember td = new ThirtyDecember();
//		td.test();
		
		
		System.out.println("main end");
	} 
}
