package swtest.tdd.lect14;

import java.util.Arrays;

public class Sort {
	public int[] sort(int[] a) {
		int[] b = a;
		//SortUsingInsertion.insertionSort(b);
		Arrays.sort(b);
		return b;
	}
}
