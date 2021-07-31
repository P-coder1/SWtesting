package swtest.tdd.lect14;

public class SortUsingInsertion {
	public static int[] insertionSort(int[] a) {
		int [] b= a;
		for(int j=1; j<b.length; j++) {
			int key = b[j];
			int i = j-1;
			while(i >= 0 && b[i] > key) {
				b[i+1] = b[i];
				i=i-1;
			}
			b[i+1] = key;
		}
		return b;
	}
}
