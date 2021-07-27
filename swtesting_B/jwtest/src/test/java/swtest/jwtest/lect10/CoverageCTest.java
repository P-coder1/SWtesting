package swtest.jwtest.lect10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoverageCTest {

	
	/*실습예제 1. T1(15,15,15) 가 달성하는 블럭커버리지 값을 구하시오.
	 * 블럭커버리지를 만족하는 최소 테스트 갯수
	 */
	@Test
	public void testCoverage1() {
		
		CoverageC cov = new CoverageC();
		
		cov.coveragem(15, 15, 15); // x y z 값
	}
	
	/*실습예제 1. 분기커버리지 T1(15,15,15)가 달성하는 분기커버리지를 구하시오.
	* 만약 분기버리지를 달성하지 않는다면 분기커버리지를 달성하는 
	* 최소 테스트 추가
	* 추가테스트와 T1이 달성하는 조건커버리지 계산*/
	@Test
	public void testCoverage2() {
		
		CoverageC cov = new CoverageC();
		
		cov.coveragem(5, 2, 15); // x y z 값
	}
}
