package swtest.jtest.lect03;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ simpleCalculatorTestS1.class, 
	simpleCalculatorTestS2.class, 
	WeiredAddlnSimpleCalculatorTest.class })
public class AllTests {
	
}
