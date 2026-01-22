 
public class Oddeven {
 public static void main(String[] args) {
	 int x =100;
	 
	 String val = x % 2 == 0? "Even" : "Odd";
	 
	 System.out.println(val);
	 
	 
	 byte b = 78;
	 short s = 10;
	 int i = 20;
	 float f = 6;
	 long l = 100;
	 char c = 'a';
	 boolean bool = true;
	 
	 System.out.println(b);
	 System.out.println(s);
	 System.out.println(i);
	 System.out.println(f);
	 System.out.println(l);
	 System.out.println(c);
	 System.out.println(bool);
	 
	 int z = 10;
	 
	 if(z%2==0) {
		 System.out.println("Is Even");
	 }
	 if(z%2 != 0) {
		 System.out.println("Is Odd");
	 }
	 
	 
 }
}
