package ScoreProcess;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(FunctionGroupP.class)
public class hapArgsTest {
	ScoreProcess calc = new ScoreProcess();
	
	private char grade;
	private int value1;
	private int value2;
	private int value3;
	
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
			{'A',30,30,30},
			{'B',10,30,30},
			{'C',30,30,5},
			{'F',5,20,30}
		});
	}
	
	public hapArgsTest(char grade, int value1, int value2, int value3) {
		this.grade = grade;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}	
	@Test(expected=IllegalArgumentException.class)
	@Category(FunctionGroupE.class)
	public void testArgs() throws Exception{
		calc.hapWithPositiveArgs(grade, value1, value2, value3);
	}
	@Test
	public void testscore() {
		calc = new ScoreProcess();
		calc.hap(value1,value2,value3);
		assertEquals(grade, calc.getResult());
	}
	

}
