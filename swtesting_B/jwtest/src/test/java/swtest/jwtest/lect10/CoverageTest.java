package swtest.jwtest.lect10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoverageTest {

	

	@Test
	public void testCoverage1() {
		Coverage cov = new Coverage();
		
		int v = cov.coverage(20, 10 , 10);
		assertEquals(10, v);
	}
	@Test
	public void testCoverage2() {
		Coverage cov = new Coverage();
		
		int v = cov.coverage(0, 10 , 10);
		assertEquals(10, v);
	}
	@Test
	public void testCoverage3() {
		Coverage cov = new Coverage();
		
		int v = cov.coverage(20, 20 , 0);
		assertEquals(0, v);
	}

	@Test
	public void testCoverage4() {
		Coverage cov = new Coverage();
		
		int v = cov.coverage(20, 20 , 30);
		assertEquals(0, v);
	}



}
