package swtest.jtest.lect03;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import swtest.jtest.lect03.simpleCalculator;

public class simpleCalculatorTestS1 {
	simpleCalculator cal;
	
	@Before
	public void setUp() throws Exception {   // 사전에 해야할것
		System.out.println("setUp start!!");
		cal = new simpleCalculator();
	}

	@After
	public void tearDown() throws Exception {  // 사후에 해야할것
		System.out.println("tearDown start!!");
	}
	
	@Test
	public void weiredAddWithNormalValues() { // 일반적인 값
		cal.weiredAdd(10, 20);
		assertEquals(30, cal.getResult());
	}
	@Test
	public void weiredAddWithZero() {  // 제로값
		cal.weiredAdd(0, 0);
		assertEquals(0, cal.getResult());
	}
	@Test
	public void weiredAddWithNotNormalValues() { // 일반적이지 않은값
		cal.weiredAdd(5, 7);
		assertEquals(100, cal.getResult());
	}

	@Test(expected=IllegalArgumentException.class) // 발생이 되면 cell유가 떨어지는 거고 안나오면 말음
	public void testaddWithPositiveArgs() {
		cal.addWithPositiveArgs(10, -20);
		//cal.addWithPositiveArgs(10, 20);
	}
	@Test
	public void testAdd() {
		cal = new simpleCalculator();
		cal.add(10, 20);
		assertEquals(30, cal.getResult());
	}
	@Test
	public void testSub() {
		cal = new simpleCalculator();
		cal.sub(30, 50);
		assertEquals(-20, cal.getResult());
	}
	@Test
	public void testDiv() {
		cal = new simpleCalculator();
		cal.div(10, 2);
		assertEquals(5, cal.getResult());
	}
	@Test
	public void testInc() {
		cal = new simpleCalculator();
		cal.inc(50);
		assertEquals(50, cal.getResult());
	}
	@Test
	public void testDec() {
		cal = new simpleCalculator();
		cal.dec(50);
		assertEquals(-50, cal.getResult());
	}
}
