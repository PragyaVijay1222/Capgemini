package main;

public class StudentService {
	public boolean isEligible(int age) throws illigalAgeException {
		if(age<=0) throw new illigalAgeException("Not a valid age");
		return age>=18;
	}
}
