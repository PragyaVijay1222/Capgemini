package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.*;


public class StudentServiceTesting {
	
	static StudentService ss;
	
	@BeforeAll
	public static void setup() {
		ss = new StudentService();
	}
	
	@Test
	public void testEqualGrade(){
		Assertions.assertEquals(ss.calculateGrade(80), "Distinction");
	}
	
	@Test
	public void testTruePass() {
		Assertions.assertTrue(ss.isPassed(75));
	}
	
	@Test
	public void testFalsePass() {
		Assertions.assertFalse(ss.isPassed(45));
	}
	
	@Test
	public void testExceptionNegativeMarks() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ss.calculateGrade(-10);
		});
	}
	
	@Test
	public void testExceptionHigherThanPossibleMarks() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			ss.calculateGrade(120);
		});
	}
	
	@Test
	public void testNotNullResponse() {
		Assertions.assertNotNull(ss.calculateGrade(70));
	}
}
