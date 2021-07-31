package swtest.tdd.lect14;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StateTest {

	@Test
	public void testSort() {
		int a[] = {5,2,4,6,1,3};
		int b[] = new Sort().sort(a);
		
		assertArrayEquals(new int[] {1,2,3,4,5,6},b);
	}

}
