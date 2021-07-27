package swtest.jwtest.lect10;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CoveragePTest02 {
	int x, y, z;
	
	/*	실습예제 3
	*	기본 경로 커버리지를 만족하는 테스트 집합을 구하시오.
	*	오류 검출 가능한가?
	*/

	@Parameters
	public static Collection getParameters () {
		return Arrays.asList(new Object[][] {
			{0,0,1},
			{0,1,1},  // 오류
			{1,1,1},
			{1,0,1}   // 오류
		});
	}
	
	public CoveragePTest02(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Test
	public void test() {
		CoverageP cov = new CoverageP();
		assertEquals(z, cov.coverage(x, y, z));
	}

}
