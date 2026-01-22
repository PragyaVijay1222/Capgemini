//30/12/25

public class StudentDetails {
	
	static String collegeName = "LPU";
	int id = 0000;
	String name = "Default name";
	double percent = 00.00;
	
	public StudentDetails() {
		
	}
	public StudentDetails(int id) {
		this.id = id;
	}
	public StudentDetails(String name) {
		this.name = name;
	}
	public StudentDetails(double percent) {
		this.percent = percent;
	}
	public StudentDetails(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public StudentDetails(int id, double percent) {
		this.id = id;
		this.percent = percent;
	}
	public StudentDetails(String name, double percent) {
		this.name = name;
		this.percent = percent;
	}
	public StudentDetails(int id, String name, double percent) {
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	
	public static void printDetails(StudentDetails obj) {
		System.out.println("ID: "+obj.id);
		System.out.println("Name: "+obj.name);
		System.out.println("Percentage: "+obj.percent);
		System.out.println("College Name: "+collegeName);
		
	}
	public static void main(String[] args) {
		
		System.out.println("Using default constructor");
		StudentDetails obj1 = new StudentDetails();
		printDetails(obj1);
		System.out.println("Using id constructor");
		StudentDetails obj2 = new StudentDetails(1);
		printDetails(obj2);
		System.out.println("Using name constructor");
		StudentDetails obj3 = new StudentDetails("Prachi");
		printDetails(obj3);
		System.out.println("Using percent constructor");
		StudentDetails obj4 = new StudentDetails(97.90);
		printDetails(obj4);
		System.out.println("Using id, name constructor");
		StudentDetails obj5 = new StudentDetails(2, "Sumit");
		printDetails(obj5);
		System.out.println("Using id, percent constructor");
		StudentDetails obj6 = new StudentDetails(3, 98.63);
		printDetails(obj6);
		System.out.println("Using name, percent constructor");
		StudentDetails obj7 = new StudentDetails("Abhijeet", 96.56);
		printDetails(obj7);
		System.out.println("Using id, name, percent constructor");
		StudentDetails obj8 = new StudentDetails(4, "Arcana", 78.90);
		printDetails(obj8);
	}
}
