// 7/1/26
//Non primitive type casting

class Father {
	int a = 10;	
}
class Son extends Father {
	int b = 20;
}
// Candy Crush

class Level_1{
	int a=10;
}
class Level_2 extends Level_1{
	int b=20;
}
class Level_3 extends Level_2{
	int c=30;
}
class Level_4 extends Level_3{
	int d=40;
}

// Task 2 Engineer and Specialization

class Engineer{
	public void work() {
		System.out.println("This is the work method inside Engineer class.");
	}
}
class CSEEngineer extends Engineer{
	public void coding() {
		System.out.println("This is the coding method inside CSEEngineer class.");
	}
}
public class SevenJanuary {
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("---object of father store inside father class ref variable---");
		Father ref1 = new Father();
		System.out.println(ref1.a);
//		System.out.println(ref1.b); CTE cannot find symbol
		System.out.println("---Object of son store inside son class ref variable---");
		Son ref2 = new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println("---upcasting---");
		Father ref3 = new Son(); 
		System.out.println(ref3.a);
//		System.out.println(ref3.b);CTE cannot find symbol
		System.out.println("---downcasting---");
		Son ref4 = (Son)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		
//		Object of level 4(sub) stored inside reference of level 1(super). 
		
		Level_1 ref1 = new Level_4(); // Up-casting
		System.out.println(ref1.a); // Trying to access any other variable in the inheritance will give error;
		
		Level_2 ref2 = (Level_2)ref1; // Down-casting
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		
		Level_3 ref3 = (Level_3)ref2;
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		System.out.println(ref3.c);
		
		Level_4 ref4 = (Level_4)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		System.out.println(ref4.c);
		System.out.println(ref4.d);
		
		Engineer eng = new CSEEngineer();
		eng.work();
		CSEEngineer cse = (CSEEngineer) eng;
		cse.coding();
		
		System.out.println("main end");
	}
}

