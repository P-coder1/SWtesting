package swtest.tdd.lect12;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	//1. 실패할 테스트 코드 작성-실행오류, 컴파일오류 모두 포함
	@Test
	public void createCalculator() {
		//3. 테스트요구사항 2
		//	 - 계산기의 초기값을 생성자를 통해 설정 할 수 있다.
		Calculator calc = new Calculator(10);
		
		//2. 테스트요구사항 1
		//	 - 계산기의 초기값은 따로 설정하지 않았을 때에 0으로 설정
		assertEquals(10, calc.getResult());
	}
	//4. 테스트요구사항 3
	//	 - 계산기는 덧셈 기능을 제공한다.
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		//5. 테스트요구사항 4
		//	 - 계산기는 계산 결과를 저장하는 기능을 가지고 있다.
		//6. 테스트요구사항 5
		//	 - 계산기는 덧셈 기능은 이전 계산 결고와 덧셈을 수행한다.
		calc.add(20);
		calc.add(30);
		assertEquals(50, calc.getResult());
	}
		
//7. 테스트요구사항 6
//	 - 계산기는 클리어 기능을 통해 이전 계산 결과를 0으로 만든다.
	@Test
	public void testClear() {
		Calculator calc = new Calculator();
		calc.add(20);
		calc.add(30);
		assertEquals(50, calc.getResult());
		calc.clear();
		assertEquals(0, calc.getResult());
	}
}