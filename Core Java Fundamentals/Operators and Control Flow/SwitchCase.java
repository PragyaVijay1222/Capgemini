import java.util.Scanner;
public class TwentyDecember {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		String fruit = sc.nextLine();
		String info;
		switch(fruit) {
		case "apple": 
			info = "Apples are rich in fiber and vitamin c";
			break;
		case "banana":
			info = "Bananas are great source of potassium";
			break;
		case "mango":
			info = "Mangoes are the king of fruits!";
			break;
		case "orange":
			info = "Oranges are packed with vitamin c";
			break;
		default:
			info = "Sorry, I don't have information about that fruit";
		}
		
		System.out.println(info);
		
		char marks = sc.next().charAt(0);
		String message;
		
		switch(marks) {
		case 'A':
			message = "Excellent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Fair";
			break;	
		case 'D':
			message = "Pass";
			break;
		case 'E':
			message = "Fail";
			break;	
		default:
			message = "Invalid input!";
		}
		
		System.out.println(message);

    // ///////////////////////////////////////////////////////////////////////////////////
    
		System.out.println("Enter the operation name (addition, multiplication, subraction, division :");
		String op = sc.nextLine();
		int ans = 0;
		int num, num1, num2, num3, num4;
		switch(op) {
		case "addition":
			System.out.println("Total number of inputs: ");
			num = sc.nextInt();
			switch(num) {
			case 2:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				ans = num1+num2;
				break;
			case 3:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				ans = num1+num2+num3;
				break;
			case 4:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				num4 = sc.nextInt();
				ans = num1+num2+num3+num4;
				break;				
			}
			break;
		case "subtraction":
			System.out.println("Total number of inputs: ");
			num = sc.nextInt();
			switch(num) {
			case 2:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				ans = num1-num2;
				break;
			case 3:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				ans = num1-num2;
				ans = ans-num3;
				break;
			case 4:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				num4 = sc.nextInt();
				ans = num1-num2;
				ans = ans-num3;
				ans = ans-num4;
				break;				
			}	
			break;
		case "multiplication":
			System.out.println("Total number of inputs: ");
			num = sc.nextInt();
			switch(num) {
			case 2:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				ans = num1*num2;
				break;
			case 3:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				ans = num1*num2*num3;
				break;
			case 4:
				System.out.println("Enter the numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				num4 = sc.nextInt();
				ans = num1*num2*num3*num4;
				break;				
			}
			break;
		case "division":
			System.out.println("Enyter the numbers: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			ans = num1/num2;
			break;
		}

    // ///////////////////////////////////////////////////////////////////////////////////////////////
    
		System.out.println("The answer is "+ans);
		
		System.out.println("Enter your department (IT, HR, Finance, Operations: ");
		String department = sc.nextLine();
		System.out.println("Enter your role (Developer, Tester, DevOps Engineer, Recruiter, HR executive, Payroll officer, Accountant, Financial analyst, Auditor, Operation executive, Team Lead, Manager: ");
		String role = sc.nextLine();
		
		switch(department) {
		case "IT":
			switch(role) {
			case "Developer":
				System.out.println("You are developer in IT department");
				break;
			case "Tester":
				System.out.println("You are tester in IT department");
				break;
			case "DevOps Engineer":
				System.out.println("You are DevOps Engineer in IT department");
				break;						
			}
			break;
		case "HR":
			switch(role) {
			case "Recruiter":
				System.out.println("You are Recruiter in HR department");
				break;
			case "HR executive":
				System.out.println("You are HR executive in HR department");
				break;
			case "Payroll officer":
				System.out.println("You are Payroll Officer in HR department");
				break;						
			}
			break;
		case "Finance":
			switch(role) {
			case "Accountant":
				System.out.println("You are Accountant in Finance department");
				break;
			case "Financial analyst":
				System.out.println("You are Finance analyst in Finance department");
				break;
			case "Auditor":
				System.out.println("You are Auditor in Finance department");
				break;						
			}
			break;
		case "Operations":
			switch(role) {
			case "Operation executive":
				System.out.println("You are Operation executive in Operations department");
				break;
			case "Team lead":
				System.out.println("You are Team lead in Operations department");
				break;
			case "Manager":
				System.out.println("You are Manager in Operations department");
				break;						
			}
			break;
		}
    
		// ///////////////////////////////////////////////////////////////////////////////////
    
		System.out.println("Enter the shape (circle, retangle, triangle, square): ");
		String shape = sc.nextLine();
		int s1, s2, s3;
		switch(shape) {
		case "circle":
			System.out.println("Enter the radius of the circle: ");
			s1 = sc.nextInt();
			System.out.println("Area of circle is "+ (3.14*s1*s1));
			break;
		case "rectangle":
			System.out.println("Enter the length of the sides: ");
			s1 = sc.nextInt();
			s2 = sc.nextInt();
			System.out.println("Area of the rectangle is " + (s1*s2));
			break;
		case "triangle":
			System.out.println("Enter the length of the height and base: ");
			s1 = sc.nextInt();
			s2 = sc.nextInt();
			System.out.println("Area of the triangle is " + (1/2*s1*s2));
			break;
		}
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Enter your employee ID:");
		int empID = sc.nextInt();
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your department (1 for IT, 2 for HR, 3 for Finance):");
		int deptChoice = sc.nextInt();
		System.out.println("Enter your base salary:");
		double salary = sc.nextDouble();
		String role;
		
		if(age<21) {
			System.out.println("Employee is not eligible to work");
		}else {
			switch(deptChoice) {
			case 1:
				System.out.println("Selet a job role (Developer, Tester):");
				role= sc.nextLine();
				break;
			case 2:
				System.out.println("Selet a job role (Recruiter, Payroll):");
				role= sc.nextLine();
				break;
			case 3:
				System.out.println("Selet a job role (Accountant, Auditor):");
				role= sc.nextLine();
				break;
			}
			
		}
		
		sc.close();
	}
}
