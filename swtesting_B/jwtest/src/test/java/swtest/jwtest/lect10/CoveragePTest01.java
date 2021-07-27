package swtest.jwtest.lect10;


import java.util.Collection;
import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CoveragePTest01 {
	int x, y, z;
	
	/*실습예제 3. 어떠한 경우에도 z의 값이 변경되지 않아야 한다. 
	분기 커버리지를 만족하여도 오류를 검출하지 못하는 테스트 집합을 
   	구하시오.*/
	@Parameters
	public static Collection getParameters () {
		return Arrays.asList(new Object[][] {
			{0,0,2},
			{2,2,3}
		});
	}
	
	public CoveragePTest01(int x, int y, int z) {
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