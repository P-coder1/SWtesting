package swtest.jwtest.lect10;

public class Coverage {
	public int coverage(int x, int y, int z) {
		/*
		if((x>0) && (y>0))
			z = x-y;
		if((x>2) || (z==0))
			z = z+1;
		return z;
		*/
		if((x>10) && (y==10) || (z>20))
			z = x-y;
		return z;
		
	}
}
