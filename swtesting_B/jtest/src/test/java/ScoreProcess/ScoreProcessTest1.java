package ScoreProcess;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class ScoreProcessTest1 {
	ScoreProcess calc;
	@Test
	@Category(FunctionGroupA.class)
	public void testA() {
		calc = new ScoreProcess();
		calc.hap(30, 30, 30);
		assertEquals('A', calc.getResult());
	}
	
	@Test
	@Category(FunctionGroupA.class)
	public void testB() {
		calc = new ScoreProcess();
		calc.hap(25, 35, 15);
		assertEquals('B', calc.getResult());
	}
	
	@Test
	@Category(FunctionGroupA.class)
	public void testC() {
		calc = new ScoreProcess();
		calc.hap(20, 20, 20);
		assertEquals('C', calc.getResult());
	}
	
	@Test
	@Category(FunctionGroupA.class)
	public void testF() {
		calc = new ScoreProcess();
		calc.hap(10, 10, 10);
		assertEquals('F', calc.getResult());
	}
}
