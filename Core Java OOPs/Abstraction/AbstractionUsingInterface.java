// 9/1/26
// Abstraction/Inheritance with Interface

interface Father2{
	abstract public void test();
	abstract public int add(int a, int b);
	
}
interface Mother{
	abstract public void demo();
}

class Son2 implements Father2, Mother{
	@Override
	public void test() {
		System.out.println("This is the test method");
	}
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override 
	public void demo() {
		System.out.println("This is the demo method");
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}

// /////////////////////////////////////////////////

class Person1{
	public void showRole() {
		System.out.println("I am a person");
	}
}
class Student2 extends Person1{
	
}
class Teacher extends Person1{
	
}

interface Sports{
	abstract public void play();
}
interface Culture{
	abstract public void perform();
}

class CollegeStudent extends Student2 implements Sports, Culture{
	
	@Override
	public void play() {
		System.out.println("This is the play method");
	}
	@Override 
	public void perform() {
		System.out.println("This is the culture method");
	}
}

// Resizing Question //////////////////////////////

interface Resizable{
	void resizeWidth(int width);
	void resizeHeight(int height);
}

class Rectangle1 implements Resizable{
	private int width;
	private int height;
	
	public Rectangle1(int w, int h) {
		this.height = h;
		this.width = w;
	}
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	
	@Override 
	public void resizeWidth(int w) {
		this.width = w;
	}
	@Override
	public void resizeHeight(int h) {
		this.height = h;
	}
	
	public void toPrint() {
		System.out.println("Width: "+this.width+" Height: "+this.height);
	}
}

public class NineJanuary {
	public static void main(String[] args) {
		Father2 ref = new Son2();
		Son2 ref2 = (Son2) ref;
		ref.test();
//		ref.sub(); CTE
		ref2.test();
		
		Sports ref3 = new CollegeStudent();
		ref3.play();
		Culture ref4 = new CollegeStudent();
		ref4.perform();
		Student2 ref5 = new CollegeStudent();
		ref5.showRole();
		
		Rectangle1 r = new Rectangle1(8, 10);
		r.toPrint();
		Resizable r2 = r;
		r2.resizeHeight(20);
		r2.resizeWidth(16);
		Rectangle1 r3 = (Rectangle1) r2;
		r3.toPrint();
	}
}
