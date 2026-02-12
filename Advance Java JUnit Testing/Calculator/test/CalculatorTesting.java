package test;

// 10/02/26

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calculator;

public class CalculatorTesting {
	Calculator c;
	
	@BeforeEach                 //To make a new object beforehand for the very next test method. We can use beforAll for all the test methods;
	public void setup() {
		c = new Calculator();
	}

	@Test
	public void testAdd() {
//		Calculator calc = new Calculator();           //BeforeEach                    
		Assertions.assertEquals(5, c.add(2, 3));
	}
	
	@Test
	public void testNoEqualsAdd() {
		Calculator calc = new Calculator();
		Assertions.assertNotEquals(5, calc.add(2, 6));
	}
	
	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(3, calc.sub(5,2));
	}
	
	@Test
	public void testIsEven() {
		Calculator calc = new Calculator();
		Assertions.assertTrue(calc.isEven(4));
		Assertions.assertFalse(calc.isEven(5));
	}
	
	@Test
	public void testDevide() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(2, calc.devide(5,2));
		
	}
	
	@Test
	public void testCheck() {
		Calculator calc = new Calculator();
		Assertions.assertNull(calc.check(10, 11), "This should return null");
	}
	
	// Edge case testing
	
	@Test
	public void testDevideByZero() {
	    Calculator calc = new Calculator();

	    Assertions.assertThrows(ArithmeticException.class, () -> {
	        calc.devide(5, 0);
	    });
	}
	
	
//	CSV SOURCE
	
	@ParameterizedTest
	@CsvSource({
		"2, 3, 5",
		"0, 0 , 0",
		"-5, 10, 5",
		"100, 200, 300"
	})
	public void testAddParameterized(int a, int b, int expected) {
		Assertions.assertEquals(expected, c.add(a, b));
	}
	
	@ParameterizedTest
	@CsvSource({
		"2, 3, 5",
		"0, 0 , 1",
		"-5, 10, 5",
		"100, 200, 300"
	})
	public void testSubParameterized(int a, int b, int expected) {
		Assertions.assertNotEquals(expected, c.sub(a, b));
	}
	
	
//	VALUE SOURCE
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,10,12,14,16})
	public void testIsEvenRetureTrue(int numbers) {
		Assertions.assertTrue(c.isEven(numbers));
	}
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7,9,11,-3})
	public void testIsEvenRetureFalse(int numbers) {
		Assertions.assertFalse(c.isEven(numbers));
	}
	
	
//	METHOD SOURCE
	
	@ParameterizedTest
	@MethodSource("provideDivisionTestCase")
	public void testDivisionWithMethodSourse(int a, int b, int expected) {
		Assertions.assertEquals(expected, c.devide(a,b));
	}
	private static Stream<Arguments> provideDivisionTestCase(){
		return Stream.of(
				Arguments.of(20,4,5),
				Arguments.of(15,5,3),
				Arguments.of(0,7,0),
				Arguments.of(100,25,4)
				);
	}
	
//	10/02/26
	
//	CSV FILE SOURCE
	
	@ParameterizedTest
	@CsvFileSource(files = "test-data/add.csv", numLinesToSkip = 1)
	public void simpleAddTest(int a, int b, int expected) {
		System.out.println("Simple @CscFileSource test: "+a+" + "+b);
		Assertions.assertEquals(expected, c.add(a, b));
	}
	}

