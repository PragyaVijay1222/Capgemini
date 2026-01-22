// 2/1/26

public class OverloadingExample {
	public static void display(int param) {
		System.out.println("This is the message fro int parameter");
	}
	public static void display(String param) {
		System.out.println("This is the message from the string parameter");
	}
	public void display(int param, String param1) {
		System.out.println("This is the message from non static method with two parameters");
	}
	public void display() {
		System.out.println("This is the message from non static method with no parameters");
	}
	public static void main(String[] args) {
		display(123);
		display("Abc");
		OverloadingExample oe = new OverloadingExample();
		oe.display(123, "Abc");
		oe.display();
	}
}
