// 2/1/26
public class DemoClass {
	static {
		System.out.println("This is SIB 1.");
	}
	static {
		System.out.println("This is SIB 2.");
	}
	
	{
		System.out.println("This is the IIB.");
	}
	
	public void displayMessage() {
		System.out.println("This is the non static method displayMessage()");
	}
	public static void staticMethodOne() {
		System.out.println("This is the first static method in the class.");
	}
	public static void staticMethodTwo() {
		System.out.println("This is the second static method in the class.");
	}
	public static void main(String[] args) {
		DemoClass.staticMethodOne();
		DemoClass.staticMethodTwo();
		staticMethodOne();
		DemoClass dc = new DemoClass();
		dc.displayMessage();
	}
}
