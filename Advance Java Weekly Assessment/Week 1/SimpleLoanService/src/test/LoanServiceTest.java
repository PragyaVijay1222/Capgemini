package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.IllegalArgumentException;
import main.LoanService;

public class LoanServiceTest {
	
	static LoanService ls;
	
	@BeforeAll
	public static void setup() {
		ls = new LoanService();
	}
	
	@Test
	public void testTrue() throws IllegalArgumentException{
		Assertions.assertTrue(ls.isEligible(45, 26000));
	}
	@Test
	public void testFalse() throws IllegalArgumentException{
		Assertions.assertFalse(ls.isEligible(10, 27000));
	}
	@Test
	public void testEqualsPremium() throws IllegalArgumentException{
		Assertions.assertEquals("Premium", ls.getLoanCategory(800));
	}
	@Test
	public void testEqualsStandard() throws IllegalArgumentException{
		Assertions.assertEquals("Standard", ls.getLoanCategory(700));
	}
	@Test
	public void testEqualsHighRisk() throws IllegalArgumentException{
		Assertions.assertEquals("High Risk", ls.getLoanCategory(500));
	}
	@Test
	public void testNotNull() throws IllegalArgumentException{
		Assertions.assertNotNull(ls.calculateEMI(10000, 8));
	}
	@Test
	public void testNoEqual() throws IllegalArgumentException{
		Assertions.assertNotEquals(ls.getLoanCategory(600), "Standard");
	}
	@Test
	public void testExceptionLoanAmount() throws IllegalArgumentException{
		Assertions.assertThrows(IllegalArgumentException.class, () -> ls.calculateEMI(0, 9));
	}
	@Test
	public void testExceptionInvalidTanure() throws IllegalArgumentException{
		Assertions.assertThrows(IllegalArgumentException.class, () -> ls.calculateEMI(100000, -1));
	}
	@Test
	public void testAll() throws IllegalArgumentException{
		Assertions.assertAll("Testing multiple", ()-> Assertions.assertTrue(ls.isEligible(45, 28000)), 
				                                 ()-> Assertions.assertFalse(ls.isEligible(14, 80000)));
	}
	
}
