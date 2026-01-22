import java.util.Scanner;
public class TwentySixDecember {
	public static void main(String[] args) {
		num(1);
		odd(500);
		System.out.println(add(1,0));
		
		double b = 45.78;
		int x = (int)b;
		System.out.println(x);
		
		int a = 130;
		byte c = (byte)a;
		System.out.println(c);
		
		long l = 987654321;
		int i = (int)l;
		short s = (short)i;
		byte bb = (byte)s;
		System.out.println(bb);
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.println("Enter the numbers: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even numbers");
		for(int i=0 ;i<arr.length; i++) {
			if(arr[i]%2==0) System.out.println(arr[i]);
		}
		
		System.out.println("Prime numbers");
		for(int i=0 ;i<arr.length; i++) {
			int count =0;
			for(int j=2; j<=arr[i]/2; j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}
			if(count==0) System.out.println(arr[i]);
		}
		
		
		System.out.println("Perfect Number");
		for(int i=0; i<arr.length; i++) {
			int prod=1;
			int sum=0;
			int temp = arr[i];
			
			while(temp!=0) {
				int digit = temp%10;
				sum += digit;
				prod *= digit;
				temp = temp/10;
			}
			if(sum+prod==arr[i]) System.out.println(arr[i]);
		}
		
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all numbers is: "+sum);
		
		int product =1;
		
		for(int i=0; i<arr.length; i++) {
			product *= arr[i];
		}
		System.out.println("Product of all numbers is: "+product);
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallest) smallest = arr[i];
		}
		
		System.out.println("Smallest value is: "+smallest);
		
		int biggest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>biggest) biggest = arr[i];
		}
		
		System.out.println("Largest value is: "+biggest);
		
		int second_smallest = arr[1];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<second_smallest && arr[i]>smallest) second_smallest = arr[i];
		}
		
		System.out.println("Second smallest number is: "+second_smallest);
		
       int second_largest = arr[1];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>second_largest && arr[i]<biggest) second_largest = arr[i];
		}
		
		System.out.println("Second largest number is: "+second_largest);
		
		
		int third_smallest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<third_smallest && arr[i]>second_smallest)third_smallest = arr[i];
		}
		
		System.out.println("Third smallest number is: "+third_smallest);
		
		
		int third_largest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>third_largest && arr[i]<second_largest)third_largest = arr[i];
		}
		
		System.out.println("Third largest number is: "+third_largest);
		
		
		int[] arr2 = {1,4,6,7,8,4,8};
		
		int[] merged_arr = new int[17];
		for(int i=0; i<arr.length; i++) {
			merged_arr[i] = arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			merged_arr[i+10]=arr2[i];
		}
		
		System.out.println("New array is: ");
		for(int i=0; i<merged_arr.length; i++) {
			System.out.print(merged_arr[i]+" ");
		}
		System.out.println("");
		
		System.out.println("Intersection of the two array is: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr[i]==arr2[j])System.out.print(arr[i]+" ");
			}
		}
		System.out.println("");
		
		System.out.println("Occurrance of elements: ");
		
		for(int i=0 ;i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) count++;
			}
			System.out.println(arr[i]+" is "+count);
		}
		System.out.println("Enter the length: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the array: ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%k==0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			int left = target-arr[i];
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==left && j!=i) {
					System.out.println("["+i+","+j+"]");
					return;
				}
			}
		}
		
		int sum = 0;
		int count =0;
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==(sum/arr.length)) count++;
		}
		System.out.println(count);
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) largest=arr[i];
			if(arr[i]<smallest) smallest=arr[i];
		}
		int count1 =0;
		int count2 =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==largest) count1++;
			if(arr[i]==smallest) count2++;
		}
		System.out.println((float)(count1*largest+smallest*count2)/(count1+count2));
		
		
		for(int i=0; i<arr.length; i++) {
			int count =0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j])count++;
			}
			if(count==0) System.out.println(arr[i]);
		}
		
		System.out.println("Enter the target: ");
		int k = sc.nextInt();
		int max = 0;
		int num=0;
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			int temp = arr[i];
			while(temp!=0) {
				int digit = temp%10;
				if(digit == k) count++;
				temp = temp/10;
			}
			if(count>max) {
				max = count;
				num = arr[i];
			}
			
		}
		
		System.out.println(num);
		
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			int num = 0;
			while(temp!=0) {
				int digit = temp%10;
				num = num*10 + digit;
				temp = temp/10;
			}
			arr[i] = num;
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the sales: ");
		int[] sales = new int[7];
		for(int i=0; i<7; i++) {
			sales[i] = sc.nextInt();
		}
		System.out.println("Enter the temperatures: ");
		int[] temp = new int[7];
		for(int i=0; i<7; i++) {
			temp[i] = sc.nextInt();
		}
		
		int sum = 0;
		int hottest = Integer.MIN_VALUE;
		int coldest = Integer.MAX_VALUE;
		int hotDays =0;
		for(int i=0; i<7; i++) {
			if(temp[i]>hottest) hottest = temp[i];
			if(temp[i]<coldest) coldest = temp[i];
			sum+=temp[i];
			if(temp[i]>30)hotDays++;
		}
		
		System.out.println("Average Temperature: "+(float)sum/7);
		System.out.println("Highest Temperature: "+hottest);
		System.out.println("Lowest Temperature: "+coldest);
		System.out.println("Number of hot days(>30deg C): "+hotDays);
		
		
		int totalSales =0;
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int hDay =0;
		int lDay =0;
		for(int i=0; i<7; i++) {
			totalSales+=sales[i];
			if(sales[i]>highest) {
				highest= sales[i];
				hDay = i+1;
			}
			if(sales[i]<lowest) {
				lowest= sales[i];
				lDay = i+1;
			}
		}
		
		System.out.println("Total Sales: "+totalSales);
		System.out.println("Average Sales: "+(float)(totalSales/7));
		System.out.println("Highest Sale: "+highest+" on "+hDay);
		System.out.println("Lowest Sale: "+lowest+" on "+lDay);
		System.out.println("Enter the sale value: ");
		int k = sc.nextInt();
		int day =0;
		for(int i=0; i<7; i++) {
			if(sales[i]==k) day = i+1;
		}
		System.out.println("Sale "+k+" found on Day "+day);
		
		System.out.println("Enter the day and the amount: ");
		int d = sc.nextInt();
		int s = sc.nextInt();
		sales[d-1] = s;
		
		System.out.println("Expected sales for Day "+d+":"+s);
		
	}
}
