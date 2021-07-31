package swtest.tdd.lect13;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import swtest.tdd.lect12.CalculatorS;

import static org.mockito.Mockito.*;
public class CalculatorSTest {
	
	@Test
	public void testSpy() {
		//spy객체 생성
		CalculatorS calc = spy(new CalculatorS());
		when(calc.add(30, 20)).thenReturn(100);
		
		//spy 동작되어 스터빙된 메서드 동작
		assertEquals(100,calc.add(30, 20)); 
		//원본의 메서드가 동작
		assertEquals(10,calc.sub(30, 20));
	}

}
