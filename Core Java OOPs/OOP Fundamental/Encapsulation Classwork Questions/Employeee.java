// 2/1/26
// Encapsulation

public class Employeee {
	private int emp_id;
	private String emp_name;
	private double emp_sal;
	
	public int getEmpID() {
		return emp_id;
	}
	
	public String getEmpName() {
		return emp_name;
	}
	
	public void setEmpID(int id) {
		this.emp_id = id;
	}
	
	public void setEmpName(String name) {
		this.emp_name = name;
	}
	
	public String setSal(double sal) {
		this.emp_sal = sal;
		return("Salary: "+emp_sal);
	}
	
	public static void main(String[] args) {
		Employeee emp = new Employeee();
		emp.setEmpID(1234);
		System.out.println(emp.getEmpID());
		emp.setEmpName("Abcd");
		System.out.println(emp.getEmpName());
		System.out.println(emp.setSal(1234567.89));
	}
}
