import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the type of prog ( 1 to add 3 variable, 2 to multiply 3 variable, 3 to subtract 4 variable, 4 to add 2 variable): ");
		
	}
	public static int calc(int type, int num1, int num2, int num3) {
		if(type == 1) {
			return (num1+num2+num3);
		}else if(type == 2) {
			return (num1*num2*num3);
		}else if(type == 3) {
			return(num1 - num2 - num3);
		}else return num1+num2;
	}
}
