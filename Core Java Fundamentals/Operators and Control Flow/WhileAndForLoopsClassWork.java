import java.util.Scanner;

public class TwentyThreeDecember {
	public static void main(String[] args) {
		
		int i = -123;
		System.out.println("From -123 to -129");
		while(i>=-129) {
			System.out.println(i);
			i--;
		}
		
		i = 79;
		System.out.println("From 79 to 84");
		while(i<=84) {
			System.out.println(i);
			i++;
		}
		
		i = -110;
		System.out.println("From -110 to -100");
		while(i<=-100) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		System.out.println("From 0 to -9");
		while(i>=-9) {
			System.out.println(i);
			i--;
		}
		
		char a = 'A';
		System.out.println("From A to M");
		while(a<='M') {
			System.out.println(a);
			a++;
		}
		
		a = 'x';
		System.out.println("From x to m");
		while(a>='m') {
			System.out.println(a);
			a--;
		}
		System.out.println("From -111 to -101");
		int i = -111;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<=-101);
		
		
		System.out.println("From 123 to 113");
		i = 123;
		
		do {
			System.out.println(i);
			i--;
		}
		while(i>=113);
		
		System.out.println("From 5 to -5");
		
		i = 5;
		
		do {
			System.out.println(i);
			i--;
		}while(i>=-5);
		
		System.out.println("From -10 to 0");
		
		i = -10;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=0);
		
		
		System.out.println("From s to l");
		char a = 's';
		
		do {
			System.out.println(a);
			a--;
		}while(a>='l');
		
		System.out.println("From T to Z");
		a = 'T';
		
		do {
			System.out.println(a);
			a++;
		}while(a<='Z');
		
		// //////////////////////////////////////////////////////////////
    
		System.out.println("From 1111 to 1121");
		
		for(int i=1111; i<=1121; i++) {
			System.out.println(i);
		}
		
		System.out.println("From 1234 to 1223");
		
		for(int i=1234; i>=1223; i--) {
			System.out.println(i);
		}
		
       System.out.println("From -1111 to -1121");
		
		for(int i=-1111; i>=-1121; i--) {
			System.out.println(i);
		}
		
       System.out.println("From -1234 to -1223");
		
		for(int i=-1234; i<=-1223; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("From d to j");
		
		for(char i='d'; i<= 'j'; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("From m to e");
		
		for(char i='m'; i>= 'e'; i--) {
			System.out.println(i);
		}
		
		
		System.out.println("From z to t");
		
		for(char i='z'; i>= 't'; i--) {
			System.out.println(i);
		}
		
		
		System.out.println("From r to x");
		
		for(char i='r'; i<= 'x'; i++) {
			System.out.println(i);
		}

    // //////////////////////////////////////////////////////////////
    
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Even numbers from 2 to 20");
		
		for(int i=2; i<=20; i+=2) {
			System.out.println(i);
		}
		
// //////////////////////////////////////////////////////////////
    
		System.out.println("Divisible by 7 from 100 to 50");
			for(int i= 100; i>=50; i--) {
				if(i%7 == 0) {
					System.out.println(i);
				}
				}

    // //////////////////////////////////////////////////////////////
			
	   System.out.println("Sum of all the numbers from 1 to 10");
	   
	   int sum = 0;
	   
	   for(int i=0; i<=10; i++) {
		   sum = sum+i;
	   }
	   
	   System.out.println("Sum = "+sum);

    // //////////////////////////////////////////////////////////////
    
	   System.out.println("Product of all the numbers in the range 1 to 10");
	   
	   int prod = 1;
	   
	   for(int i=1; i<=10; i++) {
		   prod = prod*i;
	   }
	   
	   System.out.println("Product = "+prod);

    // //////////////////////////////////////////////////////////////
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3==0 && i%5!=0) {
				System.out.println("Fizz");
			}else if(i%3!=0 && i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}

    // //////////////////////////////////////////////////////////////
		
		System.out.println("Factors of a number");
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i ==0) {
				System.out.println(i);
			}
		}
		
		

    // //////////////////////////////////////////////////////////////
		
		System.out.println("Enter the number: ");
		
		int n = sc.nextInt();
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0){
				System.out.println("Composite number");
				return;
			}
		}
		System.out.println("Prime number");
		
		System.out.println("Prime numbers from 20 to 1");
		
		for(int i=1; i<=20; i++) {
			int count =0;
			for(int j=2; j<= i/2; j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count ==0 ) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("Enter the number");
		int n = sc.nextInt();

    // //////////////////////////////////////////////////////////////
		
		for(int i=1; i<=n; i++) {
			int sum = 0;
			for(int j=1; j<= i/2; j++) {
				if(i%j==0) {
					sum = sum+j;
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
		}

    // //////////////////////////////////////////////////////////////
    
		for(int i=1; i<=100; i++) {
			int sum = 0;
			for(int j=1; j<= i/2; j++) {
				if(i%j==0) {
					sum = sum+j;
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
		}

    // //////////////////////////////////////////////////////////////
    
		System.out.println("Eneter the number to get the factorial: ");
		int n = sc.nextInt();
		
		int facto = 1;
		
		for(int i=1; i<=n ;i++) {
			facto *= i;
		}
		System.out.println("Factoral of the number "+n+" is "+facto);

    // //////////////////////////////////////////////////////////////
    
		System.out.println("Factorial of the number in the range 1 to 10");
		
		int facto = 1;
		for(int i=1; i<= 10; i++) {
			facto *= i;
			
			System.out.println("Factorial of number "+i+" is "+facto);
		}

	// //////////////////////////////////////////////////////////////

       System.out.println("Factorial of the odd numbers in the range 1 to 10");
		
		int facto = 1;
		for(int i=1; i<= 10; i++) {
			facto *= i;
			if(i %2!=0) {
			System.out.println("Factorial of number "+i+" is "+facto);
			}
		}

// //////////////////////////////////////////////////////////////

    
       System.out.println("Factorial of the even numbers in the range 1 to 10");
		
		int facto = 1;
		for(int i=1; i<= 10; i++) {
			facto *= i;
			if(i %2==0) {
			System.out.println("Factorial of number "+i+" is "+facto);
			}
		}
		// //////////////////////////////////////////////////////////////
    
		System.out.println("Factorial of a prime from 14 to 5");
		
		int facto = 24;
		for(int i=5; i<=14; i++) {
			facto *= i;
			int count = 0;
			for(int j = 2; j<= i/2; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println("Factorial of "+ i +" is " +facto);
			}
		}

  // //////////////////////////////////////////////////////////////

		System.out.println("Sum of all the prime numbers from 32 to 50");
		int sum =0;
		
		for(int i=32; i<=50; i++) {
			int count=0;
			for(int j=2; j<= 32/2; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum = "+sum);
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		int time = input1*input2;
		
		System.out.println("The time is " + time%12);
		
		System.out.println("Fibonacci Sequence");
		System.out.println("Enter the limit");
		
		int n = sc.nextInt();
		int past1 = 0, past2 = 1;
		System.out.print(0+" , "+1+" , ");
		for(int i=3; i<=n ; i++) {
			int curr = past1+past2;
			System.out.print(curr+" , ");
			past1 = past2;
			past2 = curr;
		}
	}
}
