// 12/01/26
// Exception Handling

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.NullPointerException;
import java.lang.ClassCastException;

class NotEligibleException extends Exception{
	public NotEligibleException(String msg) { 
		System.out.println(msg);
	}
}

public class TwelveJanuary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    ///////////////////////////////////////////////////////////////////////////////////
		try {
			System.out.println("Enter a: ");
			int a = sc.nextInt();
			System.out.println("Enter b: ");
			int b = sc.nextInt();
			int ans = a/b;
			System.out.println("Ans: "+ans);
			String str = null;
			System.out.println(str.length());
			A aa = new A();
			B bb = (B)aa;
			
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Handled....");
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("Handled....");
		}
		catch(ClassCastException cce) {
			cce.printStackTrace();
			System.out.println("Handled....");
		}
		finally {
			System.out.println("Finally block");
			sc.close();
		}

    ///////////////////////////////////////////////////////////////////////////////////

    
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
			eligibleForVoting(age);
		}catch(NotEligibleException e){
			e.printStackTrace();
		}
		
	}
	public static void eligibleForVoting(int age) throws NotEligibleException{
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("Your age is below 18");
		}
	}
}


//class A{
//	
//}
//class B extends A{
//	
//}
