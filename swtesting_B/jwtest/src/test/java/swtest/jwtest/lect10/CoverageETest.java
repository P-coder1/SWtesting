package swtest.jwtest.lect10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoverageETest {

	/*실습예제 2. 실습 예제 1번 프로그램을 조건문 &&를 ||로 잘 못 작성하였다고 가정한다.
			블럭커버리지를 만족하지만 오류를 발견할 수 없는 테스트 데이타를 구하라
	 */
	@Test
	public void testCoverage1() {
		
		CoverageE cov = new CoverageE();
		
		cov.coverage(15, 15, 15); // x y z 값
	}
	
	/*실습예제 2. 분기커버리지를 만족하지만 오류를 발견할 수 없는 테스트 데이타를 구하라.*/
	@Test
	public void testCoverage2() {
		
		CoverageE cov = new CoverageE();
		
		cov.coverage(5, 2, 15); // x y z 값
	}
}
