import java.util.Scanner;
public class TwentySixDecember {
public static void main(String[] args) {

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
	public static void num(int i) {
		if(i>1000) {
			return;
		}
		System.out.println(i);
		num(i+1);
	}
	public static void odd(int i) {
		if(i<50) return;
		if(i%2!=0) {
			System.out.println(i);
		}
		odd(--i);
	}
	public static int add(int i, int sum) {
		if(i>5) return sum;
		return add(i+1, sum+i);
	}
}
