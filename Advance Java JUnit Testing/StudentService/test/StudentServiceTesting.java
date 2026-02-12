package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.StudentService;
import main.illigalAgeException;

public class StudentServiceTesting {
	
	static StudentService ss;
	
	@BeforeAll
	public static void setup() {
		ss = new StudentService();
	}
	
	@Test
	public void testTrue() throws illigalAgeException {
		Assertions.assertTrue(ss.isEligible(19)); 
	} 
	
	@Test
	public void testFalse() throws illigalAgeException {
		Assertions.assertFalse(ss.isEligible(12));
	}
	
	@Test
	public void testEqual() throws illigalAgeException {
		Assertions.assertEquals(true, ss.isEligible(34));
	}
	
	@Test
	public void testNotEqual() throws illigalAgeException {
		Assertions.assertNotEquals(true, ss.isEligible(4));
	}
	
	@Test
	public void testNotNull() throws illigalAgeException {
		Assertions.assertNotNull(ss.isEligible(34), "This should be not null");
	}
	
	@Test
	public void testSame() throws illigalAgeException {
		Assertions.assertSame(false, ss.isEligible(11));
	}
	
	@Test
	public void testNotSame() throws illigalAgeException {
		Assertions.assertNotSame(true, ss.isEligible(10));
	}
	
	@Test 
	public void testAssertAll() {
		Assertions.assertAll("Testing multiple", ()-> Assertions.assertTrue(ss.isEligible(22)), 
				                                 ()-> Assertions.assertFalse(ss.isEligible(2)));
	}
	
	@Test
	public void testException() {
		Assertions.assertThrows(illigalAgeException.class, ()->{
		ss.isEligible(0);
		});
	}
}
