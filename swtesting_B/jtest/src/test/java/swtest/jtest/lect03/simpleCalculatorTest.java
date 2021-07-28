package swtest.jtest.lect03;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleCalculatorTest {

	@Test
	public void testAdd() {
		simpleCalculator cal = new simpleCalculator();
		cal.add(10, 20);
		assertEquals(30, cal.getResult());
	}
	@Test
	public void testSub() {
		simpleCalculator cal = new simpleCalculator();
		cal.sub(30, 50);
		assertEquals(-20, cal.getResult());
	}
	@Test
	public void testDiv() {
		simpleCalculator cal = new simpleCalculator();
		cal.div(10, 2);
		assertEquals(5, cal.getResult());
	}
	@Test
	public void testInc() {
		simpleCalculator cal = new simpleCalculator();
		cal.inc(50);
		assertEquals(50, cal.getResult());
	}
	@Test
	public void testDec() {
		simpleCalculator cal = new simpleCalculator();
		cal.dec(50);
		assertEquals(-50, cal.getResult());
	}
}
