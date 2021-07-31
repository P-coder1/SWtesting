package swtest.tdd.lect14;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
@RunWith(PowerMockRunner.class)
@PrepareForTest({Sort.class})

public class InteractionTest {

	@Test
	//인터액션 테스트
	public void testSort() {
		int[] a = {5,2,4,6,1,3};
		PowerMockito.mockStatic(Arrays.class);
		int b[] = new Sort().sort(a);
		
		PowerMockito.verifyStatic();
		//SortUsingInsertion.insertionSort(a);
		Arrays.sort(a);
	}

}
