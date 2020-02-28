package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import javacode.calc;

public class test {

  calc c=new calc();
	
	@Test(timeout=1000)
	public void testadd() {
		assertEquals(5,c.add(2,3));
	}
	
	@Test(timeout=1000)
	public void testsub() {
		assertEquals(1,c.sub(3,2));
	}
	
	@Test(timeout=1000)
	public void testmul() {
		assertEquals(10,c.mul(5,2));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testdiv() {
		assertEquals(1,c.div(3,0));
		
	}
	
	
}
