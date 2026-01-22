// 13/1/26
// Wrapper Class
// Collection framework

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ThirteenJanuary {
	public static void main(String[] args) {
		
		//////////////////////////Integer//////////////////////////////
		int a = 10;
		Integer i = a;
		System.out.println("Implicit boxing: "+i);
		Integer j = Integer.valueOf(a);
		System.out.println("Explicit boxing: "+j); 
		
		Integer b = 20;
		int x = b;
		System.out.println("Implicit unboxing: "+x);
		int y = b.intValue();
		System.out.println("Eplicit unboxing: "+y);
		
		/////////////////////////Byte/////////////////////////////////
		byte c = 1;
		Byte m = c;
		System.out.println("Implicit boxing: "+m);
		Byte n = Byte.valueOf(c);
		System.out.println("Explicit boxing: "+n);
		
		Byte d = 2;
		byte e = d;
		System.out.println("Implicit unboxing: "+e);
		byte f = d.byteValue();
		System.out.println("Eplicit unboxing: "+f);		
		
		///////////////////////Boolean///////////////////////////////
		boolean g = true;
		Boolean h = g;
		System.out.println("Implicit boxing: "+h);
		Boolean k = Boolean.valueOf(g);
		System.out.println("Explicit boxing: "+k);
		
		Boolean l = false;
		boolean o = l;
		System.out.println("Implicit unboxing: "+o);
		boolean p = l.booleanValue();
		System.out.println("Eplicit unboxing: "+p);	
		
		/////////////////////Collection Framework////////////////////
		
		List al = new ArrayList();
		
		al.add(10); al.add(10.90); al.add('d'); al.add("This"); al.add(true); al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(4));
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		ArrayListProblem alp = new ArrayListProblem();
		alp.add();
		alp.insert();
		alp.present();
		System.out.println(alp.sort());
		System.out.println(alp.clear());
		
		IntegerList il = new IntegerList();
		il.methodOfIntegerList();
		
		int[] arr = {1,2,3,4,5,6};
		for(int a : arr) {
			ArrayList<Integer> array = new ArrayList<>(a);
			System.out.println(array);
		}
		
		
		
	}
}

class ArrayListProblem{
	ArrayList <String> arr = new ArrayList<>();
	
	public void add() {
	arr.add("Delhi");
	arr.add("Mumbai");
	arr.add("Chennai");
	arr.add("Kolkata");
	}
	public void insert() {
		arr.add(2, "Bangalore");
	}
	public void display() {
		System.out.println(arr);
	}
	public void present() {
		if(arr.contains("Mumbai")) {
			System.out.println("Mumbai is present");
		}else {
			System.out.println("Mumbai is not present");
		}
	}
	public ArrayList<String> sort(){
		Collections.sort(arr);
		return arr;
	}
	public int clear() {
		arr.clear();
		return arr.size();
	}
	
	
}

class IntegerList{
	
	ArrayList<Integer> arr = new ArrayList<>();
	public void methodOfIntegerList() {
		arr.add(10); arr.add(5); arr.add(20); arr.add(15); arr.add(25);
		System.out.println("Present list: "+arr);
		arr.add(2, 12);
		System.out.println("List after adding 12: "+arr);
		System.out.println("Does 15 exists in the arr: "+arr.contains(15));
		Collections.sort(arr);
		System.out.println("After sorting: "+arr);
		arr.remove(arr.indexOf(5));
		System.out.println("Final list: "+arr);
		System.out.println("Size of list: "+arr.size());
	}
}

class EmployeeDetails{
	int employeeId;
	String name;
	double salary;
	
	public EmployeeDetails(int id, String name, double salary) {
		this.employeeId = id;
		this.name = name;
		this.salary = salary;
	}
	public static EmployeeDetails create(int id, String name, double salary) {
		return new EmployeeDetails(id, name, salary);
	}
	public void display() {
		System.out.println("EmployeeID: "+this.employeeId);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
	}
}

class Company {
	ArrayList <EmployeeDetails> detail = new ArrayList<>();
	public void addEmployee(int id, String name, double sal) {
		EmployeeDetails ed = EmployeeDetails.create(id, name, sal);
		detail.add(ed);
	}
	public void display() {
		for(EmployeeDetails e : detail) {
			e.display();
		}
	}
}
