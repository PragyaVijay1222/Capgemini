// 2/1/26

public class Employees {
	int id;
	String name;
	double sal;
	
	public Employees(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public void printDetails() {
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.sal);
	}
	
	public static void main(String[] args) {
		Employees emp1 = new Employees(1234, "Abc", 123456.78);
		emp1.printDetails();
		Employees emp2 = new Employees(2345, "Cde", 234567.89);
		emp2.printDetails();
		Employees emp3 = new Employees(3456, "Efg", 345678.90);
		emp3.printDetails();
		Employees emp4 = new Employees(4567, "Fgh", 456789.01);
		emp4.printDetails();
		
	}
}
