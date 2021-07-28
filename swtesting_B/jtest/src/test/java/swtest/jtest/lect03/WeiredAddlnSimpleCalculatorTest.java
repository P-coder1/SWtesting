package swtest.jtest.lect03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) // 컨트롤 쉬프트 o 를 눌러서 생성
public class WeiredAddlnSimpleCalculatorTest {
	
	//멤버변수
	private int expected;
	private int value1;
	private int value2;
	simpleCalculator cal;
	
	//생성자
	public WeiredAddlnSimpleCalculatorTest(int expected, 
			int value1, int value2) {
		this.expected = expected;
		this.value1 = value1;
		this.value2 = value2;
	}
	
	//메서드
	
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
			{30, 10, 20},
			{0, 0, 0,} ,
			{100, 5 , 7}
		}); 
	}
	@Before
	public void setUp() throws Exception {
		cal = new simpleCalculator();
	}

	@Test
	public void testWeiredAdd() {
		cal.weiredAdd(value1,value2);
		assertEquals(expected, cal.getResult());
	}

}
