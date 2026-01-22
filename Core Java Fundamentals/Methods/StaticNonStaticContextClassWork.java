import java.util.Scanner;

public class TwentyNineDecember {
	static int a = 10;
	static {
		System.out.println("First static block");
	}
//	Non static method
	int a = 20;
	public void test() {
//		Non static context
		System.out.println("Test method");
		System.out.println(a); // Will give output as 20;
		int a = 25;
		System.out.println(a); // Will give output as 25;
		TwentyNineDecember tnd2 = new TwentyNineDecember();
		System.out.println(tnd2.a); //Will give output as 10;
		System.out.println("Test method end");
	}
	public static void main(String[] args) {
		System.out.println("Main method start");
		main();
//		System.out.println(a);
//		test();                
		TwentyNineDecember tnd = new TwentyNineDecember();
		System.out.println(tnd.a);
		
		System.out.println("Main method end");
	}
	
	public static void main() {
		System.out.println("This is the new main method");
	}
	static {
		System.out.println("Second static block");
	}
	public static void test() {
		System.out.println("test method start");
		int a = 20;
//		A.test2();
		System.out.println(a);
		System.out.println(TwentyNineDecember.a);
		System.out.println("test method end");
	}
}

class A{
	static {
		System.out.println("Static block inside class A");
	}
	public static void test2(){
		System.out.println("Inside test2");
	}
}
