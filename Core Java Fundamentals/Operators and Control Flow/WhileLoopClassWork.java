import java.util.Scanner;
public class TwentyFourDecember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("All the digits of the given number");
		while(num !=0) {
			int digit = num %10;
			System.out.println(digit);
			num = num/10;
		}
		
//		Prime number
		System.out.println("Prime digits");
		while(num !=0) {
			int digit = num%10;
			int count=0;
			for(int i=2; i<=digit/2; i++) {
				if(digit%i==0) {
					count++;
				}
			}
			if(count ==0) {
				System.out.println(digit);
			}
			num = num/10;
		}
		
		
//		Even digits
		System.out.println("Even digits");
		while(num !=0) {
			int digit = num%10;
			if(digit%2==0) {
				System.out.println(digit);
			}
			num = num/10;
		}
		
//		Sum of the digits
		System.out.println("Sum of the digits");
		int sum = 0;
		
		while(num!=0) {
			int digit = num%10;
			sum += digit;
			num = num/10;
		}
		System.out.println("Sum = "+sum);
		
		
		int even = 0;
		int odd = 0;
		
		while(num!=0) {
			int digit = num%10;
			if(digit%2==0) {
				even+=digit;
			}else {
				odd+=digit;
			}
			
			num = num/10;
		}
		
		System.out.println("The required product is: "+ (even*odd));
		
		int temp = num;
		int smallest = 10;
		
		while(num!=0) {
			int digit = num%10;
			if(digit<smallest) {
				smallest = digit;
			}
			num = num/10;
		}
		
		System.out.println("Smallest digit is: "+ smallest);
		
		
		int second_smallest = 10;
		num = temp;
		while(num!=0) {
			int digit = num%10;
			if(digit<second_smallest && digit>smallest) {
				second_smallest = digit;
			}
			num = num/10;
		}
		System.out.println("Second smallest digit is: "+second_smallest);
		
		
		int largest = -1;
		num = temp;
		while(num!=0) {
			int digit = num%10;
			if(digit>largest) {
				largest = digit;
			}
			num = num/10;
		}
		System.out.println("Largest digit is: "+largest);
		
		
		int second_largest = -1;
		num = temp;
		while(num!=0) {
			int digit = num%10;
			if(digit>second_largest && digit<largest) {
				second_largest = digit;
			}
			num = num/10;
		}
		System.out.println("Second largest digit is: "+second_largest);
		
		Special Number
		int temp = num;
		int sum =0;
		int prod =1;
		
		while(num!=0) {
			int digit  = num%10;
			sum += digit;
			prod *= digit;
			num = num/10;
		}
		num = temp;
		if(sum+prod == num) {
			System.out.println(num + " is a special number");
		}else {
			System.out.println(num + " is a not special number");
		}
		
		// Range of special numbers;
		
		System.out.println("Special numbers from 1 to 100");
		for(int i=1; i<=100; i++) {
			int sum =0;
			int prod =1;
			int temp = i;
			while(temp!=0) {
				int digit = temp%10;
				sum += digit;
				prod *= digit;
				temp = temp/10;
			}
			if(sum+prod == i) {
				System.out.println(i);
			}
		}
		
		
		// Niven Number
		
		int sum = 0;
		int temp = num;
		
		while(num!=0) {
			int digit = num%10;
			sum += digit;
			num = num/10;
		}
		
		String res = temp % sum ==0 ? "Niven Number" : "Not a Niven Number";
		System.out.println(res);
		
		// Factorial of each digit
		
		while(num!=0) {
			int digit = num%10;
			int facto = 1;
			for(int i=1; i<=digit; i++) {
				facto *= i;
			}
			System.out.println("Factorial of "+digit +" is "+facto);
			num = num/10;
		}
		
		// Strong Number
		
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			int facto = 1;
			for(int i=1; i<=digit; i++) {
				facto *= i;
			}
			sum += facto;
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a strong number");
		}
		
		System.out.println("Strong number in the range of 1 to 1000");
		for(int i = 1; i<=1000; i++) {
			int temp = i;
			int sum = 0;
			while(temp!=0) {
				int digit = temp%10;
				int facto = 1;
				for(int j=1; j<=digit; j++) {
					facto *= j;
				}
				sum += facto;
				temp = temp/10;
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
		
		
		
		// Palindome numbers
		
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int digit = num%10;
			rev = rev *10 +digit;
			num = num/10;
		}
		
		String res = rev == temp ? "Palindrome" : "Not a palindrome";
		System.out.println(res);
		
		// Abundant number
		
		int sum = 0;
		
		for(int i=1; i<=num/2; i++) {
			if(num%i==0) {
				sum += num;
			}
		}
		
		int ans = sum > num ? 1:0;
		
		System.out.println(ans);
		
		// Xylem and Phloem numbers
		
		

		// Disarium Number
		
		int temp = num;
		int count =0;
		
		while(num!=0) {
			count += 1;
			num = num/10;
		}
		
		num = temp;
		
		int sum = 0;
		
		while(num!=0) {
			int digit = num%10;
			sum += Math.pow(digit, count);
			count--;
			num = num/10;
		}
		
		if(sum == temp){
			System.out.println("Disarium Number");
		}else {
			System.out.println("Not a disarium number");
		}
		
		
	}
}
