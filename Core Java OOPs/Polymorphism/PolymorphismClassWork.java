// 7/1/25
// Polymorphism

// Shadowing/hiding 
class Superclass{
//	Variable Shadowing
	int a = 10;
	static int b = 100;
//	Method Shadowing	
	public static void test() {
		System.out.println("Superclass test method");
	}
	public static void demo(int x) {
		System.out.println("Superclass demo method");
	}
//	Method Overriding 
	public void over(int a) {
		System.out.println("Over method in superclass");
	}
}
class Subclass extends Superclass{
//	Variable Shadowing
	int a = 20;
	static int b = 200;
//	Method Shadowing
	public static void test() {
		System.out.println("Subclass test method");
	}
	public static void demo(int x) {
		System.out.println("Subclass demo method");
	}
	
//	Method Overriding
	@Override      // After putting @override, we have to make ditto method as superclass, else it will give CTE. 
	public void over(int x) {
		System.out.println("Over method in subclass");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
//		Shadowing/hiding
		System.out.println("Superclass obj stored in superclass ref variable");
		Superclass ref1 = new Superclass();
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		ref1.test();
		ref1.demo(0);
//		Overriding
		ref1.over(1);
		
		System.out.println("Subclass obj stored in subclass ref variable");
		Subclass ref2 = new Subclass();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		ref2.test();
		ref2.demo(0);
//		Overriding
		ref2.over(1);
		
		System.out.println("Upcasting");
		Superclass ref3 = new Subclass();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		ref3.test();
		ref3.demo(0);
//		Overriding
		ref3.over(1);
		
		System.out.println("Downcasting");
		Subclass ref4 = (Subclass) ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		ref4.test();
		ref4.demo(0);
//		Overriding  
		ref4.over(1);
//		/////////////////////////////////////
		
	}
}
