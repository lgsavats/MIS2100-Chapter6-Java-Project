package Savatsky.Lydia.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//test that the a zero numerator returns  zero
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		
		SimpleMath simpleMathObject = new SimpleMath();
		assertEquals(0, simpleMathObject.divide(0, 7), 0.01);
		fail("result did not return zero");
	}
	
	//test that a smaller numerator returns a decimal
	@Test
	public void testThatSmallerNumeratorReturnsZero() {
		
		SimpleMath simpleMathObject = new SimpleMath();
		assertEquals(1, simpleMathObject.divide(1,4), 0.01);
		fail("result did not return a decimal");
	}
	
	//test that method throws an exception when divide by 0
	@Test
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath simpleMathObject = new SimpleMath();
		assertEquals(0.25, simpleMathObject.divide(6,0), 0.01);
		fail("cannot divide by zero");
	}

}
