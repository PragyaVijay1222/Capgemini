package main;


public class LoanService {
	public boolean isEligible(int age, double salary) {
		return (age>=21 && age<=60 && salary >= 25000);
	}
	public double calculateEMI(double loanAmount, int tenureYears) throws IllegalArgumentException{
		if(loanAmount <= 0) {
			throw new IllegalArgumentException("Loan amount is incorrect");
		}else if(tenureYears <= 0) {
			throw new IllegalArgumentException("Tenure amount is incorrect");
		}else {
			return loanAmount / (tenureYears * 12);
		}
	}
	public String getLoanCategory(int creditScore) {
		if(creditScore >= 750) {
			return "Premium";
		}else if(creditScore> 600 && creditScore < 749) {
			return "Standard";
		}else {
			return "High Risk";
		}
	}
}

