// 8/1/26
// Abstraction using Abstract Class

abstract class Abstraction{
	static int a =10;
	int b = 20;
	public Abstraction() {
		System.out.println("This is the constructor");
	}
	public static void test() {
		System.out.println("This is the static method");
	}
	public void add() {
		System.out.println("This is the non static method");
	}
	abstract public void demo();
}
class AbstractionChild extends Abstraction{
	
	@Override 
	public void demo() {
		System.out.println("This is the demo method");
	}
}

public class EightJanuary {
	public static void main(String[] args) {
		 Abstraction abs = new AbstractionChild();
		 System.out.println(abs.a);
		 System.out.println(abs.b);
		 abs.test();
		 abs.add();
		 abs.demo();
	}
}

