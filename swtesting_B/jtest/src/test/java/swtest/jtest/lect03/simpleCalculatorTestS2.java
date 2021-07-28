package swtest.jtest.lect03;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import swtest.jtest.lect03.simpleCalculator;

public class simpleCalculatorTestS2 {
	simpleCalculator cal;

	@Before
	public void setUp() throws Exception {   // 사전에 해야할것
		System.out.println("setUp start!!");
		cal = new simpleCalculator();
	}
	
	@Test(expected=IllegalArgumentException.class) // 발생이 되면 cell유가 떨어지는 거고 안나오면 말음
	public void testaddWithPositiveArgs() {
		cal.addWithPositiveArgs(10, -20);
		//cal.addWithPositiveArgs(10, 20);
	}
}
