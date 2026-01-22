// 20/1/26
// Functional interface, anonymous function and lambda expression.
// forEach
// Method reference 
// Stream
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface F1{
	void greet();
}
@FunctionalInterface
interface F2{
	int add(int a, int b);
}
@FunctionalInterface
interface F3{
	int findFactorial(int n);
}

class AbsBody implements F3{
	@Override
	public int findFactorial(int n) {
		int fact =1;
		for(int i=n; i>=1; i--) {
			fact = fact*i;
		}
		return fact;
	}
}

public class TwentyJanuary {
	public static void main(String[] args) {
		
		F1 ref1 = new F1() {
			@Override
			public void greet() {
				System.out.println("Hello world using anonymous class");
			}
		};
		ref1.greet();
		F1 ref2 = () -> System.out.println("Hello world using lamda");
		ref2.greet();
		
//		////////////////////////////////////////////////////////////////////////
		
		F2 obj1 = new F2() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println("Using anonymous function: "+obj1.add(10, 20));
		F2 obj2 = (a,b) -> a+b;
		System.out.println("Using lambda function: "+obj2.add(20, 30));
		
//		////////////////////////////////////////////////////////////////////////
		
		
		F3 r1 = new AbsBody();
		System.out.println("Ussing normal class: "+r1.findFactorial(5));
		
		F3 r2 = new F3() {
			@Override
			public int findFactorial(int a) {
				int fact = 1;
				
				for(int i = a; i>=1; i--) {
					fact = fact*i;
				}
				return fact;
			}
		};
		System.out.println("Using anonymous class: "+r2.findFactorial(7));
		
		F3 r3 = (a) -> {
			int fact = 1;
			for(int i=a; i>=1; i--) {
				fact = fact*i;
			}
			return fact;
		};
		System.out.println("Using lamda expresseion: "+r3.findFactorial(8));
		
//		///////////////////////////////////////////////////////////////////////
		
		List<Studentss> st = new ArrayList<Studentss>();

		st.add(new Studentss(3, "Murali", 75.5));
		st.add(new Studentss(4, "Aditya", 85.5));
		st.add(new Studentss(1, "Vishnu", 80.5));
		st.add(new Studentss(2, "Pramod", 90.5));
		st.add(new Studentss(2, "Suraj", 55.5));
        Comparator<Studentss> c1 = (s1,s2)-> s1.name.compareTo(s2.name);
        Collections.sort(st,c1);
        
        for (Studentss s : st) {
			System.out.println(s);
		}
        
//        /////////////////////////////////////////////////////////////////////
        
        List<Integer> num = Arrays.asList(10,21,24,32,23,14,15);
        num.forEach(n -> System.out.println(n));
		
//        /////////////////////////////////////////////////////////////////////
        
        List<String> name = Arrays.asList("Kabir", "Devansh", "Girish", "Nitish", "Murali");
        name.forEach(n -> {
        	if(n.endsWith("sh"))System.out.println(n);
        });
        
        num.forEach(n-> {
        	if(n%2==0) System.out.println(n);
        });
        
        st.forEach(stud -> {
        	if(stud.marks > 85) System.out.println(stud);
        });
        
        
//        ///////////////////////////////////////////////////////////////////////
        
//        Method Reference 
        
        F2 obj3 = Integer :: sum;
        System.out.println(obj3.add(60, 90));
        
        name.forEach(System.out::println);
        
        List<Emp> employees = Arrays.asList(
        		new Emp(23, "Cat", 235567),
        		new Emp(34, "Dog", 678432),
        		new Emp(45, "Owl", 936846));
        
        employees.forEach(Emp :: printDetails);
        
//        //////////////////////////////////////////////////////////////////////
        
//        Stream
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        System.out.println("To print elements one by one");
        numbers.stream().forEach(System.out :: println);
        
        System.out.println("\n To print only even numbers");
        numbers.stream().filter(n -> n%2==0).forEach(System.out::println);
        
        System.out.println("\n To print odd numbers with adding 3 to each");
        numbers.stream().filter(n -> n%2!=0).map(n -> n+3).forEach(System.out::println);
        
        System.out.println("\n To find even numbers and store it in another list");
        List<Integer> even_collected = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(even_collected);
        
        List<String> names = Arrays.asList("Nitish", "Aditya", "Devansh", "Mohit", "Pawan", "Girish");
        System.out.println("\n printing objects ending with sh using stream");
        names.stream().filter(n -> n.endsWith("sh")).forEach(System.out::println);
        
        System.out.println("\n Printing the details of students wo got more than 80 using stream");
        st.stream().filter(n -> n.marks>80).forEach(System.out::println);
        
        System.out.println("\n Sorting student objects by id in ascending order");
        st.stream().sorted((a,b)-> Integer.compare(a.id, b.id)).forEach(System.out::println);
        
        System.out.println("\n Sorting student objects by id in descending order");
        st.stream().sorted((a,b)-> Integer.compare(b.id, a.id)).forEach(System.out::println);
        
        System.out.println("\n Sorting student objects by name in ascending order");
        st.stream().sorted((a,b)-> a.name.compareTo(b.name)).forEach(System.out::println);
        
        System.out.println("\n Sorting student objects by marks in ascending order");
        st.stream().sorted((a,b)-> Double.compare(a.marks, b.marks)).forEach(System.out::println);
        
        System.out.println("\n Adding 5 grace marks");
        st.stream().map(a -> a.marks+5).forEach(System.out::println);
        
	}
}

class Emp{
	int id;
	String name;
	double sal;
	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public void printDetails() {
		System.out.println("------------------");
		System.out.println("ID: "+this.id);
		System.out.println("NAME: "+this.name);
		System.out.println("SAL: "+this.sal);
	}
}

class Studentss implements Comparable<Studentss>{
	int id;
	String name;
	double marks;
	public Studentss(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Studentss s) {
		return this.id - s.id;
	}
}

// class SortByNames implements Comparator<Students>{

// 	@Override
// 	public int compare(Students s1, Students s2) {
// 		return s1.name.compareTo(s2.name);
// 	}

// }
