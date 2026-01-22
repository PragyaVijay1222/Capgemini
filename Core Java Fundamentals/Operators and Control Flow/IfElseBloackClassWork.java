import java.util.Scanner;

public class NineteenDecember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%7==0) {
			System.out.println("Divisible by 7");
		}else {
			System.out.println("Not divisible by 7");
		}
    
		// /////////////////////////////////////////////////////////////////
    
		if(a%3 ==0 && a%5 ==0) {
			System.out.println("Divisible by 3 & 5");
		}else {
			System.out.println("Not divisible by 3 & 5");
		}

    // ////////////////////////////////////////////////////////////////
    
		char b = 'i';
		
		if(b == 'a' || b == 'e' || b == 'i' || b == 'o' ||b == 'u') {
			System.out.println("Given char is vowel");
		}else {
			System.out.println("Given char is consonent");
		}

    // ////////////////////////////////////////////////////////////////
    
		char c = '9';
		
		if(c>='0' && c<='9') {
			System.out.println("Given char is digit");
		}else {
			System.out.println("Given char is not a digit");
		}

    // ////////////////////////////////////////////////////////////////
    
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper case char");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("Lower case char");
		}else if(ch >= '0' && ch <= '9') {
			System.out.println("Digit char");
		}else {
			System.out.println("Special char");
		}

    // ////////////////////////////////////////////////////////////////
    
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Charcter is uppercase vowel");
			}else {
				System.out.println("Charcter is uppercase consonent");
			}
		}else if(ch >= 'a' && ch <= 'z') {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Charcter is lowercase vowel");
			}else {
				System.out.println("Charcter is lowercase consonent");
			}
		}else {
			System.out.println("Charcter is non-alphabetic");
		}

    // ////////////////////////////////////////////////////////////////
    
		int num = sc.nextInt();
		
		if(num >0) {
			System.out.println("Positive Number");
		}else if(num ==0 ) {
			System.out.println("Zero");
		}else {
			System.out.println("Negative Number");
		}

    // ////////////////////////////////////////////////////////////////
    
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>z && x>y) {
			System.out.println(x + " is the largest number");
		}else if(z>x && z>y) {
			System.out.println(z + " is the largest number");
		}else {
			System.out.println(y + " is the largest number");
		}

    // ////////////////////////////////////////////////////////////////
    
		if(x<z && x<y) {
			System.out.println(x + " is the smallest number");
		}else if(z<x && z<y) {
			System.out.println(z + " is the smallest number");
		}else {
			System.out.println(y + " is the smallest number");
		}
		
		sc.close();
		
	}
}
