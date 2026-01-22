
import java.util.Scanner;

public class TwwentySevenDecember {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(predict(45000, 30000, true));
		
		sc.close();
	}
	
	public static double predict(double income, double expenses) {
		
		double savings = income-expenses;
		return savings;
	}
	
	public static double predict(double income, double expenses, boolean festiveMonth) {
		
		double savings;
		if(festiveMonth) {
			savings = income - (expenses + 0.2*expenses);
		}
		else {
			savings = income - expenses;
		}
		
		return savings;
	}
	
	public static double loan(double principal) {
		
		return principal + (principal*8)/100;
	}
	
	public static double loan(double principal, int years) {
		
		return principal + (principal*10*years)/100;
	}
	
	public static double loan(double principal, int years, String loanType) {
		
		double amount = 0.0;
		int rate;
		switch(loanType) {
		case "Home":
			rate = 7;
			amount = principal + (principal*7*years)/100 ;
			break;
			
		case "Auto":
			rate = 9;
			amount = principal + (principal*9*years)/100 ;
			break;
			
		case "Personal":
			rate=12;
			amount = principal + (principal*12*years)/100 ;
		}
		
		return amount;
	}
	
}
